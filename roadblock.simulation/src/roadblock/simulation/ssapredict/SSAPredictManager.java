package roadblock.simulation.ssapredict;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class SSAPredictManager {

	private static final String SSA_PREDICTOR_URL = "http://ssapredict.ico2s.org/";

	private static SSAPredictManager instance = null;

	private final Pattern formKeyPattern;
	private final Pattern analysisIdPattern;
	private final Pattern algorithmNamePattern;

	public static SSAPredictManager getInstance() {

		if (instance == null) {
			instance = new SSAPredictManager();
		}

		return instance;
	}

	public String predictSimulationAlgorithm(File file)
			throws ClientProtocolException, IOException, InterruptedException {
		CloseableHttpClient client = HttpClients.createDefault();

		String analysisId = getAnalysisId(client, file);

		runAnalysis(client, analysisId);

		HttpGet httpGet = new HttpGet(SSA_PREDICTOR_URL + "analyse/results/" + analysisId);
		CloseableHttpResponse response = client.execute(httpGet);

		int statusCode = response.getStatusLine().getStatusCode();
		if (statusCode != 200) {
			throw new RuntimeException(
					"Cannot connect to the SSA Predictor. Failed with HTTP error code : " + statusCode);
		}

		HttpEntity httpEntity = response.getEntity();
		String httpOutput = EntityUtils.toString(httpEntity);
		String algorithmName = null;

		Matcher matcher = algorithmNamePattern.matcher(httpOutput);
		if (matcher.find()) {
			algorithmName = matcher.group(1);
		}

		client.close();

		return algorithmName;
	}

	private void runAnalysis(CloseableHttpClient client, String analysisId)
			throws ClientProtocolException, IOException, InterruptedException {
		HttpGet httpGet = new HttpGet(SSA_PREDICTOR_URL + "analyse/analysis/" + analysisId);

		String algorithmName = null;

		for (int i = 0; i < 9 && algorithmName == null; i++) {
			if(i >= 1) {
				Thread.sleep(100);
			}
			
			CloseableHttpResponse response = client.execute(httpGet);

			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode != 200) {
				throw new RuntimeException(
						"Cannot connect to the SSA Predictor. Failed with HTTP error code : " + statusCode);
			}
			
			HttpEntity httpEntity = response.getEntity();
			String httpOutput = EntityUtils.toString(httpEntity);

			Matcher matcher = algorithmNamePattern.matcher(httpOutput);
			if (matcher.find()) {
				algorithmName = matcher.group(1);
			}
		}
	}

	private String getFormKey(CloseableHttpClient client) throws ClientProtocolException, IOException {
		HttpGet httpGet = new HttpGet(SSA_PREDICTOR_URL);

		CloseableHttpResponse response = client.execute(httpGet);

		int statusCode = response.getStatusLine().getStatusCode();
		if (statusCode != 200) {
			throw new RuntimeException(
					"Cannot connect to the SSA Predictor. Failed with HTTP error code : " + statusCode);
		}

		HttpEntity httpEntity = response.getEntity();
		String httpOutput = EntityUtils.toString(httpEntity);
		String formKey = null;

		Matcher matcher = formKeyPattern.matcher(httpOutput);
		if (matcher.find()) {
			formKey = matcher.group(1);
		}

		return formKey;
	}

	private String getAnalysisId(CloseableHttpClient client, File file) throws ClientProtocolException, IOException {
		HttpPost httpPost = new HttpPost(SSA_PREDICTOR_URL);

		String formKey = getFormKey(client);

		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		builder.addTextBody("_formname", "model/create");
		builder.addTextBody("_formkey", formKey);
		builder.addBinaryBody("file", file);
		HttpEntity entity = builder.build();

		httpPost.setEntity(entity);

		CloseableHttpResponse response = client.execute(httpPost);

		int statusCode = response.getStatusLine().getStatusCode();
		if (statusCode != 200) {
			throw new RuntimeException(
					"Cannot connect to the SSA Predictor. Failed with HTTP error code : " + statusCode);
		}

		HttpEntity httpEntity = response.getEntity();
		String jsonOutput = EntityUtils.toString(httpEntity);
		String analysisId = null;

		Matcher matcher = analysisIdPattern.matcher(jsonOutput);
		if (matcher.find()) {
			analysisId = matcher.group(1);
		}

		return analysisId;
	}

	private SSAPredictManager() {
		formKeyPattern = Pattern.compile("<input name=\"_formkey\" type=\"hidden\" value=\"(\\S+)\" />");
		analysisIdPattern = Pattern.compile("\"analysis\": (\\d+),");
		algorithmNamePattern = Pattern.compile("<p><strong class=\"alg\">(.*)</strong></p>");
	}
}
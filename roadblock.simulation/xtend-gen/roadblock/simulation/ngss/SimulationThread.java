package roadblock.simulation.ngss;

import com.google.common.base.Objects;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class SimulationThread extends Thread {
  private String xml_model;
  
  private String resultFilename;
  
  public Process process;
  
  public SimulationThread(final String xml_model, final String resultFilename, final String cmd) {
    try {
      this.xml_model = xml_model;
      this.resultFilename = resultFilename;
      Runtime _runtime = Runtime.getRuntime();
      Process _exec = _runtime.exec(cmd);
      this.process = _exec;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void run() {
    try {
      OutputStream input = this.process.getOutputStream();
      byte[] _bytes = this.xml_model.getBytes();
      input.write(_bytes);
      input.close();
      InputStream _inputStream = this.process.getInputStream();
      InputStreamReader _inputStreamReader = new InputStreamReader(_inputStream);
      BufferedReader output = new BufferedReader(_inputStreamReader);
      PrintWriter _printWriter = new PrintWriter(this.resultFilename);
      BufferedWriter fileStream = new BufferedWriter(_printWriter);
      String part = null;
      String _readLine = output.readLine();
      String _part = part = _readLine;
      boolean _notEquals = (!Objects.equal(_part, null));
      boolean _while = _notEquals;
      while (_while) {
        {
          fileStream.write(part);
          fileStream.newLine();
        }
        String _readLine_1 = output.readLine();
        String _part_1 = part = _readLine_1;
        boolean _notEquals_1 = (!Objects.equal(_part_1, null));
        _while = _notEquals_1;
      }
      output.close();
      fileStream.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

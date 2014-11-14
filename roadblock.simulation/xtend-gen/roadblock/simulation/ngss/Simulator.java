package roadblock.simulation.ngss;

import com.google.common.base.Objects;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import roadblock.bin.BinaryPathProvider;
import roadblock.simulation.ngss.SimulationThread;

@SuppressWarnings("all")
public class Simulator {
  /**
   * variables to alter the behavior of the simulator
   */
  public String simulation_algorithm = "nrm";
  
  public double max_time = 100.0;
  
  public double max_runtime = 0.0;
  
  public double log_interval = 1.0;
  
  public int runs = 1;
  
  public int seed = 0;
  
  private String model;
  
  public Simulator(final String model) {
    this.model = model;
  }
  
  public void runSimulation(final String resultFilename, final OutputStream errorStream) {
    try {
      BinaryPathProvider _instance = BinaryPathProvider.getInstance();
      String ngssPath = _instance.getNgssPath();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(ngssPath, "");
      _builder.append(" --emf parser=emf max_time=");
      _builder.append(this.max_time, "");
      _builder.append(" max_runtime=");
      _builder.append(this.max_runtime, "");
      _builder.append(" simulation_algorithm=");
      _builder.append(this.simulation_algorithm, "");
      _builder.append(" data_file=model.csv log_interval=");
      _builder.append(this.log_interval, "");
      _builder.append(" runs=");
      _builder.append(this.runs, "");
      _builder.append(" seed=");
      _builder.append(this.seed, "");
      _builder.append(" output=console compress=true parallel=true show_progress=false");
      final String cmd = _builder.toString();
      SimulationThread thread = new SimulationThread(this.model, resultFilename, cmd);
      thread.start();
      int result = thread.process.waitFor();
      if ((result != 0)) {
        String line = null;
        InputStream _errorStream = thread.process.getErrorStream();
        InputStreamReader _inputStreamReader = new InputStreamReader(_errorStream);
        BufferedReader error = new BufferedReader(_inputStreamReader);
        String _readLine = error.readLine();
        String _line = line = _readLine;
        boolean _notEquals = (!Objects.equal(_line, null));
        boolean _while = _notEquals;
        while (_while) {
          byte[] _bytes = line.getBytes();
          errorStream.write(_bytes);
          String _readLine_1 = error.readLine();
          String _line_1 = line = _readLine_1;
          boolean _notEquals_1 = (!Objects.equal(_line_1, null));
          _while = _notEquals_1;
        }
        error.close();
      }
      thread.join();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

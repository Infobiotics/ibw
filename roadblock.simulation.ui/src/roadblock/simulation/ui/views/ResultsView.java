package roadblock.simulation.ui.views;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.csstudio.swt.xygraph.dataprovider.CircularBufferDataProvider;
import org.csstudio.swt.xygraph.dataprovider.Sample;
import org.csstudio.swt.xygraph.figures.ToolbarArmedXYGraph;
import org.csstudio.swt.xygraph.figures.Trace;
import org.csstudio.swt.xygraph.figures.Trace.ErrorBarType;
import org.csstudio.swt.xygraph.figures.Trace.TraceType;
import org.csstudio.swt.xygraph.figures.XYGraph;
import org.csstudio.swt.xygraph.linearscale.Range;
import org.csstudio.swt.xygraph.util.XYGraphMediaFactory;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.part.ViewPart;

import roadblock.simulation.ui.Activator;

/**
 * ResultsView - The view to display the results of a simulation
 * 
 * @author Jonny Naylor
 *
 */
public class ResultsView extends ViewPart implements IPartListener2 {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "roadblock.simulation.ui.views.resultsView";

	private Browser browser;

	/**
	 * Parent of this view.
	 */
	private Composite parent;

	/**
	 * XYGraph (the actual graph).
	 */
	private XYGraph xyGraph;

	/**
	 * ToolbarArmedXYGraph (to hold xyGraph).
	 */
	private ToolbarArmedXYGraph toolbarArmedXYGraph;

	/**
	 * LightweightSystem (to hold toolbarArmedXYGraph)
	 */
	private LightweightSystem lws;

	/**
	 * List of the trajectories to be plotted.
	 */
	private ArrayList<Trajectory> trajectories;

	/**
	 * Map of the plotted traces (trajectories plotted on the XYGraph) Species ->
	 * Trace
	 */
	private HashMap<String, Trace> traces;

	/**
	 * Map of species trace to a boolean describing whether or not it is being drawn
	 */
	private HashMap<Trace, Boolean> traceDrawStates;

	/**
	 * The table of species being plotted with checkboxes to toggle their draw state
	 */
	private Table speciesTable;

	/**
	 * Group of composites for the GUI - allowing the user to interact with the
	 * ResultsView
	 */
	private Group gui;

	/**
	 * The constructor.
	 */
	public ResultsView() {
		trajectories = new ArrayList<>();
		traces = new HashMap<>();
		traceDrawStates = new HashMap<>();
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {

		// store the parent composite
		setParent(parent);
		browser = new Browser(parent, SWT.NONE);

		//plotTrajectories();

		// create the gui
		// createGUI();

		// plot the results
		// plot();
	}

	/**
	 * Plot the generated results
	 */
	public void plotTrajectories() {

		// clear all of the trajectories and trace history before loading new data
		trajectories.clear();

		// get the directory in which the results are stored
		String resultsDataPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString()
				+ "/.tmp/simulation/";

		// load the trajectory data from a csv
		loadCSVData(resultsDataPath + ".output.csv");

		// add traces to the graph
		try {
			URL chartTemplateURL = Platform.getBundle(Activator.PLUGIN_ID).getEntry("/resources/charts/line-chart/");
			String chartTempaltePath = FileLocator.resolve(chartTemplateURL).getPath().trim();

			String chartHtml = FileUtils.readFileToString(new File(chartTempaltePath + "index.htm"), "UTF-8");

			String chartSeries = getChartSeries(trajectories);
			chartHtml = chartHtml.replace("<ChartDependencyPath>",chartTempaltePath + "../");
			chartHtml = chartHtml.replace("<ChartSeriesData>", chartSeries);

			browser.setText(chartHtml);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void plot() {

		// if the graph already exists, clean it and remove the species table
		if (toolbarArmedXYGraph != null) {
			removeAllTraces();
			speciesTable.removeAll();
			speciesTable.dispose();
			speciesTable = null;
		}

		// create the new XYGraph
		else {
			createXYGraph("Simulation results");
		}

		// clear all of the trajectories and trace history before loading new data
		trajectories.clear();
		traceDrawStates.clear();

		// get the directory in which the results are stored
		String resultsDataPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString()
				+ "/.tmp/simulation/";

		// load the trajectory data from a csv
		loadCSVData(resultsDataPath + ".output.csv");

		// add traces to the graph
		plotTrajectories(trajectories);

		// set the range of the X Axis
		setXAxisRange(trajectories);

		// generate the species table
		createSpeciesTable();
		speciesTable.setRedraw(true);
		speciesTable.getParent().layout();
	}

	/**
	 * Generate the XY graph (create and initialise it).
	 * 
	 * @param title
	 *            The title of the graph.
	 */
	public void createXYGraph(String title) {

		// create a new XYGraph.
		xyGraph = new XYGraph();
		xyGraph.setTitle(title);
		xyGraph.setShowLegend(false);
		xyGraph.setFont(XYGraphMediaFactory.getInstance().getFont(XYGraphMediaFactory.FONT_TAHOMA));
		xyGraph.primaryXAxis.setTitle("time (seconds)");
		xyGraph.primaryYAxis.setTitle("# molecules");
		xyGraph.primaryYAxis.setAutoScale(true);

		// embed the XYGraph into a window with toolbars
		toolbarArmedXYGraph = new ToolbarArmedXYGraph(xyGraph);

		// create a LightweightSystem to bridge between SWT and draw2D and set the
		// XYGraph to be its contents
		lws = new LightweightSystem(new Canvas(parent, SWT.NONE));
		lws.setContents(toolbarArmedXYGraph);

	}

	/**
	 * Generate the GUI for interacting with the XYGraph
	 */
	public void createSpeciesTable() {

		// create a table of the species with check boxes to toggle their trace draw
		// state
		speciesTable = new Table(parent, SWT.CHECK | SWT.BORDER | SWT.V_SCROLL | SWT.SINGLE);
		speciesTable.setHeaderVisible(true);
		speciesTable.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {

				// if a species trajectory is checked/unchecked, toggle its draw state
				if (event.detail == SWT.CHECK)
					toggleDrawingTrace((String) event.item.getData());
			}
		});

		// create a column to hold the species trajectories and their check boxes
		TableColumn column = new TableColumn(speciesTable, SWT.NULL);
		column.setText("Species trajectories");

		// for each species trajectory trace which exists on the xyGraph, create an
		// according table item
		for (int i = 0; i < traces.size(); i++)
			generateTableItem((String) traces.keySet().toArray()[i]);

		// pack the table column with items
		speciesTable.getColumn(0).pack();
	}

	/**
	 * Generate a TableItem for a given species
	 * 
	 * @param species
	 *            The species
	 * @return Return the created TableItem
	 */
	public TableItem generateTableItem(String species) {
		TableItem item = new TableItem(speciesTable, SWT.NULL);
		item.setText(species);
		item.setData(species);
		item.setChecked(true);
		return item;
	}

	/**
	 * Plot a given list of trajectories to the XYGraph.
	 */
	public String getChartSeries(ArrayList<Trajectory> trajectories) {
		StringBuilder seriesBuilder = new StringBuilder();

		seriesBuilder.append("[");

		List<String> dataItems = new ArrayList<>();
		for (int i = 0; i < trajectories.size(); i++) {
			dataItems.add(getChartData(trajectories.get(i), i));
		}

		seriesBuilder.append(String.join(",", dataItems));

		seriesBuilder.append("]");

		return seriesBuilder.toString();
	}

	public void plotTrajectories(ArrayList<Trajectory> trajectories) {
		for (Trajectory t : trajectories)
			plotTrajectory(t);
	}

	/**
	 * Set the Range of the X Axis
	 */
	public void setXAxisRange(ArrayList<Trajectory> trajectories) {
		double maxRange = Double.MIN_VALUE;
		double minRange = Double.MAX_VALUE;

		for (Trajectory t : trajectories) {
			minRange = Math.min(minRange, t.getXMinValue());
			maxRange = Math.max(maxRange, t.getXMaxValue());
		}

		xyGraph.primaryXAxis.setRange(new Range(minRange, maxRange));
	}

	/**
	 * Plot a given trajectory.
	 * 
	 * @param trajectory
	 *            The trajectory to be plotted.
	 */
	public String getChartData(Trajectory trajectory, int index) {
		StringBuilder dataBuilder = new StringBuilder();

		dataBuilder.append("{");
		dataBuilder.append("name: '" + trajectory.species + "',");
		dataBuilder.append("zIndex: 1,");
		dataBuilder.append("lineColor: Highcharts.getOptions().colors[" + (index - 1) + "],");
		dataBuilder.append("marker: { enabled: false },");
		dataBuilder.append("data: [");

		List<String> points = new ArrayList<>();
		for (int timeIndex = 0; timeIndex < trajectory.getXValues().size(); timeIndex++) {
			points.add(
					"[" + trajectory.getXValues().get(timeIndex) + "," + trajectory.getYValues().get(timeIndex) + "]");
		}

		dataBuilder.append(String.join(",", points));

		dataBuilder.append("]");
		dataBuilder.append("},");
		
		
		dataBuilder.append("{");
		dataBuilder.append("name: '" + trajectory.species + "',");
		dataBuilder.append("type: 'arearange',");
		dataBuilder.append("linkedTo: ':previous',");
		dataBuilder.append("fillOpacity: 0.2,");
		dataBuilder.append("zIndex: 0,");
		dataBuilder.append("lineWidth: 0,");
		dataBuilder.append("color: Highcharts.getOptions().colors[" + (index - 1) + "],");
		dataBuilder.append("marker: { enabled: false },");
		dataBuilder.append("data: [");

		List<String> ranges = new ArrayList<>();
		for (int timeIndex = 0; timeIndex < trajectory.getXValues().size(); timeIndex++) {
			ranges.add(
					"[" + trajectory.getXValues().get(timeIndex) + 
					"," + (trajectory.getYValues().get(timeIndex) - trajectory.getYValuesSD().get(timeIndex) / 2) + 
					"," + (trajectory.getYValues().get(timeIndex) + trajectory.getYValuesSD().get(timeIndex) / 2) + "]");
		}

		dataBuilder.append(String.join(",", ranges));

		dataBuilder.append("]");
		dataBuilder.append("}");

		return dataBuilder.toString();
	}

	public void plotTrajectory(Trajectory trajectory) {

		// create a trace data provider, which will provide the data to the trace.
		CircularBufferDataProvider traceDataProvider = new CircularBufferDataProvider(true);
		traceDataProvider.setBufferSize(trajectory.getYValues().size());

		// create and add samples for each time step
		for (int timeIndex = 0; timeIndex < trajectory.getXValues().size(); timeIndex++)
			traceDataProvider.addSample(generateSample(trajectory, timeIndex));

		// create a new trace based on the sample data from the trajectory
		Trace trace = new Trace(trajectory.getSpecies(), xyGraph.primaryXAxis, xyGraph.primaryYAxis, traceDataProvider);

		// store the trace (map species -> trace) for this trajectory
		storeTrajectoryTrace(trajectory, trace);

		// add the trajectory trace to the xyGraph
		addTrace(trace);
	}

	/**
	 * Generate a sample for the trace data provider.
	 * 
	 * @param trajectory
	 *            The trajectory for which to generate a sample.
	 * @param timeIndex
	 *            The time index of the trajectory data at which to generate a
	 *            sample.
	 * @return Return the generated sample.
	 */
	public Sample generateSample(Trajectory trajectory, int timeIndex) {
		return new Sample(trajectory.getXValues().get(timeIndex), trajectory.getYValues().get(timeIndex),
				trajectory.getYValuesSD().get(timeIndex) / 2, trajectory.getYValuesSD().get(timeIndex) / 2, Double.NaN,
				Double.NaN);
	}

	/**
	 * Add a given trajectory trace to the XYGraph.
	 * 
	 * @param trace
	 *            The trace to be plotted.
	 */
	public void addTrace(Trace trace) {

		// set the trace properties
		trace.setTraceType(TraceType.SOLID_LINE);
		trace.setLineWidth(1);
		trace.setAreaAlpha(100);
		trace.setAntiAliasing(true);
		trace.setErrorBarEnabled(true);
		trace.setDrawYErrorInArea(true);
		trace.setYErrorBarType(ErrorBarType.BOTH);
		trace.setXErrorBarType(ErrorBarType.NONE);

		// add the trace to xyGraph
		xyGraph.addTrace(trace);
	}

	/**
	 * Remove all of the traces which are currently plotted on the XYGraph
	 */
	public void removeAllTraces() {

		// remove all of the traces from the XYGraph and storage
		for (String species : traces.keySet())
			removeTrace(species);

		// empty the traces map
		traces.clear();
	}

	/**
	 * Remove a specific species trace
	 * 
	 * @param species
	 *            The species for which the trace is to be removed
	 */
	public void removeTrace(String species) {
		xyGraph.removeTrace(traces.get(species));
		traceDrawStates.remove(traces.get(species));
	}

	/**
	 * Store the trajectory data (map species -> trajectory) and the trace data
	 * (trace -> drawState)
	 * 
	 * @param trajectory
	 *            The trajectory to be stored
	 * @param trace
	 *            The trace to be stored
	 */
	public void storeTrajectoryTrace(Trajectory trajectory, Trace trace) {
		traces.put(trajectory.getSpecies(), trace);
		traceDrawStates.put(trace, true);
	}

	/**
	 * Toggle drawing the trace for a given species trajectory
	 * 
	 * @param species
	 *            The species for which to toggle the trace drawing
	 */
	public void toggleDrawingTrace(String species) {

		// get the corresponding trace for this species
		Trace trace = traces.get(species);

		// if the trace is currently being drawn, save its new draw state as false and
		// remove it from the graph
		if (traceDrawStates.get(trace)) {
			traceDrawStates.put(trace, false);
			xyGraph.removeTrace(trace);
		}

		// if the trace is currently not being drawn, save its new draw state as true
		// and add it to the graph
		else {
			traceDrawStates.put(trace, true);
			xyGraph.addTrace(trace);
		}
	}

	/**
	 * Load the trajectories to be plotted from a CSV file
	 * 
	 * @param file
	 *            The CSV file (including file path)
	 */
	public void loadCSVData(String file) {

		// initialise file reader variables
		BufferedReader br = null;
		String[] tokens = null;
		String line = "";

		try {

			// initialise the buffered reader
			br = new BufferedReader(new FileReader(file));

			// read in the first line (contains all of the trajectory headers)
			line = br.readLine();

			// split up the line into its separate tokens (split string at commas ",")
			tokens = line.split(",");

			// for each of the trajectories, create a new Trajectory object with its species
			// name (excluding first column, as that contains time seires data)
			for (int i = 1; i < tokens.length; i += 2)
				trajectories.add(new Trajectory(tokens[i]));

			// for every line (after the first line)
			while ((line = br.readLine()) != null) {

				// split the line into its tokens (time, followed by concentration of series of
				// species concentrations at that time)
				tokens = line.split(",");

				// for each of the trajectories, plot the time as the x value and the species
				// concentration as the y value
				for (int i = 1; i < tokens.length; i += 2)
					trajectories.get((int) Math.floor(i / 2)).addPoint(asDouble(tokens[0]), asDouble(tokens[i]),
							asDouble(tokens[i + 1]));
			}
		}

		// exception handling
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// finally close the file reader
		finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Convert a given string to a double.
	 * 
	 * @param str
	 *            The string to be parsed.
	 * @return The converted double
	 */
	public double asDouble(String str) {
		return Double.parseDouble(str);
	}

	/**
	 * Convert a given arraylist of doubles to an array of doubles
	 * 
	 * @param list
	 *            The given arraylist of doubles
	 * @return The converted array of doubles
	 */
	public double[] asDoubleArray(ArrayList<Double> list) {
		double[] doubleArray = new double[list.size()];

		for (int i = 0; i < list.size(); i++)
			doubleArray[i] = list.get(i);

		return doubleArray;
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		// updateUI();
	}

	/**
	 * Update the view
	 */
	protected void updateUI() {
		plotTrajectories();
	}

	/**
	 * Set the parent of this view
	 * 
	 * @param parent
	 *            The parent composite
	 */
	public void setParent(Composite parent) {
		this.parent = parent;
	}

	/**
	 * Trajectory object - holds species time series data for a graph trace
	 * 
	 * @author Jonny Naylor
	 *
	 */
	public class Trajectory {

		/** Fields **/
		private String species;
		private ArrayList<Double> xValues;
		private ArrayList<Double> yValues;
		private ArrayList<Double> yValuesSD;

		/** Constructors **/
		public Trajectory(String species) {
			this(species, new ArrayList<Double>(), new ArrayList<Double>(), new ArrayList<Double>());
		}

		public Trajectory(String species, ArrayList<Double> xValues, ArrayList<Double> yValues,
				ArrayList<Double> yValuesSD) {
			setSpecies(species);
			setXValues(xValues);
			setYValues(yValues);
			setYValuesSD(yValuesSD);
		}

		/** Utility functions **/
		public void addPoint(double x, double y, double ySD) {
			xValues.add(x);
			yValues.add(y);
			yValuesSD.add(ySD);
		}

		public double getXMinValue() {
			double min = Double.MAX_VALUE;

			for (int i = 0; i < xValues.size(); i++)
				min = Math.min(min, xValues.get(i));

			return min;
		}

		public double getXMaxValue() {
			double max = Double.MIN_VALUE;

			for (int i = 0; i < xValues.size(); i++)
				max = Math.max(max, xValues.get(i));

			return max;
		}

		/** Getters and setters **/
		public String getSpecies() {
			return species;
		}

		public void setSpecies(String species) {
			this.species = species;
		}

		public ArrayList<Double> getXValues() {
			return xValues;
		}

		public void setXValues(ArrayList<Double> xValues) {
			this.xValues = xValues;
		}

		public ArrayList<Double> getYValues() {
			return yValues;
		}

		public void setYValues(ArrayList<Double> yValues) {
			this.yValues = yValues;
		}

		public ArrayList<Double> getYValuesSD() {
			return yValuesSD;
		}

		public void setYValuesSD(ArrayList<Double> yValuesSD) {
			this.yValuesSD = yValuesSD;
		}
	}

	/**
	 * Override methods
	 */

	@Override
	public void dispose() {
	}

	@Override
	public void partActivated(IWorkbenchPartReference partRef) {
		updateUI();
	}

	@Override
	public void partDeactivated(IWorkbenchPartReference partRef) {
		updateUI();
	}

	@Override
	public void partBroughtToTop(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partClosed(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partOpened(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partHidden(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partVisible(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partInputChanged(IWorkbenchPartReference partRef) {
	}
}
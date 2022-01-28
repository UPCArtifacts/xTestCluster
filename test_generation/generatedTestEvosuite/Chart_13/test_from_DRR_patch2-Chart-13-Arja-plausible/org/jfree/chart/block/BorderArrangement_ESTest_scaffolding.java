/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 22 21:37:59 GMT 2021
 */

package org.jfree.chart.block;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class BorderArrangement_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.block.BorderArrangement"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.dir", "/home/mmartinez/preoverfitting"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.home", "/home/mmartinez"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BorderArrangement_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.time.Year",
      "org.jfree.chart.Drawable",
      "org.jfree.data.DomainOrder",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.time.Minute",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.data.DomainInfo",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.text.TextLine",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.data.RangeInfo",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.statistics.SimpleHistogramBin",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.xy.TableXYDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.time.Day",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.chart.util.Size2D",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.data.Values2D",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.data.statistics.BoxAndWhiskerXYDataset",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.data.general.SeriesChangeListener",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.block.Block",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.data.time.Hour",
      "org.jfree.data.statistics.BoxAndWhiskerItem",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.general.Series",
      "org.jfree.data.xy.XYDatasetTableModel",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.data.general.PieDataset",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.chart.util.UnitType",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "org.jfree.data.time.Second",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.data.time.MonthConstants",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.data.Values",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.KeyedValues",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.data.general.SeriesException"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.sql.Connection", false, BorderArrangement_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.sql.Statement", false, BorderArrangement_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BorderArrangement_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.Hour",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.Range",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.util.Size2D",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.chart.block.GridArrangement",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.block.EmptyBlock",
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "org.jfree.chart.block.ColorBlock",
      "org.jfree.data.time.Week",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.statistics.BoxAndWhiskerCalculator",
      "org.jfree.data.statistics.Statistics",
      "org.jfree.data.statistics.BoxAndWhiskerItem",
      "org.jfree.data.KeyedObjects",
      "org.jfree.data.KeyedObject",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.data.xy.XYDatasetTableModel",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.data.general.SubSeriesDataset",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.data.statistics.SimpleHistogramBin",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.time.Quarter",
      "org.jfree.chart.block.CenterArrangement"
    );
  }
}

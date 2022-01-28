import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer4.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer4.getUpperBound();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray1 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        int int10 = cMAESOptimizer8.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        int int10 = cMAESOptimizer8.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer8.getStartPoint();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer8.getUpperBound();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer0.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        int int1 = cMAESOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer4.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer4.getStartPoint();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer4.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer4.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer4.getLowerBound();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer0.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer8.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer8.getUpperBound();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer0.getUpperBound();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        double[] doubleArray8 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        int int10 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer8.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer8.getStartPoint();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer4.getStatisticsMeanHistory();
        int int6 = cMAESOptimizer4.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer4.getUpperBound();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        int int7 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer0.getStatisticsMeanHistory();
        int int4 = cMAESOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer4.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer4.getUpperBound();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        int int2 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer0.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer0.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer0.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer0.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer0.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer0.getUpperBound();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer8.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer8.getStartPoint();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer8.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer0.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int6 = cMAESOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer0.getUpperBound();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        int int1 = cMAESOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        int int5 = cMAESOptimizer4.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer4.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer4.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer4.getUpperBound();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer0.getUpperBound();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer0.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer0.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer0.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer0.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer4.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer4.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer4.getUpperBound();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer4.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer4.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer4.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer4.getStartPoint();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        int int10 = cMAESOptimizer8.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer8.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer8.getStartPoint();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer8.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer8.getUpperBound();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        int int5 = cMAESOptimizer4.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer4.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer4.getStatisticsSigmaHistory();
        int int8 = cMAESOptimizer4.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer4.getUpperBound();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        int int10 = cMAESOptimizer8.getEvaluations();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer8.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer8.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer8.getUpperBound();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        int int5 = cMAESOptimizer4.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer4.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer4.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer4.getLowerBound();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer8.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer8.getUpperBound();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer0.getUpperBound();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer4.getLowerBound();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer0.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer0.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer0.getUpperBound();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer8.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer8.getUpperBound();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        int int5 = cMAESOptimizer4.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer4.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer4.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer4.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer4.getLowerBound();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray1);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer2.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer2.getLowerBound();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        int int3 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        double[] doubleArray9 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray9);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer12.getStatisticsMeanHistory();
        int int14 = cMAESOptimizer12.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        int int2 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer8.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        int int10 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer8.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer8.getGoalType();
        int int13 = cMAESOptimizer8.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer8.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer4.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer4.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer4.getLowerBound();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer4.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer4.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer4.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer4.getLowerBound();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        int int5 = cMAESOptimizer1.getEvaluations();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        int int2 = cMAESOptimizer1.getEvaluations();
        int int3 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer0.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        double[] doubleArray10 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray10);
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer14.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer14.getLowerBound();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        int int10 = cMAESOptimizer8.getEvaluations();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer8.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer8.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer8.getStartPoint();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer0.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer0.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer4.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer4.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer4.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer4.getUpperBound();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer0.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer0.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer0.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        int int4 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        int int2 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int5 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        int int10 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer8.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer8.getUpperBound();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer8.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        double[] doubleArray11 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer16.getStartPoint();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        int int6 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        int int5 = cMAESOptimizer4.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer4.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer4.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer4.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer4.getStartPoint();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray2);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer4.getStartPoint();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer0.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer0.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer0.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer0.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer0.getUpperBound();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer0.getStatisticsMeanHistory();
        int int4 = cMAESOptimizer0.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer0.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        int int5 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        int int3 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer4.getUpperBound();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        double[] doubleArray8 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer10.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer10.getUpperBound();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        int int5 = cMAESOptimizer4.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer4.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer4.getStatisticsSigmaHistory();
        int int8 = cMAESOptimizer4.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer4.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer4.getLowerBound();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        double[] doubleArray11 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer16.getUpperBound();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        int int5 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        int int2 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer4.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer4.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker7 = cMAESOptimizer4.getConvergenceChecker();
        int int8 = cMAESOptimizer4.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer4.getUpperBound();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer8.getStatisticsMeanHistory();
        int int10 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer8.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        int int4 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer4.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer4.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker7 = cMAESOptimizer4.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer4.getLowerBound();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getEvaluations();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        int int10 = cMAESOptimizer8.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer8.getStartPoint();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer8.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer8.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer8.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        int int10 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer8.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer8.getGoalType();
        int int13 = cMAESOptimizer8.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer8.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer8.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer8.getStatisticsFitnessHistory();
        int int17 = cMAESOptimizer8.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer0.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        int int7 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker7 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        int int10 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer8.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer8.getGoalType();
        int int13 = cMAESOptimizer8.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer8.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer8.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer8.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer8.getUpperBound();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer4.getStatisticsMeanHistory();
        int int6 = cMAESOptimizer4.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer4.getLowerBound();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        int int5 = cMAESOptimizer4.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer4.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer4.getStatisticsSigmaHistory();
        int int8 = cMAESOptimizer4.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer4.getLowerBound();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        int int2 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        int int4 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer4.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer4.getStatisticsDHistory();
        int int7 = cMAESOptimizer4.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer4.getUpperBound();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer4.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer4.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer4.getStartPoint();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        int int2 = cMAESOptimizer1.getEvaluations();
        int int3 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        int int3 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        int int3 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        double[] doubleArray11 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray11);
        int int17 = cMAESOptimizer16.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer16.getLowerBound();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        int int3 = cMAESOptimizer1.getEvaluations();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        double[] doubleArray8 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer10.getUpperBound();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        int int1 = cMAESOptimizer0.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer0.getGoalType();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer4.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer4.getUpperBound();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        int int5 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        int int5 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer4.getStatisticsMeanHistory();
        int int6 = cMAESOptimizer4.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer4.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer4.getStartPoint();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer8.getConvergenceChecker();
        int int10 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer8.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer8.getStartPoint();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        int int3 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        int int5 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        double[] doubleArray7 = new double[] { (-1.0f), 100L, 100.0d, '4', 1, (byte) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer8.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        int int6 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer8.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer8.getStatisticsFitnessHistory();
        int int11 = cMAESOptimizer8.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        int int7 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        double[] doubleArray5 = new double[] { (byte) 0, (-1.0f), 10.0f, '4' };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer6.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer6.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer6.getUpperBound();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer4.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer4.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer4.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer4.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer4.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer4.getUpperBound();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer0.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int8 = cMAESOptimizer1.getEvaluations();
        int int9 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        int int5 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int9 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int11 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int7 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int5 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer8.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer8.getStatisticsSigmaHistory();
        int int12 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer8.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int7 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        int int10 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer8.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer8.getGoalType();
        int int13 = cMAESOptimizer8.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer8.getConvergenceChecker();
        int int15 = cMAESOptimizer8.getEvaluations();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer8.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer8.getUpperBound();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        int int2 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        int int5 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer0.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer0.getEvaluations();
        int int5 = cMAESOptimizer0.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer0.getStatisticsDHistory();
        int int7 = cMAESOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer4.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer4.getStatisticsDHistory();
        int int7 = cMAESOptimizer4.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer4.getStartPoint();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer0.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer0.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer0.getStatisticsDHistory();
        int int7 = cMAESOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer0.getUpperBound();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        double[] doubleArray11 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray11);
        int int17 = cMAESOptimizer16.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer16.getUpperBound();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        int int3 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray3);
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer4.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer4.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer4.getUpperBound();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        int int10 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer8.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer8.getGoalType();
        int int13 = cMAESOptimizer8.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer8.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer8.getStartPoint();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer0.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer0.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer0.getGoalType();
        int int7 = cMAESOptimizer0.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer0.getGoalType();
        int int9 = cMAESOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int8 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        double[] doubleArray5 = new double[] { (byte) 0, (-1.0f), 10.0f, '4' };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer6.getLowerBound();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer0.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int5 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType5 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer3 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray2);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer4 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray2);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer4.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer4.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer4.getUpperBound();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        int int5 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int9 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int11 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        int int3 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        int int10 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer8.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer8.getGoalType();
        int int13 = cMAESOptimizer8.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer8.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer8.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker7 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer0.getUpperBound();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        int int2 = cMAESOptimizer1.getEvaluations();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        double[] doubleArray12 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer18.getUpperBound();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        int int10 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer8.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer8.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer8.getUpperBound();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#');
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer0.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer0.getUpperBound();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer2 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray1);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer2.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer2.getUpperBound();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        int int6 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        double[] doubleArray7 = new double[] { 1.0d, 100, 1, 1.0f, 1.0d, 0.0f };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray7);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer8.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer8.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer8.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer8.getGoalType();
        int int14 = cMAESOptimizer8.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker1 = cMAESOptimizer0.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer0.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int6 = cMAESOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer0.getStartPoint();
    }
}


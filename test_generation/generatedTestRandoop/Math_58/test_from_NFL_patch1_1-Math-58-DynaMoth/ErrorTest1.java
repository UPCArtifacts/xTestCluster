import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 0, 0.0d, (double) 'a', 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (short) -1, (double) 100, (double) 1L, (double) 1);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) (short) 100, (double) (byte) 10, (double) (-1), (double) (byte) -1);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray9 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer41 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer45 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker46 = levenbergMarquardtOptimizer45.getConvergenceChecker();
        levenbergMarquardtOptimizer41.setConvergenceChecker(vectorialPointValuePairConvergenceChecker46);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer53 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer59 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker60 = levenbergMarquardtOptimizer59.getConvergenceChecker();
        levenbergMarquardtOptimizer53.setConvergenceChecker(vectorialPointValuePairConvergenceChecker60);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker62 = levenbergMarquardtOptimizer53.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer63 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double64 = levenbergMarquardtOptimizer63.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker65 = levenbergMarquardtOptimizer63.getConvergenceChecker();
        levenbergMarquardtOptimizer53.setConvergenceChecker(vectorialPointValuePairConvergenceChecker65);
        levenbergMarquardtOptimizer41.setConvergenceChecker(vectorialPointValuePairConvergenceChecker65);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker65);
        int int69 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray70 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), 10.0d, (double) 0.0f, 0.0d, Double.NaN);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (byte) 10, (double) ' ', (double) (-1), (double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) (byte) 0, (double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) (byte) -1, (double) (byte) 100);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 100, (double) 1L);
        int int9 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int18 = levenbergMarquardtOptimizer17.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker23 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray24 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, Double.NaN, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) 0.0f, (double) '4');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, (double) (-1.0f), (double) (byte) 100, (double) 100.0f, (double) (byte) -1);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double13 = levenbergMarquardtOptimizer12.getRMS();
        int int14 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        int int15 = levenbergMarquardtOptimizer12.getEvaluations();
        int int16 = levenbergMarquardtOptimizer12.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker21 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray25 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 10L, (double) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) '4', (double) 100L);
        double double8 = levenbergMarquardtOptimizer7.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker9);
        double double11 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) (-1.0f), (double) 0, (double) (short) 1, (double) (short) 1);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, 1.0d, (double) 0);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 100, (double) 1L);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) 10.0f, (double) (-1.0f), (double) ' ', (double) (short) 1);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray9 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 1.0f, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, (double) 10.0f, (double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) (short) 1, (double) 0, (double) (-1), (double) (byte) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        int int10 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray11 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) -1, (double) 0L, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) 'a', (double) (byte) 100, (double) 100, (double) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 1.0f, (double) (-1), 1.0d, (double) 100);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray9 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) 10.0f, (double) 0.0f, (double) 1L, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker38 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double39 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker40 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray41 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), (double) '4', 0.0d, (double) (short) 100, 100.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 10L, (double) (byte) 10, (double) 1L, (-1.0d));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, Double.NaN, (double) 100.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double8 = levenbergMarquardtOptimizer7.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        double double23 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray24 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) '#', (double) (-1L), (double) 1L, (double) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, 0.0d, (double) (byte) -1, (double) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 100.0f, 10.0d, (double) (short) 10, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, (double) 1L, (double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 100L, 1.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double13 = levenbergMarquardtOptimizer12.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double24 = levenbergMarquardtOptimizer23.getRMS();
        int int25 = levenbergMarquardtOptimizer23.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker26 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker26);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker28);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker28);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray32 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, 100.0d, (double) 1L, (double) 'a', (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 1L, (double) 0, (double) '4', (double) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) 100, 10.0d, 0.0d, (-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, 0.0d, (double) 0.0f, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) ' ', (double) (short) 10, 10.0d, (double) 'a', (double) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) 1L, (double) 1.0f, (double) 'a', 100.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double11 = levenbergMarquardtOptimizer10.getRMS();
        int int12 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        double double14 = levenbergMarquardtOptimizer10.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (byte) 0, (double) 100, (double) 10.0f, (double) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(10.0d, (double) 100L, (double) 0, (double) (byte) 100, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, 0.0d, (double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 1L, (double) 0L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 100.0d, (double) (byte) -1);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double11 = levenbergMarquardtOptimizer10.getRMS();
        int int12 = levenbergMarquardtOptimizer10.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer10.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int18 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) '#', (double) 0, (double) 0L, (double) (short) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int29 = levenbergMarquardtOptimizer28.getEvaluations();
        int int30 = levenbergMarquardtOptimizer28.getMaxEvaluations();
        double double31 = levenbergMarquardtOptimizer28.getRMS();
        int int32 = levenbergMarquardtOptimizer28.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker33 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialPointValuePairConvergenceChecker33);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker35 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        double double37 = levenbergMarquardtOptimizer3.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray38 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double13 = levenbergMarquardtOptimizer3.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray14 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (short) 10, (double) (short) 0, 0.0d, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 10L, (double) (byte) 10, (double) 1L, (-1.0d));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (short) 1, 1.0d, (double) (short) -1, (double) 0);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (-1.0d), (double) (byte) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 100L, (double) 100L, 0.0d, (double) 0L);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 0, 0.0d, (double) 'a', 0.0d);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) '#', (double) 0, (double) 0L, (double) (short) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int16 = levenbergMarquardtOptimizer15.getEvaluations();
        int int17 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        double double18 = levenbergMarquardtOptimizer15.getRMS();
        int int19 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker22 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray24 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (byte) -1, (double) 100L);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double8 = levenbergMarquardtOptimizer7.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray11 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        double double8 = levenbergMarquardtOptimizer5.getRMS();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        int int10 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double11 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = levenbergMarquardtOptimizer0.getStartPoint();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, 100.0d, (double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) (byte) 0, (double) (byte) 1, 0.0d, 100.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double16 = levenbergMarquardtOptimizer15.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        int int19 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray20 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, (double) (short) 100, (double) 1L, (double) ' ', (double) (short) -1);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 1.0f, (double) (-1), 1.0d, (double) 100);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), (double) 100L, (double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (byte) 10, (double) ' ', (double) (-1), (double) (byte) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int21 = levenbergMarquardtOptimizer20.getJacobianEvaluations();
        int int22 = levenbergMarquardtOptimizer20.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker23 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray26 = levenbergMarquardtOptimizer0.getStartPoint();
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) 0L, (double) (short) -1, 1.0d, (double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 0L, 1.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double8 = levenbergMarquardtOptimizer7.getRMS();
        int int9 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        int int21 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray22 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, (double) 1L, (double) ' ');
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, 10.0d, (double) (byte) -1);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(Double.NaN, (double) (-1L), (double) '4');
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) 0, (double) '4', (double) 100.0f, (double) (short) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, (double) '#', (double) 1.0f, (double) 100, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) 0L, (double) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, 0.0d, 0.0d, (double) (-1.0f), 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) '#', (double) (-1L), (double) 1L, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray10 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, 100.0d, 10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray9 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) (byte) 10, (double) (-1L));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), Double.NaN, (double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) 100.0f, (double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) 0.0f, (double) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(Double.NaN, 0.0d, 1.0d, 0.0d, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double13 = levenbergMarquardtOptimizer3.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        int int20 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int21 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray22 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer0.getStartPoint();
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(Double.NaN, (double) (-1L), (double) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) ' ', (double) (byte) 10);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) -1, (double) 0L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (byte) 100, 100.0d, (double) (-1.0f), (double) 10);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, (double) '#', (double) 0L, (double) '4', (double) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, Double.NaN, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) 1, (double) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) 0, (double) (-1.0f), Double.NaN, (double) (short) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (-1.0d), (double) (short) -1, 10.0d, (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray16 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, (-1.0d), 10.0d, (double) 0L, 10.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        double double38 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer44 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer50 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker51 = levenbergMarquardtOptimizer50.getConvergenceChecker();
        levenbergMarquardtOptimizer44.setConvergenceChecker(vectorialPointValuePairConvergenceChecker51);
        int int53 = levenbergMarquardtOptimizer44.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer57 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int58 = levenbergMarquardtOptimizer57.getJacobianEvaluations();
        double double59 = levenbergMarquardtOptimizer57.getChiSquare();
        double double60 = levenbergMarquardtOptimizer57.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker61 = levenbergMarquardtOptimizer57.getConvergenceChecker();
        levenbergMarquardtOptimizer44.setConvergenceChecker(vectorialPointValuePairConvergenceChecker61);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker61);
        int int64 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray65 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) -1, (double) (byte) 100, (double) 0.0f, (double) (short) 0);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        double double38 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker39 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker40 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer44 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, 0.0d, (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker45 = levenbergMarquardtOptimizer44.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray47 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) 100.0f, (double) (-1L), (double) '4', 10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int14 = levenbergMarquardtOptimizer13.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) '4', (double) 100L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double26 = levenbergMarquardtOptimizer25.getRMS();
        int int27 = levenbergMarquardtOptimizer25.getMaxEvaluations();
        int int28 = levenbergMarquardtOptimizer25.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker29 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialPointValuePairConvergenceChecker36);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer41 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer45 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker46 = levenbergMarquardtOptimizer45.getConvergenceChecker();
        levenbergMarquardtOptimizer41.setConvergenceChecker(vectorialPointValuePairConvergenceChecker46);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer51 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer55 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker56 = levenbergMarquardtOptimizer55.getConvergenceChecker();
        levenbergMarquardtOptimizer51.setConvergenceChecker(vectorialPointValuePairConvergenceChecker56);
        levenbergMarquardtOptimizer41.setConvergenceChecker(vectorialPointValuePairConvergenceChecker56);
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialPointValuePairConvergenceChecker56);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialPointValuePairConvergenceChecker56);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray62 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) 1.0f);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, Double.NaN, (double) 100.0f);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double5 = levenbergMarquardtOptimizer4.getRMS();
        int int6 = levenbergMarquardtOptimizer4.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer4.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) (short) -1, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) 100.0f, (double) '#', (double) (-1L), (double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        double double9 = levenbergMarquardtOptimizer3.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray10 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) (short) 1, (double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(10.0d, (double) (short) 0, (double) (short) 100);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, (double) 100, 10.0d, Double.NaN);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) '4', (double) 100L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double8 = levenbergMarquardtOptimizer7.getRMS();
        int int9 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialPointValuePairConvergenceChecker28);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker38 = levenbergMarquardtOptimizer37.getConvergenceChecker();
        levenbergMarquardtOptimizer33.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray43 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) (short) -1, (double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) ' ', 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, 0.0d, (double) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (short) 1, 1.0d, (double) (short) -1, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 1L, (-1.0d), (double) 0.0f, (double) (short) 10);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 1, (double) (byte) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int8 = levenbergMarquardtOptimizer7.getEvaluations();
        double double9 = levenbergMarquardtOptimizer7.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) (short) -1, (double) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double20 = levenbergMarquardtOptimizer19.getRMS();
        int int21 = levenbergMarquardtOptimizer19.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker23 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double27 = levenbergMarquardtOptimizer26.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        int int29 = levenbergMarquardtOptimizer26.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker30 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        int int31 = levenbergMarquardtOptimizer26.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker32 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker32);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray35 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, (double) (-1), (double) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) 0, (double) (-1.0f), Double.NaN, (double) (short) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, (double) (-1L), (double) 1, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) 1, (double) (short) 100);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 1.0f, (double) (short) 10);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, 0.0d, (-1.0d));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double14 = levenbergMarquardtOptimizer13.getRMS();
        int int15 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        int int16 = levenbergMarquardtOptimizer13.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer43 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker44 = levenbergMarquardtOptimizer43.getConvergenceChecker();
        levenbergMarquardtOptimizer39.setConvergenceChecker(vectorialPointValuePairConvergenceChecker44);
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker44);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker44);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer51 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer55 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker56 = levenbergMarquardtOptimizer55.getConvergenceChecker();
        levenbergMarquardtOptimizer51.setConvergenceChecker(vectorialPointValuePairConvergenceChecker56);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer63 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer69 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker70 = levenbergMarquardtOptimizer69.getConvergenceChecker();
        levenbergMarquardtOptimizer63.setConvergenceChecker(vectorialPointValuePairConvergenceChecker70);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker72 = levenbergMarquardtOptimizer63.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer73 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double74 = levenbergMarquardtOptimizer73.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker75 = levenbergMarquardtOptimizer73.getConvergenceChecker();
        levenbergMarquardtOptimizer63.setConvergenceChecker(vectorialPointValuePairConvergenceChecker75);
        levenbergMarquardtOptimizer51.setConvergenceChecker(vectorialPointValuePairConvergenceChecker75);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker75);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker75);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker75);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer84 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int85 = levenbergMarquardtOptimizer84.getJacobianEvaluations();
        double double86 = levenbergMarquardtOptimizer84.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker87 = levenbergMarquardtOptimizer84.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker87);
        int int89 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray90 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', 1.0d, (double) 1);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double12 = levenbergMarquardtOptimizer11.getRMS();
        int int13 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer11.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker16);
        double double18 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray19 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int15 = levenbergMarquardtOptimizer14.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        int int17 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        double double18 = levenbergMarquardtOptimizer14.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int23 = levenbergMarquardtOptimizer22.getEvaluations();
        int int24 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double30 = levenbergMarquardtOptimizer29.getRMS();
        int int31 = levenbergMarquardtOptimizer29.getMaxEvaluations();
        int int32 = levenbergMarquardtOptimizer29.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker33 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialPointValuePairConvergenceChecker33);
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialPointValuePairConvergenceChecker33);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker36 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialPointValuePairConvergenceChecker36);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker36);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer44 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) (short) 10, (double) 10L, (double) (-1.0f), (double) ' ');
        int int45 = levenbergMarquardtOptimizer44.getMaxEvaluations();
        double double46 = levenbergMarquardtOptimizer44.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker47 = levenbergMarquardtOptimizer44.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray49 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, (double) (byte) 100, (double) 10L, (double) 0.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        double double16 = levenbergMarquardtOptimizer5.getRMS();
        int int17 = levenbergMarquardtOptimizer5.getEvaluations();
        int int18 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int19 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray20 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (byte) -1, (double) 100L);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 1, (double) (short) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) '4', (double) 100L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, Double.NaN, (double) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) 10L, (double) (short) 10, (double) (short) 1, (double) 100L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray22 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) 10L, (double) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, (double) (byte) 100, (double) 10L, (double) 0.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        double double16 = levenbergMarquardtOptimizer5.getRMS();
        int int17 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int18 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray19 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double11 = levenbergMarquardtOptimizer10.getRMS();
        int int12 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        double double14 = levenbergMarquardtOptimizer10.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray9 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) '#', (double) (-1L), (double) 1L, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) (byte) 10, (double) (-1.0f), (double) (byte) 1, (double) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 10L, (double) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) '4', (double) 100L);
        double double8 = levenbergMarquardtOptimizer7.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 10.0d, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '#', (double) 0, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 1.0f, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray9 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (byte) 1, (double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 10.0d, (double) (short) 1, (double) ' ', Double.NaN);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double10 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray11 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray9 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, 1.0d, (double) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, 0.0d, (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) 0, Double.NaN, (double) (short) 0, (double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) '#', (double) 0, (double) 0L, (double) (short) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int10 = levenbergMarquardtOptimizer9.getEvaluations();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        double double12 = levenbergMarquardtOptimizer9.getRMS();
        int int13 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        int int16 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int17 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray18 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '#', Double.NaN, (double) 1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (short) 1, 1.0d, (double) (short) -1, (double) 0);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (-1.0f), (double) (byte) 10, (double) '4', 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) -1, (double) 0L);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker32 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialPointValuePairConvergenceChecker32);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 0L, 1.0d);
        double double40 = levenbergMarquardtOptimizer39.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer44 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        double double45 = levenbergMarquardtOptimizer44.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker46 = levenbergMarquardtOptimizer44.getConvergenceChecker();
        levenbergMarquardtOptimizer39.setConvergenceChecker(vectorialPointValuePairConvergenceChecker46);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker46);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray50 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, 1.0d, 10.0d, (double) (byte) -1, (double) 1L);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (short) 0, (double) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        int int8 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int13 = levenbergMarquardtOptimizer12.getJacobianEvaluations();
        int int14 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        int int15 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        int int21 = levenbergMarquardtOptimizer19.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker22 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray26 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double11 = levenbergMarquardtOptimizer10.getRMS();
        int int12 = levenbergMarquardtOptimizer10.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer10.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double18 = levenbergMarquardtOptimizer3.getRMS();
        int int19 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (-1.0f), (double) (byte) -1);
        int int24 = levenbergMarquardtOptimizer23.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker25 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray27 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray9 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int12 = levenbergMarquardtOptimizer11.getEvaluations();
        int int13 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double19 = levenbergMarquardtOptimizer18.getRMS();
        int int20 = levenbergMarquardtOptimizer18.getMaxEvaluations();
        int int21 = levenbergMarquardtOptimizer18.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker22 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker25 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker25);
        double double27 = levenbergMarquardtOptimizer3.getRMS();
        int int28 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray29 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (-1.0d), (double) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) 'a', 10.0d, (double) 0, 0.0d);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 1.0f, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int8 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer7.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int15 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray16 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, 100.0d, (double) 1L, (double) 'a', (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker13);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        int int20 = levenbergMarquardtOptimizer18.getMaxEvaluations();
        int int21 = levenbergMarquardtOptimizer18.getMaxEvaluations();
        int int22 = levenbergMarquardtOptimizer18.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker23 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray25 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (short) 100, (double) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) '#', 0.0d, (double) 10.0f, (double) 0.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) 0, (double) (-1.0f), Double.NaN, (double) (short) 100);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) 0, (double) ' ', (double) (-1), (double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) 1, (-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) 0L, (double) 100.0f, (double) (short) 0, (double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) '4', (double) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (short) 10, (double) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), Double.NaN, (double) 10.0f, (double) (byte) 1, (double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) (byte) -1, (double) (byte) 100);
        double double10 = levenbergMarquardtOptimizer9.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int17 = levenbergMarquardtOptimizer16.getMaxEvaluations();
        int int18 = levenbergMarquardtOptimizer16.getJacobianEvaluations();
        int int19 = levenbergMarquardtOptimizer16.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double24 = levenbergMarquardtOptimizer23.getRMS();
        int int25 = levenbergMarquardtOptimizer23.getMaxEvaluations();
        int int26 = levenbergMarquardtOptimizer23.getEvaluations();
        int int27 = levenbergMarquardtOptimizer23.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker32 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialPointValuePairConvergenceChecker32);
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialPointValuePairConvergenceChecker32);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker32);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker32);
        double double37 = levenbergMarquardtOptimizer5.getChiSquare();
        int int38 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray39 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (short) -1, (double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int8 = levenbergMarquardtOptimizer7.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer7.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double11 = levenbergMarquardtOptimizer5.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, (double) ' ', (double) (-1L), (double) 1, (double) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (byte) -1, (double) 100L);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, 10.0d, (double) (byte) 0, (double) 1L, (double) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double13 = levenbergMarquardtOptimizer12.getRMS();
        int int14 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        int int15 = levenbergMarquardtOptimizer12.getEvaluations();
        int int16 = levenbergMarquardtOptimizer12.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker21 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray25 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 0, Double.NaN);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) 100.0f, (double) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 1.0f, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int14 = levenbergMarquardtOptimizer13.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        int int16 = levenbergMarquardtOptimizer13.getJacobianEvaluations();
        int int17 = levenbergMarquardtOptimizer13.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray21 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, 1.0d, (double) 10, Double.NaN, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, 0.0d, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 10L, (double) (byte) 10, (double) 1L, (-1.0d));
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 1.0f, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double17 = levenbergMarquardtOptimizer16.getRMS();
        int int18 = levenbergMarquardtOptimizer16.getMaxEvaluations();
        int int19 = levenbergMarquardtOptimizer16.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker27 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialPointValuePairConvergenceChecker27);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer32 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker37 = levenbergMarquardtOptimizer36.getConvergenceChecker();
        levenbergMarquardtOptimizer32.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer42 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer46 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker47 = levenbergMarquardtOptimizer46.getConvergenceChecker();
        levenbergMarquardtOptimizer42.setConvergenceChecker(vectorialPointValuePairConvergenceChecker47);
        levenbergMarquardtOptimizer32.setConvergenceChecker(vectorialPointValuePairConvergenceChecker47);
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialPointValuePairConvergenceChecker47);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker51 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker51);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray54 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 0.0d, 0.0d, 0.0d, (double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, 10.0d);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, 0.0d, (double) 1.0f, (double) (short) 1, (double) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, (-1.0d), 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 0L, 1.0d);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), Double.NaN, (double) 10.0f, (double) (short) -1, (double) (short) 100);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) -1, (double) 0L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double5 = levenbergMarquardtOptimizer4.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer4.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker22 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker23 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double29 = levenbergMarquardtOptimizer28.getRMS();
        int int30 = levenbergMarquardtOptimizer28.getJacobianEvaluations();
        int int31 = levenbergMarquardtOptimizer28.getJacobianEvaluations();
        double double32 = levenbergMarquardtOptimizer28.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker33 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialPointValuePairConvergenceChecker33);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray36 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double12 = levenbergMarquardtOptimizer11.getRMS();
        int int13 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer11.getEvaluations();
        int int15 = levenbergMarquardtOptimizer11.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray23 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (byte) 10, (double) 1.0f, (double) '#', 1.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray10 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer0.getStartPoint();
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (-1L), (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        int int16 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (byte) 10, 10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray10 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) 100.0f, (double) (-1L), (double) '4', 10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) 10L, (double) (short) 10, (double) (short) 1, (double) 100L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        double double13 = levenbergMarquardtOptimizer11.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray16 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int7 = levenbergMarquardtOptimizer6.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer6.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = levenbergMarquardtOptimizer0.getStartPoint();
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) '4', (double) 100L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double8 = levenbergMarquardtOptimizer7.getRMS();
        int int9 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialPointValuePairConvergenceChecker28);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker38 = levenbergMarquardtOptimizer37.getConvergenceChecker();
        levenbergMarquardtOptimizer33.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        double double43 = levenbergMarquardtOptimizer3.getRMS();
        double double44 = levenbergMarquardtOptimizer3.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray45 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (short) 1, 1.0d, (double) (short) -1, (double) 0);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        int int9 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double10 = levenbergMarquardtOptimizer5.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) (short) -1, 0.0d, (double) (byte) 10, (double) (short) 1);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(10.0d, (double) (short) 0, (double) (short) 100);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, 1.0d, (double) 100, (double) 100, (-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) '#', (double) 0, (double) 0L, (double) (short) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int10 = levenbergMarquardtOptimizer9.getEvaluations();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        double double12 = levenbergMarquardtOptimizer9.getRMS();
        int int13 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, 0.0d, (-1.0d), (double) (short) 10, (double) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), (double) 1, 0.0d, (double) 0.0f, (double) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) 100L, (double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (-1L), (double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) (short) -1, (double) (-1));
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), 1.0d, (double) 1.0f, (-1.0d), (double) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, 0.0d, (double) (byte) 100, (-1.0d), (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 1.0f, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int8 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer7.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int15 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double16 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) '#', 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, (double) 0L, (double) (short) 0, (double) 'a', (double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(10.0d, (double) '#', (double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int13 = levenbergMarquardtOptimizer12.getJacobianEvaluations();
        int int14 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        double double9 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 100L, 1.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double19 = levenbergMarquardtOptimizer18.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double30 = levenbergMarquardtOptimizer29.getRMS();
        int int31 = levenbergMarquardtOptimizer29.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker32 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialPointValuePairConvergenceChecker32);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer18.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray38 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, 1.0d, 10.0d, (double) (byte) -1, (double) 1L);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray9 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) ' ', 1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) 0L, (double) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker38 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int39 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray40 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, 0.0d, (double) 1.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, (double) 100.0f, (double) (byte) 1, (double) (-1L), 100.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (short) 1, 1.0d, (double) (short) -1, (double) 0);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, 0.0d, (double) 10, (double) 0, (double) 100L);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (byte) -1, 100.0d);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, 1.0d, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        int int17 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) '#', 0.0d, (double) 10.0f, (double) 0.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) 0, (double) '4', (double) 100.0f, (double) (short) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, 0.0d, (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) (short) 1, (double) 0, (double) (-1), (double) (byte) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, Double.NaN, (double) 0);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) -1, (double) 0L);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', Double.NaN, (double) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, (double) (-1L), (double) 1, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) ' ', (double) '#', (double) (short) 10, (double) (-1), (double) '#');
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        int int18 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray19 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) (short) 1, (double) 1.0f);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (-1.0d), (double) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, (double) 100.0f, (double) (byte) 1, (double) (-1L), 100.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 100.0f, (double) (byte) 100, (double) 10.0f, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int7 = levenbergMarquardtOptimizer6.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer6.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = levenbergMarquardtOptimizer0.getStartPoint();
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 100, (double) 100.0f, (double) '#', (double) (short) 1);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) 100, (double) (byte) 10, (double) 10L, (double) (-1));
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 100.0f, (double) 100.0f, 0.0d, (double) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double12 = levenbergMarquardtOptimizer11.getRMS();
        int int13 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer11.getEvaluations();
        int int15 = levenbergMarquardtOptimizer11.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        double double23 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray24 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), (double) 1, 0.0d, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int10 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) (byte) -1, (double) '4', (double) 100.0f, (double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (short) 1, 1.0d, (double) (short) -1, (double) 0);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (-1), (double) (-1), (double) (short) 1, (double) 100.0f);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) (short) -1, 0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int31 = levenbergMarquardtOptimizer30.getEvaluations();
        int int32 = levenbergMarquardtOptimizer30.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double38 = levenbergMarquardtOptimizer37.getRMS();
        int int39 = levenbergMarquardtOptimizer37.getMaxEvaluations();
        int int40 = levenbergMarquardtOptimizer37.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker41 = levenbergMarquardtOptimizer37.getConvergenceChecker();
        levenbergMarquardtOptimizer33.setConvergenceChecker(vectorialPointValuePairConvergenceChecker41);
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialPointValuePairConvergenceChecker41);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer49 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer53 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double54 = levenbergMarquardtOptimizer53.getRMS();
        int int55 = levenbergMarquardtOptimizer53.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker56 = levenbergMarquardtOptimizer53.getConvergenceChecker();
        levenbergMarquardtOptimizer49.setConvergenceChecker(vectorialPointValuePairConvergenceChecker56);
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialPointValuePairConvergenceChecker56);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker56);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray61 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double9 = levenbergMarquardtOptimizer8.getRMS();
        int int10 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer8.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker29 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialPointValuePairConvergenceChecker29);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer38 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker39 = levenbergMarquardtOptimizer38.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setConvergenceChecker(vectorialPointValuePairConvergenceChecker39);
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialPointValuePairConvergenceChecker39);
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker39);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker43 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        double double45 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker46 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int47 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double48 = levenbergMarquardtOptimizer3.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray49 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (byte) 1, (double) (byte) 10, (double) (byte) 1, 0.0d);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = levenbergMarquardtOptimizer5.getStartPoint();
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (-1L), (double) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, (double) (-1L), (double) 1, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray10 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        double double9 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 100L, 1.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double19 = levenbergMarquardtOptimizer18.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double30 = levenbergMarquardtOptimizer29.getRMS();
        int int31 = levenbergMarquardtOptimizer29.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker32 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialPointValuePairConvergenceChecker32);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer18.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray38 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, (double) (byte) 1, (double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) 1, (double) (byte) -1, (double) 0, (double) (byte) 1);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray9 = levenbergMarquardtOptimizer5.getCovariances();
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, 1.0d, (double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray9 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test791");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) (byte) 1, (double) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer3.getCovariances();
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test792");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test793");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 1, 100.0d);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = levenbergMarquardtOptimizer3.getStartPoint();
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test794");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (-1L), 100.0d, (double) (short) 1, (double) 10L);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer5.getCovariances();
    }
}


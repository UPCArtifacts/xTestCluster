import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix1 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray3 = new double[] { (short) 1, 10.0d };
        double[] doubleArray6 = new double[] { (short) 1, 10.0d };
        double[] doubleArray9 = new double[] { (short) 1, 10.0d };
        double[] doubleArray12 = new double[] { (short) 1, 10.0d };
        double[][] doubleArray13 = new double[][] { doubleArray3, doubleArray6, doubleArray9, doubleArray12 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation14 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray13);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = pearsonsCorrelation0.computeCorrelationMatrix(doubleArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix16 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray3 = new double[] { (short) 1, 10.0d };
        double[] doubleArray6 = new double[] { (short) 1, 10.0d };
        double[] doubleArray9 = new double[] { (short) 1, 10.0d };
        double[] doubleArray12 = new double[] { (short) 1, 10.0d };
        double[][] doubleArray13 = new double[][] { doubleArray3, doubleArray6, doubleArray9, doubleArray12 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation14 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray13);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation15 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray13);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = pearsonsCorrelation15.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation17 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray20 = new double[] { (short) 1, 10.0d };
        double[] doubleArray23 = new double[] { (short) 1, 10.0d };
        double[] doubleArray26 = new double[] { (short) 1, 10.0d };
        double[] doubleArray29 = new double[] { (short) 1, 10.0d };
        double[][] doubleArray30 = new double[][] { doubleArray20, doubleArray23, doubleArray26, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation17.computeCorrelationMatrix(doubleArray30);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, 10);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = pearsonsCorrelation15.computeCorrelationMatrix(realMatrix32);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray39 = new double[] { (short) 1, 10.0d };
        double[] doubleArray42 = new double[] { (short) 1, 10.0d };
        double[] doubleArray45 = new double[] { (short) 1, 10.0d };
        double[] doubleArray48 = new double[] { (short) 1, 10.0d };
        double[][] doubleArray49 = new double[][] { doubleArray39, doubleArray42, doubleArray45, doubleArray48 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation50 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = pearsonsCorrelation36.computeCorrelationMatrix(doubleArray49);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation53 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix51, 10);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = pearsonsCorrelation15.computeCorrelationMatrix(realMatrix51);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = pearsonsCorrelation0.computeCorrelationMatrix(realMatrix51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix56 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray3 = new double[] { (short) 1, 10.0d };
        double[] doubleArray6 = new double[] { (short) 1, 10.0d };
        double[] doubleArray9 = new double[] { (short) 1, 10.0d };
        double[] doubleArray12 = new double[] { (short) 1, 10.0d };
        double[][] doubleArray13 = new double[][] { doubleArray3, doubleArray6, doubleArray9, doubleArray12 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation14 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray13);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = pearsonsCorrelation0.computeCorrelationMatrix(doubleArray13);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = pearsonsCorrelation0.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation17 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray20 = new double[] { (short) 1, 10.0d };
        double[] doubleArray23 = new double[] { (short) 1, 10.0d };
        double[] doubleArray26 = new double[] { (short) 1, 10.0d };
        double[] doubleArray29 = new double[] { (short) 1, 10.0d };
        double[][] doubleArray30 = new double[][] { doubleArray20, doubleArray23, doubleArray26, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation17.computeCorrelationMatrix(doubleArray30);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, 10);
        double[] doubleArray37 = new double[] { (short) 1, 10.0d };
        double[] doubleArray40 = new double[] { (short) 1, 10.0d };
        double[] doubleArray43 = new double[] { (short) 1, 10.0d };
        double[] doubleArray46 = new double[] { (short) 1, 10.0d };
        double[][] doubleArray47 = new double[][] { doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation48 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray47);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation49 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = pearsonsCorrelation49.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation51 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix50);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = pearsonsCorrelation51.getCorrelationMatrix();
        double[] doubleArray55 = new double[] { (short) 1, 10.0d };
        double[] doubleArray58 = new double[] { (short) 1, 10.0d };
        double[] doubleArray61 = new double[] { (short) 1, 10.0d };
        double[] doubleArray64 = new double[] { (short) 1, 10.0d };
        double[][] doubleArray65 = new double[][] { doubleArray55, doubleArray58, doubleArray61, doubleArray64 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation66 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray65);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation67 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = pearsonsCorrelation67.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation69 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = pearsonsCorrelation51.computeCorrelationMatrix(realMatrix68);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation72 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix68, (int) (byte) 0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation73 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix68);
        double[] doubleArray76 = new double[] { (short) 1, 10.0d };
        double[] doubleArray79 = new double[] { (short) 1, 10.0d };
        double[] doubleArray82 = new double[] { (short) 1, 10.0d };
        double[] doubleArray85 = new double[] { (short) 1, 10.0d };
        double[][] doubleArray86 = new double[][] { doubleArray76, doubleArray79, doubleArray82, doubleArray85 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation87 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray86);
        org.apache.commons.math.linear.RealMatrix realMatrix88 = pearsonsCorrelation73.computeCorrelationMatrix(doubleArray86);
        org.apache.commons.math.linear.RealMatrix realMatrix89 = pearsonsCorrelation34.computeCorrelationMatrix(doubleArray86);
        org.apache.commons.math.linear.RealMatrix realMatrix90 = pearsonsCorrelation0.computeCorrelationMatrix(doubleArray86);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix91 = pearsonsCorrelation0.getCorrelationStandardErrors();
    }
}


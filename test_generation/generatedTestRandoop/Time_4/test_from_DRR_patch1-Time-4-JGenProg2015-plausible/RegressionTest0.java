import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField2 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField0, dateTimeFieldType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}


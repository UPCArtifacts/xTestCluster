import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0000219474331413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752350605859097d + "'", double1 == 1.1752350605859097d);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        float float2 = org.apache.commons.math.util.FastMath.min(11013.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        int int2 = org.apache.commons.math.util.FastMath.min(36, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5785150749710588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9538893074685098d + "'", double1 == 0.9538893074685098d);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2378644027129615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8448454122626561d + "'", double1 == 0.8448454122626561d);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.09531017980432487d, 0.0065892631285295435d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9846304904050632d + "'", double2 == 0.9846304904050632d);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6555341548275427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.609582766785463d + "'", double1 == 0.609582766785463d);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.762613918721344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        double double1 = org.apache.commons.math.util.FastMath.abs(201.7156361224559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 201.7156361224559d + "'", double1 == 201.7156361224559d);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.3004939424875053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3004939424875053d + "'", double1 == 2.3004939424875053d);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 97);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1124761597012494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01941637183672906d + "'", double1 == 0.01941637183672906d);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3953649341158527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        double double1 = org.apache.commons.math.util.FastMath.log1p(55.22296199276716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0293252498388d + "'", double1 == 4.0293252498388d);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        double double2 = org.apache.commons.math.util.FastMath.min((-3.3520838269185758d), 24.35674178862402d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.3520838269185758d) + "'", double2 == (-3.3520838269185758d));
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.008837862706915424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.506372233022319d) + "'", double1 == (-0.506372233022319d));
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        double double2 = org.apache.commons.math.util.FastMath.max(0.11749267603958367d, (double) 52L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.313261687518223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        double double1 = org.apache.commons.math.util.FastMath.sinh(65.7839305200671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8559575005177096E28d + "'", double1 == 1.8559575005177096E28d);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.40771660571030227d, 0.6345784979980641d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5659027686649458d + "'", double2 == 0.5659027686649458d);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1752011936438014d, 0.9983608366524339d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1752011936438014d + "'", double2 == 1.1752011936438014d);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0000000000035623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        double double1 = org.apache.commons.math.util.FastMath.ulp(11014.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8189894035458565E-12d + "'", double1 == 1.8189894035458565E-12d);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.665909510804426d, 0.5013507798060325d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.6659095108044255d + "'", double2 == 7.6659095108044255d);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8360321798777053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.106765243357013d + "'", double1 == 1.106765243357013d);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 149, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        int int2 = org.apache.commons.math.util.FastMath.min(36, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        double double2 = org.apache.commons.math.util.FastMath.min(2.147483648E9d, (-0.08776598447540371d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.08776598447540371d) + "'", double2 == (-0.08776598447540371d));
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        double double1 = org.apache.commons.math.util.FastMath.atan((-75.53138920040317d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5575575715124121d) + "'", double1 == (-1.5575575715124121d));
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.7130053006861585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.280852984926756E9d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8862269254527579d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.009136105855588923d + "'", double2 == 0.009136105855588923d);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 416128L, (float) 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2556637328313827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2556637328313829d + "'", double1 == 1.2556637328313829d);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        double double2 = org.apache.commons.math.util.FastMath.min((-14.04469065108256d), 0.9012409891810164d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-14.04469065108256d) + "'", double2 == (-14.04469065108256d));
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        double double1 = org.apache.commons.math.util.FastMath.acos(44.770142683335514d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9538893074685098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.653831440602524d + "'", double1 == 54.653831440602524d);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7629292891930134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9137514854687232d + "'", double1 == 0.9137514854687232d);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        double double1 = org.apache.commons.math.util.FastMath.signum(100.00000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        double double2 = org.apache.commons.math.util.FastMath.max(11013.232874703413d, (-0.4262213939948603d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232874703413d + "'", double2 == 11013.232874703413d);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        long long1 = org.apache.commons.math.util.FastMath.round(3.018085164638296d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        double double1 = org.apache.commons.math.util.FastMath.log(0.011368429140754338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.476915139009423d) + "'", double1 == (-4.476915139009423d));
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6960755400997087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.769916847424642d + "'", double1 == 0.769916847424642d);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.4134332111535645d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39138388782023675d) + "'", double1 == (-0.39138388782023675d));
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.041914822473392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.93525940845419d + "'", double1 == 55.93525940845419d);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.0022052151333469753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13016183264466877d + "'", double1 == 0.13016183264466877d);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.680774471315522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2137569431448592d + "'", double1 == 1.2137569431448592d);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0028590734924855603d, 11013.232920103304d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0028590734924855607d + "'", double2 == 0.0028590734924855607d);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 100, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.43338071209297463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.36313042116107785d) + "'", double1 == (-0.36313042116107785d));
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8924232090626707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8924232090626707d + "'", double1 == 0.8924232090626707d);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-53), (-36.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.0338353139228529d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8773671774142848d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9171523356672743d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.731671717763701d + "'", double1 == 2.731671717763701d);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 229.1831180523293d + "'", double1 == 229.1831180523293d);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9428090415820634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7627471740390859d + "'", double1 == 1.7627471740390859d);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8422941990863629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9454830277888808d + "'", double1 == 0.9454830277888808d);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8341610016597678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6717993929027507d + "'", double1 == 0.6717993929027507d);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.7853981633974483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013707783890401887d) + "'", double1 == (-0.013707783890401887d));
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        double double1 = org.apache.commons.math.util.FastMath.cos((-53.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9182827862121189d) + "'", double1 == (-0.9182827862121189d));
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.281420761381717E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.80857186097812d + "'", double1 == 49.80857186097812d);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7944146264030464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5846788553292092d + "'", double1 == 0.5846788553292092d);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.388020644993609E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.881370696966641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.881370696966641d + "'", double1 == 0.881370696966641d);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5135318290179205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.44373434685906d + "'", double1 == 17.44373434685906d);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.49174338951939384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49174338951939384d + "'", double1 == 0.49174338951939384d);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        double double1 = org.apache.commons.math.util.FastMath.log10(53.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.724275869600789d + "'", double1 == 1.724275869600789d);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.570796326794902d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        double double1 = org.apache.commons.math.util.FastMath.rint(471.123645247015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 471.0d + "'", double1 == 471.0d);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.7051926755065845E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.94075637751001d + "'", double1 == 28.94075637751001d);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.2835736696417744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.040477170287252d + "'", double1 == 1.040477170287252d);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.784134301546406d, 7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948875d + "'", double2 == 1.5707963267948875d);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        long long1 = org.apache.commons.math.util.FastMath.round(2.217380259166629d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.81765898774876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9990342965546459d + "'", double1 == 0.9990342965546459d);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        double double1 = org.apache.commons.math.util.FastMath.log(2.5999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9555114450274362d + "'", double1 == 0.9555114450274362d);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        double double1 = org.apache.commons.math.util.FastMath.log(7.6659095108044255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.036783162923711d + "'", double1 == 2.036783162923711d);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2661711883825657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2999355935358229d + "'", double1 == 0.2999355935358229d);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.7568396789787584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5545602336450495d + "'", double1 == 1.5545602336450495d);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.1662915285707833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.40589190094865796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3855752601679547d + "'", double1 == 0.3855752601679547d);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 3.0f, 3.0537144249814574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.641255928060115d + "'", double2 == 28.641255928060115d);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.118384612948669d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11894236074679199d + "'", double1 == 0.11894236074679199d);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        int int1 = org.apache.commons.math.util.FastMath.abs(15472906);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15472906 + "'", int1 == 15472906);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        double double1 = org.apache.commons.math.util.FastMath.ceil(6.766375983153399E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0590159658258047d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.759755815723173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.7692799493082574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8480859447769493d + "'", double1 == 2.8480859447769493d);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9994533134057076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5447358754943394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        double double1 = org.apache.commons.math.util.FastMath.signum((-4.084289455298593d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.0159227463586952E74d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4198319429984294E37d + "'", double1 == 1.4198319429984294E37d);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.677511790861663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7305466429491709d + "'", double1 == 0.7305466429491709d);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7212254887267799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.056952438710966d + "'", double1 == 2.056952438710966d);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7162579075638862d, 11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232920103323d + "'", double2 == 11013.232920103323d);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.0d, 17.986111111111118d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2711459741908265d + "'", double2 == 0.2711459741908265d);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5494213976540494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2447575658151468d + "'", double1 == 1.2447575658151468d);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.281420761381717E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.62378791018529E7d + "'", double1 == 1.62378791018529E7d);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5464562895278918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        int int1 = org.apache.commons.math.util.FastMath.round(10.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9999999999999958d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707962349379698d) + "'", double1 == (-1.5707962349379698d));
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        double double1 = org.apache.commons.math.util.FastMath.log(4.3368086899420177E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-42.281978014156664d) + "'", double1 == (-42.281978014156664d));
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.2031992972018404d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        long long2 = org.apache.commons.math.util.FastMath.min((-36L), (long) 149);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2992240294445547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6664505058576533d + "'", double1 == 3.6664505058576533d);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.37986169703498257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7242277608733415d + "'", double1 == 0.7242277608733415d);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.281321279551499E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.34143015186032E-13d + "'", double1 == 7.34143015186032E-13d);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6384917413123372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19484471582527388d) + "'", double1 == (-0.19484471582527388d));
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9999999999999958d), 0.11776318452497536d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4535730434043441d) + "'", double2 == (-1.4535730434043441d));
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 84677176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.018085164638296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7615560214388488d, 2.036783162923711d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.036783162923711d + "'", double2 == 2.036783162923711d);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        double double1 = org.apache.commons.math.util.FastMath.cosh(471.123645247015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.020084001944983E204d + "'", double1 == 2.020084001944983E204d);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.494102162974031d, 2.26707232437651d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.49410216297403103d + "'", double2 == 0.49410216297403103d);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        double double1 = org.apache.commons.math.util.FastMath.sin(96.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9835877454343449d + "'", double1 == 0.9835877454343449d);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        double double1 = org.apache.commons.math.util.FastMath.log1p(77.26503394947866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3601009381160925d + "'", double1 == 4.3601009381160925d);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        int int2 = org.apache.commons.math.util.FastMath.max(416128, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416128 + "'", int2 == 416128);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        double double1 = org.apache.commons.math.util.FastMath.abs((-41.01558075875642d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.01558075875642d + "'", double1 == 41.01558075875642d);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.38626711782658774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40669796742333153d) + "'", double1 == (-0.40669796742333153d));
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 1477896L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 113.90635584655254d + "'", double1 == 113.90635584655254d);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.19484471582527388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19484471582527385d) + "'", double1 == (-0.19484471582527385d));
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091340L, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8743692948528521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(10.049875621120886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17540341900446965d + "'", double1 == 0.17540341900446965d);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0679333434477085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9093606334381874d + "'", double1 == 1.9093606334381874d);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        double double2 = org.apache.commons.math.util.FastMath.max(0.19892537929119716d, 14.206130012655933d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.206130012655933d + "'", double2 == 14.206130012655933d);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.7711544466071394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.924097546764221d) + "'", double1 == (-4.924097546764221d));
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        int int2 = org.apache.commons.math.util.FastMath.max(100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6360918665423811d, (-1.5707963267948963d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.035308797215385d + "'", double2 == 2.035308797215385d);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        int int2 = org.apache.commons.math.util.FastMath.max(53, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 149L, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 274877906944L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.74877907E11f + "'", float2 == 2.74877907E11f);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.48105018967490865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.8097187196293865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5706386041602216d + "'", double1 == 1.5706386041602216d);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 5, 0.5464562895278918d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5464562895278918d + "'", double2 == 0.5464562895278918d);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9930368739582951d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        double double2 = org.apache.commons.math.util.FastMath.max(0.2026142367355531d, 1.1599753909038675d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1599753909038675d + "'", double2 == 1.1599753909038675d);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        double double1 = org.apache.commons.math.util.FastMath.abs((-42.281978014156664d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.281978014156664d + "'", double1 == 42.281978014156664d);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1284552609919887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9037520325301021d + "'", double1 == 0.9037520325301021d);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 84677176);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.07752552270710597d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07459659470484177d) + "'", double1 == (-0.07459659470484177d));
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, 5558L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-53));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        double double2 = org.apache.commons.math.util.FastMath.max(3.121587127777053E-5d, (-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.121587127777053E-5d + "'", double2 == 3.121587127777053E-5d);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.3686469200204923d, 2.841145771760947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3686469200204927d + "'", double2 == 2.3686469200204927d);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 416128L, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.3678794411714423d, 0.15175275993832957d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3678794411714422d + "'", double2 == 0.3678794411714422d);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        double double1 = org.apache.commons.math.util.FastMath.signum(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        double double1 = org.apache.commons.math.util.FastMath.log10(7.419050069773651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8703483020626325d + "'", double1 == 0.8703483020626325d);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4975450646752215d, 1.2536458786393914d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6590683909191797d + "'", double2 == 1.6590683909191797d);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5860134523134338E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.200306866613815d + "'", double1 == 15.200306866613815d);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9934865306650267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9978241125025105d) + "'", double1 == (-0.9978241125025105d));
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3018626251784624d, 0.6803629519678808d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6803629519678808d + "'", double2 == 0.6803629519678808d);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        double double1 = org.apache.commons.math.util.FastMath.sin(7.951853132063153E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.951853132062316E-7d + "'", double1 == 7.951853132062316E-7d);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5408212093041704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7174166417689328d + "'", double1 == 0.7174166417689328d);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0523598775598299d + "'", double1 == 0.0523598775598299d);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5065192423637161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6085491459180241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8377631374710781d + "'", double1 == 1.8377631374710781d);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        int int1 = org.apache.commons.math.util.FastMath.round((-4.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4) + "'", int1 == (-4));
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2447575658151468d, 5.293329949408896d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2447575658151468d + "'", double2 == 1.2447575658151468d);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.201488995569804d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34271651892329597d + "'", double1 == 0.34271651892329597d);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        double double2 = org.apache.commons.math.util.FastMath.pow(9.306943613116557d, (-0.06678466725522385d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8615858172757184d + "'", double2 == 0.8615858172757184d);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5320411334091114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7024035975902562d + "'", double1 == 0.7024035975902562d);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.9125908874543283d, 2.9290529400482024d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.681684853779354d + "'", double2 == 6.681684853779354d);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        double double1 = org.apache.commons.math.util.FastMath.atanh(43.66827237527655d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5668854225622851d, 0.31466697030166657d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5668854225622851d + "'", double2 == 0.5668854225622851d);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        double double2 = org.apache.commons.math.util.FastMath.atan2(34.18390799770244d, 0.40767170372406053d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5588710554571172d + "'", double2 == 1.5588710554571172d);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.4393066983576382d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.453574004858562d) + "'", double1 == (-0.453574004858562d));
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7542679379177583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6376882447082454d + "'", double1 == 0.6376882447082454d);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.23269451697447066d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2378644027129617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.237864402712962d + "'", double1 == 1.237864402712962d);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.3270448216204103d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24134492463194956d + "'", double1 == 0.24134492463194956d);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-2.9999999999999996d), 7.6659095108044255d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3730212381267685d) + "'", double2 == (-0.3730212381267685d));
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        double double2 = org.apache.commons.math.util.FastMath.max(36.000000000000014d, (double) 45.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 45.0d + "'", double2 == 45.0d);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5659027686649458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, (float) 149L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        double double1 = org.apache.commons.math.util.FastMath.expm1(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.0035151680352298246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15204846151015436d + "'", double1 == 0.15204846151015436d);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8076349221631601d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7226544327451406d + "'", double1 == 0.7226544327451406d);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3106472496723418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1021241580712529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.742948337347527d + "'", double1 == 0.742948337347527d);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.11831214619987152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9269706674025199d) + "'", double1 == (-0.9269706674025199d));
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.217380259166629d, 1.253350360695029d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0563284455662498d + "'", double2 == 1.0563284455662498d);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.814697265625E-6d + "'", double1 == 3.814697265625E-6d);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9948376736367679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9982762549558649d + "'", double1 == 0.9982762549558649d);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5258817486693113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.209034609522352d + "'", double1 == 1.209034609522352d);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        double double1 = org.apache.commons.math.util.FastMath.log(0.921688867296064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08154756650174319d) + "'", double1 == (-0.08154756650174319d));
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.828641396489095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 219.36499328789878d + "'", double1 == 219.36499328789878d);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.02187509047518678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0221161044594675d + "'", double1 == 1.0221161044594675d);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        int int2 = org.apache.commons.math.util.FastMath.min((-4), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.3686469200204927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 135.7134716738357d + "'", double1 == 135.7134716738357d);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.4393066983576382d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.45482676655224064d) + "'", double1 == (-0.45482676655224064d));
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 1.58601345E15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.311231547115195E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.363655626077857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37358420207865345d + "'", double1 == 0.37358420207865345d);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.42149796567476777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9124771049380547d + "'", double1 == 0.9124771049380547d);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3565686652647782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023676589738255212d + "'", double1 == 0.023676589738255212d);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3565686652647782d, 1.5706847692395227d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3565686652647782d + "'", double2 == 1.3565686652647782d);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        double double1 = org.apache.commons.math.util.FastMath.exp(236.0628816681138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.317469132454582E102d + "'", double1 == 3.317469132454582E102d);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.765184808842236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.842652032073906d + "'", double1 == 5.842652032073906d);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3745669993918974d, 1.5707651109236087d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3745669993918974d + "'", double2 == 1.3745669993918974d);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.7621956910836314d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5414729998706594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7185364026199063d + "'", double1 == 0.7185364026199063d);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.7017203400855395d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6455325219591219d) + "'", double1 == (-0.6455325219591219d));
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.056952438710966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.056952438710966d + "'", double1 == 2.056952438710966d);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.7853981633974483d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.719463918234335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9377984480378878d + "'", double1 == 0.9377984480378878d);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.7105940846527337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7105940846527337d + "'", double1 == 2.7105940846527337d);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 149, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0450588814264876d, 0.2842089146420203d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3052632916026126d + "'", double2 == 1.3052632916026126d);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5659027686649458d, 1681014.419118863d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3664361365892006E-7d + "'", double2 == 3.3664361365892006E-7d);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9912373278715739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9970705359106596d + "'", double1 == 0.9970705359106596d);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.3664361365892006E-7d, 4.214684851089406E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3664361365892E-7d + "'", double2 == 3.3664361365892E-7d);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644483341943246d + "'", double1 == 4.644483341943246d);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5707962024866189d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8044516.569932792d + "'", double1 == 8044516.569932792d);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32, 149.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8385206858446207d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5707963263292353d, 1.5021549377007268d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.970617982160289d + "'", double2 == 1.970617982160289d);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        float float2 = org.apache.commons.math.util.FastMath.min((-53.0f), (float) 1477896L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8422941990863629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6657527112301422d + "'", double1 == 0.6657527112301422d);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-2.6661203985235478d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9903800402810106d) + "'", double1 == (-0.9903800402810106d));
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        double double1 = org.apache.commons.math.util.FastMath.log(201.7156361224559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.306858963633532d + "'", double1 == 5.306858963633532d);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        double double1 = org.apache.commons.math.util.FastMath.rint(105.44019367551631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 105.0d + "'", double1 == 105.0d);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        double double1 = org.apache.commons.math.util.FastMath.floor((-3.3520838269185758d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.0d) + "'", double1 == (-4.0d));
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5215691996538042d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-29.883713864179178d) + "'", double1 == (-29.883713864179178d));
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5297042362484659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18460746939144745d + "'", double1 == 0.18460746939144745d);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        double double2 = org.apache.commons.math.util.FastMath.min(65.7839305200671d, 0.02187509047518678d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02187509047518678d + "'", double2 == 0.02187509047518678d);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9984579799537394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9984579799537394d + "'", double1 == 0.9984579799537394d);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.07439846418517579d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07433000036532472d) + "'", double1 == (-0.07433000036532472d));
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        long long2 = org.apache.commons.math.util.FastMath.max(1586013452313419L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (-0.7907435667822754d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.33704882067673875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.32484016313609476d) + "'", double1 == (-0.32484016313609476d));
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7485270909508315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.558773771225018d + "'", double1 == 0.558773771225018d);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-4.084289455298593d), 3.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.084289455298592d) + "'", double2 == (-4.084289455298592d));
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.523746987213264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5480224764689321d + "'", double1 == 0.5480224764689321d);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9171523356672742d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948954d) + "'", double1 == (-1.5707963267948954d));
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7360711750351105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6713814013480993d + "'", double1 == 0.6713814013480993d);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.002205224069989189d, 3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        long long2 = org.apache.commons.math.util.FastMath.max(1477896L, 11013L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0001353885748059d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.348658628056262d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22031529761059193d + "'", double1 == 0.22031529761059193d);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0000000421468493d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000421468491d + "'", double2 == 1.0000000421468491d);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5623823663631259d, 1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5440680443502757d + "'", double2 == 1.5440680443502757d);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        float float1 = org.apache.commons.math.util.FastMath.abs(55.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 55.0f + "'", float1 == 55.0f);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8757729564429687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1993046081449956d + "'", double1 == 1.1993046081449956d);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5502140269482249d), 0.053286411214247056d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5502140269482249d) + "'", double2 == (-0.5502140269482249d));
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.8383544794438463d), 3.317469132454582E102d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.317469132454582E102d + "'", double2 == 3.317469132454582E102d);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 149L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 149L + "'", long2 == 149L);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        double double1 = org.apache.commons.math.util.FastMath.atanh(42.281978014156664d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.680482178387856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08168982459378467d + "'", double1 == 0.08168982459378467d);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5310724756574393d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4881954908148405d) + "'", double1 == (-0.4881954908148405d));
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.862645149230957E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8626451474962336E-9d + "'", double1 == 1.8626451474962336E-9d);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8924232090626707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.13208341881215d + "'", double1 == 51.13208341881215d);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.2136609872391593d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5681767505732657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4499136391552796d + "'", double1 == 0.4499136391552796d);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2583723393689585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3073661825631483d + "'", double1 == 0.3073661825631483d);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.8375930412496614d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1102440620720302d) + "'", double1 == (-1.1102440620720302d));
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        int int1 = org.apache.commons.math.util.FastMath.round(11013.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11013 + "'", int1 == 11013);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4752832273511767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025748549716726098d + "'", double1 == 0.025748549716726098d);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.2723414689118314d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.6251071482389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2049.000000000001d + "'", double1 == 2049.000000000001d);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4393066983576382d, 0.0028590734924855603d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0028590734924855603d + "'", double2 == 0.0028590734924855603d);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6509498349092767d, 1.3297065169161864d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3297065169161864d + "'", double2 == 1.3297065169161864d);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7237289657353609d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(7.049772952917979E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2304174954646191E11d + "'", double1 == 1.2304174954646191E11d);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-2), (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.11894236074679199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34488021217053316d + "'", double1 == 0.34488021217053316d);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5343928609612147d, 1.4073861552074949d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4073861552074949d + "'", double2 == 1.4073861552074949d);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        double double1 = org.apache.commons.math.util.FastMath.signum((-7.375234893767539d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        double double1 = org.apache.commons.math.util.FastMath.ulp(13.781934843695916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8773671774142848d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3642154640752333d) + "'", double1 == (-1.3642154640752333d));
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        double double2 = org.apache.commons.math.util.FastMath.min(3.9697296111063074d, 1.4577979139729036d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4577979139729036d + "'", double2 == 1.4577979139729036d);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        double double1 = org.apache.commons.math.util.FastMath.asinh(24.35674178862402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8863770026926345d + "'", double1 == 3.8863770026926345d);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.18702182332316017d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1881295983189412d) + "'", double1 == (-0.1881295983189412d));
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25000000000000006d + "'", double1 == 0.25000000000000006d);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8849970445005177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05305817965162052d) + "'", double1 == (-0.05305817965162052d));
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        double double1 = org.apache.commons.math.util.FastMath.log(0.3707603033998556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9921995076561011d) + "'", double1 == (-0.9921995076561011d));
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.02042992181229427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0206400411325952d + "'", double1 == 0.0206400411325952d);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6997597439205169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.093279999800885d + "'", double1 == 40.093279999800885d);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 0, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(96.10655605346268d, 1.0484411939287768d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.10655605346267d + "'", double2 == 96.10655605346267d);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.04675969811694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0467596981169403d + "'", double1 == 1.0467596981169403d);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.6664505058576533d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0016940011094824d, 9.0871877068532832E16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0871877068532832E16d + "'", double2 == 9.0871877068532832E16d);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7835271334741006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6704741561210048d + "'", double1 == 0.6704741561210048d);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 36L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.027414190085478973d, 0.13016183264466877d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6261581216290331d + "'", double2 == 0.6261581216290331d);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.127345252052883d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-36), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7076312586751926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7681844027608976d) + "'", double1 == (-0.7681844027608976d));
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2584006825852871d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22984161518493007d + "'", double1 == 0.22984161518493007d);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.680774471315522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6424959163097872d + "'", double1 == 1.6424959163097872d);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7214969542037845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.022270853073133732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022272694507561284d + "'", double1 == 0.022272694507561284d);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.951853132062316E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009264517017798879d + "'", double1 == 0.009264517017798879d);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        long long1 = org.apache.commons.math.util.FastMath.round(26.339410356026733d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 26L + "'", long1 == 26L);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.433704240591099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9906175883772129d + "'", double1 == 0.9906175883772129d);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.2014038779280567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        double double1 = org.apache.commons.math.util.FastMath.atanh(6.681684853779354d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.37076030339985566d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.268524170518187d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26539759400522506d) + "'", double1 == (-0.26539759400522506d));
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.38095094490971865d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3809509449097186d + "'", double2 == 0.3809509449097186d);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        float float2 = org.apache.commons.math.util.FastMath.min(1.5472906E7f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5303019207992773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6994453290609608d + "'", double1 == 1.6994453290609608d);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        double double2 = org.apache.commons.math.util.FastMath.min(4.5087686982174615d, 0.13127977254262357d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13127977254262357d + "'", double2 == 0.13127977254262357d);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3140833526702298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0497309909515d + "'", double1 == 1.0497309909515d);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.22459997143478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        double double2 = org.apache.commons.math.util.FastMath.min(0.22490746112810533d, 0.0026974884567037482d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0026974884567037482d + "'", double2 == 0.0026974884567037482d);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        double double1 = org.apache.commons.math.util.FastMath.asin(14.899276870949834d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.5068440202380022d), 7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5068440202380022d) + "'", double2 == (-1.5068440202380022d));
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5343928609612147d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        double double1 = org.apache.commons.math.util.FastMath.atan((-33.10480098881463d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5405984104723354d) + "'", double1 == (-1.5405984104723354d));
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5520864868395452d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8203560256686975d) + "'", double1 == (-0.8203560256686975d));
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        double double1 = org.apache.commons.math.util.FastMath.log((-41.01558075875642d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        int int2 = org.apache.commons.math.util.FastMath.max(1477896, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 26L, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4077166057103022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6868023880361244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7732774675530747d + "'", double1 == 0.7732774675530747d);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.42157803635284585d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5474516357479716d) + "'", double1 == (-0.5474516357479716d));
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9377984480378878d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8062576954222263d + "'", double1 == 0.8062576954222263d);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-4), 28L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4L) + "'", long2 == (-4L));
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.022272694507561284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5485217903960327d + "'", double1 == 1.5485217903960327d);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(8.168997321391517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.168997321391519d + "'", double1 == 8.168997321391519d);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0187497017783491d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01857609283998372d + "'", double1 == 0.01857609283998372d);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1134536045423387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.031927454771116d + "'", double1 == 2.031927454771116d);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9429832520348356d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9429832520348355d) + "'", double1 == (-0.9429832520348355d));
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0035151607961293246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.650670009067568d) + "'", double1 == (-5.650670009067568d));
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        double double1 = org.apache.commons.math.util.FastMath.floor(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8062576954222263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7375472405743759d + "'", double1 == 0.7375472405743759d);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        float float2 = org.apache.commons.math.util.FastMath.max((-2.0f), 8.4677176E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.4677176E7f + "'", float2 == 8.4677176E7f);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        double double1 = org.apache.commons.math.util.FastMath.log(3.2395798055406804d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1754436317458703d + "'", double1 == 1.1754436317458703d);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.4881954908148405d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.605170185988092d, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.605170185988093d + "'", double2 == 4.605170185988093d);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000101d + "'", double1 == 100.00000000000101d);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.0222383329741738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4535367551487675d + "'", double1 == 1.4535367551487675d);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.355516912589023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2991889085111596d) + "'", double1 == (-0.2991889085111596d));
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4430227241169226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4286723297002584d + "'", double1 == 0.4286723297002584d);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9632991984933736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6203272079179196d + "'", double1 == 1.6203272079179196d);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        double double1 = org.apache.commons.math.util.FastMath.exp(471.123645247015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.040168003889966E204d + "'", double1 == 4.040168003889966E204d);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.002628524305939983d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.01684552645924234d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) (-36L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.8189894035458565E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8189894035442021E-12d + "'", double1 == 1.8189894035442021E-12d);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2556637328313829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0788418462814133d + "'", double1 == 1.0788418462814133d);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6242971965547152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2012855766700548d + "'", double1 == 1.2012855766700548d);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2L, 2.74877907E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.74877907E11f + "'", float2 == 2.74877907E11f);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2490457723982544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9486832980505138d + "'", double1 == 0.9486832980505138d);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        int int2 = org.apache.commons.math.util.FastMath.max(53, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        int int1 = org.apache.commons.math.util.FastMath.round(4.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 6, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', (float) 45L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 45.0f + "'", float2 == 45.0f);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05232886219155787d + "'", double1 == 0.05232886219155787d);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-29.883713864179178d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.756659174304436E12d) + "'", double1 == (-4.756659174304436E12d));
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.8286413964890955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9990552668871044d + "'", double1 == 0.9990552668871044d);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3246090892520057d, 79.65665351938952d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.310067841184883E9d + "'", double2 == 5.310067841184883E9d);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.4881954908148405d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4881954908148404d) + "'", double1 == (-0.4881954908148404d));
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        double double1 = org.apache.commons.math.util.FastMath.ceil(52.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.0d + "'", double1 == 53.0d);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5570698013513056d, 9.99997885478613d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 83.76773101727919d + "'", double2 == 83.76773101727919d);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.567739246697935d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1555081393936252d + "'", double2 == 0.1555081393936252d);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        double double1 = org.apache.commons.math.util.FastMath.atanh(11.548739357257746d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.680482178387855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.247769699670448d + "'", double1 == 2.247769699670448d);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.3678794411714423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9330920755982086d + "'", double1 == 0.9330920755982086d);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 84677176, 0.17542037193601015d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17542037193601015d + "'", double2 == 0.17542037193601015d);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.61512051684126d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.1048285727011695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4508027339032588d + "'", double1 == 1.4508027339032588d);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0000000004872154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077263238677d + "'", double1 == 1.5574077263238677d);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        double double1 = org.apache.commons.math.util.FastMath.tanh(105.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6063268761536349d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8463869133158289d + "'", double1 == 0.8463869133158289d);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.37076030339985566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35504850493149953d + "'", double1 == 0.35504850493149953d);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 28L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.291502622129181d + "'", double1 == 5.291502622129181d);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5344625446055697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009328131131954251d + "'", double1 == 0.009328131131954251d);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.741297982545108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08275126061357677d + "'", double1 == 0.08275126061357677d);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.9481478479872E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948712d + "'", double1 == 1.5707963267948712d);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        double double2 = org.apache.commons.math.util.FastMath.min(28.45884779991685d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) (-36L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.006625307971731655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.187817197929678d + "'", double1 == 0.187817197929678d);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.201488995569804d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5302764730926062d + "'", double1 == 1.5302764730926062d);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7722028462284364d + "'", double1 == 0.7722028462284364d);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.4678297255314154d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 35, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.018085164638296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9952300096280062d + "'", double1 == 0.9952300096280062d);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5598925417941161d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        int int1 = org.apache.commons.math.util.FastMath.round(9.223372E18f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        int int1 = org.apache.commons.math.util.FastMath.round(2.74877907E11f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.784134301546406d, 55.37844799163721d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014158611008253509d + "'", double2 == 0.014158611008253509d);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.60978210179491616E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.725864345518537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.762595266812182d + "'", double1 == 7.762595266812182d);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        double double1 = org.apache.commons.math.util.FastMath.log(0.881370696966641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12627697313707573d) + "'", double1 == (-0.12627697313707573d));
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.8377631374710781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 105.29607152181329d + "'", double1 == 105.29607152181329d);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.27767826196252E83d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.31053720517096894d) + "'", double1 == (-0.31053720517096894d));
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4650188248182272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10558035700584559d + "'", double1 == 0.10558035700584559d);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.2711459741908265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0369858394385183d + "'", double1 == 1.0369858394385183d);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.2851156853967676d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 36);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        double double2 = org.apache.commons.math.util.FastMath.pow(65.7839305200671d, 1.2556637328313829d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 191.84351280658734d + "'", double2 == 191.84351280658734d);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9994533134057076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6928737998977109d + "'", double1 == 0.6928737998977109d);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7206435247136849d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6694963894787934d + "'", double1 == 0.6694963894787934d);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6826664571216055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6384085668285737d + "'", double1 == 0.6384085668285737d);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.0808866710930326E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0808866710930027E-7d + "'", double1 == 2.0808866710930027E-7d);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.09531017980432487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.456786327633631d + "'", double1 == 0.456786327633631d);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.6475439282580142d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.01386515085673384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        double double2 = org.apache.commons.math.util.FastMath.max(3.694990094719959d, 3.9481478479872E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9481478479872E13d + "'", double2 == 3.9481478479872E13d);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-10.017874927409903d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.121587127777053E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1215871282840145E-5d + "'", double1 == 3.1215871282840145E-5d);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        double double1 = org.apache.commons.math.util.FastMath.abs(9.306922469822426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306922469822426d + "'", double1 == 9.306922469822426d);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-36L), (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        double double2 = org.apache.commons.math.util.FastMath.max(1.2012855766700548d, 2.1662915285707833d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1662915285707833d + "'", double2 == 2.1662915285707833d);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5598925417941161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5341303138750584d + "'", double1 == 0.5341303138750584d);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.44671356483539665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1077076909888397d + "'", double1 == 1.1077076909888397d);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7005202664493964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7761262757231032d + "'", double1 == 0.7761262757231032d);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9260416922830169d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0798649870014492d + "'", double2 == 1.0798649870014492d);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        double double1 = org.apache.commons.math.util.FastMath.rint(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.0d + "'", double1 == 11013.0d);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.01706683222077747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.257464668395979d + "'", double1 == 0.257464668395979d);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5987609268125889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8198624600147784d + "'", double1 == 1.8198624600147784d);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        float float2 = org.apache.commons.math.util.FastMath.min(1.5472906E7f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 52L, 0.24619002710729043d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5660619385698706d + "'", double2 == 1.5660619385698706d);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        long long2 = org.apache.commons.math.util.FastMath.min(15472906L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.053286411214247056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.053236062412679155d + "'", double1 == 0.053236062412679155d);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        double double1 = org.apache.commons.math.util.FastMath.asin(105.29607152181329d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-89.2328896037985d) + "'", double1 == (-89.2328896037985d));
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        double double1 = org.apache.commons.math.util.FastMath.ceil(191.84351280658734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 192.0d + "'", double1 == 192.0d);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.085536923187668d + "'", double1 == 20.085536923187668d);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5785150749710588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7833882657167645d + "'", double1 == 0.7833882657167645d);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 416128, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 416128.0f + "'", float2 == 416128.0f);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5874010519681996d + "'", double1 == 1.5874010519681996d);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-3.6268604078470186d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.2638973976934564E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4198319429984294E37d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4198319429984294E37d + "'", double1 == 1.4198319429984294E37d);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2185696235757997d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        long long2 = org.apache.commons.math.util.FastMath.min(15472906L, (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3887317335324654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1784446247204259d + "'", double1 == 1.1784446247204259d);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5447358754943394d, 0.13937364645376973d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9188217726326442d + "'", double2 == 0.9188217726326442d);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9970705359106596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7839312838178244d + "'", double1 == 0.7839312838178244d);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9899924966004454d), (-36.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.114099791007893d) + "'", double2 == (-3.114099791007893d));
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.34555558058171215d), 0.4932054413052554d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.34555558058171215d) + "'", double2 == (-0.34555558058171215d));
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.653673562487557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6315355878229942d + "'", double1 == 1.6315355878229942d);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 55L, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (-4.0f), 11.591953275521519d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.33227338136174506d) + "'", double2 == (-0.33227338136174506d));
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        double double1 = org.apache.commons.math.util.FastMath.sinh(22.24855859029184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2982445049454165E9d + "'", double1 == 2.2982445049454165E9d);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.2835736696417744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5325163562199516d + "'", double1 == 0.5325163562199516d);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        int int1 = org.apache.commons.math.util.FastMath.abs(416128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 416128 + "'", int1 == 416128);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5341303138750584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27235277350985465d) + "'", double1 == (-0.27235277350985465d));
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9999959128521664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7201065497963348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3283560920926158d) + "'", double1 == (-0.3283560920926158d));
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        double double1 = org.apache.commons.math.util.FastMath.cos(31.330643198305168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9963655798023592d + "'", double1 == 0.9963655798023592d);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.768115672379123E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30250.188000121576d + "'", double1 == 30250.188000121576d);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.5815258540844123d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.191399364288735d + "'", double1 == 2.191399364288735d);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7542679379177583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2982046836284908d + "'", double1 == 1.2982046836284908d);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        double double1 = org.apache.commons.math.util.FastMath.rint(83.76773101727919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 84.0d + "'", double1 == 84.0d);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        int int2 = org.apache.commons.math.util.FastMath.max((-4), 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-4), (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4L) + "'", long2 == (-4L));
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        double double1 = org.apache.commons.math.util.FastMath.ulp(803226.6141649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1641532182693481E-10d + "'", double1 == 1.1641532182693481E-10d);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        long long2 = org.apache.commons.math.util.FastMath.min(1477896L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.691649480399158E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.849561650499365E20d + "'", double1 == 6.849561650499365E20d);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.8286413964890955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03490658503988659d + "'", double1 == 0.03490658503988659d);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.8369144593899815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2771399790034055d + "'", double1 == 5.2771399790034055d);
    }
}


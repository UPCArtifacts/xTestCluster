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
        double double1 = org.apache.commons.math.util.FastMath.abs(2.138692313968385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.138692313968385d + "'", double1 == 2.138692313968385d);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.21348529365373875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21348529365373872d) + "'", double1 == (-0.21348529365373872d));
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4369873807744509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025080161104123633d + "'", double1 == 0.025080161104123633d);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2378644027129617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.7568396789787597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.559583514754563d + "'", double1 == 1.559583514754563d);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2147483647);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        double double2 = org.apache.commons.math.util.FastMath.min(6.766375983153399E-7d, 3.0537144249814574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.766375983153399E-7d + "'", double2 == 6.766375983153399E-7d);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.33932123363772365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2921629435656496d + "'", double1 == 0.2921629435656496d);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308232d + "'", double1 == 57.29577951308232d);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.24928153889173274d), 4.680482178387855d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.680482178387855d + "'", double2 == 4.680482178387855d);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.10757413843619562d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.98717325326644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5789007127791432d + "'", double1 == 3.5789007127791432d);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.8369144593899815d, 0.6105647004975027d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4495839778291926d + "'", double2 == 1.4495839778291926d);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        double double2 = org.apache.commons.math.util.FastMath.max(2.097129110263696d, (-0.268524170518187d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.097129110263696d + "'", double2 == 2.097129110263696d);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.3194821852228826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7581226324091722d, 7.2638973976934564E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7581226324091723d + "'", double2 == 0.7581226324091723d);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574077246549023d) + "'", double1 == (-1.5574077246549023d));
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1477896, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.311329466289671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3113294662896715d + "'", double1 == 2.3113294662896715d);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        double double2 = org.apache.commons.math.util.FastMath.min(1.175201187282749d, 0.6108652381980153d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6108652381980153d + "'", double2 == 0.6108652381980153d);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        double double1 = org.apache.commons.math.util.FastMath.atan(10.523809523809524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.476058158779025d + "'", double1 == 1.476058158779025d);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.4957317426056835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        double double1 = org.apache.commons.math.util.FastMath.asin(35.21318466623103d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8943859157098326d, 100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.008943620687644805d + "'", double2 == 0.008943620687644805d);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.540302305868139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7165256995489022d + "'", double1 == 0.7165256995489022d);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 149L, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.25469727314226837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2546972731422684d + "'", double1 == 0.2546972731422684d);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8420042837526478d, 2.291904389212817d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8420042837526478d + "'", double2 == 0.8420042837526478d);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.8241115710409757d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        double double1 = org.apache.commons.math.util.FastMath.cos((-6.053272382792838d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9736862425967708d + "'", double1 == 0.9736862425967708d);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.07414666724177091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2482910979143895d + "'", double1 == 4.2482910979143895d);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(167631.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.1380553813981d + "'", double1 == 55.1380553813981d);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5912595710565535E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.26022281860914137d), 4.267909605184542d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.267909605184542d + "'", double2 == 4.267909605184542d);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.3480172585170018d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5586003788994619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5823209471693539d) + "'", double1 == (-0.5823209471693539d));
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4110599028199951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4236164312943335d + "'", double1 == 0.4236164312943335d);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8243712042404339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6774420217837002d + "'", double1 == 0.6774420217837002d);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4073861552074949d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0852631923464764d + "'", double1 == 3.0852631923464764d);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.02411494803001423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(471.123645247015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.781171137477771d + "'", double1 == 7.781171137477771d);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.4758285569314635d, 1.2791426222204005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.475828556931463d + "'", double2 == 2.475828556931463d);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        float float2 = org.apache.commons.math.util.FastMath.max(35.0f, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        double double1 = org.apache.commons.math.util.FastMath.log10(44.770142683335514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6509884784908055d + "'", double1 == 1.6509884784908055d);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        double double1 = org.apache.commons.math.util.FastMath.abs(35.69314718055995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.69314718055995d + "'", double1 == 35.69314718055995d);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52L, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.9154315634767938d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.761511811895975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7051538975941565d + "'", double1 == 0.7051538975941565d);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0871877068532768E16d + "'", double1 == 9.0871877068532768E16d);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.03353507713878987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03354765682638067d + "'", double1 == 0.03354765682638067d);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.634578497998064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6780340105920696d + "'", double1 == 0.6780340105920696d);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9975366607028199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5423734930288137d + "'", double1 == 0.5423734930288137d);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.9562645537814451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.034143257503543904d + "'", double1 == 0.034143257503543904d);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5433467420946743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027446137712611524d + "'", double1 == 0.027446137712611524d);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8623188722876837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6218224167640863d + "'", double1 == 0.6218224167640863d);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-2.1137231068183593d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.4881954908148405d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9663516425671944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9663516425671944d + "'", double1 == 0.9663516425671944d);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.724275869600789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.4642859456318895d) + "'", double1 == (-6.4642859456318895d));
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7531517633868128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7531517633868128d + "'", double1 == 0.7531517633868128d);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        double double1 = org.apache.commons.math.util.FastMath.log10(52.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7160033436347992d + "'", double1 == 1.7160033436347992d);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        double double1 = org.apache.commons.math.util.FastMath.atanh(7.225973768125749E86d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.6691802474911265E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        double double1 = org.apache.commons.math.util.FastMath.log1p(7.9277663657849295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1891662365896636d + "'", double1 == 2.1891662365896636d);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 53.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.206879716514544E22d + "'", double1 == 5.206879716514544E22d);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.008838092819754681d), 0.9999424817108994d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.008838371052019397d) + "'", double2 == (-0.008838371052019397d));
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.18276587140654418d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0000000000000009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557653d + "'", double1 == 0.7615941559557653d);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3440585709080869E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.30685281944007d + "'", double1 == 99.30685281944007d);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4400297437607181d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3646637687639772d + "'", double1 == 0.3646637687639772d);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        double double1 = org.apache.commons.math.util.FastMath.cos(8.4677176E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6960824080015361d + "'", double1 == 0.6960824080015361d);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3565686652647782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1069990812243715d + "'", double1 == 1.1069990812243715d);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5267041877018416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9916299884373267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7811955944788658d) + "'", double1 == (-0.7811955944788658d));
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-2), 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0000000000035623d, 1.6783632786807827d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000059788d + "'", double2 == 1.0000000000059788d);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 32.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6376882447082454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.0222383329741738d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3127199080565219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31784189721835715d + "'", double1 == 0.31784189721835715d);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.2200909184537633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2263663666197746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.011800076512800234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.00848826368395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.004235163536883d + "'", double1 == 1.004235163536883d);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6427991330798924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.687989146026119d + "'", double1 == 0.687989146026119d);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7410435382626417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0981238450044923d + "'", double1 == 2.0981238450044923d);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        double double2 = org.apache.commons.math.util.FastMath.max(4.267909605184542d, 0.7360711750351105d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.267909605184542d + "'", double2 == 4.267909605184542d);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9171473774587547d, 3.3480571885407375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.26737507814968237d + "'", double2 == 0.26737507814968237d);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7020228836336021d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8378680586068442d + "'", double1 == 0.8378680586068442d);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.008837977760189568d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.21689041524151353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21862792669197736d + "'", double1 == 0.21862792669197736d);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        double double1 = org.apache.commons.math.util.FastMath.log(14.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6390573296152584d + "'", double1 == 2.6390573296152584d);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        double double1 = org.apache.commons.math.util.FastMath.log(1.521129310212147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41945302623948505d + "'", double1 == 0.41945302623948505d);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.008943620687644805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20757312514495754d + "'", double1 == 0.20757312514495754d);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.521129310212147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 87.15428956880217d + "'", double1 == 87.15428956880217d);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.008838092819754681d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8743692948528521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9018391760035765d, 0.7853981633974484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8543017348099278d + "'", double2 == 0.8543017348099278d);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.736589899020896d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4380253164811876d, 1.2378644027129617d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2378644027129617d + "'", double2 == 1.2378644027129617d);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.4311581967195641d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4446414441314305d) + "'", double1 == (-0.4446414441314305d));
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        int int2 = org.apache.commons.math.util.FastMath.min(84677176, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(14.899276870949834d, 0.9830787956514044d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.899276870949832d + "'", double2 == 14.899276870949832d);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9754001961551924d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8279263991776009d) + "'", double1 == (-0.8279263991776009d));
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7588984970945903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5646877591982128d + "'", double1 == 0.5646877591982128d);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041914822473389d + "'", double1 == 4.041914822473389d);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0363623432113664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6895067407632058d + "'", double1 == 1.6895067407632058d);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        long long2 = org.apache.commons.math.util.FastMath.min(36L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.768115659666964E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30250.187953815082d + "'", double1 == 30250.187953815082d);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3522829578815d + "'", double1 == 2005.3522829578815d);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        long long2 = org.apache.commons.math.util.FastMath.min(2147483647L, 1477896L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.147483647E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1161530356493914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019480545428211527d + "'", double1 == 0.019480545428211527d);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.36232417902938024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43666460301404963d + "'", double1 == 0.43666460301404963d);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        double double2 = org.apache.commons.math.util.FastMath.max(200.00499987500626d, 0.6530481872478414d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 200.00499987500626d + "'", double2 == 200.00499987500626d);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9589242746631385d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4250920813534227d) + "'", double1 == (-1.4250920813534227d));
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.214684851089404E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.0d, 1.5494213976540494d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.486076778602998d + "'", double2 == 5.486076778602998d);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        double double1 = org.apache.commons.math.util.FastMath.signum(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4779900867225375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9074477826834271d + "'", double1 == 0.9074477826834271d);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        double double2 = org.apache.commons.math.util.FastMath.min(8.881784197001248E-16d, 0.2471906124334223d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.881784197001248E-16d + "'", double2 == 8.881784197001248E-16d);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.6691802474911265E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.5736220976821045d) + "'", double1 == (-5.5736220976821045d));
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.02137167427366076d), 4.494563888756254d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.494563888756254d + "'", double2 == 4.494563888756254d);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5802135739451127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.548202570919862d + "'", double1 == 0.548202570919862d);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5472906394139022E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.21496017549925742d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1934264390728977d) + "'", double1 == (-0.1934264390728977d));
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        float float1 = org.apache.commons.math.util.FastMath.abs(3.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        double double2 = org.apache.commons.math.util.FastMath.max(0.08838879722590735d, 2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0634370688955608d + "'", double2 == 2.0634370688955608d);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5195675877329186d, 55.367870644634905d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5195675877329187d + "'", double2 == 0.5195675877329187d);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 11013, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.21348529365373872d), 1.2112226438198959d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2134852936537387d) + "'", double2 == (-0.2134852936537387d));
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.1758611674202721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.2622510397683969d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.363655626077857d, 3.0537144249814574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.829913596651863d + "'", double2 == 13.829913596651863d);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        double double1 = org.apache.commons.math.util.FastMath.log10(1262023.5276316951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.101067451441691d + "'", double1 == 6.101067451441691d);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5015887158341327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.794540280252645d + "'", double1 == 0.794540280252645d);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        double double2 = org.apache.commons.math.util.FastMath.min(2.270441887429704d, 5.852975109821626E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.852975109821626E-4d + "'", double2 == 5.852975109821626E-4d);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1747253020465267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9225838959664566d + "'", double1 == 0.9225838959664566d);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9250245035569947d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6034782972361921d) + "'", double1 == (-0.6034782972361921d));
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5413728739027834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009448739130587655d + "'", double1 == 0.009448739130587655d);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9999424817108994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7181254820354117d + "'", double1 == 2.7181254820354117d);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0001116543485011d, 0.492549213298881d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.492549213298881d + "'", double2 == 0.492549213298881d);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6076102029351266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21637494211468025d) + "'", double1 == (-0.21637494211468025d));
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.74342314569772E-5d, 2.6701224592653805d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9677175604421164E-13d + "'", double2 == 1.9677175604421164E-13d);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.5556080775287264d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7889389978403197d) + "'", double1 == (-0.7889389978403197d));
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6701982005616954d, 0.415289655969459d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8468841612020394d + "'", double2 == 0.8468841612020394d);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.39592515018183416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41880727536983153d) + "'", double1 == (-0.41880727536983153d));
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        float float1 = org.apache.commons.math.util.FastMath.abs(57.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 57.0f + "'", float1 == 57.0f);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        double double2 = org.apache.commons.math.util.FastMath.max(0.540302305868139d, 9.306943617238488d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.306943617238488d + "'", double2 == 9.306943617238488d);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-4.632512904931238d), 3.4694469519536138E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-2.251799813685243E15d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.282781601724098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2754775569909996d + "'", double1 == 0.2754775569909996d);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.34679171459871794d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.073779252550484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0737792525504846d + "'", double1 == 2.0737792525504846d);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.44736775427009084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9015889177303088d + "'", double1 == 0.9015889177303088d);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        double double2 = org.apache.commons.math.util.FastMath.atan2(31.999999999999996d, 0.0017885376783303671d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570740434992507d + "'", double2 == 1.570740434992507d);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4670602929020586d, 5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.267831587699267d + "'", double2 == 5.267831587699267d);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8674940695502573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        float float2 = org.apache.commons.math.util.FastMath.max(1477896.0f, (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        double double1 = org.apache.commons.math.util.FastMath.expm1(8.881784197001248E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.343185164137478E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6940436.902830199d + "'", double1 == 6940436.902830199d);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.9977506581384374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9102311822245078d + "'", double1 == 0.9102311822245078d);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.8691222135114136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        double double1 = org.apache.commons.math.util.FastMath.cosh(6.491429796429747E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000000002d + "'", double1 == 1.000000000000002d);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.2239800905693157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6077178770248709d) + "'", double1 == (-0.6077178770248709d));
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 115L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 115.0f + "'", float1 == 115.0f);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.71828182845905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3132616875182241d + "'", double1 == 1.3132616875182241d);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        double double1 = org.apache.commons.math.util.FastMath.log10(14.174068730929205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.151494534351201d + "'", double1 == 1.151494534351201d);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.339637404328899d, (-0.2492815388917327d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7547734575403355d + "'", double2 == 1.7547734575403355d);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6883420083174141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8829472498848988d + "'", double1 == 0.8829472498848988d);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8580016718173996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9502314013655482d + "'", double1 == 0.9502314013655482d);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.044524487391685E157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        double double1 = org.apache.commons.math.util.FastMath.log(1.476058158779025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38937512836882326d + "'", double1 == 0.38937512836882326d);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.529104380392399d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-87.61122743145124d) + "'", double1 == (-87.61122743145124d));
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.680915307843775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8999780005767564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.564941087670505d + "'", double1 == 51.564941087670505d);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.7568396789787597d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.0066253564415875025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4343980560668567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4493698777773448d + "'", double1 == 0.4493698777773448d);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.6316845824854256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21263620997833557d + "'", double1 == 0.21263620997833557d);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        double double1 = org.apache.commons.math.util.FastMath.cos((-4.079110090920021d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.591791019100031d) + "'", double1 == (-0.591791019100031d));
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(92560.48544260226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1615.4852282176905d + "'", double1 == 1615.4852282176905d);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 36);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9155040003582885E22d, 1.1624473515096263d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1624473515096263d + "'", double2 == 1.1624473515096263d);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.8108072797718955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.581016986177585d + "'", double1 == 0.581016986177585d);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.6239190567167857d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5358403285876145d + "'", double1 == 0.5358403285876145d);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5862079620765748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.885188938755962d + "'", double1 == 4.885188938755962d);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        double double2 = org.apache.commons.math.util.FastMath.min(1.4379819809736698d, 105.44019367551631d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4379819809736698d + "'", double2 == 1.4379819809736698d);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.7160033436347992d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.2123899885214408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2366300625802217d + "'", double1 == 0.2366300625802217d);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 57);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43616475524782494d + "'", double1 == 0.43616475524782494d);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        double double1 = org.apache.commons.math.util.FastMath.abs((-6.4642859456318895d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.4642859456318895d + "'", double1 == 6.4642859456318895d);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        double double1 = org.apache.commons.math.util.FastMath.log10(22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.342944819032518d + "'", double1 == 4.342944819032518d);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9975366607028198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7605576742458647d + "'", double1 == 0.7605576742458647d);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.7571902525277983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7571902525277983d + "'", double1 == 3.7571902525277983d);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        float float2 = org.apache.commons.math.util.FastMath.max(32.0f, (float) 1477896L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.383255525197761d, 1.0076789965809125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9412085051809825d + "'", double2 == 0.9412085051809825d);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (-53L), (double) (-2L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6085142792617608d) + "'", double2 == (-1.6085142792617608d));
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 57L, (float) 115L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.35708453783909466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.709453085291442d + "'", double1 == 0.709453085291442d);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(11014.0d, 0.927002471590281d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.999999999998d + "'", double2 == 11013.999999999998d);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5604874136486533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604874136486535d + "'", double1 == 1.5604874136486535d);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        int int2 = org.apache.commons.math.util.FastMath.min(100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 4L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1578212823495775d + "'", double1 == 1.1578212823495775d);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) 53L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.385849999980594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8524213068750052d + "'", double1 == 0.8524213068750052d);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.912812809961445d, 1.3574158419544757d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.371681402258948d + "'", double2 == 6.371681402258948d);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        float float2 = org.apache.commons.math.util.FastMath.min(57.0f, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.214684851089402E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999991d + "'", double1 == 0.9999999999999991d);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.8404766374262674d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6860614383184498d) + "'", double1 == (-0.6860614383184498d));
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9178792555725124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08568942688989699d) + "'", double1 == (-0.08568942688989699d));
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        float float2 = org.apache.commons.math.util.FastMath.max(8.4677176E7f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.4677176E7f + "'", float2 == 8.4677176E7f);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.1934264390728977d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0148369064941645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.08341665804059989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.779422446812397d + "'", double1 == 4.779422446812397d);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 32, (-0.9999999999999958d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999958d) + "'", double2 == (-0.9999999999999958d));
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.004407855229809197d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004407855229809197d + "'", double1 == 0.004407855229809197d);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.692617892345774d + "'", double1 == 8.692617892345774d);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (-53.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9754001961551926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7510677804443033d) + "'", double1 == (-0.7510677804443033d));
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.837131699124806d), (-49.011857372290144d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8371316991248061d) + "'", double2 == (-0.8371316991248061d));
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.983031862437426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1491859173764585d + "'", double1 == 1.1491859173764585d);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.07414666724177091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07407874621034372d + "'", double1 == 0.07407874621034372d);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0066253564415875025d, 1.5707558589185557d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.00421791656147471d + "'", double2 == 0.00421791656147471d);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 84677176, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 84677176L + "'", long2 == 84677176L);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7211038773899042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6247496728951809d + "'", double1 == 0.6247496728951809d);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.31712849292107215d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.267909605184542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42998790048727914d) + "'", double1 == (-0.42998790048727914d));
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1046225788468809d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1046225788468806d + "'", double2 == 1.1046225788468806d);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6483608274590866d, 4.494563888756254d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.494563888756254d + "'", double2 == 4.494563888756254d);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        float float1 = org.apache.commons.math.util.FastMath.abs(32.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.2472279286356684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.245676816900702d) + "'", double1 == (-1.245676816900702d));
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8623188722876837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.368646920020492d + "'", double1 == 2.368646920020492d);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9999999999999999d), 0.11831214619987152d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4119499585462214d, 1.6509884784908055d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6509884784908055d + "'", double2 == 1.6509884784908055d);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        long long2 = org.apache.commons.math.util.FastMath.max(149L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 149L + "'", long2 == 149L);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.1624473515096263d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.162447351509626d) + "'", double1 == (-1.162447351509626d));
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.4236164312943335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007393501491634464d + "'", double1 == 0.007393501491634464d);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        double double1 = org.apache.commons.math.util.FastMath.atan((-86.33580274416312d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5592141644436837d) + "'", double1 == (-1.5592141644436837d));
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.18106042748149917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.373998331524408d + "'", double1 == 10.373998331524408d);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4657022738769552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.3600357884336912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3075110144264994d + "'", double1 == 0.3075110144264994d);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9908886150478887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5266323591684456d + "'", double1 == 1.5266323591684456d);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.25743468985150686d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.09267307410348408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0016174502710504894d + "'", double1 == 0.0016174502710504894d);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.0962532307185966d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.583108182225291E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000035831146015d + "'", double1 == 1.0000035831146015d);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        double double2 = org.apache.commons.math.util.FastMath.min(0.06085912128862039d, 0.7206435247136849d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06085912128862039d + "'", double2 == 0.06085912128862039d);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6428702637760138d, 0.8336269685240393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8336269685240393d + "'", double2 == 0.8336269685240393d);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0077322051969947875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.673617379884035E-19d + "'", double1 == 8.673617379884035E-19d);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        int int2 = org.apache.commons.math.util.FastMath.max(11013, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(20.135010823031887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35142223378659976d + "'", double1 == 0.35142223378659976d);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 149, 1586013452313419L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1586013452313419L + "'", long2 == 1586013452313419L);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.3605663563338206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6004717781326785d + "'", double1 == 0.6004717781326785d);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        double double2 = org.apache.commons.math.util.FastMath.max(0.35708453783909466d, 0.5982487386901945d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5982487386901945d + "'", double2 == 0.5982487386901945d);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9048544643595436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8492204648891346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.623488653973615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7306922102916164d + "'", double1 == 0.7306922102916164d);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        double double2 = org.apache.commons.math.util.FastMath.min(11013.232874695796d, 0.5414729998706594d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5414729998706594d + "'", double2 == 0.5414729998706594d);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.69314718055995d + "'", double1 == 52.69314718055995d);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.729577951308232d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.757740976791324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7577409767913241d + "'", double1 == 0.7577409767913241d);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.041984501486787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6065946439314696d + "'", double1 == 0.6065946439314696d);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.7456418720467646d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1477895.9999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(43.42944819032519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2488.324087887704d + "'", double1 == 2488.324087887704d);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.8688562153383979d), 0.5642465536043678d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.8688562153383976d) + "'", double2 == (-1.8688562153383976d));
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4761519398724137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4761519398724139d + "'", double1 == 1.4761519398724139d);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5781043205336559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9543927957373938d + "'", double1 == 0.9543927957373938d);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5707963267738794d, 0.7282657137693634d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267738794d + "'", double2 == 1.5707963267738794d);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.408849339280523d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6065946439314696d, 3.5835189384561104d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.166729680768071d + "'", double2 == 0.166729680768071d);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.388267471840758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.321264196906668d + "'", double1 == 2.321264196906668d);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3023186765274488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7029569194264695d + "'", double1 == 1.7029569194264695d);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        double double1 = org.apache.commons.math.util.FastMath.log((-2.5049299044217186d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.011029879034124758d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.781171137477771d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5084443253324786d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.3852968325547366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3361261908684114d + "'", double1 == 1.3361261908684114d);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        long long1 = org.apache.commons.math.util.FastMath.round(0.07407874621034372d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4032630823831073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3924217616740467d + "'", double1 == 0.3924217616740467d);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9429808081566275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8607616271094027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.296276891303204d + "'", double1 == 1.296276891303204d);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5013507798060324d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.4250920813534227d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1524804875517143d) + "'", double1 == (-1.1524804875517143d));
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6879577661240026d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6879577661240025d + "'", double2 == 0.6879577661240025d);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        double double1 = org.apache.commons.math.util.FastMath.exp(13.781934843695916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 966981.6941481612d + "'", double1 == 966981.6941481612d);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        double double2 = org.apache.commons.math.util.FastMath.min(0.01180062424654847d, 0.8461684323333869d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01180062424654847d + "'", double2 == 0.01180062424654847d);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5707558589185557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5090853520332064d + "'", double1 == 2.5090853520332064d);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7672312144687762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        double double2 = org.apache.commons.math.util.FastMath.min(96.10655605346268d, (-0.22481137595997358d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.22481137595997358d) + "'", double2 == (-0.22481137595997358d));
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7027403004155557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7792419376831017d + "'", double1 == 0.7792419376831017d);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2829807711056233E14d, 0.6982469888270821d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6982469888270821d + "'", double2 == 0.6982469888270821d);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9999984005652075d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.037396450599555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8037511215230416d + "'", double1 == 0.8037511215230416d);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.570796217597235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.162447324572857d + "'", double1 == 1.162447324572857d);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        double double1 = org.apache.commons.math.util.FastMath.log(5.388267471840758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6842238994542127d + "'", double1 == 1.6842238994542127d);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        int int2 = org.apache.commons.math.util.FastMath.max(36, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 0, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        double double1 = org.apache.commons.math.util.FastMath.cos((-55.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022126756261955736d + "'", double1 == 0.022126756261955736d);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7572971775997339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5637769341169547d + "'", double1 == 0.5637769341169547d);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2142337871918323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9371022206832453d + "'", double1 == 0.9371022206832453d);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.006589358495248128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5642069206141151d + "'", double1 == 1.5642069206141151d);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        double double1 = org.apache.commons.math.util.FastMath.log(3.708744903392718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3106935184103474d + "'", double1 == 1.3106935184103474d);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.9719444690199132E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.70191572631413d + "'", double1 == 57.70191572631413d);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.011029208157548202d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0110292081575482d) + "'", double1 == (-0.0110292081575482d));
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.7365898990208962d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4761519398724139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4670602929020584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.17635156360968d + "'", double1 == 1.17635156360968d);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-53), (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5026209698040973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6879189320925984d) + "'", double1 == (-0.6879189320925984d));
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4488357507586564d, (-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4488357507586562d + "'", double2 == 1.4488357507586562d);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.9481478479872E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5618536070571041d) + "'", double1 == (-0.5618536070571041d));
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        double double1 = org.apache.commons.math.util.FastMath.asinh(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        double double1 = org.apache.commons.math.util.FastMath.expm1(13268.823645422231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.09969305692768458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09952800231331152d + "'", double1 == 0.09952800231331152d);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848078964d + "'", double1 == 0.8414709848078964d);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        double double1 = org.apache.commons.math.util.FastMath.exp(53.90638748024775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5777845832455183E23d + "'", double1 == 2.5777845832455183E23d);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1046225788468809d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45353613234378093d + "'", double1 == 0.45353613234378093d);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0076108850910483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12329842152485081d + "'", double1 == 0.12329842152485081d);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        int int1 = org.apache.commons.math.util.FastMath.round(35.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.212015649612875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6401883983615237d + "'", double1 == 0.6401883983615237d);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931221821223308d + "'", double1 == 0.6931221821223308d);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2048.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.699208415745597d + "'", double1 == 12.699208415745597d);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9912373278715739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5328418429405195d + "'", double1 == 1.5328418429405195d);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.6997678580926362d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6440401179566951d) + "'", double1 == (-0.6440401179566951d));
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        int int2 = org.apache.commons.math.util.FastMath.max(84677176, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84677176 + "'", int2 == 84677176);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        float float2 = org.apache.commons.math.util.FastMath.min(3.9481478E13f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.1817363258761233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03807848229690231d + "'", double1 == 0.03807848229690231d);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44127637925208785d + "'", double1 == 0.44127637925208785d);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        double double2 = org.apache.commons.math.util.FastMath.pow(200.0d, 0.9075712110370514d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 122.55995132216341d + "'", double2 == 122.55995132216341d);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5143524375699184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5143524375699186d + "'", double1 == 0.5143524375699186d);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.492549213298881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0363623432113664d, 2.185039863261519d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.08116883210995d + "'", double2 == 1.08116883210995d);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0118705263048873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.598838319671569d + "'", double1 == 1.598838319671569d);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.3284512750821519d), 0.006396878559837075d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5513229058370135d) + "'", double2 == (-1.5513229058370135d));
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2263663666197746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.032743650897659d + "'", double1 == 1.032743650897659d);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.09969305692768458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950347615814844d + "'", double1 == 0.9950347615814844d);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        double double2 = org.apache.commons.math.util.FastMath.min(42.12656474461543d, (-0.6319270787987707d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6319270787987707d) + "'", double2 == (-0.6319270787987707d));
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2992240294445547d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        long long1 = org.apache.commons.math.util.FastMath.abs(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.0077322051969947875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0879329585365737d + "'", double1 == 0.0879329585365737d);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        double double1 = org.apache.commons.math.util.FastMath.tan(11013.232874703415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5049299044084856d) + "'", double1 == (-2.5049299044084856d));
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5600707647582166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9154319198454343d + "'", double1 == 0.9154319198454343d);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        double double1 = org.apache.commons.math.util.FastMath.sin(6.491429796429747E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.491429796429743E-8d + "'", double1 == 6.491429796429743E-8d);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4752832273511767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.138391912273988d + "'", double1 == 1.138391912273988d);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0038586340573412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.787323762949519d + "'", double1 == 0.787323762949519d);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8713868162390156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9334810208242135d + "'", double1 == 0.9334810208242135d);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.20535382550526307d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0035841003866327486d) + "'", double1 == (-0.0035841003866327486d));
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4067132730318201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02455177824591122d + "'", double1 == 0.02455177824591122d);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        double double1 = org.apache.commons.math.util.FastMath.atan(55.1380553813981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5526620205885364d + "'", double1 == 1.5526620205885364d);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        double double2 = org.apache.commons.math.util.FastMath.min(1.4495725029967728d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.154434690031884d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.02651157679069284d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29818000622065877d) + "'", double1 == (-0.29818000622065877d));
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2396109578603927d + "'", double1 == 2.2396109578603927d);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        double double1 = org.apache.commons.math.util.FastMath.asin(248.5313787931064d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0141303618583601d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        double double1 = org.apache.commons.math.util.FastMath.asin(6.101067451441691d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), 53L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5489194913340663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9136070342961825d + "'", double1 == 0.9136070342961825d);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.09952800231331152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3671385529012792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8326380535341398d + "'", double1 == 0.8326380535341398d);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 57L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.433704240591099d, 0.2461900271072904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4007387961164683d + "'", double2 == 1.4007387961164683d);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        double double1 = org.apache.commons.math.util.FastMath.expm1(13.829913596651863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1014506.2622267058d + "'", double1 == 1014506.2622267058d);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9751009553485449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3471758298476075d + "'", double1 == 1.3471758298476075d);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        double double1 = org.apache.commons.math.util.FastMath.tan((-2.9999999999999996d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14254654307427825d + "'", double1 == 0.14254654307427825d);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0164187227291022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01628539292497197d + "'", double1 == 0.01628539292497197d);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.31587294930624943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.098186857597895d + "'", double1 == 18.098186857597895d);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        double double1 = org.apache.commons.math.util.FastMath.tan(100.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5872139151568908d) + "'", double1 == (-0.5872139151568908d));
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8152974304743282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6856519153523216d + "'", double1 == 0.6856519153523216d);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.344058570908106E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.46998083208689106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.081527264575068d + "'", double1 == 1.081527264575068d);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1599753909038675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8210318612260353d + "'", double1 == 0.8210318612260353d);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.339637404328899d, 1.0363623432113664d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3539568368823505d + "'", double2 == 1.3539568368823505d);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.3893722612835904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32885203454848133d + "'", double1 == 0.32885203454848133d);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.768115672379123E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.64492021551913d + "'", double1 == 31.64492021551913d);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.1664479627434767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16568881822443138d + "'", double1 == 0.16568881822443138d);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9174537712762877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7246906350487435d + "'", double1 == 0.7246906350487435d);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3533464791127893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7069688132815516d + "'", double1 == 0.7069688132815516d);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        double double1 = org.apache.commons.math.util.FastMath.atanh(8.467720335926633E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8986761182296238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4540545455879128d + "'", double1 == 0.4540545455879128d);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        double double1 = org.apache.commons.math.util.FastMath.floor(12.699208415745597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.0d + "'", double1 == 12.0d);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6931221821223308d, 0.7346342576927686d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7346342576927686d + "'", double2 == 0.7346342576927686d);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.147483647E9d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.8404766374262674d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9981622750664296d) + "'", double1 == (-0.9981622750664296d));
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.20500081011138022d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20500081011138022d + "'", double1 == 0.20500081011138022d);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4L, (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        double double2 = org.apache.commons.math.util.FastMath.max(1.2583723393689583d, 0.014512922521601742d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2583723393689583d + "'", double2 == 1.2583723393689583d);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6085491459180241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5761418928855238d + "'", double1 == 0.5761418928855238d);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.432854651161728d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01745417873758517d) + "'", double1 == (-0.01745417873758517d));
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5860134523134298E15d, (-0.10757413843619563d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02316541500114063d + "'", double2 == 0.02316541500114063d);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5942992187596847d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8407529241110021d) + "'", double1 == (-0.8407529241110021d));
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, (float) (-36));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.0583132700977513d, 10.862286466674373d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1872713236960942d + "'", double2 == 0.1872713236960942d);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.4528691957923933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4252373880711206d + "'", double1 == 0.4252373880711206d);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1048317455746075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.302196093496576d + "'", double1 == 63.302196093496576d);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.787323762949519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        double double1 = org.apache.commons.math.util.FastMath.exp(14.141104673840013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1384853.16487161d + "'", double1 == 1384853.16487161d);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.6306268775526067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.107075226087454d + "'", double1 == 4.107075226087454d);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57L, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2422079676186446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0749743545693506d + "'", double1 == 1.0749743545693506d);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.428182669496151d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4152182237572941d) + "'", double1 == (-0.4152182237572941d));
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6004717781326785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6938846602072433d + "'", double1 == 0.6938846602072433d);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.450905222306537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.0112343375115525d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.2123899885214408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21402010170352076d + "'", double1 == 0.21402010170352076d);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4973.752448262787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.52483568405378d + "'", double1 == 70.52483568405378d);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2422079676186446d, (-0.10757413843619563d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9769382823042868d + "'", double2 == 0.9769382823042868d);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8096100974766685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6805733498473111d + "'", double1 == 0.6805733498473111d);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.0d, 0.3458703352271477d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4560129843698693d + "'", double2 == 1.4560129843698693d);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        long long2 = org.apache.commons.math.util.FastMath.max(1586013452313419L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1586013452313419L + "'", long2 == 1586013452313419L);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        long long2 = org.apache.commons.math.util.FastMath.max(115L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 115L + "'", long2 == 115L);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        double double2 = org.apache.commons.math.util.FastMath.min(1.442704017851834d, 18.098186857597895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.442704017851834d + "'", double2 == 1.442704017851834d);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5840734641020676d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.16703684659955795d), (-46.780218848748426d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.1380219961447096d) + "'", double2 == (-3.1380219961447096d));
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.3777255673228614d, 0.5143524375699186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4538394667855745d + "'", double2 == 1.4538394667855745d);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        double double1 = org.apache.commons.math.util.FastMath.sinh(22.24855859029184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2982445049454165E9d + "'", double1 == 2.2982445049454165E9d);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7854754257066167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8862705149708054d + "'", double1 == 0.8862705149708054d);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9015889177303088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04499143524739139d) + "'", double1 == (-0.04499143524739139d));
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.3431851641374776E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3431851641374776E20d + "'", double1 == 3.3431851641374776E20d);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        double double1 = org.apache.commons.math.util.FastMath.log(263.856815596594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.575406590848711d + "'", double1 == 5.575406590848711d);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6312937620005052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8072646191779101d + "'", double1 == 0.8072646191779101d);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2112226438198959d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0659610283405505d + "'", double1 == 1.0659610283405505d);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9998039600078416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01980133317597954d + "'", double1 == 0.01980133317597954d);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5618536070571041d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1620359079881888d + "'", double1 == 1.1620359079881888d);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8492499565656627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        int int2 = org.apache.commons.math.util.FastMath.max(149, 84677176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84677176 + "'", int2 == 84677176);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 11013, (long) 11013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.860761315262648E-32d + "'", double1 == 9.860761315262648E-32d);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(263.856815596594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.243670016243065d + "'", double1 == 16.243670016243065d);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        double double1 = org.apache.commons.math.util.FastMath.rint(7.77037274892726E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.7703727489273E13d + "'", double1 == 7.7703727489273E13d);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(14.899277193215763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2600414431889144d + "'", double1 == 0.2600414431889144d);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.569912439052819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.80622733753212d + "'", double1 == 3.80622733753212d);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1031594239427869d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.296276891303204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8607616271094027d + "'", double1 == 0.8607616271094027d);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        int int2 = org.apache.commons.math.util.FastMath.max(36, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        float float2 = org.apache.commons.math.util.FastMath.max(10.0f, (float) 57);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3301388768476645d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.366643026452033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 307.4859955690165d + "'", double1 == 307.4859955690165d);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9640275800758169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26903599074888146d + "'", double1 == 0.26903599074888146d);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        int int2 = org.apache.commons.math.util.FastMath.max(149, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.948147847987199E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0078125d + "'", double1 == 0.0078125d);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9944107743857757d, 0.2735617324781447d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9944107743857756d + "'", double2 == 0.9944107743857756d);
    }
}


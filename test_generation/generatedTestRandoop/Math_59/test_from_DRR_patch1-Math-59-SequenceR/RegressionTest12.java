import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.6429979698813715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.488624189192843d + "'", double1 == 2.488624189192843d);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.896360940747447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4506687359177668d + "'", double1 == 1.4506687359177668d);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9830787956514044d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        float float2 = org.apache.commons.math.util.FastMath.max(35.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-36.7368005696771d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.736800569677094d) + "'", double1 == (-36.736800569677094d));
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 32L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.9112042903736097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 102);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        double double2 = org.apache.commons.math.util.FastMath.min(0.31617702417284754d, (-0.0027106300438728367d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0027106300438728367d) + "'", double2 == (-0.0027106300438728367d));
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.24662339848588008d, 0.7815396418229947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3348502961992308d + "'", double2 == 0.3348502961992308d);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.948148009134E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9947193530202868d + "'", double1 == 0.9947193530202868d);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.02984471039941535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029835854170358504d + "'", double1 == 0.029835854170358504d);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.7368005696771d) + "'", double1 == (-36.7368005696771d));
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        long long1 = org.apache.commons.math.util.FastMath.abs((-5L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.862332614347913d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5778238412901399d) + "'", double1 == (-0.5778238412901399d));
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-8.397420143738124E-10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7593534431810431d, 1.5467250970042676d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5467250970042676d + "'", double2 == 1.5467250970042676d);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5147652438503667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.54835324760936d + "'", double1 == 4.54835324760936d);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 72, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4960576635771723d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        int int2 = org.apache.commons.math.util.FastMath.max(1477896, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.47482279119744175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4947626657693009d + "'", double1 == 0.4947626657693009d);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        double double1 = org.apache.commons.math.util.FastMath.atan(5507.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570614739725892d + "'", double1 == 1.570614739725892d);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        int int2 = org.apache.commons.math.util.FastMath.min(969, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.18946745652025E-159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.603864636211472E-160d + "'", double1 == 1.603864636211472E-160d);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8425647914073723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.2285994658896716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22859946588967162d + "'", double1 == 0.22859946588967162d);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-2));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, (float) 969L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7593534431810431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9123216663043751d + "'", double1 == 0.9123216663043751d);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-11.163779877214074d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.05305491663174207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05300519252945412d + "'", double1 == 0.05300519252945412d);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        double double2 = org.apache.commons.math.util.FastMath.min(2.0d, 0.015085296975380386d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015085296975380386d + "'", double2 == 0.015085296975380386d);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1604.281826366305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.073578558640289d + "'", double1 == 8.073578558640289d);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        double double1 = org.apache.commons.math.util.FastMath.log10(14.206130689293303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1524758056463174d + "'", double1 == 1.1524758056463174d);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        double double2 = org.apache.commons.math.util.FastMath.pow(6.0d, 4.377166757077596d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2547.40375799955d + "'", double2 == 2547.40375799955d);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(41.40763396801269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7226995482024658d + "'", double1 == 0.7226995482024658d);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        long long2 = org.apache.commons.math.util.FastMath.max(89L, (long) 232);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 232L + "'", long2 == 232L);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', (float) 89);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-3), 601302L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        double double1 = org.apache.commons.math.util.FastMath.exp(3036.6763141933634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1524757751089236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4250838772683103d + "'", double1 == 1.4250838772683103d);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2110908904786679E-5d + "'", double1 == 1.2110908904786679E-5d);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.017434763363561593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0175876359907272d + "'", double1 == 1.0175876359907272d);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.11158130719039049d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1118129898004287d) + "'", double1 == (-0.1118129898004287d));
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5716315636979223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7711544466071394d + "'", double1 == 0.7711544466071394d);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.874689525981298d, 0.9551472471031407d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8225846997522648d + "'", double2 == 1.8225846997522648d);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.557407724654902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.226191170883517d + "'", double1 == 1.226191170883517d);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        double double1 = org.apache.commons.math.util.FastMath.atan((-47.34153258046857d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5496763660156136d) + "'", double1 == (-1.5496763660156136d));
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7920437201135672d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.792043720113567d + "'", double2 == 0.792043720113567d);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        float float2 = org.apache.commons.math.util.FastMath.max(3.9481478E13f, (float) 1248L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5860134523134308E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.200306866613815d + "'", double1 == 15.200306866613815d);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 969);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 969 + "'", int1 == 969);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9985159205421982d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.30102999566398114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29665946452667546d + "'", double1 == 0.29665946452667546d);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5716315636979223d, 0.44333907546532597d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5716315636979222d + "'", double2 == 0.5716315636979222d);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.8923911571889502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9555813042538992d + "'", double1 == 0.9555813042538992d);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        double double1 = org.apache.commons.math.util.FastMath.acosh(101.85321931168104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.316655831697726d + "'", double1 == 5.316655831697726d);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1238746832737802E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1238746832737802E29d + "'", double1 == 1.1238746832737802E29d);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.2664920422852502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.268869296766706d + "'", double1 == 15.268869296766706d);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.7871071944553747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2135291168781825d + "'", double1 == 1.2135291168781825d);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.7333083296531462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091340L, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9668078739084816d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.747298177276513d) + "'", double1 == (-0.747298177276513d));
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        long long1 = org.apache.commons.math.util.FastMath.abs(1248L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1248L + "'", long1 == 1248L);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.06912789873045781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06912789873045781d + "'", double1 == 0.06912789873045781d);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.21481175810568434d, 1.9904513401802029d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10750504920074214d + "'", double2 == 0.10750504920074214d);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(34.999999999999986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885893d + "'", double1 == 3.2710663101885893d);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9993945338097157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        int int1 = org.apache.commons.math.util.FastMath.abs(601302);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 601302 + "'", int1 == 601302);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8144772166995118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8144772166995119d + "'", double1 == 0.8144772166995119d);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1624473515096263d, (-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8700016166449096d + "'", double2 == 0.8700016166449096d);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        double double1 = org.apache.commons.math.util.FastMath.log1p(7.366912598987926E39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 91.79781733054413d + "'", double1 == 91.79781733054413d);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        double double1 = org.apache.commons.math.util.FastMath.expm1(43.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.7278394682293463E18d + "'", double1 == 4.7278394682293463E18d);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.0537144249814574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7815494916347825d + "'", double1 == 1.7815494916347825d);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.9985221050176076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1068529639689926d + "'", double1 == 1.1068529639689926d);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.023982243273803952d), 4426.960349240149d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.023982243273803952d) + "'", double2 == (-0.023982243273803952d));
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.12304367228535418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0542128609568502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6090910053351573d + "'", double1 == 1.6090910053351573d);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.680322147502893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.163405220365083d + "'", double1 == 2.163405220365083d);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.022872853233396457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6406796567212327d) + "'", double1 == (-1.6406796567212327d));
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8549344892399791d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15673043375285245d) + "'", double1 == (-0.15673043375285245d));
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9006750627339184d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.20638559288074199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4707796599556535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38579264111060985d + "'", double1 == 0.38579264111060985d);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.1559057424196283d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1559057424196283d + "'", double2 == 0.1559057424196283d);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        double double1 = org.apache.commons.math.util.FastMath.tan(9.775996303178843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3664097912383717d + "'", double1 == 0.3664097912383717d);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.06066622498266398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.653426408689451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6677728501812283d + "'", double1 == 0.6677728501812283d);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        int int2 = org.apache.commons.math.util.FastMath.min(3, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        double double2 = org.apache.commons.math.util.FastMath.min(8.619944404759956d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        double double1 = org.apache.commons.math.util.FastMath.tan(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 84.73931296875567d + "'", double1 == 84.73931296875567d);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6108652381980153d + "'", double1 == 0.6108652381980153d);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.774204487989302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6493676394712089d + "'", double1 == 0.6493676394712089d);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7672312144687762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6941448321473619d + "'", double1 == 0.6941448321473619d);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 102);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 102L + "'", long1 == 102L);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.6106548779547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.840722945265443d + "'", double1 == 6.840722945265443d);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.5707914869904152d), 0.03756258900618957d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.06258498876153973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.22469894983086625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2228498343677317d + "'", double1 == 0.2228498343677317d);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9900590857598653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (-3L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        double double1 = org.apache.commons.math.util.FastMath.ulp(13.359533360579945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        double double2 = org.apache.commons.math.util.FastMath.max(0.33372300080313627d, 969.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 969.0d + "'", double2 == 969.0d);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.508969531384463d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5403023058681395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7350525871447154d + "'", double1 == 0.7350525871447154d);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        double double2 = org.apache.commons.math.util.FastMath.min(1.927360501394206d, 0.005202448750892189d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005202448750892189d + "'", double2 == 0.005202448750892189d);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        long long1 = org.apache.commons.math.util.FastMath.abs(56L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 56L + "'", long1 == 56L);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (byte) -1, (double) 3.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6L, (float) 969);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.001739546146996826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0017395479016342847d + "'", double1 == 0.0017395479016342847d);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.986213958420301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6862302931637163d + "'", double1 == 0.6862302931637163d);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0943643578893503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9872832367514643d + "'", double1 == 1.9872832367514643d);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1276321542566607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9688071972108251d + "'", double1 == 0.9688071972108251d);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        double double1 = org.apache.commons.math.util.FastMath.expm1(120.59779381432197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.371135557616074E52d + "'", double1 == 2.371135557616074E52d);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.5999999999999996d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.986323777050765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        double double1 = org.apache.commons.math.util.FastMath.asin((-6.128666380978778d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        double double1 = org.apache.commons.math.util.FastMath.tan(13.596393407513997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.665329995925052d + "'", double1 == 1.665329995925052d);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.1321109099202004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        float float2 = org.apache.commons.math.util.FastMath.min(601302.0f, (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 0.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9122545643872476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2923720961853506d + "'", double1 == 1.2923720961853506d);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.28751871345990776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2798494414678038d + "'", double1 == 0.2798494414678038d);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        int int2 = org.apache.commons.math.util.FastMath.min(969, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.688117141816173E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        double double1 = org.apache.commons.math.util.FastMath.ceil(601302.1420828041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 601303.0d + "'", double1 == 601303.0d);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        float float2 = org.apache.commons.math.util.FastMath.min((-1.0f), (float) (-3L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6919903846336738d + "'", double1 == 0.6919903846336738d);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8003700919354247d), 1.5697643204608027d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4715095433553458d) + "'", double2 == (-0.4715095433553458d));
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        long long1 = org.apache.commons.math.util.FastMath.round(32.00000000000001d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        double double2 = org.apache.commons.math.util.FastMath.pow(9.712293689529174E-39d, 2.158010543951033d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.294791554170031E-83d + "'", double2 == 9.294791554170031E-83d);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(8.194070294404359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 469.48564490288965d + "'", double1 == 469.48564490288965d);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.4102002216622384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3870041092853976d) + "'", double1 == (-0.3870041092853976d));
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.03496291770971693d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5569083308639295d, 7.77037274892726E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8224081017903951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.357673173526722d + "'", double1 == 1.357673173526722d);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.619945108332321E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5882189752822237E-4d + "'", double1 == 3.5882189752822237E-4d);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5579004906280911d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.05074122630354142d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05069774611314722d) + "'", double1 == (-0.05069774611314722d));
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        int int1 = org.apache.commons.math.util.FastMath.abs((-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        double double1 = org.apache.commons.math.util.FastMath.asin(12.232006459765389d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.6111038742580877d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 601302, (float) 74);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 74.0f + "'", float2 == 74.0f);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        long long1 = org.apache.commons.math.util.FastMath.round(4251.530792427802d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4252L + "'", long1 == 4252L);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5569083308639295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.442702015629826d + "'", double1 == 0.442702015629826d);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.8353789697787954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.489079626509513d + "'", double1 == 8.489079626509513d);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.882468649088755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4168587241160415d + "'", double1 == 1.4168587241160415d);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.018833921356972847d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        long long2 = org.apache.commons.math.util.FastMath.max((-53L), 53L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1736823502191418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0548325543701305d + "'", double1 == 1.0548325543701305d);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        long long2 = org.apache.commons.math.util.FastMath.min(53L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5733724749885676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0025761453442203607d) + "'", double1 == (-0.0025761453442203607d));
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.09950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09917661929213893d + "'", double1 == 0.09917661929213893d);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1477896L, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.42631174417624496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6529255272818217d + "'", double1 == 0.6529255272818217d);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.451863517420987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.171221449253997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5771426833144853d + "'", double1 == 0.5771426833144853d);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6535893717671493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8584790261650161d + "'", double1 == 0.8584790261650161d);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9413588930953838d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9413588930953838d + "'", double1 == 0.9413588930953838d);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        float float2 = org.apache.commons.math.util.FastMath.min(72.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        double double1 = org.apache.commons.math.util.FastMath.exp((-3.405442597106097d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.033192126091518455d + "'", double1 == 0.033192126091518455d);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        double double1 = org.apache.commons.math.util.FastMath.tan((-15.942385152878742d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23881253346535827d) + "'", double1 == (-0.23881253346535827d));
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.2134887868481213d, 1.4699634275333602d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10332511048643829d + "'", double2 == 0.10332511048643829d);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0137651267062169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0137651267062169d + "'", double1 == 1.0137651267062169d);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7740840138843887d, 3.434381731912222d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7740840138843889d + "'", double2 == 0.7740840138843889d);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7901955581184713d, 2.6260580840928345d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2922874041071986d + "'", double2 == 0.2922874041071986d);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.633123935319537E16d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5716315636979222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6499429567608754d + "'", double1 == 0.6499429567608754d);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 232);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        long long2 = org.apache.commons.math.util.FastMath.min(6L, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        double double1 = org.apache.commons.math.util.FastMath.acos(34.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1578212823495775d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9963790917388103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.545073735561594d + "'", double1 == 1.545073735561594d);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        double double1 = org.apache.commons.math.util.FastMath.rint(43.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.0d + "'", double1 == 43.0d);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3625821845411108d, 0.5123029387691214d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3625821845411108d + "'", double2 == 1.3625821845411108d);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.000027401317026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453770763144784d + "'", double1 == 0.017453770763144784d);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.31617702417284754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31113287105458004d + "'", double1 == 0.31113287105458004d);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9447141383035655d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9812209335997889d) + "'", double1 == (-0.9812209335997889d));
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        double double1 = org.apache.commons.math.util.FastMath.acos(2547.40375799955d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5551126252984884d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.010451397689929d + "'", double1 == 2.010451397689929d);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.004921566601151857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0049336974027414d + "'", double1 == 1.0049336974027414d);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-12.492756561291529d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999718188d) + "'", double1 == (-0.9999999999718188d));
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6308886990004812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5628226826437187d + "'", double1 == 0.5628226826437187d);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        int int2 = org.apache.commons.math.util.FastMath.min(969, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.7399788154926485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.854275151361752d) + "'", double1 == (-5.854275151361752d));
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(102.00000000000001d, 969.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 102.00000000000003d + "'", double2 == 102.00000000000003d);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.0051873834444522435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005187336916194732d + "'", double1 == 0.005187336916194732d);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.012821786594683294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5579741888610903d + "'", double1 == 1.5579741888610903d);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1511334730668343d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-4.238865337353114d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.671782976874766d + "'", double1 == 34.671782976874766d);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2261911708835183d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 102, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 102L + "'", long2 == 102L);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.8801322811985435d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.99836867862969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9983686786296901d + "'", double1 == 0.9983686786296901d);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        float float2 = org.apache.commons.math.util.FastMath.max(28.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.0f + "'", float2 == 28.0f);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        long long2 = org.apache.commons.math.util.FastMath.min(12L, (long) 72);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6296609567811063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5940920277793489d + "'", double1 == 0.5940920277793489d);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        double double1 = org.apache.commons.math.util.FastMath.abs(5.2068797165145434E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2068797165145434E22d + "'", double1 == 5.2068797165145434E22d);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5725317062401747d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.13766929481533965d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        long long1 = org.apache.commons.math.util.FastMath.round(4.54835324760936d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        double double1 = org.apache.commons.math.util.FastMath.asin(104.95237014951114d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1756713690335514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7773372923279167d + "'", double1 == 0.7773372923279167d);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.2365903764701667d, (-0.8273263794480143d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.863056761120057d + "'", double2 == 2.863056761120057d);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        int int2 = org.apache.commons.math.util.FastMath.min((-3), 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.0222383329741738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0625582428435867d) + "'", double1 == (-2.0625582428435867d));
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        double double1 = org.apache.commons.math.util.FastMath.ulp(57.260440365722204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.8003700919354247d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4987086185814076d + "'", double1 == 2.4987086185814076d);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4250838772683103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024872405775418792d + "'", double1 == 0.024872405775418792d);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9948635511998325d), 0.13394365429496144d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.436965885583685d) + "'", double2 == (-1.436965885583685d));
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.2266354000930777d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        double double1 = org.apache.commons.math.util.FastMath.atan(22.24855859029184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.525879825435418d + "'", double1 == 1.525879825435418d);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5424818954018846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5162631492122486d + "'", double1 == 0.5162631492122486d);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.29327768157142287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2731428440531727d + "'", double1 == 1.2731428440531727d);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.507288054547834E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.007987835004624685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007987750062418433d + "'", double1 == 0.007987750062418433d);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3887317335324652d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4168587241160415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.124144993981348d + "'", double1 == 3.124144993981348d);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0137651267062167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        double double1 = org.apache.commons.math.util.FastMath.log(0.2227953217324957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5015017687594445d) + "'", double1 == (-1.5015017687594445d));
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        double double2 = org.apache.commons.math.util.FastMath.max(0.06262594923388143d, 1.241721948438556d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.241721948438556d + "'", double2 == 1.241721948438556d);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, (float) 1477896L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.629973850390113d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5943567862086525d) + "'", double1 == (-0.5943567862086525d));
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5423560824282998d, 0.6080872397649995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1952491596692922d + "'", double2 == 1.1952491596692922d);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        double double1 = org.apache.commons.math.util.FastMath.expm1(96.95151244102988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2749902547909429E42d + "'", double1 == 1.2749902547909429E42d);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.2134887868481213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.02287541703683d + "'", double1 == 1.02287541703683d);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 35, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6560676710276012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5757405129948149d + "'", double1 == 0.5757405129948149d);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.4422495703074085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9645397928556648d + "'", double1 == 0.9645397928556648d);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7135781201111424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7135781201111425d + "'", double1 == 0.7135781201111425d);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.316996876365737E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1147604.843300052d + "'", double1 == 1147604.843300052d);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.06004622792980713d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.319776824715853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.319776824715853d + "'", double1 == 2.319776824715853d);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), 53.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5898626184376445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5562468617341296d + "'", double1 == 0.5562468617341296d);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.680322147502893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2249009368704327d + "'", double1 == 2.2249009368704327d);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 1477896.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        float float2 = org.apache.commons.math.util.FastMath.min((-53.0f), (float) 1477896);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        double double2 = org.apache.commons.math.util.FastMath.min(10.690128972137646d, (double) 601302L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.690128972137646d + "'", double2 == 10.690128972137646d);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1477896, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.30102999566398114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26315625511699287d + "'", double1 == 0.26315625511699287d);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4995723020409742d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4252L, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4676097652834482E15d, 10.55522688394848d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.467609765283448E15d + "'", double2 == 1.467609765283448E15d);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.0920059914005305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.019059100001444142d) + "'", double1 == (-0.019059100001444142d));
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-53), (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.18946745652025E-159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.18946745652025E-159d + "'", double1 == 9.18946745652025E-159d);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.06241880999595734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0010894137496062042d + "'", double1 == 0.0010894137496062042d);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        double double1 = org.apache.commons.math.util.FastMath.tan(9.044524487391685E157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0179631314892548d + "'", double1 == 1.0179631314892548d);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.2638973976934574E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1024.0d + "'", double1 == 1024.0d);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.1418397313418598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41592215668290394d + "'", double1 == 0.41592215668290394d);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.24255740539295487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1477896L, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.2922874041071986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5341898998139843d) + "'", double1 == (-0.5341898998139843d));
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.260052243696693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.260052243696694d + "'", double1 == 5.260052243696694d);
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.3018019822761655d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0017395479016342847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0017410617927869d + "'", double1 == 1.0017410617927869d);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9816339318384565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7761302849961603d + "'", double1 == 0.7761302849961603d);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9149994957367079d, 0.28357366964177444d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9149994957367078d + "'", double2 == 0.9149994957367078d);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5716776679087391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9622471808768726d + "'", double1 == 0.9622471808768726d);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0995378951737242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        double double2 = org.apache.commons.math.util.FastMath.max(1.2723278394410604d, 2.0741994078890014d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0741994078890014d + "'", double2 == 2.0741994078890014d);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (-3));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.09187222072048129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0016034727426913556d + "'", double1 == 0.0016034727426913556d);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (-3L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.691758600279624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999772371651287d + "'", double1 == 0.9999772371651287d);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        long long1 = org.apache.commons.math.util.FastMath.round(7.77037274892726E13d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 77703727489273L + "'", long1 == 77703727489273L);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7068047800279598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6494073147094548d + "'", double1 == 0.6494073147094548d);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.3346634130618275d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.28442109966604967d) + "'", double1 == (-0.28442109966604967d));
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7361507318256206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.768115672379143E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7681156723791E13d + "'", double1 == 2.7681156723791E13d);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.06981317007977318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06987000497506388d + "'", double1 == 0.06987000497506388d);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        int int1 = org.apache.commons.math.util.FastMath.abs(74);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7672312144687763d, 1.5700548602583582d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5700548602583582d + "'", double2 == 1.5700548602583582d);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.27229885648267216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2756763625220462d + "'", double1 == 0.2756763625220462d);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9649955887750582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.21127011215504418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.474632480815888d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        int int2 = org.apache.commons.math.util.FastMath.min(74, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.34266379734457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0274342645415075d) + "'", double1 == (-1.0274342645415075d));
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.0628837175857748d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06566270191375284d + "'", double1 == 0.06566270191375284d);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7453180650273789d, 453.7053897732997d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0016427342751365833d + "'", double2 == 0.0016427342751365833d);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        double double1 = org.apache.commons.math.util.FastMath.tan((-25.170419727719402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03769633946808679d) + "'", double1 == (-0.03769633946808679d));
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.2210278799953218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22283193883788277d + "'", double1 == 0.22283193883788277d);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1477896, 601302L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9518155064321638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4882239126802983d + "'", double1 == 1.4882239126802983d);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.05300519252945412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.053054888633596774d + "'", double1 == 0.053054888633596774d);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.2110908904786674E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.1714543991571844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029870624878120294d + "'", double1 == 0.029870624878120294d);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        double double1 = org.apache.commons.math.util.FastMath.floor((-3.046174197867085E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        long long1 = org.apache.commons.math.util.FastMath.round(0.4374744323806797d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2347857777188793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0728290864129486d + "'", double1 == 1.0728290864129486d);
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4944324908505626d, (-0.7856166766042585d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4944324908505626d + "'", double2 == 0.4944324908505626d);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.6884941597894443d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.523590477869305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        double double1 = org.apache.commons.math.util.FastMath.log1p(8.949844845080285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2975569575896544d + "'", double1 == 2.2975569575896544d);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 56.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.0d + "'", double1 == 56.0d);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        float float2 = org.apache.commons.math.util.FastMath.max(1477896.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9555813042538992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.742299409068664d + "'", double1 == 0.742299409068664d);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.22285077660407818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-3.0461742449770714E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.421010862427522E-20d + "'", double1 == 5.421010862427522E-20d);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.2816949531804002E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(18.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6207413942088964d + "'", double1 == 2.6207413942088964d);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        double double1 = org.apache.commons.math.util.FastMath.abs(17.247748258387592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.247748258387592d + "'", double1 == 17.247748258387592d);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5206936783915806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6831948407143134d + "'", double1 == 1.6831948407143134d);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1414869946644686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1414869946644686d + "'", double1 == 1.1414869946644686d);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        float float2 = org.apache.commons.math.util.FastMath.max((-3.0f), 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2488679726422227d, 2.508969531384463d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.46185505754605943d + "'", double2 == 0.46185505754605943d);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.718281828459047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9891437136247577d + "'", double1 == 0.9891437136247577d);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.01728624313179109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0174365148617333d + "'", double1 == 1.0174365148617333d);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.314818645033839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.146655416868485d + "'", double1 == 1.146655416868485d);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.316655831697726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.316655831697727d + "'", double1 == 5.316655831697727d);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.041914824263686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041914824263687d + "'", double1 == 4.041914824263687d);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9998885350647092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.074668213802979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018756498697388355d + "'", double1 == 0.018756498697388355d);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9859950710226582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8338218158606182d + "'", double1 == 0.8338218158606182d);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.20057203709370552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3688545382643078d + "'", double1 == 1.3688545382643078d);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        double double1 = org.apache.commons.math.util.FastMath.log(1.7602765479495022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5654709262232736d + "'", double1 == 0.5654709262232736d);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9425687912622992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3766453324014576d + "'", double1 == 1.3766453324014576d);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.1538784231553383E30d, (-0.32345179675065633d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5440633201885449E-10d + "'", double2 == 1.5440633201885449E-10d);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.6094379124341003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.028089990678399235d + "'", double1 == 0.028089990678399235d);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.1183599281602883d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        double double1 = org.apache.commons.math.util.FastMath.sin(41.32317658130462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4639704888177957d) + "'", double1 == (-0.4639704888177957d));
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        int int2 = org.apache.commons.math.util.FastMath.max(3, 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 89 + "'", int2 == 89);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(22.180709777452588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1270.8610568525928d + "'", double1 == 1270.8610568525928d);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.05375489702567273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.053703210089628646d + "'", double1 == 0.053703210089628646d);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        double double1 = org.apache.commons.math.util.FastMath.log(0.03529934148039703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.343890970163151d) + "'", double1 == (-3.343890970163151d));
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 12, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.0f + "'", float2 == 12.0f);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        double double2 = org.apache.commons.math.util.FastMath.max((-36.7368005696771d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.46096535893150964d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46096535893150964d + "'", double1 == 0.46096535893150964d);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5083775167989395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1490617565057817d + "'", double1 == 2.1490617565057817d);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9425687912622992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02568694395995302d) + "'", double1 == (-0.02568694395995302d));
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, 53L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.0871877068532832E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.74137414560076d + "'", double1 == 39.74137414560076d);
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.15200797361400648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6017167600432312d + "'", double1 == 0.6017167600432312d);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4154931988910127d, 0.09901507724404694d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4154931988910124d + "'", double2 == 1.4154931988910124d);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-47.34153258046857d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.01076481464331043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01076460674748331d + "'", double1 == 0.01076460674748331d);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        double double1 = org.apache.commons.math.util.FastMath.signum(42842.07030090556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.009999666686664915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.9112042903736097d, 0.002460783300575925d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0015952029170108d + "'", double2 == 1.0015952029170108d);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7469273663670994d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7469273663670994d + "'", double2 == 0.7469273663670994d);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4250838772683103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.158206607140378d + "'", double1 == 4.158206607140378d);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8809945689944431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7581226324091722d, 1.4802234523765398d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7581226324091723d + "'", double2 == 0.7581226324091723d);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.946997808922293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.721111401541822d) + "'", double1 == (-0.721111401541822d));
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4395010458716009d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.14254654307427825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9898574333295201d + "'", double1 == 0.9898574333295201d);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 4L, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 12, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7994292769759406d), (-0.13766929481533965d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.13766929481533965d) + "'", double2 == (-0.13766929481533965d));
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.06445067165256874d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06436157936777905d) + "'", double1 == (-0.06436157936777905d));
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        double double1 = org.apache.commons.math.util.FastMath.exp(8.474177595438071d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4789.482253092021d + "'", double1 == 4789.482253092021d);
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.146128035678238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.145988142880954d + "'", double1 == 3.145988142880954d);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.106387248181345d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        long long1 = org.apache.commons.math.util.FastMath.round(0.874597073387939d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, 4252L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4252L + "'", long2 == 4252L);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9226350743220142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1672838871475524d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        double double1 = org.apache.commons.math.util.FastMath.sin((-3.0461741978670846E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.046174150757101E-4d) + "'", double1 == (-3.046174150757101E-4d));
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1540392241723758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8190877725887346d + "'", double1 == 0.8190877725887346d);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.7893184915864662d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5860134523134185E15d, 439.50133562451674d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6032754731892245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6476017675391463d + "'", double1 == 0.6476017675391463d);
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 1248L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        long long1 = org.apache.commons.math.util.FastMath.round(9.041911449206605d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6080833035834908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8369072289754835d + "'", double1 == 0.8369072289754835d);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 102);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3276291673075579d + "'", double1 == 0.3276291673075579d);
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, (long) 969);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1938614780827772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.801423761690953d + "'", double1 == 1.801423761690953d);
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.47381472041445094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6883420083174141d + "'", double1 == 0.6883420083174141d);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9876604284616479d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005392346297227792d) + "'", double1 == (-0.005392346297227792d));
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        int int2 = org.apache.commons.math.util.FastMath.max(53, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.026299389467141204d), 0.9980845732903538d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5766474848126442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5230715269149525d + "'", double1 == 0.5230715269149525d);
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.19611958311551322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4428539071923304d + "'", double1 == 0.4428539071923304d);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        double double2 = org.apache.commons.math.util.FastMath.pow(91.79781733054413d, 0.5740524125174076d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.389632240078496d + "'", double2 == 13.389632240078496d);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        int int1 = org.apache.commons.math.util.FastMath.abs(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.6520112072674529d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4790031103808692d) + "'", double1 == (-0.4790031103808692d));
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.556678137025108d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.556678137025108d + "'", double1 == 0.556678137025108d);
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.0078125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08838834764831845d + "'", double1 == 0.08838834764831845d);
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, 72.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 72.0f + "'", float2 == 72.0f);
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9311474297834463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1975470291576211d + "'", double1 == 1.1975470291576211d);
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.6766585098840832E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009606545630105158d) + "'", double1 == (-0.009606545630105158d));
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.4253120969346567d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4134332111535645d) + "'", double1 == (-0.4134332111535645d));
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5228075827238494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5501411795197522d + "'", double1 == 0.5501411795197522d);
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3688545382643078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8784308797054761d + "'", double1 == 0.8784308797054761d);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.012054337993946678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012054337993946678d + "'", double1 == 0.012054337993946678d);
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.15467365951537007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4154991976276925d + "'", double1 == 1.4154991976276925d);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.103555437009692d, (double) 32L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06564166507650802d + "'", double2 == 0.06564166507650802d);
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        float float2 = org.apache.commons.math.util.FastMath.max(32.0f, (float) 72);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 72.0f + "'", float2 == 72.0f);
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.3218028439150607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005616519168599209d + "'", double1 == 0.005616519168599209d);
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        double double2 = org.apache.commons.math.util.FastMath.max(0.020207793526663034d, (-0.13400211995708533d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.020207793526663034d + "'", double2 == 0.020207793526663034d);
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        long long1 = org.apache.commons.math.util.FastMath.round(0.0975855140010009d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        double double1 = org.apache.commons.math.util.FastMath.signum(41.32317658130462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.7871071944553747d, 0.8813735870195429d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6681645261488875d + "'", double2 == 1.6681645261488875d);
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5707963267948795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3012989023072516d + "'", double1 == 2.3012989023072516d);
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6109634842191889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47683243740733866d + "'", double1 == 0.47683243740733866d);
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8683429710876526d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1813475223303582d + "'", double1 == 1.1813475223303582d);
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.6466160762890201d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0402002104793626d) + "'", double1 == (-1.0402002104793626d));
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        double double1 = org.apache.commons.math.util.FastMath.atanh(34.99999999999999d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.953280866830926E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000004d + "'", double1 == 1.0000000000000004d);
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.0461741978670857E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0461741036471213E-4d + "'", double1 == 3.0461741036471213E-4d);
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.3883106012234607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41082075266795576d) + "'", double1 == (-0.41082075266795576d));
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-6.920312456645728d), 1.310610594469108d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3836270120478895d) + "'", double2 == (-1.3836270120478895d));
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        double double2 = org.apache.commons.math.util.FastMath.max(1.2490457723982544d, (-0.019059100001444142d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2490457723982544d + "'", double2 == 1.2490457723982544d);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7330383821741316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6325570045229664d + "'", double1 == 0.6325570045229664d);
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974482d + "'", double1 == 0.7853981633974482d);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.3455797190266234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.377021598522727d + "'", double1 == 27.377021598522727d);
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0943643578893503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0943643578893503d + "'", double1 == 1.0943643578893503d);
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3658604883745558d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7042643509780869d + "'", double1 == 0.7042643509780869d);
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0253512046806867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02503519261599814d + "'", double1 == 0.02503519261599814d);
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.04191482247339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.458847799916875d + "'", double1 == 28.458847799916875d);
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5771426833144853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.20787957635076196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0036281830549717347d + "'", double1 == 0.0036281830549717347d);
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.7621186826519104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.054617772418968d + "'", double1 == 1.054617772418968d);
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.5777877754722899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6591354567261247d) + "'", double1 == (-0.6591354567261247d));
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5898626184376445d, 601303.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        int int2 = org.apache.commons.math.util.FastMath.max(6, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        double double1 = org.apache.commons.math.util.FastMath.cosh(8.205696208681136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1830.874687035371d + "'", double1 == 1830.874687035371d);
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        double double1 = org.apache.commons.math.util.FastMath.sin(11.147713248144797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9884491740168845d) + "'", double1 == (-0.9884491740168845d));
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.3671391507352896d), 0.9903210539364167d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3671391507352895d) + "'", double2 == (-0.3671391507352895d));
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.28751871345990776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5413338835382208d) + "'", double1 == (-0.5413338835382208d));
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        double double1 = org.apache.commons.math.util.FastMath.signum((-53.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.13400211995708533d), 1.192092895507818E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1340021199570853d) + "'", double2 == (-0.1340021199570853d));
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3828763427709216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1759576279657875d + "'", double1 == 1.1759576279657875d);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 12.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-6.128666380978778d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8201627853541854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2708694717373374d + "'", double1 == 2.2708694717373374d);
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.020240673962871766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.532664034748008E-4d + "'", double1 == 3.532664034748008E-4d);
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9552316851251946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9552316851251947d + "'", double1 == 0.9552316851251947d);
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.05488618398122306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.054831168635193384d + "'", double1 == 0.054831168635193384d);
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.04305126783455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.22859946588967162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47812076496390704d + "'", double1 == 0.47812076496390704d);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.9622075694412033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4872344125117167d + "'", double1 == 3.4872344125117167d);
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.949477120674141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8131112435465191d + "'", double1 == 0.8131112435465191d);
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6494073147094548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6494073147094549d + "'", double1 == 0.6494073147094549d);
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4970071417221087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6437942581999371d + "'", double1 == 0.6437942581999371d);
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.3829261109163618d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1280178182881717d) + "'", double1 == (-1.1280178182881717d));
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(15.200306866613815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.200306866613817d + "'", double1 == 15.200306866613817d);
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        float float2 = org.apache.commons.math.util.FastMath.max(232.0f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 232.0f + "'", float2 == 232.0f);
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        double double1 = org.apache.commons.math.util.FastMath.acos(9.079985986933498E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707055269349026d + "'", double1 == 1.5707055269349026d);
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.36017358796285076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3766010463442277d + "'", double1 == 0.3766010463442277d);
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.335529133262637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3355291332626371d + "'", double1 == 1.3355291332626371d);
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
        double double1 = org.apache.commons.math.util.FastMath.cos(76.16461263958305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7204197602654155d + "'", double1 == 0.7204197602654155d);
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9903301413773639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5317885726565768d + "'", double1 == 1.5317885726565768d);
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.147483648E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.084289455298593d) + "'", double1 == (-4.084289455298593d));
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        int int2 = org.apache.commons.math.util.FastMath.max(6, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        double double1 = org.apache.commons.math.util.FastMath.rint(6.157240911549056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.3046231798951236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1614027504379212d + "'", double1 == 1.1614027504379212d);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.1443601628891088d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1344240564202083d) + "'", double1 == (-0.1344240564202083d));
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9999999958776928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.57070552693625d + "'", double1 == 1.57070552693625d);
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.474632480815888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 256.37755602290366d + "'", double1 == 256.37755602290366d);
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        double double1 = org.apache.commons.math.util.FastMath.asinh(192.2171757448326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.951779803319841d + "'", double1 == 5.951779803319841d);
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(813.951274474838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.206129690390002d + "'", double1 == 14.206129690390002d);
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        double double2 = org.apache.commons.math.util.FastMath.max(0.2228507766040782d, (double) (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2228507766040782d + "'", double2 == 0.2228507766040782d);
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5416614449118216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.2493163641423473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1524592039206207d + "'", double1 == 1.1524592039206207d);
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.017940902525888144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2617870116320479d + "'", double1 == 0.2617870116320479d);
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        double double1 = org.apache.commons.math.util.FastMath.tan(86.42366562500264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-33.47108260928763d) + "'", double1 == (-33.47108260928763d));
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.003921736500322172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003921746553059026d + "'", double1 == 0.003921746553059026d);
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        double double1 = org.apache.commons.math.util.FastMath.expm1(171.78552109133565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.031845492717505E74d + "'", double1 == 4.031845492717505E74d);
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.33372300080313627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3337230008031363d + "'", double1 == 0.3337230008031363d);
    }
}


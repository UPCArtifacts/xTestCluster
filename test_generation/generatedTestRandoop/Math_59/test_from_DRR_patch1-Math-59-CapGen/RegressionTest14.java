import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8918900011220077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7283163279129076d + "'", double1 == 0.7283163279129076d);
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.23923049735223084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24395773739405557d + "'", double1 == 0.24395773739405557d);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        long long1 = org.apache.commons.math.util.FastMath.round((-2.7131306085479543d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-3L) + "'", long1 == (-3L));
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.05087194876325805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05218815066243086d + "'", double1 == 0.05218815066243086d);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.42846204504183943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.356598372536505d + "'", double1 == 0.356598372536505d);
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7604870043227957d, 1.5268171949666718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7604870043227958d + "'", double2 == 0.7604870043227958d);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.199489555435047d, 1.5707963001144702d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6521603053032209d + "'", double2 == 0.6521603053032209d);
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.40498456639956293d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007068314103433971d) + "'", double1 == (-0.007068314103433971d));
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.4735278632514661d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4735278632514661d + "'", double1 == 1.4735278632514661d);
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-82.14959033343958d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9999999999986171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348136186d + "'", double1 == 1.5430806348136186d);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.48549279735503514d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6645457244960807d) + "'", double1 == (-0.6645457244960807d));
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.016380052907402187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01638005290740219d + "'", double1 == 0.01638005290740219d);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.19611987703015216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21667274770822859d + "'", double1 == 0.21667274770822859d);
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3383347192042886E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.668093098623186E43d + "'", double1 == 7.668093098623186E43d);
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.019228399099707562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.355988741774104E-4d + "'", double1 == 3.355988741774104E-4d);
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        double double1 = org.apache.commons.math.util.FastMath.abs(57.271284253105414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.271284253105414d + "'", double1 == 57.271284253105414d);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6407835429487976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7457624298432085d + "'", double1 == 0.7457624298432085d);
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.7646645087741661d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6438162405233504d) + "'", double1 == (-0.6438162405233504d));
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) -1, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2675013768438783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2675013768438783d + "'", double1 == 1.2675013768438783d);
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        int int2 = org.apache.commons.math.util.FastMath.min(2005, 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5035448147047986d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3956155728430544d) + "'", double1 == (-0.3956155728430544d));
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        int int2 = org.apache.commons.math.util.FastMath.max(2005, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2005 + "'", int2 == 2005);
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0291617385510083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0291617385510083d + "'", double1 == 1.0291617385510083d);
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(80.9867340528794d, 1.3669495678698107d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 80.98673405287938d + "'", double2 == 80.98673405287938d);
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        double double1 = org.apache.commons.math.util.FastMath.asin(198.99999999999997d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6905985797206106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9949092881730508d + "'", double1 == 1.9949092881730508d);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8648361267541332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.648764830127854d + "'", double1 == 0.648764830127854d);
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.7089878066060047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.52336793069389d + "'", double1 == 4.52336793069389d);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5900247258946039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2436845633863511d + "'", double1 == 1.2436845633863511d);
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.48706190399811883d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 6559);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6559 + "'", int1 == 6559);
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5340248990657174d, 0.6521603053032209d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6861327785851723d + "'", double2 == 0.6861327785851723d);
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        double double2 = org.apache.commons.math.util.FastMath.max(6.17645782688986E-4d, 1.4677992676220695d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4677992676220695d + "'", double2 == 1.4677992676220695d);
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.17634267404187864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1754301470197195d + "'", double1 == 0.1754301470197195d);
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.129830963909753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.129830963909753d + "'", double1 == 1.129830963909753d);
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        int int2 = org.apache.commons.math.util.FastMath.max(564, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 564 + "'", int2 == 564);
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(24.19638901669072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.196389016690723d + "'", double1 == 24.196389016690723d);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9440892412430648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.09232900693583d + "'", double1 == 54.09232900693583d);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6929693744344998d + "'", double1 == 1.6929693744344998d);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.01581244357602706d, 1.1172617738080048d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01415190988542915d + "'", double2 == 0.01415190988542915d);
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        double double1 = org.apache.commons.math.util.FastMath.tan(171.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.540060192683886d + "'", double1 == 4.540060192683886d);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        double double2 = org.apache.commons.math.util.FastMath.pow((-96.87824279114196d), 1.9925591367766533d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        double double1 = org.apache.commons.math.util.FastMath.sin(9.0871877068532768E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.369095451634872d + "'", double1 == 0.369095451634872d);
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        int int2 = org.apache.commons.math.util.FastMath.min(4, 3280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0149280275816275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2698012268765735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2213702543563585d + "'", double1 == 3.2213702543563585d);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.2634178653612851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.194992268641593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9302128167397059d + "'", double1 == 0.9302128167397059d);
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9243999553637673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9741368491943365d + "'", double1 == 0.9741368491943365d);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.40985124626279884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 7.922473906616227E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.922473906616227E-4d + "'", double2 == 7.922473906616227E-4d);
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 49, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49L + "'", long2 == 49L);
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5349590412599404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.512259587620932d + "'", double1 == 0.512259587620932d);
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7023108900190393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8888799992304708d + "'", double1 == 0.8888799992304708d);
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9131871133554458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0497552308367462d + "'", double1 == 1.0497552308367462d);
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.4705882352941176d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.015107169978686073d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015107744628211833d) + "'", double1 == (-0.015107744628211833d));
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7998630706317855d, 2.745295347905096d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.28350938628841055d + "'", double2 == 0.28350938628841055d);
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.587213915156929d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-33.64487900984523d) + "'", double1 == (-33.64487900984523d));
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9147226107566937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7923934070389476d + "'", double1 == 0.7923934070389476d);
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9170462317842702d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3996979141632339d + "'", double1 == 0.3996979141632339d);
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5531156729965456d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9562917612541741d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2967504154586013d + "'", double1 == 0.2967504154586013d);
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.362282645426244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5266342189753591d + "'", double1 == 0.5266342189753591d);
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        int int2 = org.apache.commons.math.util.FastMath.min(49, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.7015156767002264d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4925067644641049d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8811503393631388d + "'", double1 == 0.8811503393631388d);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1361178534283194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.043456770960971d + "'", double1 == 1.043456770960971d);
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.03603771279247703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.036029916884223606d + "'", double1 == 0.036029916884223606d);
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7523557927644398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013131085730191604d + "'", double1 == 0.013131085730191604d);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8623188722876838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 2.9982229502979716d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.6280580358907252d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.14176215585771934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14223745393427165d + "'", double1 == 0.14223745393427165d);
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        long long1 = org.apache.commons.math.util.FastMath.round(0.4387689880853682d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.6953521630119134E-5d, 14.703675447597915d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1933186907787848E-6d + "'", double2 == 3.1933186907787848E-6d);
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3406624011429167d, 0.99836867862969d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3406624011429167d + "'", double2 == 0.3406624011429167d);
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7244153292787553d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        long long2 = org.apache.commons.math.util.FastMath.max(3280L, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0546274546035364d, 83.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 83.0d + "'", double2 == 83.0d);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.0722201960340971d), 0.28172266585745886d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.25094811390556965d) + "'", double2 == (-0.25094811390556965d));
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.15152168239853733d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15210754885364602d) + "'", double1 == (-0.15210754885364602d));
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4899326697744564d, 0.44372725983318934d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1935448962170667d + "'", double2 == 1.1935448962170667d);
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.323818048994663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0119292870026917d + "'", double1 == 2.0119292870026917d);
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.036895443825105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015734966168102413d + "'", double1 == 0.015734966168102413d);
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6986857868719877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6098433974741037d + "'", double1 == 0.6098433974741037d);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.914747959740454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.44416314520527d + "'", double1 == 17.44416314520527d);
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.999973512128498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.557316993695399d + "'", double1 == 1.557316993695399d);
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9899750504798679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5487107188577957d + "'", double1 == 0.5487107188577957d);
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.2409478134865074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2386752917259767d + "'", double1 == 0.2386752917259767d);
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        int int2 = org.apache.commons.math.util.FastMath.max(6559, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6559 + "'", int2 == 6559);
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.40498456639956293d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        double double1 = org.apache.commons.math.util.FastMath.rint(21.42227207044929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.0d + "'", double1 == 21.0d);
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0610850527508944d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6180243309565554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6662271476489382d + "'", double1 == 0.6662271476489382d);
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.1734524968868303d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2180909242787736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.716672131286994d + "'", double1 == 2.716672131286994d);
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-5L), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        double double2 = org.apache.commons.math.util.FastMath.min(4.926969347450164d, (-0.017278628635716543d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.017278628635716543d) + "'", double2 == (-0.017278628635716543d));
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.1417162261588426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00247341474997272d + "'", double1 == 0.00247341474997272d);
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9755461963938009d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.759353443181043d + "'", double1 == 0.759353443181043d);
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.37287332357954484d, (-0.36570469544600726d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4344388506924428d + "'", double2 == 1.4344388506924428d);
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8805765261215637d, 0.47420105633127485d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8805765261215636d + "'", double2 == 0.8805765261215636d);
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.3185862410962617d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.866431916209303d) + "'", double1 == (-0.866431916209303d));
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.054822099620526d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1178774484105711d + "'", double1 == 1.1178774484105711d);
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.37287332357954484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39175629151049157d + "'", double1 == 0.39175629151049157d);
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.0722201960340971d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0000000000000142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000000007d + "'", double1 == 1.000000000000007d);
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(45.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.556893304490063d + "'", double1 == 3.556893304490063d);
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3280, 3280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3280.0f + "'", float2 == 3280.0f);
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0005784555913422d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0610850527508946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0300898275154913d + "'", double1 == 1.0300898275154913d);
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3076604860118306d + "'", double1 == 1.3076604860118306d);
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        double double2 = org.apache.commons.math.util.FastMath.max(9.079573887825082E-5d, 1.416281099899578d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.416281099899578d + "'", double2 == 1.416281099899578d);
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5057720758044307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5057720758044307d + "'", double1 == 0.5057720758044307d);
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        long long1 = org.apache.commons.math.util.FastMath.round(0.16601303451652816d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8418176412695313d) + "'", double1 == (-1.8418176412695313d));
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        int int2 = org.apache.commons.math.util.FastMath.min(36, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        double double1 = org.apache.commons.math.util.FastMath.sin(9.949874371066196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5012964284823489d) + "'", double1 == (-0.5012964284823489d));
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.8183832327885827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25968541812993223d + "'", double1 == 0.25968541812993223d);
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.2342422629590661d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4839858086339579d + "'", double1 == 0.4839858086339579d);
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.93006726156721E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.558142233720284d + "'", double1 == 1.558142233720284d);
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        double double2 = org.apache.commons.math.util.FastMath.pow((-3.6923537059133387d), 0.7456282765000657d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2604124669171584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30542417660721677d + "'", double1 == 0.30542417660721677d);
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9948848769417228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0022271707131250136d) + "'", double1 == (-0.0022271707131250136d));
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5574075654456325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.68504518261824d + "'", double1 == 74.68504518261824d);
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.6371840522608367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.022469922316507d + "'", double1 == 1.022469922316507d);
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 36L, (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9586654676184497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9586654676184498d + "'", double1 == 0.9586654676184498d);
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.1734524968868303d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        double double1 = org.apache.commons.math.util.FastMath.atanh(8.668644773586124d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.03160459413510747d, 1833.464944418635d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7237632073733778E-5d + "'", double2 == 1.7237632073733778E-5d);
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.010309278362160296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010309460984675509d + "'", double1 == 0.010309460984675509d);
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        double double1 = org.apache.commons.math.util.FastMath.atan((-51.9999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5515679276951895d) + "'", double1 == (-1.5515679276951895d));
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.000110801212674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.6866772216106064d), 0.8221857156655816d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        long long1 = org.apache.commons.math.util.FastMath.abs(16L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 16L + "'", long1 == 16L);
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3815006871452328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39141922639540216d + "'", double1 == 0.39141922639540216d);
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.2873554892516914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.31758271426885d + "'", double1 == 1.31758271426885d);
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        double double1 = org.apache.commons.math.util.FastMath.cos(89.2328896037985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2979085989337856d + "'", double1 == 0.2979085989337856d);
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.6633689306847952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.277058977460265d + "'", double1 == 4.277058977460265d);
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 16L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5198420997897464d + "'", double1 == 2.5198420997897464d);
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.027066513565235144d, 0.4387689880853682d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027066513565235147d + "'", double2 == 0.027066513565235147d);
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9110715003828589d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5337933434707716d) + "'", double1 == (-1.5337933434707716d));
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        long long2 = org.apache.commons.math.util.FastMath.min(41L, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41L + "'", long2 == 41L);
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        float float1 = org.apache.commons.math.util.FastMath.abs(23.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 23.0f + "'", float1 == 23.0f);
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.1478260473879486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14836980746341247d + "'", double1 == 0.14836980746341247d);
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.045799397948117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.343005504578808d + "'", double1 == 1.343005504578808d);
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8345607153475648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3689334594499811d + "'", double1 == 1.3689334594499811d);
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.010308730556720751d, 2.273944986628134d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010308730556720753d + "'", double2 == 0.010308730556720753d);
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 49L, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 49.0f + "'", float2 == 49.0f);
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.2853242860200621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2779390561168309d + "'", double1 == 0.2779390561168309d);
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7456282765000656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7456282765000656d + "'", double1 == 0.7456282765000656d);
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3440585709082206E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.017939523577309636d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.532821681221366d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.6276125002048192d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.587213915156929d) + "'", double1 == (-0.587213915156929d));
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8864602386292288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6321587261496011d + "'", double1 == 0.6321587261496011d);
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5155056039017638d, 0.24395773739405557d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5155056039017638d + "'", double2 == 1.5155056039017638d);
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.019233140238467443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5515620005920432d + "'", double1 == 1.5515620005920432d);
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5792.618751480198d, 1.544406443719329d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5705297105245386d + "'", double2 == 1.5705297105245386d);
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 564, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 564L + "'", long2 == 564L);
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8073058308799063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.241859893345463d + "'", double1 == 2.241859893345463d);
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4844603454294543d, 14.389377026852705d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4844603454294545d + "'", double2 == 1.4844603454294545d);
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.79382339397931d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.343387707436827d + "'", double1 == 15.343387707436827d);
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.3833411645476898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9642074377382737d + "'", double1 == 1.9642074377382737d);
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8526913992993734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        int int2 = org.apache.commons.math.util.FastMath.min(564, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 564 + "'", int2 == 564);
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7722395858224873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1646086561305773d + "'", double1 == 1.1646086561305773d);
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.757421577635591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1327699430736295d + "'", double1 == 2.1327699430736295d);
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 564, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 564L + "'", long2 == 564L);
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.4602546797556596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 23L, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 23.0f + "'", float2 == 23.0f);
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.06855266446079726d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.286300195494016d), (double) 49L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.026244996887057667d) + "'", double2 == (-0.026244996887057667d));
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.14239733028093693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14192043730440299d + "'", double1 == 0.14192043730440299d);
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.999999999733659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.369695522031988d + "'", double1 == 11.369695522031988d);
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.010308913146243286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999468636254574d + "'", double1 == 0.9999468636254574d);
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9988116486579154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9988116486579154d + "'", double1 == 0.9988116486579154d);
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.341756987135465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8720936077713521d + "'", double1 == 0.8720936077713521d);
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 32L, 5.000000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4157995848709557d + "'", double2 == 1.4157995848709557d);
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5340248990657174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2724384933932605d) + "'", double1 == (-0.2724384933932605d));
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3314955002296929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.2758777218403646d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0382962262753126d + "'", double1 == 1.0382962262753126d);
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
        double double1 = org.apache.commons.math.util.FastMath.acos(564.2988711233954d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1362667799148092d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7206");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.0215423270882085d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7207");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7208");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9852092622487529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.449739226056404d + "'", double1 == 2.449739226056404d);
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7209");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.1459660262893476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7210");
        double double1 = org.apache.commons.math.util.FastMath.exp(1202604.2841647768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7211");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.018814327862137076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0779815808758473d + "'", double1 == 1.0779815808758473d);
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7212");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.27799377989205787d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7213");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.504654289280179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6489583202725444d + "'", double1 == 1.6489583202725444d);
    }

    @Test
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7214");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.2873554892516914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7540701097526282d + "'", double1 == 0.7540701097526282d);
    }

    @Test
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7215");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4519004066366517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16193682687952202d + "'", double1 == 0.16193682687952202d);
    }

    @Test
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7216");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.11975712045798752d, 1.6574544541530924d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02967060888264287d + "'", double2 == 0.02967060888264287d);
    }

    @Test
    public void test7217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7217");
        double double1 = org.apache.commons.math.util.FastMath.asin(11.557336411107308d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7218");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 41, (-0.20857219642206395d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 40.99999999999999d + "'", double2 == 40.99999999999999d);
    }

    @Test
    public void test7219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7219");
        int int2 = org.apache.commons.math.util.FastMath.max(3280, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3280 + "'", int2 == 3280);
    }

    @Test
    public void test7220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7220");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8092007725687939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7221");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4403028592460305d, 0.19301249470048104d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0729600886743107d + "'", double2 == 1.0729600886743107d);
    }

    @Test
    public void test7222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7222");
        long long2 = org.apache.commons.math.util.FastMath.max(423L, 2005L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2005L + "'", long2 == 2005L);
    }

    @Test
    public void test7223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7223");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.46098211388712107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8956160578519576d + "'", double1 == 0.8956160578519576d);
    }

    @Test
    public void test7224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7224");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5781356913552533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7225");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(8.044065639126247E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.044065639126248E-5d + "'", double1 == 8.044065639126248E-5d);
    }

    @Test
    public void test7226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7226");
        double double1 = org.apache.commons.math.util.FastMath.sin(70.41869527689032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9645299563679709d + "'", double1 == 0.9645299563679709d);
    }

    @Test
    public void test7227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7227");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8467900408269441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2446975175515231d + "'", double1 == 1.2446975175515231d);
    }

    @Test
    public void test7228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7228");
        double double1 = org.apache.commons.math.util.FastMath.asinh(30.9221450661659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.124881131412898d + "'", double1 == 4.124881131412898d);
    }

    @Test
    public void test7229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7229");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.467108650523244d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7230");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.3665789367467411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.00342593398143d + "'", double1 == 21.00342593398143d);
    }

    @Test
    public void test7231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7231");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5335854272192775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.911036158587637d + "'", double1 == 0.911036158587637d);
    }

    @Test
    public void test7232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7232");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.916079783099616d + "'", double1 == 5.916079783099616d);
    }

    @Test
    public void test7233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7233");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5624661221785252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00833010827468362d + "'", double1 == 0.00833010827468362d);
    }

    @Test
    public void test7234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7234");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4961362064880912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7235");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 84.73931296875567d + "'", double1 == 84.73931296875567d);
    }

    @Test
    public void test7236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7236");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.115026405460952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.897922410566064d + "'", double1 == 0.897922410566064d);
    }

    @Test
    public void test7237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7237");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7238");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6191249712398811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20822167918370313d) + "'", double1 == (-0.20822167918370313d));
    }

    @Test
    public void test7239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7239");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5705956494526137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0038269411583476d + "'", double1 == 1.0038269411583476d);
    }

    @Test
    public void test7240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7240");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7241");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test7242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7242");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.061855305450760255d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06193437480350489d) + "'", double1 == (-0.06193437480350489d));
    }

    @Test
    public void test7243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7243");
        double double1 = org.apache.commons.math.util.FastMath.log(2.1057044739884163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.744650078123713d + "'", double1 == 0.744650078123713d);
    }

    @Test
    public void test7244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7244");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.01743362446048348d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7245");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7224741314941174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.059522441670214d + "'", double1 == 1.059522441670214d);
    }

    @Test
    public void test7246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7246");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.2035968637649817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7247");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.433780830483027d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23840584404423515d + "'", double1 == 0.23840584404423515d);
    }

    @Test
    public void test7248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7248");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4030062718424735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49631627629412856d + "'", double1 == 0.49631627629412856d);
    }

    @Test
    public void test7249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7249");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.8130791098485624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.129291167175251d + "'", double1 == 6.129291167175251d);
    }

    @Test
    public void test7250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7250");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.0068699188553262855d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7251");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.010308913146243286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000531373157175d + "'", double1 == 1.0000531373157175d);
    }

    @Test
    public void test7252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7252");
        double double2 = org.apache.commons.math.util.FastMath.min(0.37414789288563605d, 1.60904478795651d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.37414789288563605d + "'", double2 == 0.37414789288563605d);
    }

    @Test
    public void test7253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7253");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5111502441944042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5642855982613474d + "'", double1 == 0.5642855982613474d);
    }

    @Test
    public void test7254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7254");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6020907673908776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test7255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7255");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.555348061489414d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7256");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8490992029155888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07104156680910527d) + "'", double1 == (-0.07104156680910527d));
    }

    @Test
    public void test7257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7257");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9643581950821597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7258");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.9124034991009713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7259");
        int int2 = org.apache.commons.math.util.FastMath.max(83, 105);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 105 + "'", int2 == 105);
    }

    @Test
    public void test7260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7260");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284590453d + "'", double1 == 1.7182818284590453d);
    }

    @Test
    public void test7261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7261");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7436495683290354d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7262");
        float float2 = org.apache.commons.math.util.FastMath.min(105.0f, (float) 3280L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 105.0f + "'", float2 == 105.0f);
    }

    @Test
    public void test7263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7263");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.5712556690037496d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7264");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5707963267948954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7265");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.9269693474501635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test7266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7266");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9999092042625951d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7267");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test7268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7268");
        double double1 = org.apache.commons.math.util.FastMath.acosh(13.067188648029997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2617842428105175d + "'", double1 == 3.2617842428105175d);
    }

    @Test
    public void test7269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7269");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5585053606381853d, 1.0729600886743107d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5352669621904063d + "'", double2 == 0.5352669621904063d);
    }

    @Test
    public void test7270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7270");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test7271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7271");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8385597057989701d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7272");
        double double2 = org.apache.commons.math.util.FastMath.atan2(8.119741647423155d, 0.9606232348570213d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.453036583852903d + "'", double2 == 1.453036583852903d);
    }

    @Test
    public void test7273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7273");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.1189414060601215d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11894140606012149d) + "'", double1 == (-0.11894140606012149d));
    }

    @Test
    public void test7274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7274");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.8414466887303463d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test7275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7275");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.5198420997897464d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7276");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.139171425638416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0443907762484252d) + "'", double1 == (-1.0443907762484252d));
    }

    @Test
    public void test7277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7277");
        double double1 = org.apache.commons.math.util.FastMath.tanh(97.60631798402139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7278");
        double double2 = org.apache.commons.math.util.FastMath.max(185.47866641176898d, 0.8194058173186031d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 185.47866641176898d + "'", double2 == 185.47866641176898d);
    }

    @Test
    public void test7279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7279");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9224567901476869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7280");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6894198109289533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8101085452895858d + "'", double1 == 0.8101085452895858d);
    }

    @Test
    public void test7281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7281");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4403028592460307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.161186440228612d + "'", double1 == 1.161186440228612d);
    }

    @Test
    public void test7282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7282");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, (float) 41);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test7283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7283");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.547473508864641E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.547473508864641E-13d + "'", double1 == 4.547473508864641E-13d);
    }

    @Test
    public void test7284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7284");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.0d, 0.6605207131100779d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.407142982519564d + "'", double2 == 1.407142982519564d);
    }

    @Test
    public void test7285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7285");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0096275915360662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.590890295703488d + "'", double1 == 1.590890295703488d);
    }

    @Test
    public void test7286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7286");
        int int2 = org.apache.commons.math.util.FastMath.min(83, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test7287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7287");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8656496755126944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9530464255659571d + "'", double1 == 0.9530464255659571d);
    }

    @Test
    public void test7288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7288");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5628104863272747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8457588752709917d + "'", double1 == 0.8457588752709917d);
    }

    @Test
    public void test7289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7289");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1133.3738086310673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7290");
        long long1 = org.apache.commons.math.util.FastMath.round(0.03011360650845773d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7291");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5734860711430395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7744421132737351d + "'", double1 == 1.7744421132737351d);
    }

    @Test
    public void test7292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7292");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2732155230818425d, 0.036726594326735876d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5419587793145515d + "'", double2 == 1.5419587793145515d);
    }

    @Test
    public void test7293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7293");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.1805076511219491d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17954150397292445d) + "'", double1 == (-0.17954150397292445d));
    }

    @Test
    public void test7294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7294");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.994092364175252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10875165928971431d + "'", double1 == 0.10875165928971431d);
    }

    @Test
    public void test7295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7295");
        double double1 = org.apache.commons.math.util.FastMath.floor(8.78874590517579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test7296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7296");
        long long2 = org.apache.commons.math.util.FastMath.min(423L, 2005L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 423L + "'", long2 == 423L);
    }

    @Test
    public void test7297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7297");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 6559L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7298");
        long long1 = org.apache.commons.math.util.FastMath.round(1.341756987135465d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7299");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test7300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7300");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.605170185988094d, (-0.7646645087741661d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.605170185988093d + "'", double2 == 4.605170185988093d);
    }

    @Test
    public void test7301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7301");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.9949092881730508d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.994909288173051d + "'", double1 == 1.994909288173051d);
    }

    @Test
    public void test7302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7302");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.877060243390276d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6394141724667206d + "'", double1 == 0.6394141724667206d);
    }

    @Test
    public void test7303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7303");
        double double1 = org.apache.commons.math.util.FastMath.acos(13.34453352613691d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7304");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0368954438251052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7305");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7370529091738747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9033018261833696d) + "'", double1 == (-0.9033018261833696d));
    }

    @Test
    public void test7306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7306");
        int int1 = org.apache.commons.math.util.FastMath.round(3280.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3280 + "'", int1 == 3280);
    }

    @Test
    public void test7307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7307");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.660102087863946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.630981939772463d + "'", double1 == 1.630981939772463d);
    }

    @Test
    public void test7308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7308");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.14536475001366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test7309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7309");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.693147182621099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8849970453777316d + "'", double1 == 0.8849970453777316d);
    }

    @Test
    public void test7310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7310");
        long long1 = org.apache.commons.math.util.FastMath.round(2.0457993979481164d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test7311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7311");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.720323134480318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6493402118666476d + "'", double1 == 1.6493402118666476d);
    }

    @Test
    public void test7312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7312");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 3280.0f, 5.000000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3279.9999999999995d + "'", double2 == 3279.9999999999995d);
    }

    @Test
    public void test7313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7313");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.47420105633127485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4427962682796437d + "'", double1 == 0.4427962682796437d);
    }

    @Test
    public void test7314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7314");
        double double1 = org.apache.commons.math.util.FastMath.log10(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9542425094393249d + "'", double1 == 0.9542425094393249d);
    }

    @Test
    public void test7315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7315");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8058302155599485d, 0.49297772472673135d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0217718733472676d + "'", double2 == 1.0217718733472676d);
    }

    @Test
    public void test7316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7316");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.3185862410962617d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7317");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.703333949748545d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7318");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7319");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7132953246693796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7132953246693797d + "'", double1 == 0.7132953246693797d);
    }

    @Test
    public void test7320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7320");
        double double1 = org.apache.commons.math.util.FastMath.atan(526.8331299048269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5688981948395049d + "'", double1 == 1.5688981948395049d);
    }

    @Test
    public void test7321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7321");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 49L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 49.0f + "'", float2 == 49.0f);
    }

    @Test
    public void test7322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7322");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9385078997951388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2182829050172774d + "'", double1 == 1.2182829050172774d);
    }

    @Test
    public void test7323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7323");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1180568005746387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0378978743822724d + "'", double1 == 1.0378978743822724d);
    }

    @Test
    public void test7324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7324");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 5L, 0.015373000987645918d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.025050511222245d + "'", double2 == 1.025050511222245d);
    }

    @Test
    public void test7325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7325");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8021880834897168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9291633449333349d + "'", double1 == 0.9291633449333349d);
    }

    @Test
    public void test7326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7326");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-5), (float) 3280);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3280.0f + "'", float2 == 3280.0f);
    }

    @Test
    public void test7327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7327");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 3280);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7328");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2182829050172774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.542819530238635d + "'", double1 == 1.542819530238635d);
    }

    @Test
    public void test7329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7329");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test7330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7330");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8028292606614267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.035484319107587d + "'", double1 == 1.035484319107587d);
    }

    @Test
    public void test7331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7331");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9170462317842702d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9170462317842702d + "'", double1 == 0.9170462317842702d);
    }

    @Test
    public void test7332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7332");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0928900516588147d, 0.017535076315453355d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0928900516588147d + "'", double2 == 1.0928900516588147d);
    }

    @Test
    public void test7333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7333");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.9481480091341E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8924799938569363d + "'", double1 == 0.8924799938569363d);
    }

    @Test
    public void test7334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7334");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.6953521612866584E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6953521578361484E-5d + "'", double1 == 4.6953521578361484E-5d);
    }

    @Test
    public void test7335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7335");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.9073465724950998E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9073465724950998E21d + "'", double1 == 1.9073465724950998E21d);
    }

    @Test
    public void test7336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7336");
        double double1 = org.apache.commons.math.util.FastMath.exp((-9.306852801150697d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079986118564082E-5d + "'", double1 == 9.079986118564082E-5d);
    }

    @Test
    public void test7337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7337");
        double double2 = org.apache.commons.math.util.FastMath.min(7.11566744569261d, 1.3115346796568936d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3115346796568936d + "'", double2 == 1.3115346796568936d);
    }

    @Test
    public void test7338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7338");
        double double1 = org.apache.commons.math.util.FastMath.floor(89.00499281765603d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.0d + "'", double1 == 89.0d);
    }

    @Test
    public void test7339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7339");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.018814327862137076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01881543801826684d + "'", double1 == 0.01881543801826684d);
    }

    @Test
    public void test7340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7340");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2248497229806472E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.137766050815275E-7d + "'", double1 == 2.137766050815275E-7d);
    }

    @Test
    public void test7341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7341");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.1362667799148092d, 1.381816156307044d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06366285453228931d + "'", double2 == 0.06366285453228931d);
    }

    @Test
    public void test7342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7342");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.4675027412274724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4519581950543851d + "'", double1 == 0.4519581950543851d);
    }

    @Test
    public void test7343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7343");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5872139151569291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.64487900984524d + "'", double1 == 33.64487900984524d);
    }

    @Test
    public void test7344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7344");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.1331539194450892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test7345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7345");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5419587793145515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.3477302378681d + "'", double1 == 88.3477302378681d);
    }

    @Test
    public void test7346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7346");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8940757456435279d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7347");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.949874371066198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20948.590341753694d + "'", double1 == 20948.590341753694d);
    }

    @Test
    public void test7348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7348");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.01983029668292673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test7349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7349");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.9903383527331044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test7350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7350");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9999999999531204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.238292721263724d + "'", double1 == 12.238292721263724d);
    }

    @Test
    public void test7351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7351");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.027413680827173704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02741024837909031d + "'", double1 == 0.02741024837909031d);
    }

    @Test
    public void test7352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7352");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.6202188093282305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5378267432104432d + "'", double1 == 0.5378267432104432d);
    }

    @Test
    public void test7353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7353");
        long long1 = org.apache.commons.math.util.FastMath.round(1.7075701760979363d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test7354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7354");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 564, 423L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 564L + "'", long2 == 564L);
    }

    @Test
    public void test7355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7355");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3899113077380959d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0769833648955625d + "'", double1 == 1.0769833648955625d);
    }

    @Test
    public void test7356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7356");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8429018484132338d, 96268.21174846243d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8429018484132338d + "'", double2 == 0.8429018484132338d);
    }

    @Test
    public void test7357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7357");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7558589813143319d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12155922215714049d) + "'", double1 == (-0.12155922215714049d));
    }

    @Test
    public void test7358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7358");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9233096377747994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0602033613734598d + "'", double1 == 1.0602033613734598d);
    }

    @Test
    public void test7359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7359");
        double double1 = org.apache.commons.math.util.FastMath.log(5.469566183975951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6991993050577383d + "'", double1 == 1.6991993050577383d);
    }

    @Test
    public void test7360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7360");
        double double1 = org.apache.commons.math.util.FastMath.rint(47.98895829359383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.0d + "'", double1 == 48.0d);
    }

    @Test
    public void test7361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7361");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7351801576829818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6262242920296794d + "'", double1 == 0.6262242920296794d);
    }

    @Test
    public void test7362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7362");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.010309095749349842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010308913146243284d + "'", double1 == 0.010308913146243284d);
    }

    @Test
    public void test7363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7363");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9999956028938003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7364");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 16L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test7365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7365");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5707963267948961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7366");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.5337933434707716d), 1.454741536383289d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.454741536383289d + "'", double2 == 1.454741536383289d);
    }

    @Test
    public void test7367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7367");
        double double1 = org.apache.commons.math.util.FastMath.acosh(8.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7686593833135738d + "'", double1 == 2.7686593833135738d);
    }

    @Test
    public void test7368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7368");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(12.238292298814303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.238292298814304d + "'", double1 == 12.238292298814304d);
    }

    @Test
    public void test7369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7369");
        long long1 = org.apache.commons.math.util.FastMath.round(0.938806681754034d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7370");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.045392431815163135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6007947648442102d + "'", double1 == 2.6007947648442102d);
    }

    @Test
    public void test7371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7371");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7742732308037816d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7372");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.2203415586770938d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7373");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.061855305450760255d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7374");
        double double1 = org.apache.commons.math.util.FastMath.log(1.130462092319088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12262648039048078d + "'", double1 == 0.12262648039048078d);
    }

    @Test
    public void test7375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7375");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.024913294410754103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025226223826717013d + "'", double1 == 0.025226223826717013d);
    }

    @Test
    public void test7376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7376");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.2737367544328376E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0487097934144756E-29d + "'", double1 == 5.0487097934144756E-29d);
    }

    @Test
    public void test7377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7377");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.3458349416236008d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3527700317609732d) + "'", double1 == (-0.3527700317609732d));
    }

    @Test
    public void test7378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7378");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3503505927690682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1620458651744638d + "'", double1 == 1.1620458651744638d);
    }

    @Test
    public void test7379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7379");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5900247258946039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5900247258946039d + "'", double1 == 1.5900247258946039d);
    }

    @Test
    public void test7380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7380");
        long long2 = org.apache.commons.math.util.FastMath.min((-5L), (long) 51);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test7381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7381");
        int int2 = org.apache.commons.math.util.FastMath.min(3280, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7382");
        double double1 = org.apache.commons.math.util.FastMath.asin(7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.951386703658792E-16d + "'", double1 == 7.951386703658792E-16d);
    }

    @Test
    public void test7383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7383");
        long long1 = org.apache.commons.math.util.FastMath.round(0.3859684164526524d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7384");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test7385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7385");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.0850300727533154d), 1.5707946849018772d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test7386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7386");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.463837428330972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.322515084495176d + "'", double1 == 4.322515084495176d);
    }

    @Test
    public void test7387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7387");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5430806348136186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348136188d + "'", double1 == 1.5430806348136188d);
    }

    @Test
    public void test7388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7388");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8542643515376653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5466622842002011d + "'", double1 == 0.5466622842002011d);
    }

    @Test
    public void test7389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7389");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test7390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7390");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.457839543417076d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7391");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.16678521231533142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16525572341477296d + "'", double1 == 0.16525572341477296d);
    }

    @Test
    public void test7392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7392");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8280082726548261d, 0.18373771326775734d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.828008272654826d + "'", double2 == 0.828008272654826d);
    }

    @Test
    public void test7393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7393");
        double double1 = org.apache.commons.math.util.FastMath.log(0.12262648039048078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0986122886681096d) + "'", double1 == (-2.0986122886681096d));
    }

    @Test
    public void test7394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7394");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.257056909705544E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7395");
        double double1 = org.apache.commons.math.util.FastMath.log10(10.564389553932575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.023844407113083d + "'", double1 == 1.023844407113083d);
    }

    @Test
    public void test7396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7396");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7397");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6696927901138922d, 0.017350939764409778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.669692790113892d + "'", double2 == 0.669692790113892d);
    }

    @Test
    public void test7398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7398");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 51, 83L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test7399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7399");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.2386752917259767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26956623098831756d + "'", double1 == 0.26956623098831756d);
    }

    @Test
    public void test7400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7400");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.015564976918834515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12475967665409571d + "'", double1 == 0.12475967665409571d);
    }

    @Test
    public void test7401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7401");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.015107744628211833d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test7402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7402");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9929402025489149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017330075809897958d + "'", double1 == 0.017330075809897958d);
    }

    @Test
    public void test7403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7403");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.533488069366356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.533488069366356d + "'", double1 == 1.533488069366356d);
    }

    @Test
    public void test7404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7404");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5270148634788125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5270148634788127d + "'", double1 == 0.5270148634788127d);
    }

    @Test
    public void test7405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7405");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test7406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7406");
        double double1 = org.apache.commons.math.util.FastMath.exp(1350.2725658295117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7407");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5012964284823489d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4631361194679013d) + "'", double1 == (-0.4631361194679013d));
    }

    @Test
    public void test7408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7408");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.9848065043413134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test7409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7409");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.681812801731165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6818128017311653d + "'", double1 == 1.6818128017311653d);
    }

    @Test
    public void test7410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7410");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.27629111752846225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5256340148130277d + "'", double1 == 0.5256340148130277d);
    }

    @Test
    public void test7411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7411");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.025050511222245d, (-1.3947302928006944d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.507796362351636d + "'", double2 == 2.507796362351636d);
    }

    @Test
    public void test7412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7412");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.027406816704501333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027785838173448933d + "'", double1 == 0.027785838173448933d);
    }

    @Test
    public void test7413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7413");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.2737367544328376E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.273736754433096E-13d + "'", double1 == 2.273736754433096E-13d);
    }

    @Test
    public void test7414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7414");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5501702829958329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7335481865142016d + "'", double1 == 0.7335481865142016d);
    }

    @Test
    public void test7415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7415");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7218684241594407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8803790356975167d + "'", double1 == 0.8803790356975167d);
    }

    @Test
    public void test7416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7416");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.019830296785124987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01983029678512499d + "'", double1 == 0.01983029678512499d);
    }

    @Test
    public void test7417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7417");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.7949001954883153d, 0.8031040041762045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.794900195488315d + "'", double2 == 1.794900195488315d);
    }

    @Test
    public void test7418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7418");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.2453438403535575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5482652757150426d + "'", double1 == 1.5482652757150426d);
    }

    @Test
    public void test7419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7419");
        float float2 = org.apache.commons.math.util.FastMath.min(6559.0f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test7420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7420");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.193280050738016d, 100.9642408323164d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011818288182753541d + "'", double2 == 0.011818288182753541d);
    }

    @Test
    public void test7421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7421");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9249802099283556d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7282449115236026d) + "'", double1 == (-0.7282449115236026d));
    }

    @Test
    public void test7422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7422");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9971213268799871d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00125199475888247d) + "'", double1 == (-0.00125199475888247d));
    }

    @Test
    public void test7423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7423");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 83);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 83.0f + "'", float1 == 83.0f);
    }

    @Test
    public void test7424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7424");
        double double1 = org.apache.commons.math.util.FastMath.log(0.01743362446048348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.049354497264685d) + "'", double1 == (-4.049354497264685d));
    }

    @Test
    public void test7425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7425");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.012097700501686678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012171173666911821d + "'", double1 == 0.012171173666911821d);
    }

    @Test
    public void test7426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7426");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.306852817378902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16243522466177238d + "'", double1 == 0.16243522466177238d);
    }

    @Test
    public void test7427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7427");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9952731515503572d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test7428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7428");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test7429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7429");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.857041449915169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6863718097511133d + "'", double1 == 0.6863718097511133d);
    }

    @Test
    public void test7430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7430");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test7431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7431");
        double double1 = org.apache.commons.math.util.FastMath.log1p(8.119741647423155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2104414755515647d + "'", double1 == 2.2104414755515647d);
    }

    @Test
    public void test7432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7432");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 3280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test7433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7433");
        long long1 = org.apache.commons.math.util.FastMath.round(0.14946825286985244d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7434");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9364017098556218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7080000778051354d + "'", double1 == 1.7080000778051354d);
    }

    @Test
    public void test7435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7435");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7775220823415315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7436");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.2973397658232583E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6940658945086007E-21d + "'", double1 == 1.6940658945086007E-21d);
    }

    @Test
    public void test7437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7437");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test7438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7438");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.419948428089307E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7439");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test7440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7440");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.1149712528373934d, (-0.45361203411340467d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7154030464724488d + "'", double2 == 1.7154030464724488d);
    }

    @Test
    public void test7441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7441");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test7442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7442");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 59L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 59.0f + "'", float1 == 59.0f);
    }

    @Test
    public void test7443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7443");
        int int2 = org.apache.commons.math.util.FastMath.min(3280, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test7444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7444");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1046581985685953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.29225258250494d + "'", double1 == 63.29225258250494d);
    }

    @Test
    public void test7445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7445");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.01629691212170672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01629546951289278d + "'", double1 == 0.01629546951289278d);
    }

    @Test
    public void test7446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7446");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6991570920917849d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012202593245670855d + "'", double1 == 0.012202593245670855d);
    }

    @Test
    public void test7447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7447");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test7448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7448");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9725420682979978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9725420682979979d + "'", double1 == 0.9725420682979979d);
    }

    @Test
    public void test7449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7449");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.01030854798077996d, (-1.532821681221366d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.134867544793341d + "'", double2 == 3.134867544793341d);
    }

    @Test
    public void test7450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7450");
        float float2 = org.apache.commons.math.util.FastMath.max(41.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 41.0f + "'", float2 == 41.0f);
    }

    @Test
    public void test7451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7451");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.556893304490063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2967269027307116d + "'", double1 == 1.2967269027307116d);
    }

    @Test
    public void test7452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7452");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.307060884908975d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7453");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.06650537637061356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0687667101456602d + "'", double1 == 1.0687667101456602d);
    }

    @Test
    public void test7454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7454");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, (long) 51);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test7455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7455");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8322707426928889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9122887386638557d + "'", double1 == 0.9122887386638557d);
    }

    @Test
    public void test7456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7456");
        int int2 = org.apache.commons.math.util.FastMath.max(41, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test7457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7457");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.2240401467946807d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7458");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9830779426147055d, 1.0393154606197867d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9830779426147056d + "'", double2 == 0.9830779426147056d);
    }

    @Test
    public void test7459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7459");
        double double1 = org.apache.commons.math.util.FastMath.signum(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7460");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.770170914020331d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7461");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7604870043227956d, 2.7686593833135738d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4685799351076605d + "'", double2 == 0.4685799351076605d);
    }

    @Test
    public void test7462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7462");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.24703638249282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test7463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7463");
        long long2 = org.apache.commons.math.util.FastMath.max(105L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 105L + "'", long2 == 105L);
    }

    @Test
    public void test7464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7464");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.454741536383289d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7465");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.06193437480350489d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3956494678981385d) + "'", double1 == (-0.3956494678981385d));
    }

    @Test
    public void test7466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7466");
        int int2 = org.apache.commons.math.util.FastMath.max(6559, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6559 + "'", int2 == 6559);
    }

    @Test
    public void test7467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7467");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3383347192042695E42d, 1.023844407113083d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3383347192042694E42d + "'", double2 == 1.3383347192042694E42d);
    }

    @Test
    public void test7468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7468");
        long long1 = org.apache.commons.math.util.FastMath.round(5.6843418860808015E-14d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7469");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7523553059884244d) + "'", double1 == (-0.7523553059884244d));
    }

    @Test
    public void test7470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7470");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.01753507631545335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017535076315453355d + "'", double1 == 0.017535076315453355d);
    }

    @Test
    public void test7471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7471");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 6559, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6559L + "'", long2 == 6559L);
    }

    @Test
    public void test7472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7472");
        int int2 = org.apache.commons.math.util.FastMath.min(49, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test7473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7473");
        double double1 = org.apache.commons.math.util.FastMath.atan(8.498228778891956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4536633967641548d + "'", double1 == 1.4536633967641548d);
    }

    @Test
    public void test7474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7474");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999999999979521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559549048d + "'", double1 == 0.7615941559549048d);
    }

    @Test
    public void test7475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7475");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.1793704123873463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38150686932482664d + "'", double1 == 0.38150686932482664d);
    }

    @Test
    public void test7476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7476");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 564);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 564 + "'", int2 == 564);
    }

    @Test
    public void test7477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7477");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9291633449333349d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9639311930492419d + "'", double1 == 0.9639311930492419d);
    }

    @Test
    public void test7478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7478");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test7479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7479");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0006178365651222d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7480");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.034852985335759985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03486004536020856d + "'", double1 == 0.03486004536020856d);
    }

    @Test
    public void test7481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7481");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1635261714989822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06577615643216807d + "'", double1 == 0.06577615643216807d);
    }

    @Test
    public void test7482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7482");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.6146685600490525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.777357160368767d + "'", double1 == 1.777357160368767d);
    }

    @Test
    public void test7483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7483");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.021362533392777E-54d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.021362533392777E-54d + "'", double1 == 3.021362533392777E-54d);
    }

    @Test
    public void test7484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7484");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.791759469228055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test7485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7485");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9773206322293114d, 0.18425105161950944d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9773206322293113d + "'", double2 == 0.9773206322293113d);
    }

    @Test
    public void test7486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7486");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5L, (float) 41);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test7487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7487");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test7488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7488");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.0016003481560184533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09169319509140117d + "'", double1 == 0.09169319509140117d);
    }

    @Test
    public void test7489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7489");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7540701097526282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7490");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.6217095394989354d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6217095394989354d + "'", double1 == 1.6217095394989354d);
    }

    @Test
    public void test7491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7491");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(53.229380982910065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.295846831102614d + "'", double1 == 7.295846831102614d);
    }

    @Test
    public void test7492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7492");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.919078092376074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test7493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7493");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.25094811390556965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24838616443758013d) + "'", double1 == (-0.24838616443758013d));
    }

    @Test
    public void test7494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7494");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.969640602224144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test7495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7495");
        double double1 = org.apache.commons.math.util.FastMath.sinh(74.20321057778875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.414240048492133E31d + "'", double1 == 8.414240048492133E31d);
    }

    @Test
    public void test7496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7496");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5063656411097466d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8745129512124497d + "'", double1 == 0.8745129512124497d);
    }

    @Test
    public void test7497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7497");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-323.3062153431158d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2855095071633634E140d + "'", double1 == 1.2855095071633634E140d);
    }

    @Test
    public void test7498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7498");
        int int2 = org.apache.commons.math.util.FastMath.min(41, 3280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test7499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7499");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7005834764389589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6047380021167238d + "'", double1 == 0.6047380021167238d);
    }

    @Test
    public void test7500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7500");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6875573919608692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7727985235349918d + "'", double1 == 0.7727985235349918d);
    }
}


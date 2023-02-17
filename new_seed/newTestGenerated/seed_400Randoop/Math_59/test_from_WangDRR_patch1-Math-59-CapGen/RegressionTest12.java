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
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.8281953229790022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2226466518620365d + "'", double1 == 5.2226466518620365d);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.004407855229809197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0044175841129233d + "'", double1 == 1.0044175841129233d);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        double double1 = org.apache.commons.math.util.FastMath.atan((-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2831853071795865d) + "'", double1 == (-1.2831853071795865d));
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3815982947372531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39092717489822687d + "'", double1 == 0.39092717489822687d);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2123946495379194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5320203199848932d + "'", double1 == 1.5320203199848932d);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8227393363495644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.276728026927164d + "'", double1 == 1.276728026927164d);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        long long1 = org.apache.commons.math.util.FastMath.round(1.598838319671569d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10, (float) 149);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.467141881863116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4671418818631161d + "'", double1 == 1.4671418818631161d);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5840734641020676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6237381136780014d + "'", double1 == 0.6237381136780014d);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.4505495340698077d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9825536750297795d, 0.5419362735933929d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5419362735933929d + "'", double2 == 0.5419362735933929d);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6938846602072433d, 0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8890503841364191d + "'", double2 == 0.8890503841364191d);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        long long2 = org.apache.commons.math.util.FastMath.max(177L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 177L + "'", long2 == 177L);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5953649790673516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.024566180664165216d) + "'", double1 == (-0.024566180664165216d));
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        double double1 = org.apache.commons.math.util.FastMath.atan((-3.8754705787895336d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3182714301523224d) + "'", double1 == (-1.3182714301523224d));
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.41285127790450793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3456098454414251d + "'", double1 == 0.3456098454414251d);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7212254887267798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.056952438710966d + "'", double1 == 1.056952438710966d);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9589242746631385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        double double2 = org.apache.commons.math.util.FastMath.max(0.11831214619987152d, 1.421085471520201E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11831214619987152d + "'", double2 == 0.11831214619987152d);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.1046784232036018d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3313174091037901d + "'", double1 == 0.3313174091037901d);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        float float2 = org.apache.commons.math.util.FastMath.min(1765.0f, (-36.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.1563686078816606d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.0634370688955608d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        double double1 = org.apache.commons.math.util.FastMath.atan(12.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4876550949064553d + "'", double1 == 1.4876550949064553d);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        int int2 = org.apache.commons.math.util.FastMath.min(57, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.07483161956956147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0013060581460886695d + "'", double1 == 0.0013060581460886695d);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.25457675705027805d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8210318612260353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8210318612260354d + "'", double1 == 0.8210318612260354d);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) 36);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0063795080101574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.002121996615392d + "'", double1 == 1.002121996615392d);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5143524375699186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4149879136381553d + "'", double1 == 0.4149879136381553d);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9640275800758169d + "'", double1 == 0.9640275800758169d);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        double double2 = org.apache.commons.math.util.FastMath.min(14.141104673840013d, 1.22459997143478d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.22459997143478d + "'", double2 == 1.22459997143478d);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4876550949064553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9512992442867865d + "'", double1 == 0.9512992442867865d);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.009448739130587655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.024626141243386d) + "'", double1 == (-2.024626141243386d));
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.2438303468812233d, 0.9033391107665129d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0752145808589093d + "'", double2 == 2.0752145808589093d);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.1215871282840145E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.121587127270091E-5d + "'", double1 == 3.121587127270091E-5d);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.4089393878627656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05949721631912529d + "'", double1 == 0.05949721631912529d);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, 1586013452313419L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1586013452313419L + "'", long2 == 1586013452313419L);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        float float2 = org.apache.commons.math.util.FastMath.max(177.0f, (float) (-36));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 177.0f + "'", float2 == 177.0f);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        double double1 = org.apache.commons.math.util.FastMath.exp(20.306852820956568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.59407868241608E8d + "'", double1 == 6.59407868241608E8d);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.138391912273988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4007052777090694d + "'", double1 == 1.4007052777090694d);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.009730277093455045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2134887868481213d + "'", double1 == 0.2134887868481213d);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.4152182237572941d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6601961944899242d + "'", double1 == 0.6601961944899242d);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.16722627711425445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16800677105828016d + "'", double1 == 0.16800677105828016d);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.6586136787048939E-248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6586136787048939E-248d + "'", double1 == 1.6586136787048939E-248d);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.1277423141222618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13626016677042613d + "'", double1 == 0.13626016677042613d);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.3924217616740467d, 0.650856032201109d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5439910362605375d + "'", double2 == 0.5439910362605375d);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.21402010170352076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21241903725604527d + "'", double1 == 0.21241903725604527d);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5267041877018416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.48478202733400194d) + "'", double1 == (-0.48478202733400194d));
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0682346001726604d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0682346001726601d + "'", double2 == 1.0682346001726601d);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-53), (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.3083117974611422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3632944711955593d + "'", double1 == 0.3632944711955593d);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        int int1 = org.apache.commons.math.util.FastMath.round(11013.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11013 + "'", int1 == 11013);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267831587699267d + "'", double1 == 5.267831587699267d);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.3859684164526524d, (-0.024566180664165216d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.38596841645265234d + "'", double2 == 0.38596841645265234d);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.09950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8580016718173996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6952266504009452d + "'", double1 == 0.6952266504009452d);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        double double1 = org.apache.commons.math.util.FastMath.acosh(295.4144370642092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.381523557699956d + "'", double1 == 6.381523557699956d);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.6109179126442243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.970291913552122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.970291913552122d + "'", double1 == 3.970291913552122d);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9285198206877272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.20026691965075d + "'", double1 == 53.20026691965075d);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(24.35674178862402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.898720870234331d + "'", double1 == 2.898720870234331d);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6065871571457463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 84677176, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 84677176L + "'", long2 == 84677176L);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7615560214388488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6419925753553876d + "'", double1 == 0.6419925753553876d);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5707651109236087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7034887077696317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7034887077696317d + "'", double1 == 0.7034887077696317d);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.853200064217061d, 0.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0759672730186283d + "'", double2 == 1.0759672730186283d);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.6783632786807827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.188398211790743d + "'", double1 == 1.188398211790743d);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        double double1 = org.apache.commons.math.util.FastMath.ceil(6.9721357718677766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.4671086505232536d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.46710865052325357d) + "'", double1 == (-0.46710865052325357d));
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.056952438710966d, 0.7966043547446022d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0451116101713789d + "'", double2 == 1.0451116101713789d);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.214684762271564E-8d + "'", double1 == 4.214684762271564E-8d);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.477141806555308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6114619437197315d + "'", double1 == 0.6114619437197315d);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        double double1 = org.apache.commons.math.util.FastMath.tanh(307.4859955690165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.762747174039086d + "'", double1 == 1.762747174039086d);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7588984970945903d, 1.0192608780318253d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7588984970945903d + "'", double2 == 0.7588984970945903d);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5716776679087391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.6112949659561453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.604461414258045d + "'", double1 == 2.604461414258045d);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7425810940508051d + "'", double1 == 0.7425810940508051d);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04084445256892067d + "'", double1 == 0.04084445256892067d);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        double double1 = org.apache.commons.math.util.FastMath.log(5.852975109821626E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.443390274226692d) + "'", double1 == (-7.443390274226692d));
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        long long1 = org.apache.commons.math.util.FastMath.round(1.383255525197761d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        long long2 = org.apache.commons.math.util.FastMath.max(1477896L, (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-33.10480098881463d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-33.0d) + "'", double1 == (-33.0d));
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        float float2 = org.apache.commons.math.util.FastMath.min(35.0f, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        double double1 = org.apache.commons.math.util.FastMath.log(6.59407868241608E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.306852820956568d + "'", double1 == 20.306852820956568d);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, (-0.4418123421690833d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3646637687639772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38173678114863274d + "'", double1 == 0.38173678114863274d);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5751804806033579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.957971566578101d + "'", double1 == 0.957971566578101d);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.999474205005279d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3106935184103474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11750115177867763d + "'", double1 == 0.11750115177867763d);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        int int2 = org.apache.commons.math.util.FastMath.min(5, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        float float1 = org.apache.commons.math.util.FastMath.abs(4.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        double double2 = org.apache.commons.math.util.FastMath.min(0.09933992780358329d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9595656024571418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4270376521328167d + "'", double1 == 1.4270376521328167d);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.2554125869476496d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.021911083113216073d) + "'", double1 == (-0.021911083113216073d));
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.00421791656147471d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004217891548254437d + "'", double1 == 0.004217891548254437d);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        int int2 = org.apache.commons.math.util.FastMath.max(57, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        double double1 = org.apache.commons.math.util.FastMath.cosh(10.186319657706955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13268.82368310455d + "'", double1 == 13268.82368310455d);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2583723393689583d, 30.957041787430857d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1229.6922651458594d + "'", double2 == 1229.6922651458594d);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.298292365610484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9754222452038217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8638872718805123d + "'", double1 == 0.8638872718805123d);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 84677176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84677176 + "'", int2 == 84677176);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7027403004155557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.17823481522447054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4932054413052554d, 0.351875212525347d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4932054413052554d + "'", double2 == 0.4932054413052554d);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6935752086037041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8548123674846693d + "'", double1 == 0.8548123674846693d);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7237289657353609d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8507226138615106d + "'", double1 == 0.8507226138615106d);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        double double2 = org.apache.commons.math.util.FastMath.min(1.60978210179491616E17d, 0.9334810208242135d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9334810208242135d + "'", double2 == 0.9334810208242135d);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.24014385818911937d), (-1.1464525897078246d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2401438581891194d) + "'", double2 == (-0.2401438581891194d));
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8117491596404741d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1321363567097247d + "'", double1 == 1.1321363567097247d);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        double double1 = org.apache.commons.math.util.FastMath.log1p(100.00000000000323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.615120516841292d + "'", double1 == 4.615120516841292d);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.66071342214928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.71147216668713d + "'", double1 == 104.71147216668713d);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3521708576437375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1098639255770602d + "'", double1 == 1.1098639255770602d);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5539281628193607d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4253120969346567d) + "'", double1 == (-0.4253120969346567d));
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        int int2 = org.apache.commons.math.util.FastMath.max(36, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.583108182225291E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707927436867144d + "'", double1 == 1.5707927436867144d);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9999991877127801d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.674774076371737d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.30102999566398114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31046516452991885d + "'", double1 == 0.31046516452991885d);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6499429567608755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-53), 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.2396109578603927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4454052136081064d + "'", double1 == 1.4454052136081064d);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.08704594528845262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08726646259971647d + "'", double1 == 0.08726646259971647d);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.623488653973615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8654245239463432d + "'", double1 == 1.8654245239463432d);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        int int2 = org.apache.commons.math.util.FastMath.max(149, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.2775176041484217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.961738500572511d + "'", double1 == 0.961738500572511d);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (-53), 0.9371022206832453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5531169949934744d) + "'", double2 == (-1.5531169949934744d));
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6738724530171597d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7212254887267799d, 0.10757413843619565d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9654551805545912d + "'", double2 == 0.9654551805545912d);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.663573410253516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 95.3157353177119d + "'", double1 == 95.3157353177119d);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.17403209863049748d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.44248081051228866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.2554125869476498d), 0.927002471590281d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 1586013452313419L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(99.30685281944008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.630839611870485d + "'", double1 == 4.630839611870485d);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9994965381991057d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3282591577868472d + "'", double1 == 1.3282591577868472d);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.5789007127791432d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.021252051384784545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        float float2 = org.apache.commons.math.util.FastMath.min(1765.0f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        long long1 = org.apache.commons.math.util.FastMath.round(1.6094379124341003d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        double double1 = org.apache.commons.math.util.FastMath.log(55.417748437204494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.014899911348687d + "'", double1 == 4.014899911348687d);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1764.9013237338472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.58601345231343E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0117658446014577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0058657189712044d + "'", double1 == 1.0058657189712044d);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) -1, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.868551121099462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.231690697458971d + "'", double1 == 1.231690697458971d);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.005289834638583393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999860088573737d + "'", double1 == 0.9999860088573737d);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.2717628242082613d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26526438319276574d) + "'", double1 == (-0.26526438319276574d));
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        float float2 = org.apache.commons.math.util.FastMath.max((-36.0f), 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(6.9721357718677766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6404802161477705d + "'", double1 == 2.6404802161477705d);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9938982054999557d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.17230617170547372d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9171523356672743d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.731671717763701d + "'", double1 == 2.731671717763701d);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5013507798060323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5013507798060323d + "'", double1 == 0.5013507798060323d);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, 11013.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.375663470794074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.24367967359407d + "'", double1 == 29.24367967359407d);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.013637765347680457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013638610900412402d + "'", double1 == 0.013638610900412402d);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3986455375243887d, 0.9207504798385601d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3619476089433091d + "'", double2 == 1.3619476089433091d);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        double double1 = org.apache.commons.math.util.FastMath.abs((-4.965964575870387E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.965964575870387E-6d + "'", double1 == 4.965964575870387E-6d);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.456588248534274d, (-0.622003184662269d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.456588248534272d + "'", double2 == 9.456588248534272d);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.2793491738997593d, 0.6509498349092765d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2926154290220093d + "'", double2 == 1.2926154290220093d);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        double double1 = org.apache.commons.math.util.FastMath.atan((-87.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.559302580079866d) + "'", double1 == (-1.559302580079866d));
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5195675877329186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5757472671756005d + "'", double1 == 0.5757472671756005d);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.9977506581384374d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 36.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        double double1 = org.apache.commons.math.util.FastMath.tan(12.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6358599286615808d) + "'", double1 == (-0.6358599286615808d));
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.77013924210893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        double double2 = org.apache.commons.math.util.FastMath.max(9.306852821501208d, 0.6108652381980155d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.306852821501208d + "'", double2 == 9.306852821501208d);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9991396955517629d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017438277374752006d) + "'", double1 == (-0.017438277374752006d));
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        double double1 = org.apache.commons.math.util.FastMath.asinh(87.15428956880217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.160860082836928d + "'", double1 == 5.160860082836928d);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(40.50173417021096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.43419174249966d + "'", double1 == 3.43419174249966d);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.585786437626905d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1966463977223425d + "'", double1 == 2.1966463977223425d);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2127992780965635d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8492499565656627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9215475877922218d + "'", double1 == 0.9215475877922218d);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.09966865249116202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001739546146996826d + "'", double1 == 0.001739546146996826d);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.687989146026119d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9897104905678056d + "'", double1 == 1.9897104905678056d);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.105427357601003E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601003E-15d + "'", double1 == 7.105427357601003E-15d);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.4919711769362983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45720394543306603d + "'", double1 == 0.45720394543306603d);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7207960780149949d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.87847734378298d + "'", double1 == 0.87847734378298d);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.2924316695611777d, 91.40768008353616d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.292431669561178d + "'", double2 == 2.292431669561178d);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.023140907904583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7968357744484835d + "'", double1 == 0.7968357744484835d);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5013507798060322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0456371014692798d + "'", double1 == 1.0456371014692798d);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6499429567608755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7075093757430987d + "'", double1 == 0.7075093757430987d);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6967614701467567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2527188875314843d + "'", double1 == 1.2527188875314843d);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        double double2 = org.apache.commons.math.util.FastMath.atan2(6.802168607459072E15d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 149, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 149L + "'", long2 == 149L);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3521708576437375d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.025080161104123633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025080161104123637d + "'", double1 == 0.025080161104123637d);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 115L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 115.0f + "'", float2 == 115.0f);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-36), (long) (-36));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4466128799118947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1647798278876687d + "'", double1 == 1.1647798278876687d);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        double double1 = org.apache.commons.math.util.FastMath.abs(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.87847734378298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3690580439100042d + "'", double1 == 1.3690580439100042d);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.826917543547572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9093500665571933d + "'", double1 == 0.9093500665571933d);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0523779637351338d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.311329466289672d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.196341993668888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7867932463437737d + "'", double1 == 0.7867932463437737d);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6495717774798734d, 1.586168716780134d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3886883786071061d + "'", double2 == 0.3886883786071061d);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        int int2 = org.apache.commons.math.util.FastMath.min(3, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.7029569194264695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.522447112971805d) + "'", double1 == (-7.522447112971805d));
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5898595141626499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (-53.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.16568881822443138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0028918154117547126d + "'", double1 == 0.0028918154117547126d);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9334810208242135d, 0.7853981633974484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8713367950337831d + "'", double2 == 0.8713367950337831d);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.16162584696387075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.540177670628365E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        int int1 = org.apache.commons.math.util.FastMath.round(4.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2992240294445547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9633503241296185d + "'", double1 == 0.9633503241296185d);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.36887502277838163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.4964448729282672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4780297639737955d + "'", double1 == 0.4780297639737955d);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.4639704888177957d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.053268411432207d + "'", double1 == 2.053268411432207d);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.48961296732686727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        double double1 = org.apache.commons.math.util.FastMath.log(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5553480614894135d + "'", double1 == 3.5553480614894135d);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0000000000000016d, 0.36887502277838163d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000016d + "'", double2 == 1.0000000000000016d);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-2L), (float) 1765L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.44736775427009084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.433648086262286d + "'", double1 == 0.433648086262286d);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.03331205968091278d, 6.24446805942027d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005334600700255724d + "'", double2 == 0.005334600700255724d);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9616411655135638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6159862187353882d + "'", double1 == 1.6159862187353882d);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.03922152639746458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0007692626737565d + "'", double1 == 1.0007692626737565d);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        float float1 = org.apache.commons.math.util.FastMath.abs(36.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        double double1 = org.apache.commons.math.util.FastMath.tanh(6.381523557699956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999994270617502d + "'", double1 == 0.999994270617502d);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5586003788994619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5094222011930425d + "'", double1 == 0.5094222011930425d);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5215691996538042d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5215691996538041d) + "'", double1 == (-0.5215691996538041d));
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.6318039343316998d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6427991330798924d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.36792187455389946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36792187455389946d + "'", double1 == 0.36792187455389946d);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        double double1 = org.apache.commons.math.util.FastMath.sin(8.4677176E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7179618940241767d + "'", double1 == 0.7179618940241767d);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3004678721409357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7569959146612819d + "'", double1 == 0.7569959146612819d);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 100, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        double double2 = org.apache.commons.math.util.FastMath.min(3.121587129297938E-5d, 0.6601961944899242d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.121587129297938E-5d + "'", double2 == 3.121587129297938E-5d);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        long long2 = org.apache.commons.math.util.FastMath.min(115L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.4694469519536138E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4694469519536138E-18d + "'", double1 == 3.4694469519536138E-18d);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.34679171459871794d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5992442618287415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.184984413315997d + "'", double1 == 1.184984413315997d);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        float float2 = org.apache.commons.math.util.FastMath.min(8.4677176E7f, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        double double1 = org.apache.commons.math.util.FastMath.log(0.3156563365585749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1531011997348775d) + "'", double1 == (-1.1531011997348775d));
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.1302020149984197d, 0.01645512199317914d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13020201499841969d + "'", double2 == 0.13020201499841969d);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4894276498683636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02599541646044423d + "'", double1 == 0.02599541646044423d);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7020228836336021d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7635374458684412d + "'", double1 == 0.7635374458684412d);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5L, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0589027237910784d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.4195087221622031d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007321808442564549d + "'", double1 == 0.007321808442564549d);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5195675877329187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5719878036302365d + "'", double1 == 0.5719878036302365d);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.022126756261955736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5494213976540494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.002205222282650664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999975684983274d + "'", double1 == 0.9999975684983274d);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.24014385818911937d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.188398211790743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07496198963953868d + "'", double1 == 0.07496198963953868d);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(36.04365338911715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.04365338911716d + "'", double1 == 36.04365338911716d);
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.944243605747584d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4671418818631161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3368222604140545d + "'", double1 == 4.3368222604140545d);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.11750115177867763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11696482699135904d + "'", double1 == 0.11696482699135904d);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.4773820570298323d), 0.7668816193536425d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4773820570298322d) + "'", double2 == (-0.4773820570298322d));
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9502314013655482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3168185144190256d + "'", double1 == 0.3168185144190256d);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0174658279143685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        double double2 = org.apache.commons.math.util.FastMath.max(0.31784189721835715d, 0.8502126400132274d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8502126400132274d + "'", double2 == 0.8502126400132274d);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.11831214619987152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002064936496288655d + "'", double1 == 0.002064936496288655d);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.22459997143478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8410058489917948d + "'", double1 == 0.8410058489917948d);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9998039600078416d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.09254025572625442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09240823112172805d + "'", double1 == 0.09240823112172805d);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4343980560668567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5440333576531722d + "'", double1 == 0.5440333576531722d);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, 1586013452313419L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1586013452313419L + "'", long2 == 1586013452313419L);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.4678297255314154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7510773914034626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9483570980585009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        double double2 = org.apache.commons.math.util.FastMath.max(21.0d, 53.90638748024775d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 53.90638748024775d + "'", double2 == 53.90638748024775d);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0038586340573412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1811641407394071d + "'", double1 == 1.1811641407394071d);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        double double1 = org.apache.commons.math.util.FastMath.rint(8886110.520507872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8886111.0d + "'", double1 == 8886111.0d);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.7541871649905414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3244573096142214d + "'", double1 == 1.3244573096142214d);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.49824130708557135d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.566481311004089d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.4430227241169226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4744784643265698d + "'", double1 == 0.4744784643265698d);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.731671717763701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.718145927957616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02998730347259369d + "'", double1 == 0.02998730347259369d);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5707956501570803d, 0.4149879136381553d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.312507948795038d + "'", double2 == 1.312507948795038d);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8990819272930286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2577849915061305d + "'", double1 == 1.2577849915061305d);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.08322398137173832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08332008606886733d + "'", double1 == 0.08332008606886733d);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1477896, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8950377376269645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.108515810924778d + "'", double1 == 1.108515810924778d);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.006625453383639586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000219483965576d + "'", double1 == 1.0000219483965576d);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9407807517372623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.371481391049875d + "'", double1 == 1.371481391049875d);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.9715843084612968d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.6500241495929224E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.650024149592924E-8d + "'", double1 == 3.650024149592924E-8d);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.7703727489272E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.7703727489272E13d + "'", double1 == 7.7703727489272E13d);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        long long1 = org.apache.commons.math.util.FastMath.round(8886111.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8886111L + "'", long1 == 8886111L);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.506844020238002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1464525897078244d) + "'", double1 == (-1.1464525897078244d));
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        double double2 = org.apache.commons.math.util.FastMath.max(0.41945704196093253d, 4.768371582031431E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.41945704196093253d + "'", double2 == 0.41945704196093253d);
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.5708649036675921d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7245474750742176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        int int2 = org.apache.commons.math.util.FastMath.min(1477896, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.02455177824591122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024255227435244553d + "'", double1 == 0.024255227435244553d);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.014727916325832233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014727916325832233d + "'", double1 == 0.014727916325832233d);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        float float2 = org.apache.commons.math.util.FastMath.max(177.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 177.0f + "'", float2 == 177.0f);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5642069206141151d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9160993815081168d + "'", double1 == 0.9160993815081168d);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.257346628641127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.026941351224813972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.016953909626680193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2568955735901137d + "'", double1 == 0.2568955735901137d);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9971678302955945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9971678302955945d + "'", double1 == 0.9971678302955945d);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.38905609893065d + "'", double1 == 7.38905609893065d);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9654551805545912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9654551805545912d + "'", double1 == 0.9654551805545912d);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52L, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.257346628641127d, 0.6390414790847105d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.100573646508922d + "'", double2 == 1.100573646508922d);
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.17403209863049748d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17315493802169976d) + "'", double1 == (-0.17315493802169976d));
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.44301479880114863d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6420977047412333d + "'", double1 == 0.6420977047412333d);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(32.307469852239215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.683966031939249d + "'", double1 == 5.683966031939249d);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.6440401179566951d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.644040117956695d) + "'", double1 == (-0.644040117956695d));
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5533448061434307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.553344806143431d + "'", double1 == 1.553344806143431d);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.948148009134001E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.890818211544747E11d + "'", double1 == 6.890818211544747E11d);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.7076312586751927d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6500355808888426d) + "'", double1 == (-0.6500355808888426d));
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6159972758633804d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9071450030636169d + "'", double1 == 0.9071450030636169d);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.1443601628891088d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.053272382792838d) + "'", double1 == (-6.053272382792838d));
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.02998730347259369d, 0.9194167487484044d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03978054692345284d + "'", double2 == 0.03978054692345284d);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9746955125367257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017011645898179533d + "'", double1 == 0.017011645898179533d);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.8136000602258506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3385736407008666d + "'", double1 == 1.3385736407008666d);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.045370515966924575d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04535495182419678d) + "'", double1 == (-0.04535495182419678d));
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        int int2 = org.apache.commons.math.util.FastMath.max(57, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.016953909626680193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9713874678549922d + "'", double1 == 0.9713874678549922d);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.175201187282749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8657694805681798d + "'", double1 == 0.8657694805681798d);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        double double1 = org.apache.commons.math.util.FastMath.log(0.32885203454848133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1121473723952222d) + "'", double1 == (-1.1121473723952222d));
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.7703727489273E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        double double2 = org.apache.commons.math.util.FastMath.max(1.7632818845146023d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7632818845146023d + "'", double2 == 1.7632818845146023d);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.3559037465428121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3559037465428121d + "'", double1 == 0.3559037465428121d);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.2600854338811875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.263027589241052d + "'", double1 == 0.263027589241052d);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9746955125367257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011131033407011737d) + "'", double1 == (-0.011131033407011737d));
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.3158729493062495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.03978054692345284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03977006232240948d + "'", double1 == 0.03977006232240948d);
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9980569874847491d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1301927452503902d, 0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.13019274525039d + "'", double2 == 1.13019274525039d);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4710382094761008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9046383900500522d + "'", double1 == 0.9046383900500522d);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        double double1 = org.apache.commons.math.util.FastMath.asinh(22.180709777452588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7928779225980582d + "'", double1 == 3.7928779225980582d);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.45390709349018515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.5574077246549018d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7569959146612817d, (-2.9999999999999996d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3052572303969585d + "'", double2 == 2.3052572303969585d);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.1524804875517143d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        double double1 = org.apache.commons.math.util.FastMath.ceil(7.9277663657849295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9335905118403581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.543625719561452d + "'", double1 == 2.543625719561452d);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8117491596404741d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.37754243147639266d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3775424314763927d + "'", double2 == 0.3775424314763927d);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5436257195614513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996309017591033d + "'", double1 == 0.9996309017591033d);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        long long1 = org.apache.commons.math.util.FastMath.round(4.276473161941219d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.2123899885214408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9775299051536079d + "'", double1 == 0.9775299051536079d);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6562661263264857d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1705572581976593d, 966981.6941481612d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 966981.6941481612d + "'", double2 == 966981.6941481612d);
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.2775176041484217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9171523356672743d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7245474750742176d) + "'", double1 == (-0.7245474750742176d));
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.8554182836643192d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42510533926958194d + "'", double1 == 0.42510533926958194d);
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 1765L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.09254025572625442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09267284848064035d + "'", double1 == 0.09267284848064035d);
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        long long1 = org.apache.commons.math.util.FastMath.round(3.3431851641374776E20d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9075712110370514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9999391764340757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011029431764026465d + "'", double1 == 0.011029431764026465d);
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.989078815390096E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.98907549296735E-4d + "'", double1 == 9.98907549296735E-4d);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.3156563365585749d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0682346001726604d, 1.5021549377007348d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1042355780856774d + "'", double2 == 1.1042355780856774d);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4932054413052554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5157707046119765d + "'", double1 == 0.5157707046119765d);
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.637986554446435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 323.0328345212856d + "'", double1 == 323.0328345212856d);
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7601945740163978d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        double double1 = org.apache.commons.math.util.FastMath.expm1(29.769029948889358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.482530666705728E12d + "'", double1 == 8.482530666705728E12d);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1896369513379932d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 'a', (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8117491596404741d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3479619979991035d + "'", double1 == 1.3479619979991035d);
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.4311581967195641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6566263752847308d + "'", double1 == 0.6566263752847308d);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.206879716514544E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.716577545208366d + "'", double1 == 22.716577545208366d);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.16299078079570548d), 1.4088493392805228d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.8439943304479269d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7009971142458026d) + "'", double1 == (-0.7009971142458026d));
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(34.86729768739367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.904853739712244d + "'", double1 == 5.904853739712244d);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.027446137712611524d, 0.7858907674327538d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05926752913350475d + "'", double2 == 0.05926752913350475d);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.06085912128862039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0627491849049196d + "'", double1 == 0.0627491849049196d);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.6895067407632058d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2998102710638988d + "'", double1 == 1.2998102710638988d);
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.6554718113440092d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.026753137071649866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5328418429405195d + "'", double1 == 1.5328418429405195d);
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.01980133317597954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019800039410893977d + "'", double1 == 0.019800039410893977d);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9852186120042791d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7779525779282561d + "'", double1 == 0.7779525779282561d);
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.014727916325832233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014728448820261811d + "'", double1 == 0.014728448820261811d);
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0340833231523574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7755408534468284d + "'", double1 == 0.7755408534468284d);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.011343644545624419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011343644545624419d + "'", double1 == 0.011343644545624419d);
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 52, 7.93006726156715E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.557321430552873E-14d + "'", double2 == 6.557321430552873E-14d);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', 177.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 177.0f + "'", float2 == 177.0f);
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 1765);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.17403209863049748d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0030374331252576957d) + "'", double1 == (-0.0030374331252576957d));
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5063656411097344d), 5557.999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5557.999999999999d + "'", double2 == 5557.999999999999d);
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        long long1 = org.apache.commons.math.util.FastMath.round((-6.4642859456318895d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-6L) + "'", long1 == (-6L));
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.10238901681014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.1071487177940904d), 11013.232874703413d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.000039054162815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752614582623901d + "'", double1 == 1.1752614582623901d);
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        double double1 = org.apache.commons.math.util.FastMath.log1p(10.373998331524408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.431329902192528d + "'", double1 == 2.431329902192528d);
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.009945246694090637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009945574594990715d + "'", double1 == 0.009945574594990715d);
    }
}


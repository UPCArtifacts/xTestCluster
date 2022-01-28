import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome3 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, 0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (35)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (97)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome6 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.Class<?> wildcardClass7 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str10 = elitisticListPopulation9.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome16 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, (int) (short) 10, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = chromosomeList6.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList6, 10, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        java.lang.Class<?> wildcardClass7 = chromosomeList6.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation3 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList0, (int) (short) 10, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList6, (int) '#', 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome6 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str10 = elitisticListPopulation9.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation2.spliterator();
        int int17 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome18 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(0, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = chromosomeList6.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList6, (int) (byte) 1, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        java.lang.Class<?> wildcardClass5 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.lang.Class<?> wildcardClass4 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.Class<?> wildcardClass7 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        double double9 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome6 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = chromosomeList6.spliterator();
        java.lang.Class<?> wildcardClass8 = chromosomeList6.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (35)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str10 = elitisticListPopulation9.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, (int) (short) -1, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        double double9 = elitisticListPopulation2.getElitismRate();
        java.lang.Class<?> wildcardClass10 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        java.lang.Class<?> wildcardClass11 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.lang.String str9 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome12 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        java.lang.Class<?> wildcardClass11 = chromosomeList10.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (byte) 0);
        java.lang.Class<?> wildcardClass3 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setElitismRate((double) 0);
        java.lang.Class<?> wildcardClass9 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '#', 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome3 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList5, (int) 'a', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeList5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray7 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList8, chromosomeArray7);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList8);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeList9);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        java.lang.Class<?> wildcardClass8 = chromosomeSpliterator7.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str9 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str10 = elitisticListPopulation9.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation2.spliterator();
        java.lang.Class<?> wildcardClass17 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = chromosomeList6.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList6, (int) (byte) 100, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList9, (int) (byte) 0, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeList9);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        double double6 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, (int) (byte) 100, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (32)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome4 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.lang.String str4 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation11.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation16.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation11.setChromosomes(chromosomeList19);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList19, 100, (double) (byte) 1);
        elitisticListPopulation2.setChromosomes(chromosomeList19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList19, (int) (short) 0, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeList19);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 100, (double) 1L);
        java.lang.Class<?> wildcardClass3 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        double double6 = elitisticListPopulation2.getElitismRate();
        java.lang.Class<?> wildcardClass7 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 1, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.Class<?> wildcardClass5 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeItor9);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList5, (int) 'a', (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeList5);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str10 = elitisticListPopulation9.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation2.spliterator();
        int int17 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation2.addChromosome(chromosome18);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate(10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        java.lang.Class<?> wildcardClass5 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList3, (int) (byte) 10, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeList3);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        double double9 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray7 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList8, chromosomeArray7);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList8);
        java.lang.Class<?> wildcardClass11 = chromosomeList8.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList7, (int) (short) 0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeList7);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (52)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((-1), (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setElitismRate((double) (byte) 1);
        java.lang.Class<?> wildcardClass8 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        java.lang.Class<?> wildcardClass8 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, 100, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, (int) (short) 0, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeList10);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = elitisticListPopulation2.spliterator();
        int int6 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        java.lang.Class<?> wildcardClass5 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        java.lang.Class<?> wildcardClass6 = chromosomeList5.getClass();
        org.junit.Assert.assertNotNull(chromosomeList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList9, (int) (byte) 0, (double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeList9);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 0, 0.9d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int15 = elitisticListPopulation14.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        java.lang.String str18 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome19 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((-1), (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, 0, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeList10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double8 = elitisticListPopulation7.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str12 = elitisticListPopulation11.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray13 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, chromosomeArray13);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14);
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, (int) (byte) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str7 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, (int) (byte) -1, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(0, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        org.apache.commons.math3.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(population9);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setElitismRate((double) (byte) 1);
        elitisticListPopulation2.setPopulationLimit(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray0 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList1 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, chromosomeArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList1, (-1), 0.9d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome6 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeList5);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation2.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (52)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (52)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(chromosomeList10);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 1, 0.0d);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(0, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (97)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 0, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.lang.String str6 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        double double8 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate(100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList9);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int15 = elitisticListPopulation14.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList16, (int) 'a', (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double13 = elitisticListPopulation12.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator14 = elitisticListPopulation12.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation12.addChromosome(chromosome15);
        elitisticListPopulation12.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList19, (int) (short) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
        org.junit.Assert.assertNotNull(chromosomeList19);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation3 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList0, 0, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.lang.String str9 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList12, (-1), (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList12);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double double6 = elitisticListPopulation2.getElitismRate();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        java.lang.Class<?> wildcardClass9 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(chromosomeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 100, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        elitisticListPopulation2.setElitismRate(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome12 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation2.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit(0);
        java.lang.Class<?> wildcardClass10 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = null;
        elitisticListPopulation2.setChromosomes(chromosomeList4);
        double double6 = elitisticListPopulation2.getElitismRate();
        double double7 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.addChromosome(chromosome8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 1, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        double double4 = elitisticListPopulation2.getElitismRate();
        java.lang.Class<?> wildcardClass5 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation13.addChromosome(chromosome16);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation13.iterator();
        int int19 = elitisticListPopulation13.getPopulationLimit();
        double double20 = elitisticListPopulation13.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray21 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, chromosomeArray21);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, (int) (short) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 0, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor6);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome11 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str10 = elitisticListPopulation2.toString();
        java.lang.Class<?> wildcardClass11 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation8.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation2.addChromosome(chromosome19);
        int int21 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList22, (int) 'a', (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (97)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(chromosomeList22);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation8.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation2.addChromosome(chromosome19);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator21 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str26 = elitisticListPopulation25.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray27 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, chromosomeArray27);
        elitisticListPopulation25.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        org.apache.commons.math3.genetics.Population population31 = elitisticListPopulation25.nextGeneration();
        int int32 = elitisticListPopulation25.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList33);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation37 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList33, (int) 'a', (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (97)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(population31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(chromosomeList33);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = null;
        elitisticListPopulation2.setChromosomes(chromosomeList4);
        double double6 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        double double9 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray10 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, chromosomeArray10);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int17 = elitisticListPopulation16.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList18);
        java.lang.Class<?> wildcardClass20 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (short) 0);
        double double3 = elitisticListPopulation2.getElitismRate();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        java.lang.Class<?> wildcardClass5 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation14.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation14.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = elitisticListPopulation14.spliterator();
        java.lang.String str19 = elitisticListPopulation14.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome22 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertNotNull(chromosomeList20);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome8 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(chromosomeItor8);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double13 = elitisticListPopulation12.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator14 = elitisticListPopulation12.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation12.addChromosome(chromosome15);
        elitisticListPopulation12.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList19);
        elitisticListPopulation2.setPopulationLimit(10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double26 = elitisticListPopulation25.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator27 = elitisticListPopulation25.spliterator();
        java.lang.String str28 = elitisticListPopulation25.toString();
        org.apache.commons.math3.genetics.Population population29 = elitisticListPopulation25.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str33 = elitisticListPopulation32.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray34 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35, chromosomeArray34);
        elitisticListPopulation32.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35);
        elitisticListPopulation25.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator39 = elitisticListPopulation25.spliterator();
        int int40 = elitisticListPopulation25.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList41 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList41);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation45 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList41, (int) (short) 100, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertNotNull(population29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(chromosomeList41);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.lang.String str4 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(population6);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        org.apache.commons.math3.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation2.addChromosome(chromosome11);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome14 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList13);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation8.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation2.addChromosome(chromosome19);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator21 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str26 = elitisticListPopulation25.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray27 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, chromosomeArray27);
        elitisticListPopulation25.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        org.apache.commons.math3.genetics.Population population31 = elitisticListPopulation25.nextGeneration();
        int int32 = elitisticListPopulation25.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList33);
        java.lang.Class<?> wildcardClass35 = chromosomeList33.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(population31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((-1), (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = chromosomeList6.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList6, (int) '4', (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int8 = elitisticListPopulation7.getPopulationLimit();
        int int9 = elitisticListPopulation7.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation7.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation7.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray12 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, chromosomeArray12);
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        int int17 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int21 = elitisticListPopulation20.getPopulationLimit();
        java.lang.String str22 = elitisticListPopulation20.toString();
        int int23 = elitisticListPopulation20.getPopulationSize();
        double double24 = elitisticListPopulation20.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList25);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation2.getChromosomes();
        java.lang.Class<?> wildcardClass28 = chromosomeList27.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertNotNull(chromosomeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList25);
        org.junit.Assert.assertNotNull(chromosomeList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int8 = elitisticListPopulation7.getPopulationLimit();
        int int9 = elitisticListPopulation7.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation7.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation7.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray12 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, chromosomeArray12);
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        int int17 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int21 = elitisticListPopulation20.getPopulationLimit();
        java.lang.String str22 = elitisticListPopulation20.toString();
        int int23 = elitisticListPopulation20.getPopulationSize();
        double double24 = elitisticListPopulation20.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList25);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList25, (int) '4', (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertNotNull(chromosomeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList25);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int int10 = elitisticListPopulation2.getPopulationLimit();
        double double11 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Population population12 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = population12.spliterator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 100, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = chromosomeList6.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList6, (int) (short) -1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str10 = elitisticListPopulation9.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, (int) (short) 1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        double double8 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation11.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor14 = elitisticListPopulation11.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation17.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation22.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation17.setChromosomes(chromosomeList25);
        elitisticListPopulation11.setChromosomes(chromosomeList25);
        elitisticListPopulation2.setChromosomes(chromosomeList25);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeItor14);
        org.junit.Assert.assertNotNull(chromosomeList25);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        int int5 = elitisticListPopulation2.getPopulationLimit();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.lang.Class<?> wildcardClass7 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation2.addChromosome(chromosome10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Population population12 = elitisticListPopulation2.nextGeneration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        double double9 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray10 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, chromosomeArray10);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator14 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Population population15 = elitisticListPopulation2.nextGeneration();
        java.lang.Class<?> wildcardClass16 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
        org.junit.Assert.assertNotNull(population15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(0, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '#', 0.0d);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(population3);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.lang.Class<?> wildcardClass5 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = null;
        elitisticListPopulation2.setChromosomes(chromosomeList4);
        double double6 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation3 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList0, 100, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        java.lang.Class<?> wildcardClass9 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        org.apache.commons.math3.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation2.addChromosome(chromosome11);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList13, (int) (short) 10, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList13);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList5, 0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeList5);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.lang.String str9 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertNotNull(population4);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation2.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 100, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (32)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int8 = elitisticListPopulation7.getPopulationLimit();
        int int9 = elitisticListPopulation7.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation7.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation7.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray12 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, chromosomeArray12);
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        int int17 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation2.addChromosome(chromosome19);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor22 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertNotNull(chromosomeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertNotNull(chromosomeItor22);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.lang.Class<?> wildcardClass10 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double13 = elitisticListPopulation12.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator14 = elitisticListPopulation12.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation12.addChromosome(chromosome15);
        elitisticListPopulation12.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList19);
        elitisticListPopulation2.setPopulationLimit(10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome23 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
        org.junit.Assert.assertNotNull(chromosomeList19);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (32)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor10);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        elitisticListPopulation2.setElitismRate(1.0d);
        int int12 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList5, 0, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeList5);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        org.junit.Assert.assertNotNull(chromosomeItor3);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        double double9 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome13 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList12);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        double double4 = elitisticListPopulation2.getElitismRate();
        int int5 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        int int8 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double double6 = elitisticListPopulation2.getElitismRate();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome8 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) -1, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int8 = elitisticListPopulation7.getPopulationLimit();
        int int9 = elitisticListPopulation7.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation7.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation7.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray12 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, chromosomeArray12);
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome17 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertNotNull(chromosomeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        int int10 = elitisticListPopulation2.getPopulationLimit();
        java.lang.Class<?> wildcardClass11 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.lang.Class<?> wildcardClass9 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        int int9 = elitisticListPopulation2.getPopulationLimit();
        int int10 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation2.addChromosome(chromosome11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Population population13 = elitisticListPopulation2.nextGeneration();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        double double6 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation8.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation2.addChromosome(chromosome19);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator21 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Population population22 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertNotNull(population22);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 1);
        org.apache.commons.math3.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation2.addChromosome(chromosome11);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeList8);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) -1, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = population5.spliterator();
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double double6 = elitisticListPopulation2.getElitismRate();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        java.lang.Class<?> wildcardClass9 = chromosomeList8.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(chromosomeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.lang.String str4 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        double double6 = elitisticListPopulation2.getElitismRate();
        java.lang.String str7 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome8 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.lang.String str6 = elitisticListPopulation2.toString();
        int int7 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        int int10 = elitisticListPopulation2.getPopulationSize();
        java.lang.Class<?> wildcardClass11 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        int int10 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit(1);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (32)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        double double5 = elitisticListPopulation2.getElitismRate();
        java.lang.String str6 = elitisticListPopulation2.toString();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) -1, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.lang.String str6 = elitisticListPopulation2.toString();
        int int7 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate(10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(population8);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        int int5 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit((int) (short) 10);
        double double10 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.lang.String str9 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int13 = elitisticListPopulation12.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation12.getChromosomes();
        int int15 = elitisticListPopulation12.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList16, (int) (short) 1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        double double10 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome11 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = null;
        elitisticListPopulation2.setChromosomes(chromosomeList4);
        double double6 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int10 = elitisticListPopulation9.getPopulationLimit();
        int int11 = elitisticListPopulation9.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation9.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation9.setPopulationLimit((int) (byte) -1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation18.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation23.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation18.setChromosomes(chromosomeList26);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList26, 100, (double) (byte) 1);
        elitisticListPopulation9.setChromosomes(chromosomeList26);
        elitisticListPopulation2.setChromosomes(chromosomeList26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation35 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList26, (int) (byte) 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (35)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertNotNull(chromosomeList26);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        elitisticListPopulation2.setElitismRate((double) 1L);
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        java.lang.String str12 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        java.lang.Class<?> wildcardClass15 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[null]" + "'", str12, "[null]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation3 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList0, (int) (short) 0, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double double6 = elitisticListPopulation2.getElitismRate();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList8, (int) (byte) 10, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (97)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(chromosomeList8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(0, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (35)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double13 = elitisticListPopulation12.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator14 = elitisticListPopulation12.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation12.addChromosome(chromosome15);
        elitisticListPopulation12.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList19);
        elitisticListPopulation2.setPopulationLimit(10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double26 = elitisticListPopulation25.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator27 = elitisticListPopulation25.spliterator();
        java.lang.String str28 = elitisticListPopulation25.toString();
        org.apache.commons.math3.genetics.Population population29 = elitisticListPopulation25.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str33 = elitisticListPopulation32.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray34 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35, chromosomeArray34);
        elitisticListPopulation32.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35);
        elitisticListPopulation25.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator39 = elitisticListPopulation25.spliterator();
        int int40 = elitisticListPopulation25.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList41 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList41);
        java.lang.Class<?> wildcardClass43 = chromosomeList41.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertNotNull(population29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(chromosomeList41);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        int int9 = elitisticListPopulation2.getPopulationLimit();
        int int10 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation2.addChromosome(chromosome11);
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int15 = elitisticListPopulation14.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList16, (-1), 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation3 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList0, (int) '#', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) -1, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        double double6 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        int int9 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str10 = elitisticListPopulation9.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation2.addChromosome(chromosome16);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (52)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 10);
        elitisticListPopulation2.setPopulationLimit((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.lang.String str4 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.lang.String str9 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation2.iterator();
        java.lang.String str11 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        double double6 = elitisticListPopulation2.getElitismRate();
        java.lang.String str7 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome8 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        double double4 = elitisticListPopulation2.getElitismRate();
        int int5 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 1);
        int int10 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double8 = elitisticListPopulation7.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str12 = elitisticListPopulation11.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray13 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, chromosomeArray13);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14);
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList14, (int) (short) 100, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (52)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setElitismRate((double) (byte) 1);
        int int8 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit(0);
        java.lang.String str10 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double14 = elitisticListPopulation13.getElitismRate();
        java.lang.String str15 = elitisticListPopulation13.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int19 = elitisticListPopulation18.getPopulationLimit();
        int int20 = elitisticListPopulation18.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor21 = elitisticListPopulation18.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation18.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        elitisticListPopulation18.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        int int28 = elitisticListPopulation13.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int32 = elitisticListPopulation31.getPopulationLimit();
        java.lang.String str33 = elitisticListPopulation31.toString();
        int int34 = elitisticListPopulation31.getPopulationSize();
        double double35 = elitisticListPopulation31.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation13.setChromosomes(chromosomeList36);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList38);
        java.lang.Class<?> wildcardClass40 = chromosomeList38.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[null]" + "'", str10, "[null]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor21);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertNotNull(chromosomeList38);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        int int9 = elitisticListPopulation2.getPopulationLimit();
        int int10 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome11 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        elitisticListPopulation2.setPopulationLimit(100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome12 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.lang.String str6 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (35)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int9 = elitisticListPopulation8.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation8.getChromosomes();
        int int11 = elitisticListPopulation8.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList12, (int) (byte) 1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeList5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chromosomeList12);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator3 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeSpliterator3);
        org.junit.Assert.assertNotNull(population4);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        elitisticListPopulation2.setElitismRate(1.0d);
        java.lang.Class<?> wildcardClass12 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        int int10 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit(1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome13 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        double double9 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome14 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(chromosomeList8);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        double double5 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome6 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(0, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList8, (int) 'a', (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome12 = elitisticListPopulation11.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertNotNull(chromosomeList8);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        double double9 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray10 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, chromosomeArray10);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int17 = elitisticListPopulation16.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int23 = elitisticListPopulation22.getPopulationLimit();
        int int24 = elitisticListPopulation22.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor25 = elitisticListPopulation22.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation22.getChromosomes();
        int int27 = elitisticListPopulation22.getPopulationLimit();
        double double28 = elitisticListPopulation22.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList29);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList29, (int) '#', (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (97)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor25);
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList29);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = null;
        elitisticListPopulation2.setChromosomes(chromosomeList4);
        double double6 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int10 = elitisticListPopulation9.getPopulationLimit();
        int int11 = elitisticListPopulation9.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation9.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation9.getChromosomes();
        elitisticListPopulation9.setPopulationLimit((int) (byte) -1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation18.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation23.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation18.setChromosomes(chromosomeList26);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList26, 100, (double) (byte) 1);
        elitisticListPopulation9.setChromosomes(chromosomeList26);
        elitisticListPopulation2.setChromosomes(chromosomeList26);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator33 = chromosomeList26.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList26, (int) (byte) -1, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertNotNull(chromosomeSpliterator33);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, 0, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeList10);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        elitisticListPopulation2.setElitismRate((double) 1L);
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        java.lang.String str12 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double18 = elitisticListPopulation17.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator19 = elitisticListPopulation17.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation17.addChromosome(chromosome20);
        elitisticListPopulation17.setElitismRate((double) 1L);
        java.lang.String str24 = elitisticListPopulation17.toString();
        elitisticListPopulation17.setElitismRate((double) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation17.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList27);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome29 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[null]" + "'", str12, "[null]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[null]" + "'", str24, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList27);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (52)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation2.iterator();
        java.lang.String str10 = elitisticListPopulation2.toString();
        java.lang.String str11 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[null]" + "'", str10, "[null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[null]" + "'", str11, "[null]");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation10.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor13 = elitisticListPopulation10.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation16.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation21.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = elitisticListPopulation21.getChromosomes();
        elitisticListPopulation16.setChromosomes(chromosomeList24);
        elitisticListPopulation10.setChromosomes(chromosomeList24);
        elitisticListPopulation2.setChromosomes(chromosomeList24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList24, (int) (byte) 100, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor13);
        org.junit.Assert.assertNotNull(chromosomeList24);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        double double9 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList12, 0, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList12);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (35)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 100, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        double double6 = elitisticListPopulation2.getElitismRate();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor8);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        int int9 = elitisticListPopulation2.getPopulationSize();
        double double10 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        java.lang.String str10 = elitisticListPopulation2.toString();
        int int11 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome12 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[null]" + "'", str10, "[null]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.lang.Class<?> wildcardClass8 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = population8.spliterator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        double double9 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        double double5 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int10 = elitisticListPopulation9.getPopulationLimit();
        java.lang.String str11 = elitisticListPopulation9.toString();
        int int12 = elitisticListPopulation9.getPopulationSize();
        int int13 = elitisticListPopulation9.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator14 = elitisticListPopulation9.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation9.addChromosome(chromosome15);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double20 = elitisticListPopulation19.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator21 = elitisticListPopulation19.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation19.addChromosome(chromosome22);
        elitisticListPopulation19.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation9.setChromosomes(chromosomeList26);
        elitisticListPopulation2.setChromosomes(chromosomeList26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome29 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertNotNull(chromosomeList26);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList6, 0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        double double6 = elitisticListPopulation2.getElitismRate();
        java.lang.Class<?> wildcardClass7 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        double double7 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(population8);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertNotNull(chromosomeItor10);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.lang.String str6 = elitisticListPopulation2.toString();
        int int7 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str7 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation15.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation15.addChromosome(chromosome18);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation15.iterator();
        int int21 = elitisticListPopulation15.getPopulationLimit();
        double double22 = elitisticListPopulation15.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        elitisticListPopulation15.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome28 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '#', (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome3 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        double double9 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation14.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation14.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = elitisticListPopulation14.spliterator();
        java.lang.String str19 = elitisticListPopulation14.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList20);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor22 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double26 = elitisticListPopulation25.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str30 = elitisticListPopulation29.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray31 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList32 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32, chromosomeArray31);
        elitisticListPopulation29.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32);
        elitisticListPopulation25.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertNotNull(chromosomeList20);
        org.junit.Assert.assertNotNull(chromosomeItor22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        double double6 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList7, (int) (byte) 10, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (52)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList7);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.lang.String str9 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome14 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        java.lang.Class<?> wildcardClass6 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '#', (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        double double9 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = chromosomeList12.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList12, (int) '4', (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome17 = elitisticListPopulation16.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str10 = elitisticListPopulation9.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation2.spliterator();
        int int17 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(chromosomeList18);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = null;
        elitisticListPopulation2.setChromosomes(chromosomeList4);
        double double6 = elitisticListPopulation2.getElitismRate();
        double double7 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate(10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.lang.String str9 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation2.addChromosome(chromosome14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int10 = elitisticListPopulation9.getPopulationLimit();
        int int11 = elitisticListPopulation9.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int15 = elitisticListPopulation14.getPopulationLimit();
        int int16 = elitisticListPopulation14.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation14.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation14.getChromosomes();
        int int19 = elitisticListPopulation14.getPopulationLimit();
        double double20 = elitisticListPopulation14.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation9.setChromosomes(chromosomeList21);
        elitisticListPopulation2.setChromosomes(chromosomeList21);
        java.lang.Class<?> wildcardClass24 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        elitisticListPopulation2.setElitismRate((double) 1L);
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation2.iterator();
        java.lang.Class<?> wildcardClass13 = chromosomeItor12.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str7 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation15.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation15.addChromosome(chromosome18);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation15.iterator();
        int int21 = elitisticListPopulation15.getPopulationLimit();
        double double22 = elitisticListPopulation15.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        elitisticListPopulation15.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, (int) (byte) -1, (double) 2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setElitismRate((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome8 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        int int6 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation14.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation14.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = elitisticListPopulation14.spliterator();
        java.lang.String str19 = elitisticListPopulation14.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList20);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor22 = elitisticListPopulation2.iterator();
        java.lang.Class<?> wildcardClass23 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertNotNull(chromosomeList20);
        org.junit.Assert.assertNotNull(chromosomeItor22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome11 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor10);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = elitisticListPopulation2.spliterator();
        int int6 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        java.lang.Class<?> wildcardClass10 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double double6 = elitisticListPopulation2.getElitismRate();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str8 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome11 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        double double9 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray10 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, chromosomeArray10);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11);
        elitisticListPopulation2.setPopulationLimit(1);
        double double16 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Population population17 = elitisticListPopulation2.nextGeneration();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(population17);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation2.addChromosome(chromosome9);
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome4 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeList3);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        int int9 = elitisticListPopulation2.getPopulationLimit();
        int int10 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        int int5 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        double double9 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = chromosomeList12.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList12, (int) '4', (double) (short) 0);
        java.lang.Class<?> wildcardClass17 = chromosomeList12.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = population4.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome12 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor9);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int15 = elitisticListPopulation14.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Population population19 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator20 = population19.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertNotNull(chromosomeSpliterator20);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList8, 1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (32)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(chromosomeList8);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str10 = elitisticListPopulation9.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation2.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome17 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation2.spliterator();
        java.lang.String str9 = elitisticListPopulation2.toString();
        java.lang.String str10 = elitisticListPopulation2.toString();
        java.lang.String str11 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population12 = elitisticListPopulation2.nextGeneration();
        int int13 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (97)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str7 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation13.addChromosome(chromosome16);
        java.lang.String str18 = elitisticListPopulation13.toString();
        elitisticListPopulation13.setPopulationLimit(0);
        java.lang.String str21 = elitisticListPopulation13.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double25 = elitisticListPopulation24.getElitismRate();
        java.lang.String str26 = elitisticListPopulation24.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int30 = elitisticListPopulation29.getPopulationLimit();
        int int31 = elitisticListPopulation29.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor32 = elitisticListPopulation29.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation29.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray34 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35, chromosomeArray34);
        elitisticListPopulation29.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35);
        elitisticListPopulation24.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35);
        int int39 = elitisticListPopulation24.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation42 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int43 = elitisticListPopulation42.getPopulationLimit();
        java.lang.String str44 = elitisticListPopulation42.toString();
        int int45 = elitisticListPopulation42.getPopulationSize();
        double double46 = elitisticListPopulation42.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList47 = elitisticListPopulation42.getChromosomes();
        elitisticListPopulation24.setChromosomes(chromosomeList47);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList49 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation13.setChromosomes(chromosomeList49);
        elitisticListPopulation2.setChromosomes(chromosomeList49);
        int int52 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList53 = elitisticListPopulation2.getChromosomes();
        java.lang.Class<?> wildcardClass54 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[null]" + "'", str18, "[null]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[null]" + "'", str21, "[null]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor32);
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertNotNull(chromosomeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList47);
        org.junit.Assert.assertNotNull(chromosomeList49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(chromosomeList53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        elitisticListPopulation2.setElitismRate((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome11 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double double6 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeItor9);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.lang.String str4 = elitisticListPopulation2.toString();
        java.lang.Class<?> wildcardClass5 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation13.addChromosome(chromosome16);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation13.iterator();
        int int19 = elitisticListPopulation13.getPopulationLimit();
        double double20 = elitisticListPopulation13.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray21 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, chromosomeArray21);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator27 = elitisticListPopulation2.spliterator();
        java.lang.Class<?> wildcardClass28 = chromosomeSpliterator27.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertNotNull(chromosomeSpliterator27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (32)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        int int5 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        java.lang.Class<?> wildcardClass8 = chromosomeSpliterator7.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(0, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        double double6 = elitisticListPopulation2.getElitismRate();
        int int7 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str10 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str10 = elitisticListPopulation9.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation2.spliterator();
        int int17 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList18, 10, (double) 0.0f);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor22 = elitisticListPopulation21.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertNotNull(chromosomeItor22);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        int int5 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit(0);
        java.lang.String str8 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation2.addChromosome(chromosome9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation8.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor19 = elitisticListPopulation2.iterator();
        double double20 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList21, (int) ' ', (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeItor19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList21);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int8 = elitisticListPopulation7.getPopulationLimit();
        int int9 = elitisticListPopulation7.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation7.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation7.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray12 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, chromosomeArray12);
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        int int17 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation2.iterator();
        java.lang.String str19 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertNotNull(chromosomeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor20);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.lang.String str9 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        java.lang.String str13 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double17 = elitisticListPopulation16.getElitismRate();
        java.lang.String str18 = elitisticListPopulation16.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int22 = elitisticListPopulation21.getPopulationLimit();
        int int23 = elitisticListPopulation21.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor24 = elitisticListPopulation21.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation21.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray26 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList27, chromosomeArray26);
        elitisticListPopulation21.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList27);
        elitisticListPopulation16.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList27);
        int int31 = elitisticListPopulation16.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int35 = elitisticListPopulation34.getPopulationLimit();
        java.lang.String str36 = elitisticListPopulation34.toString();
        int int37 = elitisticListPopulation34.getPopulationSize();
        double double38 = elitisticListPopulation34.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation16.setChromosomes(chromosomeList39);
        elitisticListPopulation2.setChromosomes(chromosomeList39);
        java.lang.String str42 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[null]" + "'", str13, "[null]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor24);
        org.junit.Assert.assertNotNull(chromosomeList25);
        org.junit.Assert.assertNotNull(chromosomeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        org.apache.commons.math3.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation2.addChromosome(chromosome11);
        java.lang.Class<?> wildcardClass13 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation8.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation2.addChromosome(chromosome19);
        int int21 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor22 = elitisticListPopulation2.iterator();
        java.lang.Class<?> wildcardClass23 = chromosomeItor22.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        double double9 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray10 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, chromosomeArray10);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int17 = elitisticListPopulation16.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList18);
        elitisticListPopulation2.setPopulationLimit(1);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(chromosomeList18);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int8 = elitisticListPopulation7.getPopulationLimit();
        int int9 = elitisticListPopulation7.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation7.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation7.getChromosomes();
        int int12 = elitisticListPopulation7.getPopulationLimit();
        double double13 = elitisticListPopulation7.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList14, (int) (byte) -1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList14);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation8.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor19 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeItor19);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        elitisticListPopulation2.setElitismRate((double) 1L);
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        java.lang.String str12 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome13 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[null]" + "'", str12, "[null]");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation8.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor19 = elitisticListPopulation2.iterator();
        double double20 = elitisticListPopulation2.getElitismRate();
        int int21 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor22 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeItor19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor22);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 0, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator3 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = null;
        elitisticListPopulation2.setChromosomes(chromosomeList4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeSpliterator3);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation8.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation2.addChromosome(chromosome19);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator21 = elitisticListPopulation2.spliterator();
        int int22 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (52)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double7 = elitisticListPopulation6.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation6.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation6.addChromosome(chromosome9);
        elitisticListPopulation6.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation6.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList13);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList13, (int) (byte) 100, 0.0d);
        int int18 = elitisticListPopulation17.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population19 = elitisticListPopulation17.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(population19);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = population4.spliterator();
        java.lang.Class<?> wildcardClass6 = chromosomeSpliterator5.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double9 = elitisticListPopulation8.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator10 = elitisticListPopulation8.spliterator();
        java.lang.String str11 = elitisticListPopulation8.toString();
        org.apache.commons.math3.genetics.Population population12 = elitisticListPopulation8.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str16 = elitisticListPopulation15.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray17 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18, chromosomeArray17);
        elitisticListPopulation15.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        elitisticListPopulation8.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18, 0, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = elitisticListPopulation2.spliterator();
        int int6 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(1, (double) 1.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation5.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation5.iterator();
        java.lang.String str11 = elitisticListPopulation5.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation5.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor13 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList14, 1, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[null]" + "'", str11, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertNotNull(chromosomeItor13);
        org.junit.Assert.assertNotNull(chromosomeList14);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.lang.String str9 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int13 = elitisticListPopulation12.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation12.getChromosomes();
        int int15 = elitisticListPopulation12.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        java.lang.Class<?> wildcardClass18 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int11 = elitisticListPopulation10.getPopulationLimit();
        int int12 = elitisticListPopulation10.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor13 = elitisticListPopulation10.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation10.getChromosomes();
        int int15 = elitisticListPopulation10.getPopulationLimit();
        double double16 = elitisticListPopulation10.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation19.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor22 = elitisticListPopulation19.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation25.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation30.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation30.getChromosomes();
        elitisticListPopulation25.setChromosomes(chromosomeList33);
        elitisticListPopulation19.setChromosomes(chromosomeList33);
        elitisticListPopulation10.setChromosomes(chromosomeList33);
        elitisticListPopulation2.setChromosomes(chromosomeList33);
        java.lang.String str38 = elitisticListPopulation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor13);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeItor22);
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        int int5 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome6 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = elitisticListPopulation2.spliterator();
        int int6 = elitisticListPopulation2.getPopulationLimit();
        double double7 = elitisticListPopulation2.getElitismRate();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double double6 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(population7);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome4 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor3);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        double double8 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        elitisticListPopulation2.setElitismRate((double) 1L);
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        java.lang.String str12 = elitisticListPopulation2.toString();
        int int13 = elitisticListPopulation2.getPopulationSize();
        java.lang.Class<?> wildcardClass14 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[null]" + "'", str12, "[null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        org.apache.commons.math3.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation2.addChromosome(chromosome11);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        int int6 = elitisticListPopulation2.getPopulationLimit();
        java.lang.Class<?> wildcardClass7 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.lang.String str9 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList12, (int) ' ', (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList12);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str10 = elitisticListPopulation9.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation2.spliterator();
        int int17 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList18, 10, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(chromosomeList18);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        double double5 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int9 = elitisticListPopulation8.getPopulationLimit();
        java.lang.String str10 = elitisticListPopulation8.toString();
        int int11 = elitisticListPopulation8.getPopulationSize();
        int int12 = elitisticListPopulation8.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList13, 1, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chromosomeList13);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList3, (int) 'a', (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeList3);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setElitismRate((double) 1.0f);
        int int9 = elitisticListPopulation2.getPopulationSize();
        java.lang.Class<?> wildcardClass10 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList11, (-1), (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList11);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 1, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        int int5 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, (int) (byte) 100, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation8.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation2.addChromosome(chromosome19);
        int int21 = elitisticListPopulation2.getPopulationLimit();
        int int22 = elitisticListPopulation2.getPopulationSize();
        int int23 = elitisticListPopulation2.getPopulationLimit();
        int int24 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome25 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str10 = elitisticListPopulation9.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation2.spliterator();
        int int17 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation2.addChromosome(chromosome18);
        double double20 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (35)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int13 = elitisticListPopulation12.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation12.getChromosomes();
        int int15 = elitisticListPopulation12.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (52)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertNotNull(chromosomeList8);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) -1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(1, (double) 1.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation5.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation5.iterator();
        java.lang.String str11 = elitisticListPopulation5.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation5.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor13 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList14, (int) ' ', (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[null]" + "'", str11, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertNotNull(chromosomeItor13);
        org.junit.Assert.assertNotNull(chromosomeList14);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int7 = elitisticListPopulation6.getPopulationLimit();
        java.lang.String str8 = elitisticListPopulation6.toString();
        int int9 = elitisticListPopulation6.getPopulationSize();
        double double10 = elitisticListPopulation6.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation6.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList11, 0, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList11);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        double double6 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int8 = elitisticListPopulation7.getPopulationLimit();
        int int9 = elitisticListPopulation7.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation7.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation7.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray12 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, chromosomeArray12);
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList17, (int) (byte) 100, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (35)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertNotNull(chromosomeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chromosomeList17);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation3 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList0, (int) (short) 1, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 10);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeItor8);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        int int5 = elitisticListPopulation2.getPopulationLimit();
        int int6 = elitisticListPopulation2.getPopulationSize();
        double double7 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList4, (int) (short) 0, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertNotNull(chromosomeList4);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int8 = elitisticListPopulation7.getPopulationLimit();
        int int9 = elitisticListPopulation7.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation7.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation7.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray12 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, chromosomeArray12);
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Population population18 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertNotNull(chromosomeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(population18);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.lang.String str9 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        elitisticListPopulation2.setPopulationLimit((int) (byte) 1);
        org.apache.commons.math3.genetics.Population population14 = elitisticListPopulation2.nextGeneration();
        java.lang.Class<?> wildcardClass15 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation2.addChromosome(chromosome9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation13.addChromosome(chromosome16);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation13.iterator();
        double double19 = elitisticListPopulation13.getElitismRate();
        java.lang.String str20 = elitisticListPopulation13.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList21);
        double double23 = elitisticListPopulation2.getElitismRate();
        java.lang.Class<?> wildcardClass24 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[null]" + "'", str20, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeList5);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        double double8 = elitisticListPopulation2.getElitismRate();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int8 = elitisticListPopulation7.getPopulationLimit();
        int int9 = elitisticListPopulation7.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation7.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation7.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray12 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, chromosomeArray12);
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome18 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertNotNull(chromosomeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chromosomeItor17);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int15 = elitisticListPopulation14.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 1);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator21 = elitisticListPopulation2.spliterator();
        java.lang.Class<?> wildcardClass22 = chromosomeSpliterator21.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(1, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (short) 0);
        double double3 = elitisticListPopulation2.getElitismRate();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit(1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertNotNull(chromosomeList7);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str7 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation15.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation15.addChromosome(chromosome18);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation15.iterator();
        int int21 = elitisticListPopulation15.getPopulationLimit();
        double double22 = elitisticListPopulation15.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        elitisticListPopulation15.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        java.lang.Class<?> wildcardClass28 = chromosomeList24.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        double double4 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int8 = elitisticListPopulation7.getPopulationLimit();
        int int9 = elitisticListPopulation7.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation7.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation7.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray12 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, chromosomeArray12);
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        int int17 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation2.addChromosome(chromosome19);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertNotNull(chromosomeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertNotNull(chromosomeList21);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        int int9 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str10 = elitisticListPopulation9.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation2.spliterator();
        int int17 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation2.addChromosome(chromosome18);
        java.lang.String str20 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome21 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[null]" + "'", str20, "[null]");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        double double10 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator11 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = chromosomeList14.spliterator();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator11);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation2.addChromosome(chromosome9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation13.addChromosome(chromosome16);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation13.iterator();
        double double19 = elitisticListPopulation13.getElitismRate();
        java.lang.String str20 = elitisticListPopulation13.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList21);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList23 = elitisticListPopulation2.getChromosomes();
        java.lang.Class<?> wildcardClass24 = chromosomeList23.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[null]" + "'", str20, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertNotNull(chromosomeList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        double double4 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(2, 1.0d);
        java.lang.Class<?> wildcardClass3 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(1, (double) 1.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation5.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation5.iterator();
        java.lang.String str11 = elitisticListPopulation5.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation5.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor13 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome16 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[null]" + "'", str11, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertNotNull(chromosomeItor13);
        org.junit.Assert.assertNotNull(chromosomeList14);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit((int) '#');
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (short) 0);
        double double3 = elitisticListPopulation2.getElitismRate();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (2)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertNotNull(chromosomeList7);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, 100, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, (int) (byte) -1, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeList10);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        double double6 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertNotNull(population8);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        double double8 = elitisticListPopulation2.getElitismRate();
        java.lang.String str9 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, (int) (byte) 100, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList10);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList8, (int) 'a', 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation11.setElitismRate((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(chromosomeList8);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 0, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.lang.String str9 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Population population12 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setElitismRate(0.0d);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor15 = elitisticListPopulation2.iterator();
        int int16 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNotNull(chromosomeItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation13.addChromosome(chromosome16);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation13.iterator();
        int int19 = elitisticListPopulation13.getPopulationLimit();
        double double20 = elitisticListPopulation13.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray21 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, chromosomeArray21);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double29 = elitisticListPopulation28.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator30 = elitisticListPopulation28.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome31 = null;
        elitisticListPopulation28.addChromosome(chromosome31);
        elitisticListPopulation28.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList35);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator30);
        org.junit.Assert.assertNotNull(chromosomeList35);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((-1), 0.9d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        int int10 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int14 = elitisticListPopulation13.getPopulationSize();
        org.apache.commons.math3.genetics.Population population15 = elitisticListPopulation13.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation13.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList17, (int) (short) 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (35)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(population15);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertNotNull(chromosomeList17);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double double6 = elitisticListPopulation2.getElitismRate();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = null;
        elitisticListPopulation2.setChromosomes(chromosomeList8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Population population10 = elitisticListPopulation2.nextGeneration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate(10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation3 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList0, 100, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation2.addChromosome(chromosome10);
        double double12 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation15.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation15.addChromosome(chromosome18);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation15.iterator();
        int int21 = elitisticListPopulation15.getPopulationLimit();
        double double22 = elitisticListPopulation15.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        elitisticListPopulation15.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation15.setPopulationLimit(1);
        double double29 = elitisticListPopulation15.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double33 = elitisticListPopulation32.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator34 = elitisticListPopulation32.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome35 = null;
        elitisticListPopulation32.addChromosome(chromosome35);
        elitisticListPopulation32.setElitismRate((double) 1L);
        java.lang.String str39 = elitisticListPopulation32.toString();
        elitisticListPopulation32.setElitismRate((double) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList42 = elitisticListPopulation32.getChromosomes();
        java.lang.String str43 = elitisticListPopulation32.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation46 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double47 = elitisticListPopulation46.getElitismRate();
        java.lang.String str48 = elitisticListPopulation46.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation51 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int52 = elitisticListPopulation51.getPopulationLimit();
        int int53 = elitisticListPopulation51.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor54 = elitisticListPopulation51.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList55 = elitisticListPopulation51.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray56 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList57 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57, chromosomeArray56);
        elitisticListPopulation51.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57);
        elitisticListPopulation46.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57);
        int int61 = elitisticListPopulation46.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation64 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int65 = elitisticListPopulation64.getPopulationLimit();
        java.lang.String str66 = elitisticListPopulation64.toString();
        int int67 = elitisticListPopulation64.getPopulationSize();
        double double68 = elitisticListPopulation64.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList69 = elitisticListPopulation64.getChromosomes();
        elitisticListPopulation46.setChromosomes(chromosomeList69);
        elitisticListPopulation32.setChromosomes(chromosomeList69);
        elitisticListPopulation15.setChromosomes(chromosomeList69);
        elitisticListPopulation2.setChromosomes(chromosomeList69);
        java.lang.Class<?> wildcardClass74 = chromosomeList69.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[null]" + "'", str39, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[null]" + "'", str43, "[null]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor54);
        org.junit.Assert.assertNotNull(chromosomeList55);
        org.junit.Assert.assertNotNull(chromosomeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "[]" + "'", str66, "[]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 1.0d + "'", double68 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList69);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation13.addChromosome(chromosome16);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation13.iterator();
        int int19 = elitisticListPopulation13.getPopulationLimit();
        double double20 = elitisticListPopulation13.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray21 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, chromosomeArray21);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator27 = chromosomeList26.spliterator();
        java.lang.Class<?> wildcardClass28 = chromosomeSpliterator27.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertNotNull(chromosomeSpliterator27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '#', (double) (short) 0);
        org.apache.commons.math3.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(population3);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.lang.String str9 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Population population12 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = population12.spliterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome3 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int10 = elitisticListPopulation9.getPopulationLimit();
        int int11 = elitisticListPopulation9.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int15 = elitisticListPopulation14.getPopulationLimit();
        int int16 = elitisticListPopulation14.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation14.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation14.getChromosomes();
        int int19 = elitisticListPopulation14.getPopulationLimit();
        double double20 = elitisticListPopulation14.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation9.setChromosomes(chromosomeList21);
        elitisticListPopulation2.setChromosomes(chromosomeList21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList21, (int) (short) 1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList21);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        int int6 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int11 = elitisticListPopulation10.getPopulationLimit();
        int int12 = elitisticListPopulation10.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor13 = elitisticListPopulation10.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation10.getChromosomes();
        int int15 = elitisticListPopulation10.getPopulationLimit();
        double double16 = elitisticListPopulation10.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation19.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor22 = elitisticListPopulation19.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation25.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation30.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation30.getChromosomes();
        elitisticListPopulation25.setChromosomes(chromosomeList33);
        elitisticListPopulation19.setChromosomes(chromosomeList33);
        elitisticListPopulation10.setChromosomes(chromosomeList33);
        elitisticListPopulation2.setChromosomes(chromosomeList33);
        double double38 = elitisticListPopulation2.getElitismRate();
        java.lang.Class<?> wildcardClass39 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor13);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeItor22);
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit(0);
        java.lang.String str10 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double14 = elitisticListPopulation13.getElitismRate();
        java.lang.String str15 = elitisticListPopulation13.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int19 = elitisticListPopulation18.getPopulationLimit();
        int int20 = elitisticListPopulation18.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor21 = elitisticListPopulation18.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation18.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        elitisticListPopulation18.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        int int28 = elitisticListPopulation13.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int32 = elitisticListPopulation31.getPopulationLimit();
        java.lang.String str33 = elitisticListPopulation31.toString();
        int int34 = elitisticListPopulation31.getPopulationSize();
        double double35 = elitisticListPopulation31.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation13.setChromosomes(chromosomeList36);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList38);
        int int40 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str41 = elitisticListPopulation2.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[null]" + "'", str10, "[null]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor21);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertNotNull(chromosomeList38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int15 = elitisticListPopulation14.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 1);
        elitisticListPopulation2.setPopulationLimit((int) '#');
        java.lang.String str23 = elitisticListPopulation2.toString();
        int int24 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setElitismRate((double) (byte) 1);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = population8.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        org.apache.commons.math3.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation2.addChromosome(chromosome12);
        org.junit.Assert.assertNotNull(chromosomeList10);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        elitisticListPopulation2.setElitismRate((double) 1L);
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        java.lang.String str12 = elitisticListPopulation2.toString();
        int int13 = elitisticListPopulation2.getPopulationSize();
        double double14 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[null]" + "'", str12, "[null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) -1, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation13.addChromosome(chromosome16);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation13.iterator();
        int int19 = elitisticListPopulation13.getPopulationLimit();
        double double20 = elitisticListPopulation13.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray21 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, chromosomeArray21);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        java.lang.Class<?> wildcardClass26 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int15 = elitisticListPopulation14.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        java.lang.String str18 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population19 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double23 = elitisticListPopulation22.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator24 = elitisticListPopulation22.spliterator();
        java.lang.String str25 = elitisticListPopulation22.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor26 = elitisticListPopulation22.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator27 = elitisticListPopulation22.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = elitisticListPopulation22.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator29 = elitisticListPopulation22.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int33 = elitisticListPopulation32.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = elitisticListPopulation32.getChromosomes();
        int int35 = elitisticListPopulation32.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation32.getChromosomes();
        elitisticListPopulation22.setChromosomes(chromosomeList36);
        elitisticListPopulation2.setChromosomes(chromosomeList36);
        org.apache.commons.math3.genetics.Population population39 = elitisticListPopulation2.nextGeneration();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome40 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor26);
        org.junit.Assert.assertNotNull(chromosomeSpliterator27);
        org.junit.Assert.assertNotNull(chromosomeList28);
        org.junit.Assert.assertNotNull(chromosomeSpliterator29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(chromosomeList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertNotNull(population39);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit(0);
        java.lang.String str10 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double14 = elitisticListPopulation13.getElitismRate();
        java.lang.String str15 = elitisticListPopulation13.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int19 = elitisticListPopulation18.getPopulationLimit();
        int int20 = elitisticListPopulation18.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor21 = elitisticListPopulation18.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation18.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        elitisticListPopulation18.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        int int28 = elitisticListPopulation13.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation31 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int32 = elitisticListPopulation31.getPopulationLimit();
        java.lang.String str33 = elitisticListPopulation31.toString();
        int int34 = elitisticListPopulation31.getPopulationSize();
        double double35 = elitisticListPopulation31.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation31.getChromosomes();
        elitisticListPopulation13.setChromosomes(chromosomeList36);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList38);
        int int40 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome41 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[null]" + "'", str10, "[null]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor21);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertNotNull(chromosomeList38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((-1), (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 100, (double) (byte) 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double double6 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeItor9);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int15 = elitisticListPopulation14.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        java.lang.String str18 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome5 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = elitisticListPopulation2.spliterator();
        double double6 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome8 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(population7);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str7 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        java.lang.String str13 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        double double9 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = chromosomeList12.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList12, (int) '4', (double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList12, (int) '4', 0.0d);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation19.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
        org.junit.Assert.assertNotNull(chromosomeList20);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        java.lang.String str10 = elitisticListPopulation2.toString();
        int int11 = elitisticListPopulation2.getPopulationLimit();
        int int12 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str13 = elitisticListPopulation2.toString();
        double double14 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[null]" + "'", str10, "[null]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[null]" + "'", str13, "[null]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '#', (double) (byte) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        int int4 = elitisticListPopulation2.getPopulationSize();
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        double double8 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int15 = elitisticListPopulation14.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        java.lang.String str18 = elitisticListPopulation2.toString();
        java.lang.String str19 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome20 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor8);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.lang.String str9 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        elitisticListPopulation2.setPopulationLimit((int) (byte) 1);
        elitisticListPopulation2.setPopulationLimit((-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(0, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        int int6 = elitisticListPopulation2.getPopulationLimit();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        double double8 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation8.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation2.addChromosome(chromosome19);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator21 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str26 = elitisticListPopulation25.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray27 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, chromosomeArray27);
        elitisticListPopulation25.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        org.apache.commons.math3.genetics.Population population31 = elitisticListPopulation25.nextGeneration();
        int int32 = elitisticListPopulation25.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList33);
        int int35 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation38.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor41 = elitisticListPopulation38.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator42 = elitisticListPopulation38.spliterator();
        java.lang.String str43 = elitisticListPopulation38.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList44 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList44);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList44, 100, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(population31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor41);
        org.junit.Assert.assertNotNull(chromosomeSpliterator42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[]" + "'", str43, "[]");
        org.junit.Assert.assertNotNull(chromosomeList44);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        int int10 = elitisticListPopulation2.getPopulationLimit();
        double double11 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList12, (int) (byte) -1, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList12);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(2, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList8, (int) 'a', 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList8, (int) (byte) 1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(chromosomeList8);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation13.addChromosome(chromosome16);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation13.iterator();
        int int19 = elitisticListPopulation13.getPopulationLimit();
        double double20 = elitisticListPopulation13.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray21 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, chromosomeArray21);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator27 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor28 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertNotNull(chromosomeSpliterator27);
        org.junit.Assert.assertNotNull(chromosomeItor28);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) 0.0f);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double8 = elitisticListPopulation7.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation7.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation7.addChromosome(chromosome10);
        elitisticListPopulation7.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation7.getChromosomes();
        int int15 = elitisticListPopulation7.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int19 = elitisticListPopulation18.getPopulationSize();
        org.apache.commons.math3.genetics.Population population20 = elitisticListPopulation18.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator21 = elitisticListPopulation18.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation7.setChromosomes(chromosomeList22);
        elitisticListPopulation2.setChromosomes(chromosomeList22);
        double double25 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(population20);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str6 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor4 = elitisticListPopulation2.iterator();
        java.lang.Class<?> wildcardClass5 = chromosomeItor4.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str7 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation15.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation15.addChromosome(chromosome18);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation15.iterator();
        java.lang.String str21 = elitisticListPopulation15.toString();
        double double22 = elitisticListPopulation15.getElitismRate();
        elitisticListPopulation15.setPopulationLimit((int) (byte) 100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation15.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator26 = chromosomeList25.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList25, (int) '4', (double) (short) 0);
        elitisticListPopulation2.setChromosomes(chromosomeList25);
        java.lang.Class<?> wildcardClass31 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[null]" + "'", str21, "[null]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList25);
        org.junit.Assert.assertNotNull(chromosomeSpliterator26);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation8.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation2.addChromosome(chromosome19);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator21 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str26 = elitisticListPopulation25.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray27 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, chromosomeArray27);
        elitisticListPopulation25.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        org.apache.commons.math3.genetics.Population population31 = elitisticListPopulation25.nextGeneration();
        int int32 = elitisticListPopulation25.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList33);
        int int35 = elitisticListPopulation2.getPopulationSize();
        java.lang.Class<?> wildcardClass36 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(population31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str7 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation15.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation15.addChromosome(chromosome18);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation15.iterator();
        int int21 = elitisticListPopulation15.getPopulationLimit();
        double double22 = elitisticListPopulation15.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray23 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24, chromosomeArray23);
        elitisticListPopulation15.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList24);
        int int28 = elitisticListPopulation2.getPopulationSize();
        int int29 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation8.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation2.addChromosome(chromosome19);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator21 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str26 = elitisticListPopulation25.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray27 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, chromosomeArray27);
        elitisticListPopulation25.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        org.apache.commons.math3.genetics.Population population31 = elitisticListPopulation25.nextGeneration();
        int int32 = elitisticListPopulation25.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList33);
        org.apache.commons.math3.genetics.Population population35 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(population31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertNotNull(population35);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str7 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setElitismRate((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome15 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        double double7 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(1, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = elitisticListPopulation2.spliterator();
        int int6 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.lang.String str8 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate(0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (byte) 0);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.lang.Class<?> wildcardClass4 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome3 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int8 = elitisticListPopulation7.getPopulationLimit();
        int int9 = elitisticListPopulation7.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation7.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation7.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray12 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, chromosomeArray12);
        elitisticListPopulation7.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13);
        int int17 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation2.iterator();
        int int19 = elitisticListPopulation2.getPopulationLimit();
        int int20 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertNotNull(chromosomeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        double double9 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray10 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, chromosomeArray10);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int17 = elitisticListPopulation16.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int23 = elitisticListPopulation22.getPopulationLimit();
        int int24 = elitisticListPopulation22.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor25 = elitisticListPopulation22.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation22.getChromosomes();
        int int27 = elitisticListPopulation22.getPopulationLimit();
        double double28 = elitisticListPopulation22.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList29 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList29);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList29, 35, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor25);
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList29);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int15 = elitisticListPopulation14.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = chromosomeList16.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (35)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double7 = elitisticListPopulation6.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation6.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation6.addChromosome(chromosome9);
        elitisticListPopulation6.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation6.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList13);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList13, (int) (byte) 100, 0.0d);
        int int18 = elitisticListPopulation17.getPopulationLimit();
        elitisticListPopulation17.setPopulationLimit((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation17.setElitismRate((double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, (double) 1L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation5.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation5.addChromosome(chromosome8);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation5.iterator();
        java.lang.String str11 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setPopulationLimit((int) '4');
        org.apache.commons.math3.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation5.addChromosome(chromosome14);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        int int18 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[null]" + "'", str11, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.lang.String str6 = elitisticListPopulation2.toString();
        int int7 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation2.iterator();
        double double10 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        int int5 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit((int) (short) 10);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertNotNull(chromosomeItor10);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator11 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeSpliterator11);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.lang.Class<?> wildcardClass3 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 100, (double) 1L);
        double double12 = elitisticListPopulation11.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation15.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation15.addChromosome(chromosome18);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation15.iterator();
        java.lang.String str21 = elitisticListPopulation15.toString();
        elitisticListPopulation15.setPopulationLimit((int) '4');
        org.apache.commons.math3.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation15.addChromosome(chromosome24);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation11.setChromosomes(chromosomeList26);
        elitisticListPopulation2.setChromosomes(chromosomeList26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Population population29 = elitisticListPopulation2.nextGeneration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[null]" + "'", str21, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList26);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        java.lang.String str8 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation11.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation16.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation11.setChromosomes(chromosomeList19);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList19, 100, (double) (byte) 1);
        elitisticListPopulation2.setChromosomes(chromosomeList19);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor25 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (97)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertNotNull(chromosomeItor25);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation2.addChromosome(chromosome10);
        double double12 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList13, (int) (byte) 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList13);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        int int10 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int14 = elitisticListPopulation13.getPopulationSize();
        org.apache.commons.math3.genetics.Population population15 = elitisticListPopulation13.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation13.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList17);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator19 = chromosomeList17.spliterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator20 = chromosomeList17.spliterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(population15);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeSpliterator19);
        org.junit.Assert.assertNotNull(chromosomeSpliterator20);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        int int6 = elitisticListPopulation2.getPopulationSize();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        java.lang.Class<?> wildcardClass9 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.lang.String str9 = elitisticListPopulation2.toString();
        int int10 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str14 = elitisticListPopulation13.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray15 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16, chromosomeArray15);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList16);
        org.apache.commons.math3.genetics.Population population19 = elitisticListPopulation13.nextGeneration();
        int int20 = elitisticListPopulation13.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation13.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation24.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation24.addChromosome(chromosome27);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor29 = elitisticListPopulation24.iterator();
        int int30 = elitisticListPopulation24.getPopulationLimit();
        double double31 = elitisticListPopulation24.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray32 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList33, chromosomeArray32);
        elitisticListPopulation24.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList33);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList33);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = elitisticListPopulation13.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList38);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation42 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str43 = elitisticListPopulation42.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray44 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList45, chromosomeArray44);
        elitisticListPopulation42.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList45);
        org.apache.commons.math3.genetics.Population population48 = elitisticListPopulation42.nextGeneration();
        int int49 = elitisticListPopulation42.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList50 = elitisticListPopulation42.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation53 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation53.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome56 = null;
        elitisticListPopulation53.addChromosome(chromosome56);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor58 = elitisticListPopulation53.iterator();
        int int59 = elitisticListPopulation53.getPopulationLimit();
        double double60 = elitisticListPopulation53.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray61 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList62 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList62, chromosomeArray61);
        elitisticListPopulation53.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList62);
        elitisticListPopulation42.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList62);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation68 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double69 = elitisticListPopulation68.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator70 = elitisticListPopulation68.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome71 = null;
        elitisticListPopulation68.addChromosome(chromosome71);
        elitisticListPopulation68.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList75 = elitisticListPopulation68.getChromosomes();
        elitisticListPopulation42.setChromosomes(chromosomeList75);
        elitisticListPopulation2.setChromosomes(chromosomeList75);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertNotNull(chromosomeItor29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(chromosomeList37);
        org.junit.Assert.assertNotNull(chromosomeList38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[]" + "'", str43, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(population48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(chromosomeList50);
        org.junit.Assert.assertNotNull(chromosomeItor58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1.0d + "'", double69 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator70);
        org.junit.Assert.assertNotNull(chromosomeList75);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) 0.0f);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 100, (double) 1);
        elitisticListPopulation2.setPopulationLimit(0);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        double double9 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray10 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, chromosomeArray10);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int17 = elitisticListPopulation16.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome20 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(chromosomeList18);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int9 = elitisticListPopulation8.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation8.getChromosomes();
        int int11 = elitisticListPopulation8.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList12);
        org.apache.commons.math3.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation2.addChromosome(chromosome14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome16 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeList5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chromosomeList12);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str10 = elitisticListPopulation9.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray11 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12, chromosomeArray11);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList12);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation2.spliterator();
        int int17 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor18);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertNotNull(population4);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int10 = elitisticListPopulation9.getPopulationLimit();
        int int11 = elitisticListPopulation9.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int15 = elitisticListPopulation14.getPopulationLimit();
        int int16 = elitisticListPopulation14.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation14.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation14.getChromosomes();
        int int19 = elitisticListPopulation14.getPopulationLimit();
        double double20 = elitisticListPopulation14.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation9.setChromosomes(chromosomeList21);
        elitisticListPopulation2.setChromosomes(chromosomeList21);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList21);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        double double9 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        int int12 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        double double8 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, 52, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(chromosomeList10);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation8.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation2.addChromosome(chromosome19);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator21 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str26 = elitisticListPopulation25.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray27 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28, chromosomeArray27);
        elitisticListPopulation25.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList28);
        org.apache.commons.math3.genetics.Population population31 = elitisticListPopulation25.nextGeneration();
        int int32 = elitisticListPopulation25.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList33);
        int int35 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation38.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor41 = elitisticListPopulation38.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator42 = elitisticListPopulation38.spliterator();
        java.lang.String str43 = elitisticListPopulation38.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList44 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList44);
        elitisticListPopulation2.setPopulationLimit(10);
        double double48 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(population31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(chromosomeList33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor41);
        org.junit.Assert.assertNotNull(chromosomeSpliterator42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[]" + "'", str43, "[]");
        org.junit.Assert.assertNotNull(chromosomeList44);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double double6 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation8.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor19 = elitisticListPopulation2.iterator();
        double double20 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor22 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList23 = elitisticListPopulation2.getChromosomes();
        java.lang.Class<?> wildcardClass24 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeItor19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertNotNull(chromosomeItor22);
        org.junit.Assert.assertNotNull(chromosomeList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation8.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation8.setChromosomes(chromosomeList16);
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation2.addChromosome(chromosome19);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator21 = elitisticListPopulation2.spliterator();
        int int22 = elitisticListPopulation2.getPopulationSize();
        java.lang.Class<?> wildcardClass23 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation13.addChromosome(chromosome16);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation13.iterator();
        int int19 = elitisticListPopulation13.getPopulationLimit();
        double double20 = elitisticListPopulation13.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray21 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, chromosomeArray21);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation2.getChromosomes();
        double double27 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome28 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double7 = elitisticListPopulation6.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation6.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation6.addChromosome(chromosome9);
        elitisticListPopulation6.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation6.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList13, (-1), (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertNotNull(chromosomeList13);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit(0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome11 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor10);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        double double8 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
    }
}


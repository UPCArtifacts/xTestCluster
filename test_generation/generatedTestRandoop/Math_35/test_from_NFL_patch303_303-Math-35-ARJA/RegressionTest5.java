import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int9 = elitisticListPopulation8.getPopulationLimit();
        java.lang.String str10 = elitisticListPopulation8.toString();
        int int11 = elitisticListPopulation8.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation8.addChromosome(chromosome12);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator14 = elitisticListPopulation8.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double18 = elitisticListPopulation17.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator19 = elitisticListPopulation17.spliterator();
        java.lang.String str20 = elitisticListPopulation17.toString();
        org.apache.commons.math3.genetics.Population population21 = elitisticListPopulation17.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str25 = elitisticListPopulation24.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray26 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList27, chromosomeArray26);
        elitisticListPopulation24.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList27);
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList27);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator31 = elitisticListPopulation17.spliterator();
        int int32 = elitisticListPopulation17.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList33 = elitisticListPopulation17.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList33, 10, (double) 0.0f);
        elitisticListPopulation8.setChromosomes(chromosomeList33);
        elitisticListPopulation2.setChromosomes(chromosomeList33);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertNotNull(population21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(chromosomeList33);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str7 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        int int13 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(population16);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        double double6 = elitisticListPopulation2.getElitismRate();
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation2.iterator();
        int int10 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(chromosomeItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        elitisticListPopulation2.setElitismRate((double) 1.0f);
        org.junit.Assert.assertNotNull(population5);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation2.iterator();
        double double11 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = elitisticListPopulation2.spliterator();
        int int6 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.lang.String str8 = elitisticListPopulation2.toString();
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
        org.apache.commons.math3.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation11.addChromosome(chromosome28);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator30 = elitisticListPopulation11.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = elitisticListPopulation11.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str35 = elitisticListPopulation34.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray36 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37, chromosomeArray36);
        elitisticListPopulation34.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList37);
        org.apache.commons.math3.genetics.Population population40 = elitisticListPopulation34.nextGeneration();
        int int41 = elitisticListPopulation34.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList42 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation11.setChromosomes(chromosomeList42);
        elitisticListPopulation2.setChromosomes(chromosomeList42);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation47 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList42, 52, (double) (byte) 1);
        org.apache.commons.math3.genetics.Chromosome chromosome48 = null;
        elitisticListPopulation47.addChromosome(chromosome48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor14);
        org.junit.Assert.assertNotNull(chromosomeList25);
        org.junit.Assert.assertNotNull(chromosomeSpliterator30);
        org.junit.Assert.assertNotNull(chromosomeList31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(population40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(chromosomeList42);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        double double4 = elitisticListPopulation2.getElitismRate();
        int int5 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList6, (int) '#', (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chromosomeList6);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        java.lang.Class<?> wildcardClass9 = chromosomeList8.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate(100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(population5);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
        double double22 = elitisticListPopulation2.getElitismRate();
        double double23 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Population population24 = elitisticListPopulation2.nextGeneration();
        int int25 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeItor19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(population24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor4 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double double6 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = elitisticListPopulation2.getChromosomes();
        int int25 = elitisticListPopulation2.getPopulationSize();
        int int26 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation2.addChromosome(chromosome27);
        org.apache.commons.math3.genetics.Chromosome chromosome29 = null;
        elitisticListPopulation2.addChromosome(chromosome29);
        int int31 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[null]" + "'", str20, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int13 = elitisticListPopulation12.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation12.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation12.addChromosome(chromosome15);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList17, (int) (short) 1, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertNotNull(chromosomeList17);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit(2);
        double double10 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str15 = elitisticListPopulation14.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor16 = elitisticListPopulation14.iterator();
        java.lang.String str17 = elitisticListPopulation14.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList18, 0, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(chromosomeList18);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
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
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double30 = elitisticListPopulation29.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator31 = elitisticListPopulation29.spliterator();
        java.lang.String str32 = elitisticListPopulation29.toString();
        org.apache.commons.math3.genetics.Population population33 = elitisticListPopulation29.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str37 = elitisticListPopulation36.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray38 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39, chromosomeArray38);
        elitisticListPopulation36.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39);
        elitisticListPopulation29.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList39);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator43 = elitisticListPopulation29.spliterator();
        int int44 = elitisticListPopulation29.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation29.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList45, 10, (double) 0.0f);
        elitisticListPopulation2.setChromosomes(chromosomeList45);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation52 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double53 = elitisticListPopulation52.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator54 = elitisticListPopulation52.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome55 = null;
        elitisticListPopulation52.addChromosome(chromosome55);
        elitisticListPopulation52.setElitismRate((double) 1L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation61 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 100, (double) 1L);
        double double62 = elitisticListPopulation61.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation65 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation65.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome68 = null;
        elitisticListPopulation65.addChromosome(chromosome68);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor70 = elitisticListPopulation65.iterator();
        java.lang.String str71 = elitisticListPopulation65.toString();
        elitisticListPopulation65.setPopulationLimit((int) '4');
        org.apache.commons.math3.genetics.Chromosome chromosome74 = null;
        elitisticListPopulation65.addChromosome(chromosome74);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList76 = elitisticListPopulation65.getChromosomes();
        elitisticListPopulation61.setChromosomes(chromosomeList76);
        elitisticListPopulation52.setChromosomes(chromosomeList76);
        elitisticListPopulation2.setChromosomes(chromosomeList76);
        elitisticListPopulation2.setElitismRate((double) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome82 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertNotNull(population33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator54);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeItor70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "[null]" + "'", str71, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList76);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList46 = elitisticListPopulation2.getChromosomes();
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
        org.junit.Assert.assertNotNull(chromosomeList46);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (byte) 0);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        int int5 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        int int24 = elitisticListPopulation2.getPopulationSize();
        int int25 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeItor19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertNotNull(chromosomeItor22);
        org.junit.Assert.assertNotNull(chromosomeList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
        org.apache.commons.math3.genetics.Population population23 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Chromosome chromosome24 = null;
        elitisticListPopulation2.addChromosome(chromosome24);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation2.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertNotNull(chromosomeList27);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.lang.String str9 = elitisticListPopulation2.toString();
        int int10 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str11 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int15 = elitisticListPopulation14.getPopulationLimit();
        java.lang.String str16 = elitisticListPopulation14.toString();
        int int17 = elitisticListPopulation14.getPopulationSize();
        double double18 = elitisticListPopulation14.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation14.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int23 = elitisticListPopulation22.getPopulationLimit();
        java.lang.String str24 = elitisticListPopulation22.toString();
        int int25 = elitisticListPopulation22.getPopulationSize();
        int int26 = elitisticListPopulation22.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator27 = elitisticListPopulation22.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation22.addChromosome(chromosome28);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double33 = elitisticListPopulation32.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator34 = elitisticListPopulation32.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome35 = null;
        elitisticListPopulation32.addChromosome(chromosome35);
        elitisticListPopulation32.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList39 = elitisticListPopulation32.getChromosomes();
        elitisticListPopulation22.setChromosomes(chromosomeList39);
        elitisticListPopulation14.setChromosomes(chromosomeList39);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation44 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double45 = elitisticListPopulation44.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str49 = elitisticListPopulation48.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray50 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList51 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList51, chromosomeArray50);
        elitisticListPopulation48.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList51);
        elitisticListPopulation44.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList51);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation57 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation57.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome60 = null;
        elitisticListPopulation57.addChromosome(chromosome60);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor62 = elitisticListPopulation57.iterator();
        int int63 = elitisticListPopulation57.getPopulationLimit();
        double double64 = elitisticListPopulation57.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray65 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList66 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList66, chromosomeArray65);
        elitisticListPopulation57.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList66);
        elitisticListPopulation44.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList66);
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList66);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList66);
        java.lang.String str72 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator27);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator34);
        org.junit.Assert.assertNotNull(chromosomeList39);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[]" + "'", str49, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(chromosomeItor62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "[]" + "'", str72, "[]");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation2.spliterator();
        java.lang.String str9 = elitisticListPopulation2.toString();
        int int10 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(chromosomeList11);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator23 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor26 = elitisticListPopulation2.iterator();
        java.lang.String str27 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertNotNull(chromosomeSpliterator23);
        org.junit.Assert.assertNotNull(chromosomeItor26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[null]" + "'", str27, "[null]");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '#', (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 100, (double) 1L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int6 = elitisticListPopulation5.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double11 = elitisticListPopulation10.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str15 = elitisticListPopulation14.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17);
        elitisticListPopulation10.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17);
        elitisticListPopulation2.setPopulationLimit((int) (short) 1);
        org.apache.commons.math3.genetics.Population population25 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(population25);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation2.spliterator();
        java.lang.String str9 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator10 = elitisticListPopulation2.spliterator();
        int int11 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator12 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(chromosomeSpliterator12);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double24 = elitisticListPopulation23.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator25 = elitisticListPopulation23.spliterator();
        java.lang.String str26 = elitisticListPopulation23.toString();
        double double27 = elitisticListPopulation23.getElitismRate();
        java.lang.String str28 = elitisticListPopulation23.toString();
        int int29 = elitisticListPopulation23.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation23.addChromosome(chromosome30);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int35 = elitisticListPopulation34.getPopulationLimit();
        int int36 = elitisticListPopulation34.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor37 = elitisticListPopulation34.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation34.setPopulationLimit((int) (byte) -1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation43.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation48.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList51 = elitisticListPopulation48.getChromosomes();
        elitisticListPopulation43.setChromosomes(chromosomeList51);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation55 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList51, 100, (double) (byte) 1);
        elitisticListPopulation34.setChromosomes(chromosomeList51);
        elitisticListPopulation23.setChromosomes(chromosomeList51);
        elitisticListPopulation2.setChromosomes(chromosomeList51);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator59 = elitisticListPopulation2.spliterator();
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor37);
        org.junit.Assert.assertNotNull(chromosomeList38);
        org.junit.Assert.assertNotNull(chromosomeList51);
        org.junit.Assert.assertNotNull(chromosomeSpliterator59);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation2.iterator();
        java.lang.String str21 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double25 = elitisticListPopulation24.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator26 = elitisticListPopulation24.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation24.addChromosome(chromosome27);
        elitisticListPopulation24.setElitismRate((double) 1L);
        java.lang.String str31 = elitisticListPopulation24.toString();
        elitisticListPopulation24.setElitismRate((double) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation24.setPopulationLimit((int) (short) 100);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation39 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int40 = elitisticListPopulation39.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome41 = null;
        elitisticListPopulation39.addChromosome(chromosome41);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList43 = elitisticListPopulation39.getChromosomes();
        elitisticListPopulation24.setChromosomes(chromosomeList43);
        elitisticListPopulation2.setChromosomes(chromosomeList43);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator46 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeItor19);
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[null]" + "'", str31, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(chromosomeList43);
        org.junit.Assert.assertNotNull(chromosomeSpliterator46);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        int int6 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        java.lang.String str14 = elitisticListPopulation2.toString();
        int int15 = elitisticListPopulation2.getPopulationLimit();
        java.lang.Class<?> wildcardClass16 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[null]" + "'", str10, "[null]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[null]" + "'", str13, "[null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[null]" + "'", str14, "[null]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
        java.lang.Class<?> wildcardClass22 = chromosomeList20.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertNotNull(chromosomeList20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor3 = elitisticListPopulation2.iterator();
        double double4 = elitisticListPopulation2.getElitismRate();
        int int5 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        int int10 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator11 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeItor3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(chromosomeSpliterator11);
        org.junit.Assert.assertNotNull(chromosomeList12);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.lang.String str9 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        elitisticListPopulation2.setElitismRate((double) (byte) 0);
        int int14 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double18 = elitisticListPopulation17.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator19 = elitisticListPopulation17.spliterator();
        java.lang.String str20 = elitisticListPopulation17.toString();
        org.apache.commons.math3.genetics.Population population21 = elitisticListPopulation17.nextGeneration();
        java.lang.String str22 = elitisticListPopulation17.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList23 = elitisticListPopulation17.getChromosomes();
        elitisticListPopulation17.setPopulationLimit((int) (byte) 1);
        int int26 = elitisticListPopulation17.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double30 = elitisticListPopulation29.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation33 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str34 = elitisticListPopulation33.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray35 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36, chromosomeArray35);
        elitisticListPopulation33.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36);
        elitisticListPopulation29.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36);
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList36);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList42 = elitisticListPopulation2.getChromosomes();
        double double43 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertNotNull(population21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertNotNull(chromosomeList23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(chromosomeList42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation2.spliterator();
        java.lang.String str9 = elitisticListPopulation2.toString();
        java.lang.Class<?> wildcardClass10 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        double double9 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation2.iterator();
        double double13 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double17 = elitisticListPopulation16.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = elitisticListPopulation16.spliterator();
        java.lang.String str19 = elitisticListPopulation16.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation16.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator21 = elitisticListPopulation16.spliterator();
        org.apache.commons.math3.genetics.Population population22 = elitisticListPopulation16.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList23 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList23);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertNotNull(population22);
        org.junit.Assert.assertNotNull(chromosomeList23);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        elitisticListPopulation2.setElitismRate((double) (byte) 1);
        int int7 = elitisticListPopulation2.getPopulationLimit();
        int int8 = elitisticListPopulation2.getPopulationSize();
        double double9 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor19 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation22.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList25);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator27 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chromosomeItor19);
        org.junit.Assert.assertNotNull(chromosomeList25);
        org.junit.Assert.assertNotNull(chromosomeSpliterator27);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit(52);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(population7);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
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
        java.lang.String str17 = elitisticListPopulation2.toString();
        int int18 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
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
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList16, 100, 0.0d);
        org.apache.commons.math3.genetics.Population population21 = elitisticListPopulation20.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation24.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation24.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int31 = elitisticListPopulation30.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList32 = elitisticListPopulation30.getChromosomes();
        int int33 = elitisticListPopulation30.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = elitisticListPopulation30.getChromosomes();
        elitisticListPopulation24.setChromosomes(chromosomeList34);
        elitisticListPopulation20.setChromosomes(chromosomeList34);
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
        org.junit.Assert.assertNotNull(population21);
        org.junit.Assert.assertNotNull(chromosomeList27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(chromosomeList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(chromosomeList34);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        int int5 = elitisticListPopulation2.getPopulationLimit();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation45 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int46 = elitisticListPopulation45.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList47 = elitisticListPopulation45.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation50 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double51 = elitisticListPopulation50.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation54 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str55 = elitisticListPopulation54.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray56 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList57 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57, chromosomeArray56);
        elitisticListPopulation54.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57);
        elitisticListPopulation50.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57);
        elitisticListPopulation45.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation65 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57, (int) (byte) 1, (double) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList66 = elitisticListPopulation65.getChromosomes();
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(chromosomeList47);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[]" + "'", str55, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(chromosomeList66);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        elitisticListPopulation2.setPopulationLimit(52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor6);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
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
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator23 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor26 = elitisticListPopulation2.iterator();
        java.lang.Class<?> wildcardClass27 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertNotNull(chromosomeSpliterator23);
        org.junit.Assert.assertNotNull(chromosomeItor26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = elitisticListPopulation2.spliterator();
        int int6 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        double double6 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int11 = elitisticListPopulation10.getPopulationLimit();
        java.lang.String str12 = elitisticListPopulation10.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation15.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation22.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor25 = elitisticListPopulation22.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator26 = elitisticListPopulation22.spliterator();
        java.lang.String str27 = elitisticListPopulation22.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation10.setChromosomes(chromosomeList28);
        elitisticListPopulation2.setChromosomes(chromosomeList28);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor31 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertNotNull(chromosomeItor25);
        org.junit.Assert.assertNotNull(chromosomeSpliterator26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertNotNull(chromosomeList28);
        org.junit.Assert.assertNotNull(chromosomeItor31);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator3 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeSpliterator3);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        double double6 = elitisticListPopulation2.getElitismRate();
        int int7 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor8);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        double double6 = elitisticListPopulation2.getElitismRate();
        double double7 = elitisticListPopulation2.getElitismRate();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (short) 0);
        double double3 = elitisticListPopulation2.getElitismRate();
        double double4 = elitisticListPopulation2.getElitismRate();
        java.lang.Class<?> wildcardClass5 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(100, (double) 1.0f);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator3 = elitisticListPopulation2.spliterator();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosomeSpliterator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (byte) 0);
        java.lang.String str3 = elitisticListPopulation2.toString();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int12 = elitisticListPopulation11.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation11.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation11.addChromosome(chromosome14);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int19 = elitisticListPopulation18.getPopulationLimit();
        int int20 = elitisticListPopulation18.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor21 = elitisticListPopulation18.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation18.setPopulationLimit((int) (byte) -1);
        int int25 = elitisticListPopulation18.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation18.setPopulationLimit((int) 'a');
        org.apache.commons.math3.genetics.Population population29 = elitisticListPopulation18.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str33 = elitisticListPopulation32.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray34 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35, chromosomeArray34);
        elitisticListPopulation32.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35);
        org.apache.commons.math3.genetics.Chromosome chromosome38 = null;
        elitisticListPopulation32.addChromosome(chromosome38);
        int int40 = elitisticListPopulation32.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation43.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome46 = null;
        elitisticListPopulation43.addChromosome(chromosome46);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor48 = elitisticListPopulation43.iterator();
        java.lang.String str49 = elitisticListPopulation43.toString();
        double double50 = elitisticListPopulation43.getElitismRate();
        elitisticListPopulation43.setPopulationLimit((int) (byte) 100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList53 = elitisticListPopulation43.getChromosomes();
        elitisticListPopulation32.setChromosomes(chromosomeList53);
        elitisticListPopulation18.setChromosomes(chromosomeList53);
        elitisticListPopulation11.setChromosomes(chromosomeList53);
        elitisticListPopulation2.setChromosomes(chromosomeList53);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator58 = chromosomeList53.spliterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor21);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertNotNull(population29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[null]" + "'", str49, "[null]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList53);
        org.junit.Assert.assertNotNull(chromosomeSpliterator58);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        java.lang.String str10 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator11 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit(100);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator14 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[null]" + "'", str10, "[null]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator11);
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
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
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList13, (int) (byte) -1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList13);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double9 = elitisticListPopulation8.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator10 = elitisticListPopulation8.spliterator();
        java.lang.String str11 = elitisticListPopulation8.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation8.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = elitisticListPopulation8.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation8.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = elitisticListPopulation8.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int19 = elitisticListPopulation18.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation18.getChromosomes();
        int int21 = elitisticListPopulation18.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation8.setChromosomes(chromosomeList22);
        elitisticListPopulation2.setChromosomes(chromosomeList22);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int28 = elitisticListPopulation27.getPopulationSize();
        org.apache.commons.math3.genetics.Population population29 = elitisticListPopulation27.nextGeneration();
        org.apache.commons.math3.genetics.Population population30 = elitisticListPopulation27.nextGeneration();
        double double31 = elitisticListPopulation27.getElitismRate();
        java.lang.String str32 = elitisticListPopulation27.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor33 = elitisticListPopulation27.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation36.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome39 = null;
        elitisticListPopulation36.addChromosome(chromosome39);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor41 = elitisticListPopulation36.iterator();
        java.lang.String str42 = elitisticListPopulation36.toString();
        double double43 = elitisticListPopulation36.getElitismRate();
        elitisticListPopulation36.setPopulationLimit((int) (byte) 100);
        elitisticListPopulation36.setPopulationLimit((int) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = elitisticListPopulation36.getChromosomes();
        elitisticListPopulation27.setChromosomes(chromosomeList48);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation52 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str53 = elitisticListPopulation52.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray54 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList55 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList55, chromosomeArray54);
        elitisticListPopulation52.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList55);
        org.apache.commons.math3.genetics.Chromosome chromosome58 = null;
        elitisticListPopulation52.addChromosome(chromosome58);
        int int60 = elitisticListPopulation52.getPopulationLimit();
        double double61 = elitisticListPopulation52.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList62 = elitisticListPopulation52.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList63 = elitisticListPopulation52.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation66 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList63, 52, (double) (short) 0);
        elitisticListPopulation27.setChromosomes(chromosomeList63);
        elitisticListPopulation2.setChromosomes(chromosomeList63);
        int int69 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chromosomeList20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(population29);
        org.junit.Assert.assertNotNull(population30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor33);
        org.junit.Assert.assertNotNull(chromosomeItor41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[null]" + "'", str42, "[null]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList48);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[]" + "'", str53, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0d + "'", double61 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList62);
        org.junit.Assert.assertNotNull(chromosomeList63);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.lang.String str9 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int15 = elitisticListPopulation14.getPopulationLimit();
        java.lang.String str16 = elitisticListPopulation14.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation19.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation14.setChromosomes(chromosomeList22);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int27 = elitisticListPopulation26.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = elitisticListPopulation26.getChromosomes();
        elitisticListPopulation14.setChromosomes(chromosomeList28);
        elitisticListPopulation2.setChromosomes(chromosomeList28);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome32 = null;
        elitisticListPopulation2.addChromosome(chromosome32);
        int int34 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor36 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(chromosomeList28);
        org.junit.Assert.assertNotNull(chromosomeList31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(chromosomeList35);
        org.junit.Assert.assertNotNull(chromosomeItor36);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '#', (double) (byte) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        int int4 = elitisticListPopulation2.getPopulationSize();
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 1);
        java.lang.String str8 = elitisticListPopulation2.toString();
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        double double8 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit(2);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int14 = elitisticListPopulation13.getPopulationSize();
        org.apache.commons.math3.genetics.Population population15 = elitisticListPopulation13.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation13.spliterator();
        int int17 = elitisticListPopulation13.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int21 = elitisticListPopulation20.getPopulationLimit();
        java.lang.String str22 = elitisticListPopulation20.toString();
        int int23 = elitisticListPopulation20.getPopulationSize();
        int int24 = elitisticListPopulation20.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator25 = elitisticListPopulation20.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome26 = null;
        elitisticListPopulation20.addChromosome(chromosome26);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double31 = elitisticListPopulation30.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator32 = elitisticListPopulation30.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome33 = null;
        elitisticListPopulation30.addChromosome(chromosome33);
        elitisticListPopulation30.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = elitisticListPopulation30.getChromosomes();
        elitisticListPopulation20.setChromosomes(chromosomeList37);
        elitisticListPopulation20.setPopulationLimit(10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double44 = elitisticListPopulation43.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator45 = elitisticListPopulation43.spliterator();
        java.lang.String str46 = elitisticListPopulation43.toString();
        org.apache.commons.math3.genetics.Population population47 = elitisticListPopulation43.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation50 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str51 = elitisticListPopulation50.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray52 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList53 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList53, chromosomeArray52);
        elitisticListPopulation50.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList53);
        elitisticListPopulation43.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList53);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator57 = elitisticListPopulation43.spliterator();
        int int58 = elitisticListPopulation43.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList59 = elitisticListPopulation43.getChromosomes();
        elitisticListPopulation20.setChromosomes(chromosomeList59);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation63 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int64 = elitisticListPopulation63.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList65 = elitisticListPopulation63.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation68 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double69 = elitisticListPopulation68.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation72 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str73 = elitisticListPopulation72.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray74 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList75 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList75, chromosomeArray74);
        elitisticListPopulation72.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList75);
        elitisticListPopulation68.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList75);
        elitisticListPopulation63.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList75);
        elitisticListPopulation20.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList75);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList75);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList75);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator83 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor84 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(population15);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator25);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator32);
        org.junit.Assert.assertNotNull(chromosomeList37);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[]" + "'", str46, "[]");
        org.junit.Assert.assertNotNull(population47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertNotNull(chromosomeList59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(chromosomeList65);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1.0d + "'", double69 == 1.0d);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "[]" + "'", str73, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator83);
        org.junit.Assert.assertNotNull(chromosomeItor84);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
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
        double double22 = elitisticListPopulation2.getElitismRate();
        double double23 = elitisticListPopulation2.getElitismRate();
        int int24 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeItor19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int9 = elitisticListPopulation8.getPopulationLimit();
        int int10 = elitisticListPopulation8.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor11 = elitisticListPopulation8.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation8.getChromosomes();
        int int13 = elitisticListPopulation8.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation16.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor19 = elitisticListPopulation16.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation22.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation27.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation22.setChromosomes(chromosomeList30);
        elitisticListPopulation16.setChromosomes(chromosomeList30);
        elitisticListPopulation8.setChromosomes(chromosomeList30);
        elitisticListPopulation2.setChromosomes(chromosomeList30);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = elitisticListPopulation2.getChromosomes();
        java.lang.String str36 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome37 = null;
        elitisticListPopulation2.addChromosome(chromosome37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor11);
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor19);
        org.junit.Assert.assertNotNull(chromosomeList30);
        org.junit.Assert.assertNotNull(chromosomeList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        int int13 = elitisticListPopulation2.getPopulationSize();
        double double14 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor15 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation2.getChromosomes();
        double double17 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeItor15);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str7 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        int int13 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation2.addChromosome(chromosome14);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor11 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int15 = elitisticListPopulation14.getPopulationLimit();
        int int16 = elitisticListPopulation14.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation14.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation14.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList19);
        double double21 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Population population22 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(chromosomeItor11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(population22);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.lang.String str9 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 10);
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
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int30 = elitisticListPopulation29.getPopulationLimit();
        java.lang.String str31 = elitisticListPopulation29.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation34.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList37);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int42 = elitisticListPopulation41.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList43 = elitisticListPopulation41.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList43);
        elitisticListPopulation17.setChromosomes(chromosomeList43);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList46 = elitisticListPopulation17.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList46);
        java.lang.String str48 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation51 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double52 = elitisticListPopulation51.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator53 = elitisticListPopulation51.spliterator();
        java.lang.String str54 = elitisticListPopulation51.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor55 = elitisticListPopulation51.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator56 = elitisticListPopulation51.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList57 = elitisticListPopulation51.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator58 = elitisticListPopulation51.spliterator();
        int int59 = elitisticListPopulation51.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList60 = elitisticListPopulation51.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList60);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[null]" + "'", str24, "[null]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertNotNull(chromosomeList37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(chromosomeList43);
        org.junit.Assert.assertNotNull(chromosomeList46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[]" + "'", str54, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor55);
        org.junit.Assert.assertNotNull(chromosomeSpliterator56);
        org.junit.Assert.assertNotNull(chromosomeList57);
        org.junit.Assert.assertNotNull(chromosomeSpliterator58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNotNull(chromosomeList60);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, 100, (double) (byte) 1);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = chromosomeList10.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, 52, (double) 0);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator19 = elitisticListPopulation18.spliterator();
        elitisticListPopulation18.setElitismRate((double) 0.0f);
        elitisticListPopulation18.setPopulationLimit(100);
        double double24 = elitisticListPopulation18.getElitismRate();
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
        org.junit.Assert.assertNotNull(chromosomeSpliterator19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        java.lang.String str6 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(chromosomeList9);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        double double7 = elitisticListPopulation2.getElitismRate();
        java.lang.String str8 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation2.addChromosome(chromosome9);
        int int11 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = chromosomeList12.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.lang.String str4 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        double double6 = elitisticListPopulation2.getElitismRate();
        java.lang.String str7 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate(0.0d);
        org.apache.commons.math3.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation2.addChromosome(chromosome10);
        double double12 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = elitisticListPopulation2.spliterator();
        double double14 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double double6 = elitisticListPopulation2.getElitismRate();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str8 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        int int10 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor12);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        int int5 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.lang.String str9 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 10);
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
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int30 = elitisticListPopulation29.getPopulationLimit();
        java.lang.String str31 = elitisticListPopulation29.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation34.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList37);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int42 = elitisticListPopulation41.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList43 = elitisticListPopulation41.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList43);
        elitisticListPopulation17.setChromosomes(chromosomeList43);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList46 = elitisticListPopulation17.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList46);
        java.lang.String str48 = elitisticListPopulation2.toString();
        int int49 = elitisticListPopulation2.getPopulationLimit();
        int int50 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit(0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[null]" + "'", str24, "[null]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertNotNull(chromosomeList37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(chromosomeList43);
        org.junit.Assert.assertNotNull(chromosomeList46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setElitismRate((double) 0);
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(1, (double) 1.0f);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation16.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation16.addChromosome(chromosome19);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor21 = elitisticListPopulation16.iterator();
        java.lang.String str22 = elitisticListPopulation16.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor23 = elitisticListPopulation16.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor24 = elitisticListPopulation16.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation13.setChromosomes(chromosomeList25);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator27 = chromosomeList25.spliterator();
        elitisticListPopulation2.setChromosomes(chromosomeList25);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeItor21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[null]" + "'", str22, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor23);
        org.junit.Assert.assertNotNull(chromosomeItor24);
        org.junit.Assert.assertNotNull(chromosomeList25);
        org.junit.Assert.assertNotNull(chromosomeSpliterator27);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor14 = elitisticListPopulation2.iterator();
        double double15 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation2.addChromosome(chromosome16);
        elitisticListPopulation2.setPopulationLimit((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[null]" + "'", str12, "[null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        double double8 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        java.lang.String str10 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor11 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome12 = elitisticListPopulation2.getFittestChromosome();
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
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor11);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) 0.0f);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        double double4 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(chromosomeList10);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        int int13 = elitisticListPopulation2.getPopulationSize();
        int int14 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population15 = elitisticListPopulation2.nextGeneration();
        int int16 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str17 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        int int20 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(population15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[null]" + "'", str17, "[null]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList25, (-1), 0.9d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(chromosomeList25);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.lang.String str9 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        int int15 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation2.addChromosome(chromosome16);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(2, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (35)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        double double8 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) '#');
        int int12 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population13 = elitisticListPopulation2.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(chromosomeList14);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
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
        int int18 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str19 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertNotNull(chromosomeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        double double21 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Population population22 = elitisticListPopulation2.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList23 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator24 = chromosomeList23.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(population22);
        org.junit.Assert.assertNotNull(chromosomeList23);
        org.junit.Assert.assertNotNull(chromosomeSpliterator24);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        double double10 = elitisticListPopulation2.getElitismRate();
        int int11 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation2.iterator();
        double double13 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        double double5 = elitisticListPopulation2.getElitismRate();
        java.lang.String str6 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setElitismRate((double) 1.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(chromosomeList7);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        int int5 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit(0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.lang.String str9 = elitisticListPopulation2.toString();
        int int10 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        double double8 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList9);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 1);
        elitisticListPopulation2.setPopulationLimit((int) (byte) 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int7 = elitisticListPopulation6.getPopulationLimit();
        java.lang.String str8 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation11.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation11.getChromosomes();
        elitisticListPopulation6.setChromosomes(chromosomeList14);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int19 = elitisticListPopulation18.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation6.setChromosomes(chromosomeList20);
        java.lang.String str22 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.Population population23 = elitisticListPopulation6.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double27 = elitisticListPopulation26.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator28 = elitisticListPopulation26.spliterator();
        java.lang.String str29 = elitisticListPopulation26.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor30 = elitisticListPopulation26.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator31 = elitisticListPopulation26.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList32 = elitisticListPopulation26.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator33 = elitisticListPopulation26.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int37 = elitisticListPopulation36.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = elitisticListPopulation36.getChromosomes();
        int int39 = elitisticListPopulation36.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList40 = elitisticListPopulation36.getChromosomes();
        elitisticListPopulation26.setChromosomes(chromosomeList40);
        elitisticListPopulation6.setChromosomes(chromosomeList40);
        org.apache.commons.math3.genetics.Population population43 = elitisticListPopulation6.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation46 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation46.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor49 = elitisticListPopulation46.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation52 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation52.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation57 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation57.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList60 = elitisticListPopulation57.getChromosomes();
        elitisticListPopulation52.setChromosomes(chromosomeList60);
        elitisticListPopulation46.setChromosomes(chromosomeList60);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor63 = elitisticListPopulation46.iterator();
        double double64 = elitisticListPopulation46.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList65 = elitisticListPopulation46.getChromosomes();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor66 = elitisticListPopulation46.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList67 = elitisticListPopulation46.getChromosomes();
        elitisticListPopulation6.setChromosomes(chromosomeList67);
        elitisticListPopulation2.setChromosomes(chromosomeList67);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (-1)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chromosomeList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertNotNull(population23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor30);
        org.junit.Assert.assertNotNull(chromosomeSpliterator31);
        org.junit.Assert.assertNotNull(chromosomeList32);
        org.junit.Assert.assertNotNull(chromosomeSpliterator33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(chromosomeList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(chromosomeList40);
        org.junit.Assert.assertNotNull(population43);
        org.junit.Assert.assertNotNull(chromosomeItor49);
        org.junit.Assert.assertNotNull(chromosomeList60);
        org.junit.Assert.assertNotNull(chromosomeItor63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList65);
        org.junit.Assert.assertNotNull(chromosomeItor66);
        org.junit.Assert.assertNotNull(chromosomeList67);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        int int5 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit(0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor8);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double double6 = elitisticListPopulation2.getElitismRate();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str8 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        double double10 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        int int6 = elitisticListPopulation2.getPopulationLimit();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Population population10 = elitisticListPopulation2.nextGeneration();
        int int11 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertNotNull(population10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        double double8 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) '#');
        int int12 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population13 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator14 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation17.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation17.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator21 = elitisticListPopulation17.spliterator();
        java.lang.String str22 = elitisticListPopulation17.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor23 = elitisticListPopulation17.iterator();
        java.lang.String str24 = elitisticListPopulation17.toString();
        int int25 = elitisticListPopulation17.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation28.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor31 = elitisticListPopulation28.iterator();
        double double32 = elitisticListPopulation28.getElitismRate();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor33 = elitisticListPopulation28.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int37 = elitisticListPopulation36.getPopulationLimit();
        java.lang.String str38 = elitisticListPopulation36.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation41.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList44 = elitisticListPopulation41.getChromosomes();
        elitisticListPopulation36.setChromosomes(chromosomeList44);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation48 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation48.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor51 = elitisticListPopulation48.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator52 = elitisticListPopulation48.spliterator();
        java.lang.String str53 = elitisticListPopulation48.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList54 = elitisticListPopulation48.getChromosomes();
        elitisticListPopulation36.setChromosomes(chromosomeList54);
        elitisticListPopulation28.setChromosomes(chromosomeList54);
        elitisticListPopulation17.setChromosomes(chromosomeList54);
        elitisticListPopulation2.setChromosomes(chromosomeList54);
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (3)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeItor33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
        org.junit.Assert.assertNotNull(chromosomeList44);
        org.junit.Assert.assertNotNull(chromosomeItor51);
        org.junit.Assert.assertNotNull(chromosomeSpliterator52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[]" + "'", str53, "[]");
        org.junit.Assert.assertNotNull(chromosomeList54);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) 'a', 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        double double9 = elitisticListPopulation2.getElitismRate();
        int int10 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        org.apache.commons.math3.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation2.addChromosome(chromosome11);
        int int13 = elitisticListPopulation2.getPopulationSize();
        int int14 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit(0);
        java.lang.String str10 = elitisticListPopulation2.toString();
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.lang.String str12 = elitisticListPopulation2.toString();
        java.lang.String str13 = elitisticListPopulation2.toString();
        java.lang.String str14 = elitisticListPopulation2.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[null]" + "'", str10, "[null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[null]" + "'", str11, "[null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[null]" + "'", str12, "[null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[null]" + "'", str13, "[null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[null]" + "'", str14, "[null]");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double14 = elitisticListPopulation13.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = elitisticListPopulation13.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation13.addChromosome(chromosome16);
        elitisticListPopulation13.setElitismRate((double) 1L);
        java.lang.String str20 = elitisticListPopulation13.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList21);
        elitisticListPopulation2.setPopulationLimit(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[null]" + "'", str20, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList21);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation3 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList0, (int) (short) 10, (double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        int int11 = elitisticListPopulation2.getPopulationLimit();
        int int12 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = elitisticListPopulation2.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome14 = elitisticListPopulation2.getFittestChromosome();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = elitisticListPopulation2.getChromosomes();
        int int25 = elitisticListPopulation2.getPopulationSize();
        int int26 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome27 = null;
        elitisticListPopulation2.addChromosome(chromosome27);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome29 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[null]" + "'", str20, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        elitisticListPopulation2.setPopulationLimit((int) '4');
        int int29 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome31 = null;
        elitisticListPopulation2.addChromosome(chromosome31);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(chromosomeList30);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        double double9 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator10 = elitisticListPopulation2.spliterator();
        int int11 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome12 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        double double8 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator11 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation2.iterator();
        int int13 = elitisticListPopulation2.getPopulationLimit();
        int int14 = elitisticListPopulation2.getPopulationSize();
        int int15 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator11);
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        double double8 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        java.lang.String str10 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        elitisticListPopulation2.setPopulationLimit((int) (byte) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation17.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor20 = elitisticListPopulation17.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation23.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation28.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList31 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation23.setChromosomes(chromosomeList31);
        elitisticListPopulation17.setChromosomes(chromosomeList31);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor34 = elitisticListPopulation17.iterator();
        double double35 = elitisticListPopulation17.getElitismRate();
        int int36 = elitisticListPopulation17.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = elitisticListPopulation17.getChromosomes();
        org.apache.commons.math3.genetics.Population population38 = elitisticListPopulation17.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation41 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, (double) 1L);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation44 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation44.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome47 = null;
        elitisticListPopulation44.addChromosome(chromosome47);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor49 = elitisticListPopulation44.iterator();
        java.lang.String str50 = elitisticListPopulation44.toString();
        elitisticListPopulation44.setPopulationLimit((int) '4');
        org.apache.commons.math3.genetics.Chromosome chromosome53 = null;
        elitisticListPopulation44.addChromosome(chromosome53);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList55 = elitisticListPopulation44.getChromosomes();
        elitisticListPopulation41.setChromosomes(chromosomeList55);
        elitisticListPopulation17.setChromosomes(chromosomeList55);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation60 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList55, 2, (double) 1L);
        elitisticListPopulation2.setChromosomes(chromosomeList55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertNotNull(chromosomeList31);
        org.junit.Assert.assertNotNull(chromosomeItor34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(chromosomeList37);
        org.junit.Assert.assertNotNull(population38);
        org.junit.Assert.assertNotNull(chromosomeItor49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[null]" + "'", str50, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList55);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        int int5 = elitisticListPopulation2.getPopulationLimit();
        int int6 = elitisticListPopulation2.getPopulationSize();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome9 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation2.getChromosomes();
        java.lang.Class<?> wildcardClass19 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(2, (double) 0L);
        java.lang.String str3 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit(35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(3, (double) 0L);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 100, (double) 1L);
        double double3 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation6.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation6.addChromosome(chromosome9);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor11 = elitisticListPopulation6.iterator();
        java.lang.String str12 = elitisticListPopulation6.toString();
        elitisticListPopulation6.setPopulationLimit((int) '4');
        org.apache.commons.math3.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation6.addChromosome(chromosome15);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation6.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList17);
        java.lang.Class<?> wildcardClass19 = chromosomeList17.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[null]" + "'", str12, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        int int5 = elitisticListPopulation2.getPopulationLimit();
        int int6 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeList9);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
        double double21 = elitisticListPopulation2.getElitismRate();
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        int int13 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str14 = elitisticListPopulation2.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[null]" + "'", str10, "[null]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[null]" + "'", str14, "[null]");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        double double7 = elitisticListPopulation2.getElitismRate();
        java.lang.String str8 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(population9);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(3, (double) 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (52)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeList5);
        org.junit.Assert.assertNotNull(population6);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        double double6 = elitisticListPopulation2.getElitismRate();
        java.lang.String str7 = elitisticListPopulation2.toString();
        double double8 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 10);
        int int11 = elitisticListPopulation2.getPopulationSize();
        int int12 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) (short) 0);
        java.lang.String str3 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeList4);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        int int7 = elitisticListPopulation2.getPopulationSize();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        int int5 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit(0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.lang.String str9 = elitisticListPopulation2.toString();
        int int10 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit(2);
        java.lang.String str13 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        int int9 = elitisticListPopulation2.getPopulationSize();
        int int10 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor11 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population12 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        int int15 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeItor11);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        java.lang.String str19 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator20 = elitisticListPopulation2.spliterator();
        java.lang.Class<?> wildcardClass21 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(population15);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int13 = elitisticListPopulation12.getPopulationLimit();
        int int14 = elitisticListPopulation12.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor15 = elitisticListPopulation12.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation12.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray17 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18, chromosomeArray17);
        elitisticListPopulation12.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator21 = chromosomeList18.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18, (int) (short) 1, 0.0d);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        org.apache.commons.math3.genetics.Population population26 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor15);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator21);
        org.junit.Assert.assertNotNull(population26);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        org.apache.commons.math3.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation2.addChromosome(chromosome18);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int23 = elitisticListPopulation22.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = elitisticListPopulation22.getChromosomes();
        double double25 = elitisticListPopulation22.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator26 = elitisticListPopulation22.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation22.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList27);
        org.apache.commons.math3.genetics.Population population29 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(population17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(chromosomeList24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator26);
        org.junit.Assert.assertNotNull(chromosomeList27);
        org.junit.Assert.assertNotNull(population29);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation45 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int46 = elitisticListPopulation45.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList47 = elitisticListPopulation45.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation50 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double51 = elitisticListPopulation50.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation54 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str55 = elitisticListPopulation54.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray56 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList57 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57, chromosomeArray56);
        elitisticListPopulation54.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57);
        elitisticListPopulation50.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57);
        elitisticListPopulation45.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList57);
        org.apache.commons.math3.genetics.Population population63 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator64 = population63.spliterator();
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(chromosomeList47);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[]" + "'", str55, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(population63);
        org.junit.Assert.assertNotNull(chromosomeSpliterator64);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
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
        int int28 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome29 = null;
        elitisticListPopulation2.addChromosome(chromosome29);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor31 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population32 = elitisticListPopulation2.nextGeneration();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor31);
        org.junit.Assert.assertNotNull(population32);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        int int5 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        int int8 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor6);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        org.apache.commons.math3.genetics.Population population13 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str17 = elitisticListPopulation16.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        elitisticListPopulation16.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        org.apache.commons.math3.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation16.addChromosome(chromosome22);
        int int24 = elitisticListPopulation16.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation27.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome30 = null;
        elitisticListPopulation27.addChromosome(chromosome30);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor32 = elitisticListPopulation27.iterator();
        java.lang.String str33 = elitisticListPopulation27.toString();
        double double34 = elitisticListPopulation27.getElitismRate();
        elitisticListPopulation27.setPopulationLimit((int) (byte) 100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation16.setChromosomes(chromosomeList37);
        elitisticListPopulation2.setChromosomes(chromosomeList37);
        org.apache.commons.math3.genetics.Population population40 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[null]" + "'", str33, "[null]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList37);
        org.junit.Assert.assertNotNull(population40);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        double double7 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation10 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double11 = elitisticListPopulation10.getElitismRate();
        elitisticListPopulation10.setElitismRate(0.0d);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation10.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList14, (int) (byte) 100, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList14);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator8 = elitisticListPopulation2.spliterator();
        java.lang.String str9 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertNotNull(chromosomeSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(population11);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(1, 0.9d);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList14, (int) '#', (double) (short) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation18.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[null]" + "'", str11, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertNotNull(chromosomeItor13);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertNotNull(chromosomeList19);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str7 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        int int13 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int17 = elitisticListPopulation16.getPopulationLimit();
        java.lang.String str18 = elitisticListPopulation16.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation21.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = elitisticListPopulation21.getChromosomes();
        elitisticListPopulation16.setChromosomes(chromosomeList24);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int29 = elitisticListPopulation28.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation16.setChromosomes(chromosomeList30);
        java.lang.String str32 = elitisticListPopulation16.toString();
        org.apache.commons.math3.genetics.Population population33 = elitisticListPopulation16.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation36 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double37 = elitisticListPopulation36.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator38 = elitisticListPopulation36.spliterator();
        java.lang.String str39 = elitisticListPopulation36.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor40 = elitisticListPopulation36.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator41 = elitisticListPopulation36.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList42 = elitisticListPopulation36.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator43 = elitisticListPopulation36.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation46 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int47 = elitisticListPopulation46.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList48 = elitisticListPopulation46.getChromosomes();
        int int49 = elitisticListPopulation46.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList50 = elitisticListPopulation46.getChromosomes();
        elitisticListPopulation36.setChromosomes(chromosomeList50);
        elitisticListPopulation16.setChromosomes(chromosomeList50);
        org.apache.commons.math3.genetics.Population population53 = elitisticListPopulation16.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation56 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int57 = elitisticListPopulation56.getPopulationSize();
        org.apache.commons.math3.genetics.Population population58 = elitisticListPopulation56.nextGeneration();
        org.apache.commons.math3.genetics.Population population59 = elitisticListPopulation56.nextGeneration();
        double double60 = elitisticListPopulation56.getElitismRate();
        int int61 = elitisticListPopulation56.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList62 = elitisticListPopulation56.getChromosomes();
        elitisticListPopulation16.setChromosomes(chromosomeList62);
        elitisticListPopulation2.setChromosomes(chromosomeList62);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation67 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList62, 10, 1.0d);
        java.lang.String str68 = elitisticListPopulation67.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertNotNull(chromosomeList24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(chromosomeList30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertNotNull(population33);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor40);
        org.junit.Assert.assertNotNull(chromosomeSpliterator41);
        org.junit.Assert.assertNotNull(chromosomeList42);
        org.junit.Assert.assertNotNull(chromosomeSpliterator43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(chromosomeList48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(chromosomeList50);
        org.junit.Assert.assertNotNull(population53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(population58);
        org.junit.Assert.assertNotNull(population59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertNotNull(chromosomeList62);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[]" + "'", str68, "[]");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor4 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        double double6 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertNotNull(chromosomeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '#', (double) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setElitismRate((double) 1.0f);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(chromosomeItor6);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '#', (double) 0L);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.lang.Class<?> wildcardClass9 = chromosomeItor8.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (short) 1, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        double double9 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setElitismRate((double) 1);
        int int15 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor16 = elitisticListPopulation2.iterator();
        int int17 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(chromosomeItor16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        double double10 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator11 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Population population12 = elitisticListPopulation2.nextGeneration();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation2.getChromosomes();
        double double14 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator11);
        org.junit.Assert.assertNotNull(population12);
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation2.addChromosome(chromosome10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator3 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        double double6 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(chromosomeSpliterator3);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        double double6 = elitisticListPopulation2.getElitismRate();
        java.lang.String str7 = elitisticListPopulation2.toString();
        double double8 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double12 = elitisticListPopulation11.getElitismRate();
        java.lang.String str13 = elitisticListPopulation11.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int17 = elitisticListPopulation16.getPopulationLimit();
        int int18 = elitisticListPopulation16.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor19 = elitisticListPopulation16.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation16.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray21 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22, chromosomeArray21);
        elitisticListPopulation16.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList22);
        int int26 = elitisticListPopulation11.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor27 = elitisticListPopulation11.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome28 = null;
        elitisticListPopulation11.addChromosome(chromosome28);
        elitisticListPopulation11.setElitismRate(0.0d);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double35 = elitisticListPopulation34.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator36 = elitisticListPopulation34.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome37 = null;
        elitisticListPopulation34.addChromosome(chromosome37);
        elitisticListPopulation34.setElitismRate((double) 1L);
        java.lang.String str41 = elitisticListPopulation34.toString();
        elitisticListPopulation34.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation46 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int47 = elitisticListPopulation46.getPopulationLimit();
        java.lang.String str48 = elitisticListPopulation46.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation51 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation51.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList54 = elitisticListPopulation51.getChromosomes();
        elitisticListPopulation46.setChromosomes(chromosomeList54);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation58 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int59 = elitisticListPopulation58.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList60 = elitisticListPopulation58.getChromosomes();
        elitisticListPopulation46.setChromosomes(chromosomeList60);
        elitisticListPopulation34.setChromosomes(chromosomeList60);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList63 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation11.setChromosomes(chromosomeList63);
        elitisticListPopulation2.setChromosomes(chromosomeList63);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator66 = elitisticListPopulation2.spliterator();
        java.lang.String str67 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor19);
        org.junit.Assert.assertNotNull(chromosomeList20);
        org.junit.Assert.assertNotNull(chromosomeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor27);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[null]" + "'", str41, "[null]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertNotNull(chromosomeList54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(chromosomeList60);
        org.junit.Assert.assertNotNull(chromosomeList63);
        org.junit.Assert.assertNotNull(chromosomeSpliterator66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "[]" + "'", str67, "[]");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor6 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        double double9 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor6);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertNotNull(chromosomeList8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        java.lang.String str8 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double12 = elitisticListPopulation11.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator13 = elitisticListPopulation11.spliterator();
        java.lang.String str14 = elitisticListPopulation11.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor15 = elitisticListPopulation11.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation11.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation11.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList17, (int) 'a', (double) (byte) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int24 = elitisticListPopulation23.getPopulationLimit();
        int int25 = elitisticListPopulation23.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor26 = elitisticListPopulation23.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation23.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation20.setChromosomes(chromosomeList28);
        elitisticListPopulation2.setChromosomes(chromosomeList28);
        double double31 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(chromosomeItor15);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor26);
        org.junit.Assert.assertNotNull(chromosomeList27);
        org.junit.Assert.assertNotNull(chromosomeList28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, 100, (double) (byte) 1);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = chromosomeList10.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, 52, (double) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double22 = elitisticListPopulation21.getElitismRate();
        java.lang.String str23 = elitisticListPopulation21.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int27 = elitisticListPopulation26.getPopulationLimit();
        int int28 = elitisticListPopulation26.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor29 = elitisticListPopulation26.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation26.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray31 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList32 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32, chromosomeArray31);
        elitisticListPopulation26.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32);
        elitisticListPopulation21.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList32);
        int int36 = elitisticListPopulation21.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor37 = elitisticListPopulation21.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome38 = null;
        elitisticListPopulation21.addChromosome(chromosome38);
        elitisticListPopulation21.setElitismRate(0.0d);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation44 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double45 = elitisticListPopulation44.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator46 = elitisticListPopulation44.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome47 = null;
        elitisticListPopulation44.addChromosome(chromosome47);
        elitisticListPopulation44.setElitismRate((double) 1L);
        java.lang.String str51 = elitisticListPopulation44.toString();
        elitisticListPopulation44.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation56 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int57 = elitisticListPopulation56.getPopulationLimit();
        java.lang.String str58 = elitisticListPopulation56.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation61 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation61.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList64 = elitisticListPopulation61.getChromosomes();
        elitisticListPopulation56.setChromosomes(chromosomeList64);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation68 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int69 = elitisticListPopulation68.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList70 = elitisticListPopulation68.getChromosomes();
        elitisticListPopulation56.setChromosomes(chromosomeList70);
        elitisticListPopulation44.setChromosomes(chromosomeList70);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList73 = elitisticListPopulation44.getChromosomes();
        elitisticListPopulation21.setChromosomes(chromosomeList73);
        elitisticListPopulation18.setChromosomes(chromosomeList73);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator76 = elitisticListPopulation18.spliterator();
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor29);
        org.junit.Assert.assertNotNull(chromosomeList30);
        org.junit.Assert.assertNotNull(chromosomeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor37);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[null]" + "'", str51, "[null]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[]" + "'", str58, "[]");
        org.junit.Assert.assertNotNull(chromosomeList64);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(chromosomeList70);
        org.junit.Assert.assertNotNull(chromosomeList73);
        org.junit.Assert.assertNotNull(chromosomeSpliterator76);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        int int10 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator11 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        elitisticListPopulation2.setPopulationLimit((int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(chromosomeSpliterator11);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        java.lang.String str8 = elitisticListPopulation2.toString();
        java.lang.String str9 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList10, (int) (byte) -1, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: list of chromosomes bigger than maxPopulationSize");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList10);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        double double5 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit(0);
        java.lang.String str10 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation2.addChromosome(chromosome11);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 1);
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation2.addChromosome(chromosome16);
        java.lang.String str18 = elitisticListPopulation2.toString();
        java.lang.String str19 = elitisticListPopulation2.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[null]" + "'", str10, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[null, null, null]" + "'", str18, "[null, null, null]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[null, null, null]" + "'", str19, "[null, null, null]");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        double double8 = elitisticListPopulation2.getElitismRate();
        java.lang.String str9 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation2.addChromosome(chromosome10);
        java.lang.Class<?> wildcardClass12 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation2.getChromosomes();
        java.lang.Class<?> wildcardClass19 = chromosomeList18.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }
}


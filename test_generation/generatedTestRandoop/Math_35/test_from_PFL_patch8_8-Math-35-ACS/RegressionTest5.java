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
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        double double10 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int14 = elitisticListPopulation13.getPopulationSize();
        org.apache.commons.math3.genetics.Population population15 = elitisticListPopulation13.nextGeneration();
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation13.nextGeneration();
        double double17 = elitisticListPopulation13.getElitismRate();
        int int18 = elitisticListPopulation13.getPopulationLimit();
        java.lang.String str19 = elitisticListPopulation13.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int23 = elitisticListPopulation22.getPopulationLimit();
        java.lang.String str24 = elitisticListPopulation22.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation27.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation22.setChromosomes(chromosomeList30);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int35 = elitisticListPopulation34.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation22.setChromosomes(chromosomeList36);
        elitisticListPopulation13.setChromosomes(chromosomeList36);
        elitisticListPopulation2.setChromosomes(chromosomeList36);
        org.apache.commons.math3.genetics.Population population40 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation43 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int44 = elitisticListPopulation43.getPopulationSize();
        org.apache.commons.math3.genetics.Population population45 = elitisticListPopulation43.nextGeneration();
        org.apache.commons.math3.genetics.Population population46 = elitisticListPopulation43.nextGeneration();
        double double47 = elitisticListPopulation43.getElitismRate();
        int int48 = elitisticListPopulation43.getPopulationLimit();
        java.lang.String str49 = elitisticListPopulation43.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation52 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int53 = elitisticListPopulation52.getPopulationLimit();
        java.lang.String str54 = elitisticListPopulation52.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation57 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation57.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList60 = elitisticListPopulation57.getChromosomes();
        elitisticListPopulation52.setChromosomes(chromosomeList60);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation64 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int65 = elitisticListPopulation64.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList66 = elitisticListPopulation64.getChromosomes();
        elitisticListPopulation52.setChromosomes(chromosomeList66);
        elitisticListPopulation43.setChromosomes(chromosomeList66);
        elitisticListPopulation2.setChromosomes(chromosomeList66);
        java.lang.Class<?> wildcardClass70 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(population15);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertNotNull(chromosomeList30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertNotNull(population40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(population45);
        org.junit.Assert.assertNotNull(population46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[]" + "'", str49, "[]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[]" + "'", str54, "[]");
        org.junit.Assert.assertNotNull(chromosomeList60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(chromosomeList66);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str10 = elitisticListPopulation2.toString();
        double double11 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str7 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation2.getChromosomes();
        int int16 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
        int int18 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation22.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation27.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation22.setChromosomes(chromosomeList30);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList30, 100, (double) (byte) 1);
        elitisticListPopulation2.setChromosomes(chromosomeList30);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList30, (int) (short) 10, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: null out of [null, null] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertNotNull(chromosomeList30);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        int int6 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        elitisticListPopulation2.setElitismRate((double) 1.0f);
        double double11 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation2.addChromosome(chromosome12);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor14 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeItor14);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        java.lang.String str7 = elitisticListPopulation2.toString();
        int int8 = elitisticListPopulation2.getPopulationSize();
        int int9 = elitisticListPopulation2.getPopulationSize();
        int int10 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor11 = elitisticListPopulation2.iterator();
        java.lang.String str12 = elitisticListPopulation2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome13 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeList5);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray7 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList8, chromosomeArray7);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList8);
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation2.getChromosomes();
        int int14 = elitisticListPopulation2.getPopulationLimit();
        double double15 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population10 = elitisticListPopulation2.nextGeneration();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome11 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertNotNull(population10);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        int int6 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setElitismRate((double) 1);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor9 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor9);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        double double9 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int14 = elitisticListPopulation13.getPopulationLimit();
        int int15 = elitisticListPopulation13.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor16 = elitisticListPopulation13.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = elitisticListPopulation13.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray18 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19, chromosomeArray18);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList19);
        elitisticListPopulation13.setPopulationLimit((int) (byte) 100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList24);
        java.lang.String str26 = elitisticListPopulation2.toString();
        int int27 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor16);
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chromosomeList24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        java.lang.String str17 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation2.getChromosomes();
        java.lang.String str19 = elitisticListPopulation2.toString();
        java.lang.String str20 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertNotNull(chromosomeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', 0.0d);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = population4.spliterator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = elitisticListPopulation2.spliterator();
        int int6 = elitisticListPopulation2.getPopulationLimit();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator7 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation2.addChromosome(chromosome9);
        java.lang.String str11 = elitisticListPopulation2.toString();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(chromosomeSpliterator7);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[null]" + "'", str11, "[null]");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 100, (double) (byte) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList3 = elitisticListPopulation2.getChromosomes();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setElitismRate(1.0d);
        org.junit.Assert.assertNotNull(chromosomeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeList5);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = elitisticListPopulation2.spliterator();
        int int6 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.lang.String str8 = elitisticListPopulation2.toString();
        java.lang.String str9 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 0);
        elitisticListPopulation2.setPopulationLimit(10);
        elitisticListPopulation2.setElitismRate((double) 1);
        elitisticListPopulation2.setPopulationLimit(97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        double double10 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int14 = elitisticListPopulation13.getPopulationSize();
        org.apache.commons.math3.genetics.Population population15 = elitisticListPopulation13.nextGeneration();
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation13.nextGeneration();
        double double17 = elitisticListPopulation13.getElitismRate();
        int int18 = elitisticListPopulation13.getPopulationLimit();
        java.lang.String str19 = elitisticListPopulation13.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int23 = elitisticListPopulation22.getPopulationLimit();
        java.lang.String str24 = elitisticListPopulation22.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation27.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation22.setChromosomes(chromosomeList30);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int35 = elitisticListPopulation34.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation22.setChromosomes(chromosomeList36);
        elitisticListPopulation13.setChromosomes(chromosomeList36);
        elitisticListPopulation2.setChromosomes(chromosomeList36);
        elitisticListPopulation2.setPopulationLimit(100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList42 = elitisticListPopulation2.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator43 = chromosomeList42.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(population15);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertNotNull(chromosomeList30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertNotNull(chromosomeList42);
        org.junit.Assert.assertNotNull(chromosomeSpliterator43);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) (short) 10);
        org.apache.commons.math3.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation2.addChromosome(chromosome11);
        org.apache.commons.math3.genetics.Population population13 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor14 = elitisticListPopulation2.iterator();
        java.lang.String str15 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int19 = elitisticListPopulation18.getPopulationLimit();
        java.lang.String str20 = elitisticListPopulation18.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation23.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation23.getChromosomes();
        elitisticListPopulation18.setChromosomes(chromosomeList26);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation30 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int31 = elitisticListPopulation30.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList32 = elitisticListPopulation30.getChromosomes();
        elitisticListPopulation18.setChromosomes(chromosomeList32);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator34 = elitisticListPopulation18.spliterator();
        elitisticListPopulation18.setPopulationLimit((int) (byte) 1);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList37);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(chromosomeItor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[null]" + "'", str15, "[null]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(chromosomeList32);
        org.junit.Assert.assertNotNull(chromosomeSpliterator34);
        org.junit.Assert.assertNotNull(chromosomeList37);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        int int12 = elitisticListPopulation2.getPopulationLimit();
        int int13 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        elitisticListPopulation2.setPopulationLimit((int) (byte) 10);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation2.iterator();
        int int13 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.lang.String str9 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.lang.String str12 = elitisticListPopulation2.toString();
        double double13 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator14 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[null]" + "'", str12, "[null]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        java.lang.String str11 = elitisticListPopulation2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation9 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int10 = elitisticListPopulation9.getPopulationLimit();
        int int11 = elitisticListPopulation9.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation9.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation9.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray14 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15, chromosomeArray14);
        elitisticListPopulation9.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = chromosomeList15.spliterator();
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList15);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator20 = elitisticListPopulation2.spliterator();
        int int21 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertNotNull(chromosomeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
        org.junit.Assert.assertNotNull(chromosomeSpliterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(chromosomeList22);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome8 = null;
        elitisticListPopulation2.addChromosome(chromosome8);
        double double10 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(population11);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        elitisticListPopulation2.setElitismRate((double) 1);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double15 = elitisticListPopulation14.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator16 = elitisticListPopulation14.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation14.addChromosome(chromosome17);
        elitisticListPopulation14.setElitismRate((double) 1L);
        org.apache.commons.math3.genetics.Population population21 = elitisticListPopulation14.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int25 = elitisticListPopulation24.getPopulationLimit();
        int int26 = elitisticListPopulation24.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor27 = elitisticListPopulation24.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = elitisticListPopulation24.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray29 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList30, chromosomeArray29);
        elitisticListPopulation24.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList30);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator33 = chromosomeList30.spliterator();
        elitisticListPopulation14.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList30);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList30);
        int int36 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation39 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double40 = elitisticListPopulation39.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator41 = elitisticListPopulation39.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome42 = null;
        elitisticListPopulation39.addChromosome(chromosome42);
        elitisticListPopulation39.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList46 = elitisticListPopulation39.getChromosomes();
        int int47 = elitisticListPopulation39.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation50 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int51 = elitisticListPopulation50.getPopulationSize();
        org.apache.commons.math3.genetics.Population population52 = elitisticListPopulation50.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator53 = elitisticListPopulation50.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList54 = elitisticListPopulation50.getChromosomes();
        elitisticListPopulation39.setChromosomes(chromosomeList54);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList56 = elitisticListPopulation39.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList56);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation60 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList56, 52, 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator16);
        org.junit.Assert.assertNotNull(population21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor27);
        org.junit.Assert.assertNotNull(chromosomeList28);
        org.junit.Assert.assertNotNull(chromosomeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(chromosomeSpliterator33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator41);
        org.junit.Assert.assertNotNull(chromosomeList46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(population52);
        org.junit.Assert.assertNotNull(chromosomeSpliterator53);
        org.junit.Assert.assertNotNull(chromosomeList54);
        org.junit.Assert.assertNotNull(chromosomeList56);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        int int10 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation2.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertNotNull(chromosomeList12);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        double double10 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int14 = elitisticListPopulation13.getPopulationSize();
        org.apache.commons.math3.genetics.Population population15 = elitisticListPopulation13.nextGeneration();
        org.apache.commons.math3.genetics.Population population16 = elitisticListPopulation13.nextGeneration();
        double double17 = elitisticListPopulation13.getElitismRate();
        int int18 = elitisticListPopulation13.getPopulationLimit();
        java.lang.String str19 = elitisticListPopulation13.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation22 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int23 = elitisticListPopulation22.getPopulationLimit();
        java.lang.String str24 = elitisticListPopulation22.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation27.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation22.setChromosomes(chromosomeList30);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int35 = elitisticListPopulation34.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation22.setChromosomes(chromosomeList36);
        elitisticListPopulation13.setChromosomes(chromosomeList36);
        elitisticListPopulation2.setChromosomes(chromosomeList36);
        elitisticListPopulation2.setPopulationLimit(100);
        org.apache.commons.math3.genetics.Chromosome chromosome42 = null;
        elitisticListPopulation2.addChromosome(chromosome42);
        elitisticListPopulation2.setElitismRate((double) 1);
        int int46 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(population15);
        org.junit.Assert.assertNotNull(population16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertNotNull(chromosomeList30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = elitisticListPopulation2.spliterator();
        java.lang.String str6 = elitisticListPopulation2.toString();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        double double8 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int12 = elitisticListPopulation11.getPopulationLimit();
        int int13 = elitisticListPopulation11.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor14 = elitisticListPopulation11.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation11.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray16 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList17 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17, chromosomeArray16);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList17);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation11.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList20);
        int int22 = elitisticListPopulation2.getPopulationLimit();
        double double23 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor14);
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertNotNull(chromosomeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(chromosomeList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double double6 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        int int9 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation2.addChromosome(chromosome10);
        int int12 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        java.lang.String str28 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population29 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 100);
        java.lang.String str32 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(chromosomeItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertNotNull(population29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation6 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str7 = elitisticListPopulation6.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray8 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9, chromosomeArray8);
        elitisticListPopulation6.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList9);
        elitisticListPopulation2.setPopulationLimit(100);
        int int15 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int19 = elitisticListPopulation18.getPopulationSize();
        org.apache.commons.math3.genetics.Population population20 = elitisticListPopulation18.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation23 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation23.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor26 = elitisticListPopulation23.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation29 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation29.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation34 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation34.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList37 = elitisticListPopulation34.getChromosomes();
        elitisticListPopulation29.setChromosomes(chromosomeList37);
        elitisticListPopulation23.setChromosomes(chromosomeList37);
        elitisticListPopulation18.setChromosomes(chromosomeList37);
        elitisticListPopulation2.setChromosomes(chromosomeList37);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList42 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor45 = elitisticListPopulation2.iterator();
        java.lang.String str46 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(population20);
        org.junit.Assert.assertNotNull(chromosomeItor26);
        org.junit.Assert.assertNotNull(chromosomeList37);
        org.junit.Assert.assertNotNull(chromosomeList42);
        org.junit.Assert.assertNotNull(chromosomeItor45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[]" + "'", str46, "[]");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation7.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation13.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation18.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation13.setChromosomes(chromosomeList21);
        elitisticListPopulation7.setChromosomes(chromosomeList21);
        elitisticListPopulation2.setChromosomes(chromosomeList21);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator25 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor26 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertNotNull(chromosomeSpliterator25);
        org.junit.Assert.assertNotNull(chromosomeItor26);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', (double) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int6 = elitisticListPopulation5.getPopulationLimit();
        int int7 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor8 = elitisticListPopulation5.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation5.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray10 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, chromosomeArray10);
        elitisticListPopulation5.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation5.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList16);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList16, (int) (short) 100, (double) 1.0f);
        org.apache.commons.math3.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation20.addChromosome(chromosome21);
        double double23 = elitisticListPopulation20.getElitismRate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor8);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertNotNull(chromosomeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        double double11 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator12 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int16 = elitisticListPopulation15.getPopulationLimit();
        java.lang.String str17 = elitisticListPopulation15.toString();
        int int18 = elitisticListPopulation15.getPopulationSize();
        int int19 = elitisticListPopulation15.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation15.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList21);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList23 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chromosomeList20);
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertNotNull(chromosomeList23);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        int int5 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        double double8 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator9 = elitisticListPopulation2.spliterator();
        elitisticListPopulation2.setPopulationLimit(0);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator9);
        org.junit.Assert.assertNotNull(chromosomeList12);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) (short) 10);
        org.apache.commons.math3.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation2.addChromosome(chromosome11);
        java.lang.String str13 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population14 = elitisticListPopulation2.nextGeneration();
        java.lang.String str15 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome chromosome16 = null;
        elitisticListPopulation2.addChromosome(chromosome16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[null]" + "'", str13, "[null]");
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[null]" + "'", str15, "[null]");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        int int6 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate((double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (100)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(32, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: null out of [null, null] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) '4', (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: null out of [null, null] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str5 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        double double7 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        java.lang.String str10 = elitisticListPopulation2.toString();
        java.lang.String str11 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        org.apache.commons.math3.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation2.addChromosome(chromosome14);
        int int16 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit((int) (short) 100);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation21 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation21.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor24 = elitisticListPopulation21.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation27.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation32.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = elitisticListPopulation32.getChromosomes();
        elitisticListPopulation27.setChromosomes(chromosomeList35);
        elitisticListPopulation21.setChromosomes(chromosomeList35);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator38 = chromosomeList35.spliterator();
        elitisticListPopulation2.setChromosomes(chromosomeList35);
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor24);
        org.junit.Assert.assertNotNull(chromosomeList35);
        org.junit.Assert.assertNotNull(chromosomeSpliterator38);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList9, (int) '#', (double) 0.0f);
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation12.addChromosome(chromosome13);
        org.apache.commons.math3.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation12.addChromosome(chromosome15);
        org.apache.commons.math3.genetics.Chromosome chromosome17 = null;
        elitisticListPopulation12.addChromosome(chromosome17);
        int int19 = elitisticListPopulation12.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        double double4 = elitisticListPopulation2.getElitismRate();
        java.lang.String str5 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray7 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList8, chromosomeArray7);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList8);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList11, 97, (double) (byte) 0);
        int int15 = elitisticListPopulation14.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, (double) (byte) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation5 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double6 = elitisticListPopulation5.getElitismRate();
        java.lang.String str7 = elitisticListPopulation5.toString();
        int int8 = elitisticListPopulation5.getPopulationLimit();
        elitisticListPopulation5.setPopulationLimit((int) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor11 = elitisticListPopulation5.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation14.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation14.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation20 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation20.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation25 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation25.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList28 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation20.setChromosomes(chromosomeList28);
        elitisticListPopulation14.setChromosomes(chromosomeList28);
        elitisticListPopulation5.setChromosomes(chromosomeList28);
        elitisticListPopulation2.setChromosomes(chromosomeList28);
        elitisticListPopulation2.setPopulationLimit((-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor11);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertNotNull(chromosomeList28);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        double double9 = elitisticListPopulation2.getElitismRate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        int int5 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList8 = elitisticListPopulation2.getChromosomes();
        int int9 = elitisticListPopulation2.getPopulationSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome10 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chromosomeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        double double14 = elitisticListPopulation13.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str18 = elitisticListPopulation17.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray19 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20, chromosomeArray19);
        elitisticListPopulation17.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList20);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation26 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation26.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome29 = null;
        elitisticListPopulation26.addChromosome(chromosome29);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor31 = elitisticListPopulation26.iterator();
        int int32 = elitisticListPopulation26.getPopulationLimit();
        double double33 = elitisticListPopulation26.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray34 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList35 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35, chromosomeArray34);
        elitisticListPopulation26.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35);
        elitisticListPopulation13.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList35);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList40 = elitisticListPopulation2.getChromosomes();
        java.lang.Class<?> wildcardClass41 = elitisticListPopulation2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chromosomeItor31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(chromosomeList40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        int int7 = elitisticListPopulation2.getPopulationLimit();
        elitisticListPopulation2.setPopulationLimit(0);
        elitisticListPopulation2.setPopulationLimit((int) '4');
        elitisticListPopulation2.setPopulationLimit(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 10, (double) (short) 0);
        int int3 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setPopulationLimit(0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation8 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation8.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome11 = null;
        elitisticListPopulation8.addChromosome(chromosome11);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor13 = elitisticListPopulation8.iterator();
        int int14 = elitisticListPopulation8.getPopulationLimit();
        double double15 = elitisticListPopulation8.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation8.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int20 = elitisticListPopulation19.getPopulationLimit();
        int int21 = elitisticListPopulation19.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor22 = elitisticListPopulation19.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList23 = elitisticListPopulation19.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray24 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25, chromosomeArray24);
        elitisticListPopulation19.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList25);
        elitisticListPopulation19.setPopulationLimit((int) (byte) 100);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation8.setChromosomes(chromosomeList30);
        elitisticListPopulation2.setChromosomes(chromosomeList30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor22);
        org.junit.Assert.assertNotNull(chromosomeList23);
        org.junit.Assert.assertNotNull(chromosomeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(chromosomeList30);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        int int6 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Chromosome chromosome7 = null;
        elitisticListPopulation2.addChromosome(chromosome7);
        elitisticListPopulation2.setElitismRate((double) 1.0f);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor11 = elitisticListPopulation2.iterator();
        elitisticListPopulation2.setPopulationLimit((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(chromosomeItor11);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.lang.String str7 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation2.iterator();
        java.lang.String str11 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList12 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Population population15 = elitisticListPopulation2.nextGeneration();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: population limit has to be positive");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[null]" + "'", str7, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[null]" + "'", str11, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList12);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 100, (double) 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: null out of [null, null] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        int int4 = elitisticListPopulation2.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList6 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setPopulationLimit((int) 'a');
        java.lang.String str13 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double17 = elitisticListPopulation16.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator18 = elitisticListPopulation16.spliterator();
        java.lang.String str19 = elitisticListPopulation16.toString();
        int int20 = elitisticListPopulation16.getPopulationLimit();
        int int21 = elitisticListPopulation16.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList22 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList22);
        java.lang.String str24 = elitisticListPopulation2.toString();
        java.lang.String str25 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int29 = elitisticListPopulation28.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList30 = elitisticListPopulation28.getChromosomes();
        int int31 = elitisticListPopulation28.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome32 = null;
        elitisticListPopulation28.addChromosome(chromosome32);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList34);
        java.lang.Class<?> wildcardClass36 = chromosomeList34.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(chromosomeList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(chromosomeList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(chromosomeList34);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str9 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator10 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation13 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int14 = elitisticListPopulation13.getPopulationLimit();
        java.lang.String str15 = elitisticListPopulation13.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation18 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation18.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation18.getChromosomes();
        elitisticListPopulation13.setChromosomes(chromosomeList21);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList23 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList23);
        int int25 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int29 = elitisticListPopulation28.getPopulationLimit();
        java.lang.String str30 = elitisticListPopulation28.toString();
        int int31 = elitisticListPopulation28.getPopulationSize();
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
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor57 = elitisticListPopulation34.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor58 = elitisticListPopulation34.iterator();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation61 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int62 = elitisticListPopulation61.getPopulationSize();
        org.apache.commons.math3.genetics.Population population63 = elitisticListPopulation61.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator64 = elitisticListPopulation61.spliterator();
        int int65 = elitisticListPopulation61.getPopulationSize();
        org.apache.commons.math3.genetics.Population population66 = elitisticListPopulation61.nextGeneration();
        java.lang.String str67 = elitisticListPopulation61.toString();
        java.lang.String str68 = elitisticListPopulation61.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList69 = elitisticListPopulation61.getChromosomes();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator70 = chromosomeList69.spliterator();
        elitisticListPopulation34.setChromosomes(chromosomeList69);
        elitisticListPopulation28.setChromosomes(chromosomeList69);
        elitisticListPopulation2.setChromosomes(chromosomeList69);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertNotNull(chromosomeList23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor37);
        org.junit.Assert.assertNotNull(chromosomeList38);
        org.junit.Assert.assertNotNull(chromosomeList51);
        org.junit.Assert.assertNotNull(chromosomeItor57);
        org.junit.Assert.assertNotNull(chromosomeItor58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(population63);
        org.junit.Assert.assertNotNull(chromosomeSpliterator64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(population66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "[]" + "'", str67, "[]");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[]" + "'", str68, "[]");
        org.junit.Assert.assertNotNull(chromosomeList69);
        org.junit.Assert.assertNotNull(chromosomeSpliterator70);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.lang.String str9 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.lang.String str12 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation16 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation16.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome19 = null;
        elitisticListPopulation16.addChromosome(chromosome19);
        java.lang.String str21 = elitisticListPopulation16.toString();
        elitisticListPopulation16.setPopulationLimit((int) (byte) -1);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor24 = elitisticListPopulation16.iterator();
        java.lang.String str25 = elitisticListPopulation16.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList26 = elitisticListPopulation16.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList27 = elitisticListPopulation16.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList27);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor29 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population30 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setElitismRate(0.0d);
        int int33 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome34 = null;
        elitisticListPopulation2.addChromosome(chromosome34);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[null]" + "'", str12, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[null]" + "'", str21, "[null]");
        org.junit.Assert.assertNotNull(chromosomeItor24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[null]" + "'", str25, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList26);
        org.junit.Assert.assertNotNull(chromosomeList27);
        org.junit.Assert.assertNotNull(chromosomeItor29);
        org.junit.Assert.assertNotNull(population30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population5 = elitisticListPopulation2.nextGeneration();
        double double6 = elitisticListPopulation2.getElitismRate();
        java.lang.String str7 = elitisticListPopulation2.toString();
        java.lang.String str8 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation11 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double12 = elitisticListPopulation11.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str16 = elitisticListPopulation15.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray17 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18, chromosomeArray17);
        elitisticListPopulation15.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        elitisticListPopulation11.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList18);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList23 = elitisticListPopulation2.getChromosomes();
        int int24 = elitisticListPopulation2.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Population population26 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(chromosomeList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(chromosomeList25);
        org.junit.Assert.assertNotNull(population26);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation7 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation7.setPopulationLimit((int) ' ');
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList10);
        double double12 = elitisticListPopulation2.getElitismRate();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList13 = elitisticListPopulation2.getChromosomes();
        java.lang.String str14 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation2.getChromosomes();
        int int16 = elitisticListPopulation2.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        int int5 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        double double8 = elitisticListPopulation2.getElitismRate();
        java.lang.String str9 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList10);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) (byte) 1, (double) (short) 0);
        int int3 = elitisticListPopulation2.getPopulationSize();
        double double4 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        int int6 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setPopulationLimit((int) (byte) 10);
        int int11 = elitisticListPopulation2.getPopulationSize();
        int int12 = elitisticListPopulation2.getPopulationLimit();
        int int13 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor5 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.lang.String str7 = elitisticListPopulation2.toString();
        int int8 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str9 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator10 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation14 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation14.setElitismRate((double) (short) 0);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor17 = elitisticListPopulation14.iterator();
        double double18 = elitisticListPopulation14.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator19 = elitisticListPopulation14.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList20 = elitisticListPopulation14.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList20);
        org.apache.commons.math3.genetics.Chromosome chromosome22 = null;
        elitisticListPopulation2.addChromosome(chromosome22);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator10);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(chromosomeItor17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator19);
        org.junit.Assert.assertNotNull(chromosomeList20);
    }
}


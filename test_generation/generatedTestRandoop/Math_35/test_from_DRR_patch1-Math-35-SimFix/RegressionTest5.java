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
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation19 = new org.apache.commons.math3.genetics.ElitisticListPopulation((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList13, 32, (double) (short) 0);
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
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = elitisticListPopulation2.spliterator();
        int int6 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        java.lang.String str8 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population9 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor10 = elitisticListPopulation2.iterator();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator11 = elitisticListPopulation2.spliterator();
        double double12 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.Chromosome chromosome13 = null;
        elitisticListPopulation2.addChromosome(chromosome13);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList15 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setElitismRate((double) (short) 1);
        int int18 = elitisticListPopulation2.getPopulationLimit();
        org.apache.commons.math3.genetics.Population population19 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator20 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(population9);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeSpliterator11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(population19);
        org.junit.Assert.assertNotNull(chromosomeSpliterator20);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str4 = elitisticListPopulation2.toString();
        int int5 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator6 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList7 = elitisticListPopulation2.getChromosomes();
        int int8 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setElitismRate((double) 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator6);
        org.junit.Assert.assertNotNull(chromosomeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation27 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double28 = elitisticListPopulation27.getElitismRate();
        java.lang.String str29 = elitisticListPopulation27.toString();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation32 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int33 = elitisticListPopulation32.getPopulationLimit();
        int int34 = elitisticListPopulation32.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor35 = elitisticListPopulation32.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList36 = elitisticListPopulation32.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray37 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList38 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38, chromosomeArray37);
        elitisticListPopulation32.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        elitisticListPopulation27.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList38);
        elitisticListPopulation27.setPopulationLimit((int) (byte) 10);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor44 = elitisticListPopulation27.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList45 = elitisticListPopulation27.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList45);
        org.apache.commons.math3.genetics.Population population47 = elitisticListPopulation2.nextGeneration();
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeItor10);
        org.junit.Assert.assertNotNull(chromosomeList21);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor35);
        org.junit.Assert.assertNotNull(chromosomeList36);
        org.junit.Assert.assertNotNull(chromosomeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(chromosomeItor44);
        org.junit.Assert.assertNotNull(chromosomeList45);
        org.junit.Assert.assertNotNull(population47);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.lang.String str5 = elitisticListPopulation2.toString();
        double double6 = elitisticListPopulation2.getElitismRate();
        int int7 = elitisticListPopulation2.getPopulationSize();
        elitisticListPopulation2.setElitismRate((double) 0.0f);
        org.apache.commons.math3.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation2.addChromosome(chromosome10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double3 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        elitisticListPopulation2.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList9 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation12 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double13 = elitisticListPopulation12.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator14 = elitisticListPopulation12.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation12.addChromosome(chromosome15);
        elitisticListPopulation12.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation12.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList19);
        java.lang.String str21 = elitisticListPopulation2.toString();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator22 = elitisticListPopulation2.spliterator();
        org.apache.commons.math3.genetics.Population population23 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeList9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator14);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[null]" + "'", str21, "[null]");
        org.junit.Assert.assertNotNull(chromosomeSpliterator22);
        org.junit.Assert.assertNotNull(population23);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
            org.apache.commons.math3.genetics.Chromosome chromosome36 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        double double12 = elitisticListPopulation2.getElitismRate();
        elitisticListPopulation2.setPopulationLimit((-1));
        double double15 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chromosomeList11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        elitisticListPopulation2.setElitismRate(0.0d);
        org.apache.commons.math3.genetics.Population population21 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator22 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chromosomeList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(population21);
        org.junit.Assert.assertNotNull(chromosomeSpliterator22);
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
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray10 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11, chromosomeArray10);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList11);
        org.apache.commons.math3.genetics.Chromosome chromosome14 = null;
        elitisticListPopulation2.addChromosome(chromosome14);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList16 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosomeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chromosomeList16);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        double double12 = elitisticListPopulation2.getElitismRate();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation15 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int16 = elitisticListPopulation15.getPopulationLimit();
        int int17 = elitisticListPopulation15.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor18 = elitisticListPopulation15.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList19 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation15.setPopulationLimit((int) (byte) -1);
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator22 = elitisticListPopulation15.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList23 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList23);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList25 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor18);
        org.junit.Assert.assertNotNull(chromosomeList19);
        org.junit.Assert.assertNotNull(chromosomeSpliterator22);
        org.junit.Assert.assertNotNull(chromosomeList23);
        org.junit.Assert.assertNotNull(chromosomeList25);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList18 = elitisticListPopulation2.getChromosomes();
        double double19 = elitisticListPopulation2.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator20 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList21 = elitisticListPopulation2.getChromosomes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation24 = new org.apache.commons.math3.genetics.ElitisticListPopulation(chromosomeList21, 2, (double) (short) -1);
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
        org.junit.Assert.assertNotNull(chromosomeList17);
        org.junit.Assert.assertNotNull(chromosomeList18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator20);
        org.junit.Assert.assertNotNull(chromosomeList21);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Chromosome[] chromosomeArray4 = new org.apache.commons.math3.genetics.Chromosome[] {};
        java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = new java.util.ArrayList<org.apache.commons.math3.genetics.Chromosome>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5, chromosomeArray4);
        elitisticListPopulation2.setChromosomes((java.util.List<org.apache.commons.math3.genetics.Chromosome>) chromosomeList5);
        org.apache.commons.math3.genetics.Population population8 = elitisticListPopulation2.nextGeneration();
        int int9 = elitisticListPopulation2.getPopulationLimit();
        java.lang.String str10 = elitisticListPopulation2.toString();
        int int11 = elitisticListPopulation2.getPopulationSize();
        int int12 = elitisticListPopulation2.getPopulationLimit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(chromosomeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator4 = elitisticListPopulation2.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList5 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.apache.commons.math3.genetics.Population population7 = elitisticListPopulation2.nextGeneration();
        int int8 = elitisticListPopulation2.getPopulationSize();
        java.lang.String str9 = elitisticListPopulation2.toString();
        int int10 = elitisticListPopulation2.getPopulationLimit();
        int int11 = elitisticListPopulation2.getPopulationSize();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator12 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator4);
        org.junit.Assert.assertNotNull(chromosomeList5);
        org.junit.Assert.assertNotNull(population6);
        org.junit.Assert.assertNotNull(population7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chromosomeSpliterator12);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(32, (double) (byte) 0);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int3 = elitisticListPopulation2.getPopulationSize();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList4 = elitisticListPopulation2.getChromosomes();
        int int5 = elitisticListPopulation2.getPopulationSize();
        org.apache.commons.math3.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation2.addChromosome(chromosome6);
        double double8 = elitisticListPopulation2.getElitismRate();
        java.lang.String str9 = elitisticListPopulation2.toString();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList10 = elitisticListPopulation2.getChromosomes();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList11 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation2.addChromosome(chromosome12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(chromosomeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[null]" + "'", str9, "[null]");
        org.junit.Assert.assertNotNull(chromosomeList10);
        org.junit.Assert.assertNotNull(chromosomeList11);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.genetics.Chromosome chromosome11 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor14 = elitisticListPopulation2.iterator();
        java.lang.String str15 = elitisticListPopulation2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor5);
        org.junit.Assert.assertNotNull(chromosomeList6);
        org.junit.Assert.assertNotNull(chromosomeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chromosomeList13);
        org.junit.Assert.assertNotNull(chromosomeItor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList14 = elitisticListPopulation2.getChromosomes();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation17 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        double double18 = elitisticListPopulation17.getElitismRate();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator19 = elitisticListPopulation17.spliterator();
        org.apache.commons.math3.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation17.addChromosome(chromosome20);
        elitisticListPopulation17.setElitismRate((double) 1L);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList24 = elitisticListPopulation17.getChromosomes();
        int int25 = elitisticListPopulation17.getPopulationLimit();
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation28 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int29 = elitisticListPopulation28.getPopulationSize();
        org.apache.commons.math3.genetics.Population population30 = elitisticListPopulation28.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator31 = elitisticListPopulation28.spliterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList32 = elitisticListPopulation28.getChromosomes();
        elitisticListPopulation17.setChromosomes(chromosomeList32);
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList34 = elitisticListPopulation17.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList34);
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation38 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        int int39 = elitisticListPopulation38.getPopulationLimit();
        int int40 = elitisticListPopulation38.getPopulationSize();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor41 = elitisticListPopulation38.iterator();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList42 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation38.setPopulationLimit((int) (byte) -1);
        int int45 = elitisticListPopulation38.getPopulationLimit();
        java.util.List<org.apache.commons.math3.genetics.Chromosome> chromosomeList46 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation2.setChromosomes(chromosomeList46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeList14);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(chromosomeSpliterator19);
        org.junit.Assert.assertNotNull(chromosomeList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(population30);
        org.junit.Assert.assertNotNull(chromosomeSpliterator31);
        org.junit.Assert.assertNotNull(chromosomeList32);
        org.junit.Assert.assertNotNull(chromosomeList34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(chromosomeItor41);
        org.junit.Assert.assertNotNull(chromosomeList42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(chromosomeList46);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation(10, (double) (short) 1);
        elitisticListPopulation2.setElitismRate((double) (short) 0);
        org.apache.commons.math3.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor7 = elitisticListPopulation2.iterator();
        java.lang.String str8 = elitisticListPopulation2.toString();
        elitisticListPopulation2.setPopulationLimit((int) '4');
        org.apache.commons.math3.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor12 = elitisticListPopulation2.iterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor13 = elitisticListPopulation2.iterator();
        org.apache.commons.math3.genetics.Population population14 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator15 = elitisticListPopulation2.spliterator();
        java.util.Iterator<org.apache.commons.math3.genetics.Chromosome> chromosomeItor16 = elitisticListPopulation2.iterator();
        int int17 = elitisticListPopulation2.getPopulationSize();
        int int18 = elitisticListPopulation2.getPopulationLimit();
        // The following exception was thrown during execution in test generation
        try {
            elitisticListPopulation2.setElitismRate(10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chromosomeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[null]" + "'", str8, "[null]");
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(chromosomeItor12);
        org.junit.Assert.assertNotNull(chromosomeItor13);
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertNotNull(chromosomeSpliterator15);
        org.junit.Assert.assertNotNull(chromosomeItor16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
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
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
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
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: elitism rate (10)");
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
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math3.genetics.ElitisticListPopulation elitisticListPopulation2 = new org.apache.commons.math3.genetics.ElitisticListPopulation((int) ' ', 0.0d);
        java.lang.String str3 = elitisticListPopulation2.toString();
        org.apache.commons.math3.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        java.util.Spliterator<org.apache.commons.math3.genetics.Chromosome> chromosomeSpliterator5 = population4.spliterator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(chromosomeSpliterator5);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertNotNull(population5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
}


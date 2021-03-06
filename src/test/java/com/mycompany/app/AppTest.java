package com.mycompany.app;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */

    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().search(array, 4));
    }

    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array, 5));
    }

    public void testEmptyArrayList() {
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(new App().search(array, 1));
    }

    public void testNull() {
      assertFalse(new App().search(null, 1));
    }

    public static void shouldDoNothingWithOneElementArray() {
        boolean m = true;
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(null));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(null));
        if(array.size()<=1 || array2.size()<=1)
            m= false;

        assertEquals(true, m);
    }
   /* public static void testEqualArraysLength() {
         boolean m = true;
         ArrayList<Integer> array = new ArrayList<>(Arrays.asList(null));
         ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(null));
         if(array.size() != array2.size())
             m= false;
        int i = 0;
        if(m == false){
             i =1;
        }
        assertEquals(1,i);

    }

      public void testNotEqualNull() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(null));
        boolean m = true;
        boolean m2 = true;
        if(array==null){
          m = false;
        }
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(null));
        if(array2 == null){
            m2 = false;
        }
        boolean m3 = m&&m2;
        int i = 0;
        if(m3 == false)
            i =1;
        assertEquals(1,i);
    }
*/
    public void IsTrueResultBubbleSort(){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(null));
        boolean m = true;
        for(int i = 0;i<array.size()-1;i++){
            if(array.get(i)>array.get(i+1) )
                m = false;
        }
        assertEquals(true, m );
    }


}

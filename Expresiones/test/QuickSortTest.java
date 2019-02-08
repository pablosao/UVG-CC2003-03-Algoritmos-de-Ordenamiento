/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrea
 */
public class QuickSortTest {
    
    public QuickSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of partition method, of class QuickSort.
     */
    @Test
    public void testPartition() {
        System.out.println("partition");
        int[] arr = null;
        int low = 0;
        int high = 0;
        QuickSort instance = new QuickSort();
        int expResult = 0;
        int result = instance.partition(arr, low, high);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sort method, of class QuickSort.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        int[] arr = null;
        int low = 0;
        int high = 0;
        QuickSort instance = new QuickSort();
        instance.sort(arr, low, high);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printArray method, of class QuickSort.
     */
    @Test
    public void testPrintArray() {
        System.out.println("printArray");
        int[] arr = null;
        QuickSort.printArray(arr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

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
public class BurbujaSortTest {
    
    public BurbujaSortTest() {
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
     * Test of burbuja method, of class BurbujaSort.
     */
    @Test
    public void testBurbuja() {
        System.out.println("burbuja");
        int[] A = {1,1000,90,560};
        BurbujaSort instance = new BurbujaSort();
        int[] expResult = {1,90,560,1000};
        int[] result = instance.burbuja(A);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}

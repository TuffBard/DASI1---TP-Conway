/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conway;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class ConwayTest {
    
    public ConwayTest() {
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
     * Test of main method, of class Conway.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Conway.main(args);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNext method, of class Conway.
     */
    @Test
    public void testGetNextSimple() {
        String term = "1121";
        String expResult = "211211";
        String result = Conway.getNext(term);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetNextOne() {
        String term = "1";
        String expResult = "11";
        String result = Conway.getNext(term);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetNext() {
        String term = "";
        String expResult = null;
        String result = Conway.getNext(term);
        assertEquals(expResult, result);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Patrik Rojek
 */
public class SideEffectsTest {
    
    private SideEffects instance;
    
    public SideEffectsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new SideEffects("sideEffectTest", 10);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMeddra_pt method, of class SideEffects.
     */
    @Test
    public void testGetMeddra_pt() {
        String result = instance.getMeddra_pt();
        assertEquals("sideEffectTest",result);
    }

    /**
     * Test of setMeddra_pt method, of class SideEffects.
     */
    @Test
    public void testSetMeddra_pt() {
        instance.setMeddra_pt("sideEffectTest2");
        String result = instance.getMeddra_pt();
        assertEquals("sideEffectTest2",result);
    }

    /**
     * Test of getQuantity method, of class SideEffects.
     */
    @Test
    public void testGetQuantity() {
        int result = instance.getQuantity();
        assertTrue(10 == result);
    }

    /**
     * Test of setQuantity method, of class SideEffects.
     */
    @Test
    public void testSetQuantity() {
        instance.setQuantity(20);
        int result = instance.getQuantity();
        assertTrue(20 == result);
    }
    
}

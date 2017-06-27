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
public class PreferredDrugsTest {
    
    private PreferredDrugs instance;
    
    public PreferredDrugsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new PreferredDrugs("test1",1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBrand_name method, of class PreferredDrugs.
     */
    @Test
    public void testGetBrand_name() {
        String result = instance.getBrand_name();
        assertEquals("test1",result);
    }

    /**
     * Test of setBrand_name method, of class PreferredDrugs.
     */
    @Test
    public void testSetBrand_name() {
        instance.setBrand_name("test2");
        String result = instance.getBrand_name();
        assertEquals("test2",result);
    }

    /**
     * Test of getDrug_id method, of class PreferredDrugs.
     */
    @Test
    public void testGetDrug_id() {
        long result = instance.getDrug_id();
        assertTrue(1 == result);
    }

    /**
     * Test of setDrug_id method, of class PreferredDrugs.
     */
    @Test
    public void testSetDrug_id() {
        instance.setDrug_id(2);
        long result = instance.getDrug_id();
        assertTrue(2 == result);
    }
    
}

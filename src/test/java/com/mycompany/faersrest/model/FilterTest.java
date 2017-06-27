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
public class FilterTest {
    
    private Filter instance;
    
    public FilterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Filter("bn1", "sn1", "mn1");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBrand_name method, of class Filter.
     */
    @Test
    public void testGetBrand_name() {
        String result;
        if (instance != null) {
            result = instance.getBrand_name();
            assertEquals("bn1",result);
        } 
    }

    /**
     * Test of setBrand_name method, of class Filter.
     */
    @Test
    public void testSetBrand_name() {
        String result = null;
        if (instance != null) {
            instance.setBrand_name("bn2");
            result = instance.getBrand_name();
        }        
        assertEquals("bn2",result);
    }

    /**
     * Test of getSubstance_name method, of class Filter.
     */
    @Test
    public void testGetSubstance_name() {
        String result;
        if (instance != null) {
            result = instance.getSubstance_name();
            assertEquals("sn1",result);
        }
    }

    /**
     * Test of setSubstance_name method, of class Filter.
     */
    @Test
    public void testSetSubstance_name() {
        String result = null;
        if (instance != null) {
            instance.setSubstance_name("sn2");
            result = instance.getSubstance_name();
        }        
        assertEquals("sn2",result);
    }

    /**
     * Test of getManufacturer_name method, of class Filter.
     */
    @Test
    public void testGetManufacturer_name() {
        String result;
        if (instance != null) {
            result = instance.getManufacturer_name();
            assertEquals("mn1",result);
        }
    }

    /**
     * Test of setManufacturer_name method, of class Filter.
     */
    @Test
    public void testSetManufacturer_name() {
        String result = null;
        if (instance != null) {
            instance.setManufacturer_name("mn2");
            result = instance.getManufacturer_name();
        }        
        assertEquals("mn2",result);
    }
    
}

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
public class ManufacturerNameTest {
    
    private ManufacturerName instance;
    
    public ManufacturerNameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new ManufacturerName("brandNameTest", "manufacturerNameTest");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBrand_name method, of class ManufacturerName.
     */
    @Test
    public void testGetBrand_name() {
        String result = instance.getBrand_name();
        assertEquals("brandNameTest",result);
    }

    /**
     * Test of setBrand_name method, of class ManufacturerName.
     */
    @Test
    public void testSetBrand_name() {
        instance.setBrand_name("brandNameTest2");
        String result = instance.getBrand_name();
        assertEquals("brandNameTest2",result);
    }

    /**
     * Test of getManufacturer_name method, of class ManufacturerName.
     */
    @Test
    public void testGetManufacturer_name() {
        String result = instance.getManufacturer_name();
        assertEquals("manufacturerNameTest",result);
    }

    /**
     * Test of setManufacturer_name method, of class ManufacturerName.
     */
    @Test
    public void testSetManufacturer_name() {
        instance.setManufacturer_name("manufacturerNameTest2");
        String result = instance.getManufacturer_name();
        assertEquals("manufacturerNameTest2",result);
    }    
}

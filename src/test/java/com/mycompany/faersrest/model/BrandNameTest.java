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
public class BrandNameTest {
    
    private BrandName instance;
    
    public BrandNameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new BrandName("test1");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBrand_name method, of class BrandName.
     */
    @Test
    public void testGetBrand_name() {
        String result = instance.getBrand_name();
        assertEquals("test1",result);
    }

    /**
     * Test of setBrand_name method, of class BrandName.
     */
    @Test
    public void testSetBrand_name() {
        instance.setBrand_name("test2");
        String result = instance.getBrand_name();
        assertEquals("test2",result);
    }    
}

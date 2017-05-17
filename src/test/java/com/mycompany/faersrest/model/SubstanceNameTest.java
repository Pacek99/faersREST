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
public class SubstanceNameTest {
    
    private SubstanceName instance;
    
    public SubstanceNameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new SubstanceName("brandNameTest", "substanceNameTest");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBrand_name method, of class SubstanceName.
     */
    @Test
    public void testGetBrand_name() {
        String result = instance.getBrand_name();
        assertEquals("brandNameTest",result);
    }

    /**
     * Test of setBrand_name method, of class SubstanceName.
     */
    @Test
    public void testSetBrand_name() {
        instance.setBrand_name("brandNameTest2");
        String result = instance.getBrand_name();
        assertEquals("brandNameTest2",result);
    }

    /**
     * Test of getSubstance_name method, of class SubstanceName.
     */
    @Test
    public void testGetSubstance_name() {
        String result = instance.getSubstance_name();
        assertEquals("substanceNameTest",result);
    }

    /**
     * Test of setSubstance_name method, of class SubstanceName.
     */
    @Test
    public void testSetSubstance_name() {
        instance.setSubstance_name("substanceNameTest2");
        String result = instance.getSubstance_name();
        assertEquals("substanceNameTest2",result);
    }    
}

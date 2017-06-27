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
public class SupportClassTest {
    
    private SupportClass instance;
    
    public SupportClassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new SupportClass(0);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getValue method, of class SupportClass.
     */
    @Test
    public void testGetValue() {
        int result;
        if (instance != null) {
            result = instance.getValue();
            assertEquals(0,result);
        }
    }

    /**
     * Test of setValue method, of class SupportClass.
     */
    @Test
    public void testSetValue() {
        int result =0;
        if (instance != null) {
            instance.setValue(1);
            result = instance.getValue();
        }        
        assertEquals(1,result);
    }
    
}

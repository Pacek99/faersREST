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
public class SaltTest {
    
    private Salt instance;
    
    public SaltTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Salt("test1");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSalt method, of class Salt.
     */
    @Test
    public void testGetSalt() {
        String result;
        if (instance != null) {
            result = instance.getSalt();
            assertEquals("test1",result);
        }      
    }

    /**
     * Test of setSalt method, of class Salt.
     */
    @Test
    public void testSetSalt() {
        String result = null;
        if (instance != null) {
            instance.setSalt("test2");
            result = instance.getSalt();
        }        
        assertEquals("test2",result);
    }
    
}

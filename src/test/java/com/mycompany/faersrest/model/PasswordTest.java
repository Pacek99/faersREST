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
public class PasswordTest {
    
    private Password instance;
    
    public PasswordTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Password("test1");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPass method, of class Password.
     */
    @Test
    public void testGetPass() {
        String result;
        if (instance != null) {
            result = instance.getPass();
            assertEquals("test1",result);
        }
    }

    /**
     * Test of setPass method, of class Password.
     */
    @Test
    public void testSetPass() {
        String result = null;
        if (instance != null) {
            instance.setPass("test2");
            result = instance.getPass();
        }        
        assertEquals("test2",result);
    }
    
}

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
public class RegisteredUserTest {
    
    private RegisteredUser instance;
    
    public RegisteredUserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new RegisteredUser("login1","mail1","pass1","salt1");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLogin method, of class RegisteredUser.
     */
    @Test
    public void testGetLogin() {
        String result;
        if (instance != null) {
            result = instance.getLogin();
            assertEquals("login1",result);
        } 
    }

    /**
     * Test of setLogin method, of class RegisteredUser.
     */
    @Test
    public void testSetLogin() {
        String result = null;
        if (instance != null) {
            instance.setLogin("login2");
            result = instance.getLogin();
        }        
        assertEquals("login2",result);
    }

    /**
     * Test of getMail method, of class RegisteredUser.
     */
    @Test
    public void testGetMail() {
        String result;
        if (instance != null) {
            result = instance.getMail();
            assertEquals("mail1",result);
        } 
    }

    /**
     * Test of setMail method, of class RegisteredUser.
     */
    @Test
    public void testSetMail() {
        String result = null;
        if (instance != null) {
            instance.setMail("mail2");
            result = instance.getMail();
        }        
        assertEquals("mail2",result);
    }

    /**
     * Test of getPass method, of class RegisteredUser.
     */
    @Test
    public void testGetPass() {
        String result;
        if (instance != null) {
            result = instance.getPass();
            assertEquals("pass1",result);
        }
    }

    /**
     * Test of setPass method, of class RegisteredUser.
     */
    @Test
    public void testSetPass() {
        String result = null;
        if (instance != null) {
            instance.setPass("pass2");
            result = instance.getPass();
        }        
        assertEquals("pass2",result);
    }

    /**
     * Test of getSalt method, of class RegisteredUser.
     */
    @Test
    public void testGetSalt() {
        String result;
        if (instance != null) {
            result = instance.getSalt();
            assertEquals("salt1",result);
        }
    }

    /**
     * Test of setSalt method, of class RegisteredUser.
     */
    @Test
    public void testSetSalt() {
        String result = null;
        if (instance != null) {
            instance.setSalt("salt2");
            result = instance.getSalt();
        }        
        assertEquals("salt2",result);
    }
    
}

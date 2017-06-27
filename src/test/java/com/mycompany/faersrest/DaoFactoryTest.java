/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest;

import com.mycompany.faersrest.DAO.BrandNameDao;
import com.mycompany.faersrest.DAO.LogInDao;
import com.mycompany.faersrest.DAO.ManufacturerNameDao;
import com.mycompany.faersrest.DAO.PreferredDrugsDao;
import com.mycompany.faersrest.DAO.RegisteredUserDao;
import com.mycompany.faersrest.DAO.SideEffectsDao;
import com.mycompany.faersrest.DAO.SubstanceNameDao;
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
public class DaoFactoryTest {
    
    public DaoFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBrandNameDao method, of class DaoFactory.
     */
    @Test
    public void testGetBrandNameDao() {
        System.out.println("getBrandNameDao");
        BrandNameDao result = DaoFactory.INSTANCE.getBrandNameDao();
        assertNotNull(result);
    }

    /**
     * Test of getSubstanceNameDao method, of class DaoFactory.
     */
    @Test
    public void testGetSubstanceNameDao() {
        System.out.println("getSubstanceNameDao");
        SubstanceNameDao result = DaoFactory.INSTANCE.getSubstanceNameDao();
        assertNotNull(result);
    }

    /**
     * Test of getManufacturerNameDao method, of class DaoFactory.
     */
    @Test
    public void testGetManufacturerNameDao() {
        System.out.println("getManufacturerNameDao");
        ManufacturerNameDao result = DaoFactory.INSTANCE.getManufacturerNameDao();
        assertNotNull(result);
    }

    /**
     * Test of getSideEffectsDao method, of class DaoFactory.
     */
    @Test
    public void testGetSideEffectsDao() {
        System.out.println("getSideEffectsDao");
        SideEffectsDao result = DaoFactory.INSTANCE.getSideEffectsDao();
        assertNotNull(result);
    }
    
    /**
     * Test of getRegisteredUserDao method, of class DaoFactory.
     */
    @Test
    public void testGetRegisteredUserDao() {
        System.out.println("getRegisteredUserDao");
        RegisteredUserDao result = DaoFactory.INSTANCE.getRegisteredUserDao();
        assertNotNull(result);
    }
    
    /**
     * Test of getPreferredDrugsDao method, of class DaoFactory.
     */
    @Test
    public void testGetPreferredDrugsDao() {
        System.out.println("getPreferredDrugsDao");
        PreferredDrugsDao result = DaoFactory.INSTANCE.getPreferredDrugsDao();
        assertNotNull(result);
    }
    
    /**
     * Test of getLogInDao method, of class DaoFactory.
     */
    @Test
    public void testGetLogInDao() {
        System.out.println("getLogInDao");
        LogInDao result = DaoFactory.INSTANCE.getLogInDao();
        assertNotNull(result);
    }
    
}

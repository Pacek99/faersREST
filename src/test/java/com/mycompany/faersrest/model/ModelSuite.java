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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Patrik Rojek
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.mycompany.faersrest.model.BrandNameTest.class, com.mycompany.faersrest.model.ManufacturerNameTest.class, com.mycompany.faersrest.model.SubstanceNameTest.class, com.mycompany.faersrest.model.SideEffectsTest.class})
public class ModelSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}

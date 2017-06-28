/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.resources;

import com.mycompany.faersrest.services.TestModulesService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Patrik Rojek
 */
@Path("/testmodules")
public class TestModulesResource {
    
    TestModulesService testModulesService = new TestModulesService();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String testModules(){
        return testModulesService.testModules(); 
    }
    
}

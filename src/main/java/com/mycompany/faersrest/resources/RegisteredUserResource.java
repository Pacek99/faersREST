/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.resources;

import com.mycompany.faersrest.model.RegisteredUser;
import com.mycompany.faersrest.model.SupportClass;
import com.mycompany.faersrest.services.RegisteredUserService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Patrik Rojek
 */
@Path("/register")
public class RegisteredUserResource {
    
    RegisteredUserService rus = new RegisteredUserService();
    
    @POST 
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void addMessage(RegisteredUser ru){
        rus.addUser(ru);
    }
    
    @GET
    @Path("/{login}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<SupportClass> checkUser(@PathParam("login") String login){
        return rus.checkUser(login); 
    }
    
}

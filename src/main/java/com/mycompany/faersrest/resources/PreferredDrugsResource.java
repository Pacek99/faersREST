/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.resources;

import com.mycompany.faersrest.model.BrandName;
import com.mycompany.faersrest.services.PreferredDrugsService;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Patrik Rojek
 */
@Path("/preferreddrugs")
public class PreferredDrugsResource {
    
    PreferredDrugsService preferredDrugsService = new PreferredDrugsService();
    
    @GET
    @Path("/{userLogin}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<BrandName> getPreferredDrugs(@PathParam("userLogin") String user){
        return preferredDrugsService.getPreferredDrugs(user); 
    }
    
    @DELETE
    @Path("/{userLogin}/{brandName}")
    public void deletePreferredDrug(@PathParam("userLogin") String user, 
                                    @PathParam("brandName") String brandName){
        preferredDrugsService.deletePreferredDrug(user,brandName.replace("%20", " "));
    }
    
    @PUT
    @Path("/{userLogin}/{brandName}")
    public void addPreferredDrug(@PathParam("userLogin") String user, 
                                 @PathParam("brandName") String brandName){
        preferredDrugsService.addPreferredDrug(user, brandName.replace("%20", " "));
    }
}

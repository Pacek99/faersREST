/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.faersrest.resources;

import com.mycompany.faersrest.model.Filter;
import com.mycompany.faersrest.services.FilterService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Patrik Rojek
 */
@Path("/filter")
public class FilterResource {
    
    FilterService filterService = new FilterService();
    
    @GET
    @Path("/{brandName}/{substanceName}/{manufacturerName}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Filter> filterDrugs(@PathParam("brandName") String brandName,
                                    @PathParam("substanceName") String substanceName,
                                    @PathParam("manufacturerName") String manufacturerName){
        return filterService.filterDrugs(brandName.replace("%20", " "),substanceName.replace("%20", " "),manufacturerName.replace("%20", " ")); 
    }
}

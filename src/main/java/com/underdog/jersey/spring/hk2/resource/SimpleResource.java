/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.underdog.jersey.spring.hk2.resource;

import com.underdog.jersey.spring.hk2.service.Hk2Service;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Paul Samsotha
 */
@Path("/simple")
public class SimpleResource {
    
    @Inject
    private Hk2Service hk2Service;
    
    @GET
    public String getMessage() {
        return hk2Service.getHk2Message();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.underdog.jersey.spring.hk2;

import com.underdog.jersey.spring.hk2.resource.SimpleResource;
import com.underdog.jersey.spring.hk2.service.Hk2Service;
import com.underdog.jersey.spring.hk2.service.Hk2ServiceImpl;
import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.web.filter.RequestContextFilter;

/**
 *
 * @author Paul Samsotha
 */
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
    
    public JerseyConfig() {
        register(SimpleResource.class);
        register(new AbstractBinder(){
            @Override
            protected void configure() {
                bind(Hk2ServiceImpl.class).to(Hk2Service.class).in(Singleton.class);
            }
        });
        
        register(RequestContextFilter.class);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.underdog.jersey.spring.hk2;

import com.underdog.jersey.spring.hk2.service.SpringService;
import com.underdog.jersey.spring.hk2.service.SpringServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author PaulSamsotha
 */
@Configuration
public class SpringConfig {
    
    @Bean
    public SpringService springService() {
        return new SpringServiceImpl();
    }
}

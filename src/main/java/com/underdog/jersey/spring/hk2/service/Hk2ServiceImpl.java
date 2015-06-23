/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.underdog.jersey.spring.hk2.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Paul Samsotha
 */
public class Hk2ServiceImpl implements Hk2Service {
    
    @Autowired
    private SpringService springService;

    @Override
    public String getHk2Message() {
        return springService.getSpringMessage("HK2 Message");
    }
}

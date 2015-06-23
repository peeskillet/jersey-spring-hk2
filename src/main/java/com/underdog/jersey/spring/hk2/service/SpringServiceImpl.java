/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.underdog.jersey.spring.hk2.service;

/**
 *
 * @author PaulSamsotha
 */
public class SpringServiceImpl implements SpringService {

    @Override
    public String getSpringMessage(String hk2Message) {
        return hk2Message + " and also Spring Message";
    }
}

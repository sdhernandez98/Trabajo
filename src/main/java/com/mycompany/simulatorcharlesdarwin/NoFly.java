/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulatorcharlesdarwin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author XPG
 */
public class NoFly implements TypesFly {

    
    public static final Logger logger = LoggerFactory.getLogger(NoFly.class);
    
    public void Fly() {
        logger.debug("No puedo volar");
        System.out.println("No puedo volar");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


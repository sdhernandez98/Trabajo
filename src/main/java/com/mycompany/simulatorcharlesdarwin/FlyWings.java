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
public class FlyWings implements TypesFly{
    
    public static final Logger logger = LoggerFactory.getLogger(FlyWings.class);
    
    public void FLy () {
        logger.debug ("Esta volando, aleteando");
        System.out.println("Esta volando, aleteando");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

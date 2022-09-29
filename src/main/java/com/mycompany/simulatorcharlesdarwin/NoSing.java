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
public class NoSing implements TypesSound {
    
    public static final Logger logger = LoggerFactory.getLogger(NoSing.class);
    
    @Override
    public void makeSound() {
        logger.debug("<<Silencio>>");
        System.out.println("<<Silencio>>");
    }
    
}

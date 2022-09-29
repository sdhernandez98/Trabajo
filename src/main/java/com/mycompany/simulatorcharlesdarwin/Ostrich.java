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

//El avestruz no vuela, no es necesario implementar la interfaz de volar(fly)
public class Ostrich extends Bird {
    
    public static final Logger logger= LoggerFactory.getLogger(Ostrich.class);
    
    public Ostrich (){
        logger.debug("Instanciando avestruz");
        
        this.setTypesSound(new NoSing());
        this.setTypesFly(new TypesFly() {
            @Override
            public void fly() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }


}

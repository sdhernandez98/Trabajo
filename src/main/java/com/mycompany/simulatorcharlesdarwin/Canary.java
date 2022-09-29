/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulatorcharlesdarwin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//import com.mycompany.simulatorcharlesdarwin.
/**
 *
 * @author XPG
 */
public class Canary extends Bird implements Fly{
    
    
   public static final Logger logger= LoggerFactory.getLogger(Canary.class);
    
    public Canary(){
        logger.debug("Instanciando un canario");
        this.setTypesSound(new Sing ());
        this.setTypesFly(new FlyWings());
        
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}


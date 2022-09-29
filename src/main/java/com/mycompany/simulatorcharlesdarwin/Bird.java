/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulatorcharlesdarwin;

/**
 *
 * @author XPG
 */
public abstract class Bird {
    
    TypesSound typesSound;
    TypesFly typesFly;
   
    //Metodos de un ave
    
public void setTypesSound(TypesSound typesSound) {
    this.typesSound = typesSound;
}

public void setTypesFly(TypesFly typesFly) {
    this.typesFly = typesFly;
}


public void makeFly(){
    typesFly.fly();
}

public void makeSound(){
    typesSound.makeSound();
}

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpfinal.Menu;


/**
 *
 * @author Familiar
 */
public abstract class State {
    protected Menu menu;

    public State(Menu menu) {
        this.menu = menu;
    }
    
    public abstract void imprimirMenu();
}

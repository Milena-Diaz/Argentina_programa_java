/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpfinal.Menu;

/**
 *
 * @author Familiar
 */
public class Menu {
    public State estado;
    
    public Menu() {
        estado = new MenuUsserState(this);
    }

    public State getEstado() {
        return estado;
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }
    
    
}

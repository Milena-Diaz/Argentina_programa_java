/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpfinal.turnos;

import com.argentinaprograma.tpfinal.TurnoMedico;

/**
 *
 * @author Familiar
 */
public class Aprobar extends TurnosTemplate {

    public Aprobar() {
    }  
    
    @Override
    protected void aprobar(TurnoMedico turno) {
        turno.setAprobado("Sí");
        turnoDAO.actualizar(turno);
    }

    @Override
    protected void asignar(TurnoMedico turno) {
        
    }    
}

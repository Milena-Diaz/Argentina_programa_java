/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpfinal.turnos;

import com.argentinaprograma.tpfinal.Daos.MedicoDAO;
import com.argentinaprograma.tpfinal.Daos.MedicoRepository;
import com.argentinaprograma.tpfinal.Medico;
import com.argentinaprograma.tpfinal.TurnoMedico;
import java.sql.Date;


/**
 *
 * @author Familiar
 */
public class Asignar extends TurnosTemplate {
    MedicoDAO medicoDAO = new MedicoRepository();

    public Asignar() {
    }

    @Override
    protected void aprobar(TurnoMedico turno) {
    }

    @Override
    protected void asignar(TurnoMedico turno) {
        System.out.println("ID del Medico: ");
        int idMed = scanner.nextInt();
        scanner.nextLine();
        Medico medico = medicoDAO.ObtenerPorId(idMed);
        System.out.println("Establecer fecha: ");
        String fecha = scanner.nextLine();
        
        turno.setFechaYHora(Date.valueOf(fecha));
        turno.setIdMedico(medico);
        turnoDAO.actualizar(turno);
    }
    
}

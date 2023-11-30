/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpfinal.turnos;

import com.argentinaprograma.tpfinal.Daos.TurnoMedicoDAO;
import com.argentinaprograma.tpfinal.Daos.TurnoMedicoRepository;
import com.argentinaprograma.tpfinal.TurnoMedico;
import java.util.Scanner;

/**
 *
 * @author Familiar
 */
public abstract class TurnosTemplate {
    Scanner scanner = new Scanner(System.in);
    TurnoMedicoDAO turnoDAO = new TurnoMedicoRepository();
    
    public final void actualizarTurno() {
        System.out.println("ID del turno: ");
        int turnoId = scanner.nextInt();
        TurnoMedico turno = turnoDAO.ObtenerPorId(turnoId);
        aprobar(turno);
        asignar(turno);
        System.out.println("Actualizado exitosamente");
    }
    
    protected abstract void aprobar(TurnoMedico turno);
    protected abstract void asignar(TurnoMedico turno);
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpfinal.Daos;

import com.argentinaprograma.tpfinal.JpaControllers.TurnoMedicoJpaController;
import com.argentinaprograma.tpfinal.TurnoMedico;
import com.argentinaprograma.tpfinal.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author Familiar
 */
public class TurnoMedicoRepository implements TurnoMedicoDAO{
    
    public TurnoMedicoJpaController controllerTurnoMedicoJpa;

    public TurnoMedicoRepository() {
        this.controllerTurnoMedicoJpa = new TurnoMedicoJpaController();
    }
        
    @Override
    public TurnoMedico ObtenerPorId(int id) {
        return controllerTurnoMedicoJpa.findTurnoMedico(id);
    }

    @Override
    public List<TurnoMedico> obtenerTodos() {
        return controllerTurnoMedicoJpa.findTurnoMedicoEntities();
    }

    @Override
    public void guardar(TurnoMedico turnoMedico) {
        controllerTurnoMedicoJpa.create(turnoMedico);
    }

    @Override
    public void actualizar(TurnoMedico turnoMedico) {
        try {
            controllerTurnoMedicoJpa.edit(turnoMedico);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {
        try {
            controllerTurnoMedicoJpa.destroy(id);
        } catch (com.argentinaprograma.tpfinal.JpaControllers.exceptions.NonexistentEntityException e) {
            e.printStackTrace();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpfinal.Daos;

import com.argentinaprograma.tpfinal.JpaControllers.MedicoJpaController;
import com.argentinaprograma.tpfinal.JpaControllers.exceptions.NonexistentEntityException;
import com.argentinaprograma.tpfinal.Medico;
import java.util.List;

/**
 *
 * @author Familiar
 */
public class MedicoRepository implements MedicoDAO {
    
     public MedicoJpaController controllerMedicoJpa;

    public MedicoRepository() {
        this.controllerMedicoJpa = new MedicoJpaController();
    }
    
    @Override
    public Medico ObtenerPorId(int id) {
        return controllerMedicoJpa.findMedico(id);
    }

    @Override
    public List<Medico> obtenerTodos() {
        return controllerMedicoJpa.findMedicoEntities();
    }

    @Override
    public void guardar(Medico medico) {
        controllerMedicoJpa.create(medico);
    }

    @Override
    public void actualizar(Medico medico) {
        try {
            controllerMedicoJpa.edit(medico);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {
        try {
            controllerMedicoJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            e.printStackTrace();
        }
    }
}

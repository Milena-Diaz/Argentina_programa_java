/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpfinal.Daos;

import com.argentinaprograma.tpfinal.JpaControllers.MascotaJpaController;
import com.argentinaprograma.tpfinal.Mascota;
import com.argentinaprograma.tpfinal.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author Familiar
 */
public class MascotaRepository implements MascotaDAO{
    
    public MascotaJpaController controllerMascotaJpa;
    
    public MascotaRepository(){
        this.controllerMascotaJpa = new MascotaJpaController();
    }
    
    @Override
    public Mascota ObtenerPorId(int id) {
        return controllerMascotaJpa.findMascota(id);
    }

    @Override
    public List<Mascota> obtenerTodos() {
        return controllerMascotaJpa.findMascotaEntities();
    }

    @Override
    public void guardar(Mascota mascota) {
        controllerMascotaJpa.create(mascota);
    }

    @Override
    public void actualizar(Mascota mascota) {
        try {
            controllerMascotaJpa.edit(mascota);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {
        try {
            controllerMascotaJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            e.printStackTrace();
        }
    }
}

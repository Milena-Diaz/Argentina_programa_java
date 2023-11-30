/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argentinaprograma.tpfinal.Daos;

import com.argentinaprograma.tpfinal.Medico;
import java.util.List;

/**
 *
 * @author Familiar
 */
public interface MedicoDAO {
    Medico ObtenerPorId(int id);
    List <Medico> obtenerTodos();
    void guardar(Medico medico);
    void actualizar(Medico medico);
    void eliminar(int id);
    
}

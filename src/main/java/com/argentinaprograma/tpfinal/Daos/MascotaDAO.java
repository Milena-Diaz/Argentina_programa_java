/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpfinal.Daos;

import com.argentinaprograma.tpfinal.Mascota;
import java.util.List;

/**
 *
 * @author Familiar
 */
public interface MascotaDAO {
    Mascota ObtenerPorId(int id);
    List <Mascota> obtenerTodos();
    void guardar(Mascota mascota);
    void actualizar(Mascota mascota);
    void eliminar(int id);
}

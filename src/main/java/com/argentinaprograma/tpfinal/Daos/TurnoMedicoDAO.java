/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpfinal.Daos;

import com.argentinaprograma.tpfinal.TurnoMedico;
import java.util.List;

/**
 *
 * @author Familiar
 */
public interface TurnoMedicoDAO {
    TurnoMedico ObtenerPorId(int id);
    List <TurnoMedico> obtenerTodos();
    void guardar(TurnoMedico turnoMedico);
    void actualizar(TurnoMedico turnoMedico);
    void eliminar(int id);
}

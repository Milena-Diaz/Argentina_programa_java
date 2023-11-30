/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpfinal.Menu;

import com.argentinaprograma.tpfinal.Daos.MascotaDAO;
import com.argentinaprograma.tpfinal.Daos.MascotaRepository;
import com.argentinaprograma.tpfinal.Daos.TurnoMedicoDAO;
import com.argentinaprograma.tpfinal.Daos.TurnoMedicoRepository;
import com.argentinaprograma.tpfinal.Mascota;
import com.argentinaprograma.tpfinal.TurnoMedico;
import com.argentinaprograma.tpfinal.turnos.*;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Familiar
 */
public class MenuMedicoState extends State{

    public MenuMedicoState(Menu menu) {
        super(menu);
    }

    @Override
    public void imprimirMenu() {
        Scanner scanner = new Scanner(System.in);
        
        boolean salir = false;
        do{
//            MascotaDAO mDao = new MascotaRepository();
//            List<Mascota> list = mDao.obtenerTodos();
//            for(Mascota test: list) {
//                System.out.println(test.getId() + " " + test.getNombre()+ " " + test.getEspecie());
//            }
            System.out.println("1 - Imprimir listado de mascotas");
            System.out.println("2 - Imprimir listado de turnos");
            System.out.println("3 - Aprobar Turno");
            System.out.println("4 - Asignar Turno");
            System.out.println("5 - Salir");
            int input= scanner.nextInt();
            
            TurnosTemplate turTemp;
            switch(input){
                case 1:
                    MascotaDAO mDao = new MascotaRepository();
                    List<Mascota> lista = mDao.obtenerTodos();
                    lista.stream().forEach((mascota) -> System.out.println(mascota.getId() + " | " 
                            + mascota.getNombre() + " | " + mascota.getEspecie() + " | " + mascota.getRaza() 
                            + " | " + mascota.getEdad() + " | " + mascota.getSexo() ));
                    break;
                case 2:
                    TurnoMedicoDAO tmDao = new TurnoMedicoRepository();
                    List<TurnoMedico> lista2 = tmDao.obtenerTodos();
                    lista2.stream().forEach((turno) -> System.out.println(turno.getId() + " | " 
                            + turno.getAprobado()+ " | " + turno.getIdMascota() + " | " +  turno.getRazonDeConsulta() + " | "
                            + turno.getIdMedico() + " | " + turno.getFechaYHora() ));
                    break;
                case 3:
                    turTemp = new Aprobar();
                    turTemp.actualizarTurno();
                    break;
                case 4:
                    turTemp = new Asignar();
                    turTemp.actualizarTurno();
                    break;
                default:
                    salir = true;
                    break;
            }
        }while(!salir);
    }
    
}

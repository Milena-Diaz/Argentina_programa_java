/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpfinal.Menu;

import com.argentinaprograma.tpfinal.Daos.*;
import com.argentinaprograma.tpfinal.Mascota;
import com.argentinaprograma.tpfinal.TurnoMedico;
import java.util.Scanner;

/**
 *
 * @author Familiar
 */
public class MenuUsserState extends State{
    public MenuUsserState(Menu menu) {
        super(menu);
    }

    @Override
    public void imprimirMenu() {
        Scanner scanner = new Scanner(System.in);
        MascotaDAO mDAO = new MascotaRepository();
        TurnoMedicoDAO turnoDAO = new TurnoMedicoRepository();
        
        boolean salir = false;
        do{
            System.out.println("1 - Registrar Mascota");
            System.out.println("2 - Sacar Turno");
            System.out.println("3 - Salir");
            int input= scanner.nextInt();
            scanner.nextLine();
            
            switch(input){
                case 1:
                    System.out.println("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Especie: ");
                    String especie = scanner.nextLine();
                    System.out.println("Raza: ");
                    String raza = scanner.nextLine();
                    System.out.println("Edad en años: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Sexo: ");
                    String sexo = scanner.nextLine();

                    Mascota mascota1 = new Mascota(nombre, especie, raza, edad, sexo);
                    mDAO.guardar(mascota1);

                    System.out.println("Mascota registrada exitosamente");
                    System.out.println("ID de su mascota: " + mascota1.getId());
                    break;
                case 2:
                    System.out.println("Ingrese el ID de su mascota: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    Mascota mascota2;
                    mascota2 = mDAO.ObtenerPorId(id);
                    
                    System.out.println("Describa la razón de su consulta: ");
                    String razon = scanner.nextLine();

                    TurnoMedico turno = new TurnoMedico(mascota2, null, razon, "No" ,null);
                    turnoDAO.guardar(turno);

                    System.out.println("Turno registrado exitosamente");
                    System.out.println("ID de su turno: " + turno.getId());
                    break;
                default:
                    salir = true;
                    break;
            }
        }while(!salir);
    }
    
}

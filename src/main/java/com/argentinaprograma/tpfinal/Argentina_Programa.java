/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.argentinaprograma.tpfinal;

import com.argentinaprograma.tpfinal.Menu.*;
import java.util.Scanner;

/**
 *
 * @author Familiar
 */
public class Argentina_Programa {
    
    public static void main(String[] args) {
        mensajeDeEntrada();
        Menu menu = iniciarSesion();
        menu.estado.imprimirMenu();
        mensajeDeSalida();
    }
    
    private static void mensajeDeEntrada(){
        System.out.println("----------------------");
        System.out.println("| Gestión Veterinaria |");
        System.out.println("----------------------");
        System.out.println("");
    }
    
    private static Menu iniciarSesion(){
        Scanner scanner = new Scanner(System.in);
        boolean incioCorrecto = true;
        Menu menu = new Menu();
        do{
            System.out.println("1 - iniciar sesión como usuario");
            System.out.println("2 - iniciar sesión como medico");
            int input= scanner.nextInt();
            switch(input){
                case 1:
                    menu.setEstado(new MenuUsserState(menu));
                    break;
                case 2:
                    System.out.println("Ingrese la contraseña: ");
                    int password= scanner.nextInt();
                    
                    //La contraseña no debería estar acá :p
                    //No sé cómo crear un sistema de contraseña seguro xd
                    if(password == 1234){
                        menu.setEstado(new MenuMedicoState(menu));
                        incioCorrecto = true;
                    }else{
                        System.out.println("Contraseña incorrecta");
                        incioCorrecto = false;
                    }
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
                    incioCorrecto = false;
                    break;
            }
        }while(!incioCorrecto);
        
        return menu;
    }
    
    private static void mensajeDeSalida(){
        System.out.println("\n Muchas gracias por usar");
    }
}

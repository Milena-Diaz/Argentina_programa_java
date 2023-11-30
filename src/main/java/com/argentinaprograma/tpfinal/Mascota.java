package com.argentinaprograma.tpfinal;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table (name = "Mascota")
public class Mascota implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mascotas_sec")
    @SequenceGenerator(name = "mascotas_sec", sequenceName = "mascotas_id_mascotas_seq", allocationSize = 1)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "especie")
    private String especie;

    @Column(name = "raza")
    private String raza;

    @Column(name = "edad")
    private int edad;

    @Column(name = "sexo")
    private String sexo;
    
    public Mascota() {
    }
    
    public Mascota(String nombre, String especie, String raza, int edad, String sexo) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
    }

    public int getId() {return id;}
    public void setId(int legajo) {this.id = id;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getEspecie() {return especie;}
    public void setEspecie(String especie) {this.especie = especie;}
    public String getRaza() {return raza;}
    public void setRaza(String raza) {this.raza = raza;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
    public String getSexo() {return sexo;}
    public void setSexo(String sexo) {this.sexo = sexo;}
    
}

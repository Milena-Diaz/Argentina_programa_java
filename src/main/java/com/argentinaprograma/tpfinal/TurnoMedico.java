/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.tpfinal;

/**
 *
 * @author Familiar
 */

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table (name = "TurnoMedico")
public class TurnoMedico implements Serializable {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "turno_sec")
    @SequenceGenerator(name = "turno_sec", sequenceName = "turno_id_mascotas_seq", allocationSize = 1)
    private int id;
    
    @ManyToOne
    @JoinColumn(name= "idMascota", referencedColumnName= "id")
    private Mascota idMascota;
    
    @ManyToOne
    @JoinColumn(name="idMedico", referencedColumnName="id")
    private Medico idMedico;
    
    @Column(name = "razonDeConsulta")
    private String razonDeConsulta;
    
    
    @Column(name = "aprobado")
    private String aprobado;
    
    @Column(name = "fechaYHora", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaYHora;
    
   
    public TurnoMedico() {
    }
    
    public TurnoMedico(Mascota idMascota, Medico idMedico, String razonDeConsulta, String aprobado ,Date fechaYHora) {
        this.idMascota = idMascota;
        this.idMedico = idMedico;
        this.razonDeConsulta = razonDeConsulta;
        this.aprobado = aprobado;
        this.fechaYHora = fechaYHora;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public Mascota getIdMascota() {return idMascota;}
    public void setIdMascota(Mascota idMascota) {this.idMascota = idMascota;}
    public Medico getIdMedico() {return idMedico;}
    public void setIdMedico(Medico idMedico) {this.idMedico = idMedico;}
    public String getRazonDeConsulta() {return razonDeConsulta;}
    public void setRazonDeConsulta(String razonDeConsulta) {this.razonDeConsulta = razonDeConsulta;}
    public String getAprobado() {return aprobado;}
    public void setAprobado(String aprobado) {this.aprobado = aprobado;}
    public Date getFechaYHora() {return fechaYHora;}
    public void setFechaYHora(Date fechaYHora) {this.fechaYHora = fechaYHora;}
}

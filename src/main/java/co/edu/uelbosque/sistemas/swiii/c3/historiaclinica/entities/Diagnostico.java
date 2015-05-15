/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.entities;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;


/**
 *
 * @author Andres Romero
 */
@Entity
@ManagedBean
@SessionScoped
public class Diagnostico implements Serializable{
    
    @Id
    @GenericGenerator(name = "generadorIdDiagnostico", strategy = "increment")
    @GeneratedValue(generator = "generadorIdDiagnostico")
    private Long id;
    Long id_paciente;
    String antecedentes_patologicos;
    String antecedentes_no_patologicos;
    String antecedentes_gineco_obstetricos;
    String alergias;
    String signos;
    String sintomas;
    String diagnostico;
    String prescripcion_medica;
    String recomendaciones;

    public Diagnostico() {
    }



    public Long getId_paciente() {
        return id_paciente;
    }

    public String getAntecedentes_patologicos() {
        return antecedentes_patologicos;
    }

    public String getAntecedentes_no_patologicos() {
        return antecedentes_no_patologicos;
    }

    public String getAntecedentes_gineco_obstetricos() {
        return antecedentes_gineco_obstetricos;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getSignos() {
        return signos;
    }

    public String getSintomas() {
        return sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getPrescripcion_medica() {
        return prescripcion_medica;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }


    public void setId_paciente(Long id_paciente) {
        this.id_paciente = id_paciente;
    }

    public void setAntecedentes_patologicos(String antecedentes_patologicos) {
        this.antecedentes_patologicos = antecedentes_patologicos;
    }

    public void setAntecedentes_no_patologicos(String antecedentes_no_patologicos) {
        this.antecedentes_no_patologicos = antecedentes_no_patologicos;
    }

    public void setAntecedentes_gineco_obstetricos(String antecedentes_gineco_obstetricos) {
        this.antecedentes_gineco_obstetricos = antecedentes_gineco_obstetricos;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public void setSignos(String signos) {
        this.signos = signos;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setPrescripcion_medica(String prescripcion_medica) {
        this.prescripcion_medica = prescripcion_medica;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }
    
    
    
    
  
    
}

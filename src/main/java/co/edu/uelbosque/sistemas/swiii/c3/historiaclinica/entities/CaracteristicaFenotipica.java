/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.entities;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Andres
 */
@ManagedBean
@ApplicationScoped
public class CaracteristicaFenotipica {
    
    public Raza[] getFenotipica(){
        return Raza.values();
    }
    
}

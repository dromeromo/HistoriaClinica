/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.repositories;

import co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.entities.Diagnostico;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Jhary
 */
public interface RepositorioDiagnostico extends CrudRepository <Diagnostico, Long>{
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.config;

import co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.entities.Paciente;
import co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.entities.Raza;
import co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.services.ServicioPacienteInt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.testng.annotations.Test;

/**
 *
 * @author Andres
 */
public class AnotacionPropia {
    private transient ServicioPacienteInt sp;

    @Test
    public void pruebaPaciente() {
        Paciente p1 = new Paciente();
        p1.setNombre("Andres");
        p1.setApellidos("Romero");
        p1.setCaracteristicaFenotipica(Raza.MESTIZO);
        Paciente p2 = new Paciente();
        p2.setNombre("Sandra");
        p2.setApellidos("Arias");
        p2.setCaracteristicaFenotipica(Raza.MESTIZO);
        Paciente p3 = new Paciente();
        p3.setNombre("Eliana");
        p3.setApellidos("Rincon");
        p3.setCaracteristicaFenotipica(Raza.INDIGENA);

        ArrayList pacientes = new ArrayList<>();
        pacientes.add(p3);
        //pacientes.add(p1);
        //pacientes.add(p2);

        for (Object paciente : pacientes) {
            System.out.println(pacientes);

        }

        Collections.sort(pacientes, new Comparator<Paciente>() {

            @Override
            public int compare(Paciente o1, Paciente o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }

        });
        for (Object paciente : pacientes) {
            System.out.println(pacientes);

        }

    }

    public @interface ordenarPacientes {

    }
    

}

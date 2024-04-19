package oop2.tp3.ejercicio4;

import org.apache.commons.lang3.ObjectUtils;
import org.jdbi.v3.core.Jdbi;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        //SetUp database
        Jdbi jdbi = Jdbi.create("jdbc:hsqldb:mem;create=true");
        new SetUpDatabase(jdbi).setUp();

        var repo = new PersonaRepository(jdbi);
        var personas = repo.buscarPorNombre("Vla");

        if (!personas.isEmpty()) {
            for (Persona persona : personas) {
                System.out.println(persona.nombre() + " " + persona.apellido());
            }
        }

        var persona = repo.buscarId(1L);
        if(persona.isPresent()){
            System.out.println(persona.get().nombre() + " " + persona.get().apellido());
        }

    }
}

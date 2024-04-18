package oop2.tp3.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    Libro elTunel = new LibroRegular("El Túnel");
    Libro antesDelFin = new LibroRegular("Antes del Fin");
    CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
    CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
    Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
    Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
    Cliente yo = new Cliente("Javier");
    @Test
    public void calcularPuntosObtenidosTest(){
        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);
        assertEquals(yo.calcularPuntosObtenidos(), 2);
    }
    @Test
    public void calcularDeudaTest(){
        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);
        assertEquals(yo.calcularDeudaTotal(), 10);
    }

}
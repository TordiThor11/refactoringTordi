package oop2.tp3.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Alquiler> alquileres = new ArrayList<Alquiler>();
    private String name;

    public Cliente(String nombre) {
        this.name = nombre;
    }
    public float calcularPuntosObtenidos(){
        int puntosAlquilerFrecuente = 0;
        for (Alquiler alquiler : alquileres){
            // sumo puntos por alquiler
            puntosAlquilerFrecuente++;
            // bonus por días de alquiler de un nuevo lanzamiento
            puntosAlquilerFrecuente += alquiler.copia().libro().calcularPuntosBonus(alquiler.diasAlquilados());
        }
        return puntosAlquilerFrecuente;
    }
    public double calcularDeudaTotal() {
        double monto = 0;
        for (Alquiler alquiler : alquileres) {
            monto += alquiler.calcularDeudaDeUnAlquiler();
        }
        return monto;
    }

    public void alquilar(Alquiler rental) {
        alquileres.add(rental);
    }
}
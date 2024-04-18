package oop2.tp3.ejercicio1;

public abstract class Libro {
    String nombre = null;
    public Libro(String nombre){
        this.nombre = nombre;
    }
    public abstract int calcularPuntosBonus(int diasAlquilados); //Retorna la cantidad de puntos bonus.
    public abstract double calcularPrecio(int diasAlquilados); //Retorna el precio.
}

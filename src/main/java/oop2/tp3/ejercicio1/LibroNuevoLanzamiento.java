package oop2.tp3.ejercicio1;

public class LibroNuevoLanzamiento extends Libro {
    static final int CANTIDAD_DIAS_PARA_PUNTOS_BONUS_NUEVO_LANZAMIENTO = 1; //Cantidad de dias que tienen que pasar para agregar el bonus de puntos por alquier a un libro NUEVO_LANZAMIENTO
    static final double COEFICIENTE_POR_DIA_NUEVO_LANZAMIENTO = 3;
    @Override
    public int calcularPuntosBonus(int diasAlquilados) {
        if(diasAlquilados > CANTIDAD_DIAS_PARA_PUNTOS_BONUS_NUEVO_LANZAMIENTO){
            return 1;
        }
        return 0;
    }

    public LibroNuevoLanzamiento(String nombre){
        super(nombre);
    }
    @Override
    public double calcularPrecio(int diasAlquilados) {
        return diasAlquilados * COEFICIENTE_POR_DIA_NUEVO_LANZAMIENTO;
    }
}

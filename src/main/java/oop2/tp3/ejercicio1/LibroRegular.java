package oop2.tp3.ejercicio1;

public class LibroRegular extends Libro {
    static final double MONTO_INICIAL_REGULARES = 2;
    static final int CANTIDAD_DIAS_PARA_COBRAR_DEUDA_EXTRA_REGULARES = 2;
    static final double COEFICIENTE_DEUDA_REGULARES = 1.5;
    public LibroRegular(String nombre){
        super(nombre);
    }

    @Override
    public int calcularPuntosBonus(int dias) {
        return 0;
    }
    @Override
    public double calcularPrecio(int diasAlquilados) {
        double monto = MONTO_INICIAL_REGULARES;
        if (diasAlquilados > CANTIDAD_DIAS_PARA_COBRAR_DEUDA_EXTRA_REGULARES){
            monto += (diasAlquilados - CANTIDAD_DIAS_PARA_COBRAR_DEUDA_EXTRA_REGULARES) * COEFICIENTE_DEUDA_REGULARES;
        }
        return monto;
    }
}

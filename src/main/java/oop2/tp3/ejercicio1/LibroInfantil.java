package oop2.tp3.ejercicio1;

public class LibroInfantil extends Libro {
    static final double MONTO_INICIAL_INFANTILES = 1.5;
    static final int CANTIDAD_DIAS_PARA_COBRAR_DEUDA_EXTRA_INFANTILES = 3;
    static final double COEFICIENTE_DEUDA_INFANTILES = 1.5;
    public LibroInfantil(String nombre){
        super(nombre);
    }

    @Override
    public int calcularPuntosBonus(int diasAlquilados) {
        return 0;
    }

    @Override
    public double calcularPrecio(int diasAlquilados) {
        double monto = MONTO_INICIAL_INFANTILES;
        if (diasAlquilados > CANTIDAD_DIAS_PARA_COBRAR_DEUDA_EXTRA_INFANTILES){
            monto += (diasAlquilados - CANTIDAD_DIAS_PARA_COBRAR_DEUDA_EXTRA_INFANTILES) * COEFICIENTE_DEUDA_INFANTILES;
        }
        return monto;
    }
}

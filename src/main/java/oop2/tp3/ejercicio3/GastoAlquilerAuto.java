package oop2.tp3.ejercicio3;

public class GastoAlquilerAuto extends Gasto{
    public GastoAlquilerAuto(int monto) {
        super(monto);
    }

    @Override
    public int gastoComida() {
        return 0;
    }
    @Override
    public String tipoDeGasto() {
        return "Alquiler de Autos";
    }

    @Override
    public boolean marcaExesoComida() {
        return false;
    }
}

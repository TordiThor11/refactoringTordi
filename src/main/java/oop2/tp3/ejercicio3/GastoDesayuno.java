package oop2.tp3.ejercicio3;

public class GastoDesayuno extends Gasto{

    public GastoDesayuno(int monto) {
        super(monto);
    }

    @Override
    public int gastoComida() {
        return monto;
    }

    @Override
    public String tipoDeGasto() {
        return "Desayuno";
    }

    @Override
    public boolean marcaExesoComida() {
        return this.monto > 1000;
    }
}

package oop2.tp3.ejercicio3;

public class GastoCena extends Gasto{

    public GastoCena(int monto) {
        super(monto);
    }

    @Override
    public int gastoComida() {
        return monto;
    }
    @Override
    public String tipoDeGasto() {
        return "Cena";
    }

    @Override
    public boolean marcaExesoComida() {
        return this.monto > 5000;
    }
}

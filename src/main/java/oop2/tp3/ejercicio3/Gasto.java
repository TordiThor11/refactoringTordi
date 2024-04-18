package oop2.tp3.ejercicio3;
public abstract class Gasto {
    protected int monto;
    public Gasto(int monto){
        this.monto = monto;
    }
    public abstract int gastoComida();
    public abstract String tipoDeGasto();
    public abstract boolean marcaExesoComida();
    public int monto(){return this.monto;}
}

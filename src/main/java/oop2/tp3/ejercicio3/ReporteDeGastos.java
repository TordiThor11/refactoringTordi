package oop2.tp3.ejercicio3;

import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastos {
    private List<Gasto> gastos;
    private LocalDate fecha;
    public ReporteDeGastos(List<Gasto> gastos, LocalDate fecha){
        this.gastos = gastos;
        this.fecha = fecha;
    }

    public String imprimir() {
        String reporte = "";
        int total = 0;
        int gastosDeComida = 0;

        reporte = reporte + "Expenses " + this.fecha;



        for (Gasto gasto : gastos) {
            gastosDeComida += gasto.gastoComida();

            String nombreGasto = gasto.tipoDeGasto();

            String stringMarcaExcesoComidas = "Exceso comidas: " + gasto.marcaExesoComida();
            reporte = reporte + nombreGasto + "\t" + gasto.monto() + "\t" + stringMarcaExcesoComidas;

            total += gasto.monto();
        }

        reporte = reporte + "Gastos de comida: " + gastosDeComida + "Total de gastos: " + total;
        return reporte;
    }

}

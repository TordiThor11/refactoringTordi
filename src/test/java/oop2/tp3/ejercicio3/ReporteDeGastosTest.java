package oop2.tp3.ejercicio3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReporteDeGastosTest {
    @Test
    public void gastosTest(){
        var g1 = new GastoDesayuno(1000);
        var reporte = new ReporteDeGastos(List.of(g1), LocalDate.of(2024,04,18));
        reporte.imprimir();
        assertEquals("Expenses 2024-04-18Desayuno\t1000\tExceso comidas: falseGastos de comida: 1000Total de gastos: 1000", reporte.imprimir());
    }


}
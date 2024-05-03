package Alimento;

import PoblacionDeBacterias.PoblacionDeBacterias;

public class CalculadorDeAlimento {
    public double calcularAlimento(PoblacionDeBacterias poblacion) {
        return poblacion.getNumeroBacteriasIniciales() * 0.1;
    }
}
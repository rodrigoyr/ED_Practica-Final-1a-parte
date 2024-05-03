import PoblacionDeBacterias.PoblacionDeBacterias;
import PoblacionDeBacterias.GestorDePoblaciones;
import Alimento.Alimento;
import Alimento.CalculadorDeAlimento;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de GestorDePoblaciones
        GestorDePoblaciones gestor = new GestorDePoblaciones();

        // Crear algunas instancias de PoblacionDeBacterias y agregarlas al GestorDePoblaciones
        PoblacionDeBacterias poblacion1 = new PoblacionDeBacterias("Poblacion 1", new Date(), new Date(), 100, 37.0, "Luz", 10);
        PoblacionDeBacterias poblacion2 = new PoblacionDeBacterias("Poblacion 2", new Date(), new Date(), 200, 37.0, "Oscuridad", 20);
        gestor.agregarPoblacion(poblacion1);
        gestor.agregarPoblacion(poblacion2);

        // Crear una instancia de Alimento
        Alimento alimento = new Alimento("Alimento 1", 50.0);

        // Crear una instancia de CalculadorDeAlimento y usarla para calcular la cantidad de alimento necesaria para cada población de bacterias
        CalculadorDeAlimento calculador = new CalculadorDeAlimento();
        for (PoblacionDeBacterias poblacion : gestor.getPoblaciones()) {
            double cantidadAlimento = calculador.calcularAlimento(poblacion);
            System.out.println("La cantidad de " + alimento.getNombre() + " necesaria para la " + poblacion.getNombre() + " es: " + cantidadAlimento);
        }
    }
}
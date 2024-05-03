package Experimento;

import Archivo.GestorDeArchivos;
import java.util.ArrayList;
import java.util.List;

public class GestorDeExperimentos {
    private Experimento experimentoActual;
    private GestorDeArchivos gestorDeArchivos;
    private List<Experimento> experimentos; // Añade una lista para almacenar los experimentos

    public GestorDeExperimentos() {
        this.gestorDeArchivos = new GestorDeArchivos();
        this.experimentos = new ArrayList<>(); // Inicializa la lista de experimentos
    }

    public void crearNuevoExperimento(String nombre) {
        this.experimentoActual = new Experimento(nombre);
        this.experimentos.add(experimentoActual); // Añade el nuevo experimento a la lista
    }

    public void abrirExperimento(String rutaArchivo) {
        this.experimentoActual = this.gestorDeArchivos.abrirArchivo(rutaArchivo);
    }

    public void guardarExperimento(String rutaArchivo) {
        this.gestorDeArchivos.guardarArchivo(rutaArchivo, this.experimentoActual);
    }

    public void guardarExperimentoComo(String rutaArchivo) {
        this.gestorDeArchivos.guardarArchivo(rutaArchivo, this.experimentoActual);
    }

    public Experimento getExperimentoActual() {
        return this.experimentoActual;
    }

    // Método para obtener los nombres de los experimentos
    public List<String> getNombresExperimentos() {
        List<String> nombres = new ArrayList<>();
        for (Experimento experimento : this.experimentos) {
            nombres.add(experimento.getNombre());
        }
        return nombres;
    }
}
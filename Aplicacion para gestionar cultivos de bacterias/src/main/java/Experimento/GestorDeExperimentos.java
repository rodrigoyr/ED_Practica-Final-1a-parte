package Experimento;

import Archivo.GestorDeArchivos;
import java.util.ArrayList;
import java.util.List;

public class GestorDeExperimentos {
    private Experimento experimentoActual;
    private GestorDeArchivos gestorDeArchivos;
    private List<Experimento> experimentos;

    public GestorDeExperimentos() {
        this.gestorDeArchivos = new GestorDeArchivos();
        this.experimentos = new ArrayList<>();
    }

    public void crearNuevoExperimento(String nombre) {
        this.experimentoActual = new Experimento(nombre);
        this.experimentos.add(experimentoActual);
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

    public List<String> getNombresExperimentos() {
        List<String> nombres = new ArrayList<>();
        for (Experimento experimento : this.experimentos) {
            nombres.add(experimento.getNombre());
        }
        return nombres;
    }
}
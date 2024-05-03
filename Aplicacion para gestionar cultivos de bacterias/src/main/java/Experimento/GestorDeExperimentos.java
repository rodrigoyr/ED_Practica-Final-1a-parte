package Experimento;

import Archivo.GestorDeArchivos;

public class GestorDeExperimentos {
    private Experimento experimentoActual;
    private GestorDeArchivos gestorDeArchivos;

    public GestorDeExperimentos() {
        this.gestorDeArchivos = new GestorDeArchivos();
    }

    public void crearNuevoExperimento() {
        this.experimentoActual = new Experimento();
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
}

package Experimento;

import PoblacionDeBacterias.PoblacionDeBacterias;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Experimento {
    private List<PoblacionDeBacterias> poblaciones;
    private String nombre;

    public Experimento(String nombre) {
        this.nombre = nombre;
        this.poblaciones = new ArrayList<>();
    }

    public void agregarPoblacion(PoblacionDeBacterias poblacion) {
        this.poblaciones.add(poblacion);
    }

    public void eliminarPoblacion(PoblacionDeBacterias poblacion) {
        this.poblaciones.remove(poblacion);
    }

    public List<PoblacionDeBacterias> getPoblaciones() {
        return this.poblaciones;
    }

    public void guardar(String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            for (PoblacionDeBacterias poblacion : poblaciones) {
                writer.write(poblacion.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public void cargar(String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                // Aquí deberías parsear la línea y crear una nueva PoblacionDeBacterias
                // Esto depende de cómo hayas implementado el método toString en la clase PoblacionDeBacterias
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
    }

    public String getNombre() {
        return this.nombre;
    }
}
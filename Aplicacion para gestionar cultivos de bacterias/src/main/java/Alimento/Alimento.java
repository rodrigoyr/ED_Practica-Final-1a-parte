package Alimento;

public class Alimento {
    private String nombre;
    private double cantidadNutrientes;

    public Alimento(String nombre, double cantidadNutrientes) {
        this.nombre = nombre;
        this.cantidadNutrientes = cantidadNutrientes;
    }

    // Getters y setters para cada campo

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidadNutrientes() {
        return cantidadNutrientes;
    }

    public void setCantidadNutrientes(double cantidadNutrientes) {
        this.cantidadNutrientes = cantidadNutrientes;
    }
}
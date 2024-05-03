package PoblacionDeBacterias;

import java.util.Date;

public class PoblacionDeBacterias {
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private int numeroBacteriasIniciales;
    private double temperatura;
    private String condicionesLuminosidad;
    private int dosisComida;

    public PoblacionDeBacterias(String nombre, Date fechaInicio, Date fechaFin, int numeroBacteriasIniciales, double temperatura, String condicionesLuminosidad, int dosisComida) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.numeroBacteriasIniciales = numeroBacteriasIniciales;
        this.temperatura = temperatura;
        this.condicionesLuminosidad = condicionesLuminosidad;
        this.dosisComida = dosisComida;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public int getNumeroBacteriasIniciales() {
        return numeroBacteriasIniciales;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public String getCondicionesLuminosidad() {
        return condicionesLuminosidad;
    }

    public int getDosisComida() {
        return dosisComida;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setNumeroBacteriasIniciales(int numeroBacteriasIniciales) {
        this.numeroBacteriasIniciales = numeroBacteriasIniciales;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setCondicionesLuminosidad(String condicionesLuminosidad) {
        this.condicionesLuminosidad = condicionesLuminosidad;
    }

    public void setDosisComida(int dosisComida) {
        this.dosisComida = dosisComida;
    }
}
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

    // Getters y setters para cada campo

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getNumeroBacteriasIniciales() {
        return numeroBacteriasIniciales;
    }

    public void setNumeroBacteriasIniciales(int numeroBacteriasIniciales) {
        this.numeroBacteriasIniciales = numeroBacteriasIniciales;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getCondicionesLuminosidad() {
        return condicionesLuminosidad;
    }

    public void setCondicionesLuminosidad(String condicionesLuminosidad) {
        this.condicionesLuminosidad = condicionesLuminosidad;
    }

    public int getDosisComida() {
        return dosisComida;
    }

    public void setDosisComida(int dosisComida) {
        this.dosisComida = dosisComida;
    }
}
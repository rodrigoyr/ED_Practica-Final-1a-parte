package PoblacionDeBacterias;

import java.util.ArrayList;
import java.util.List;

public class GestorDePoblaciones {
    private List<PoblacionDeBacterias> poblaciones;

    public GestorDePoblaciones() {
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
}
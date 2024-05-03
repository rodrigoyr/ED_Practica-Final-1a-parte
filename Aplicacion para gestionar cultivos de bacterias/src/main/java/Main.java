import PoblacionDeBacterias.PoblacionDeBacterias;
import Experimento.GestorDeExperimentos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GestorDeExperimentos gestor = new GestorDeExperimentos();

        // Crear la ventana principal
        JFrame frame = new JFrame("Gestor de Experimentos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear el panel principal
        JPanel panel = new JPanel();
        frame.add(panel);

        // Crear botones para cada acción
        JButton abrirButton = new JButton("Abrir un archivo que contenga un experimento");
        abrirButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String archivo = JOptionPane.showInputDialog("Introduce el nombre del archivo:");
                gestor.abrirExperimento(archivo);
            }
        });
        panel.add(abrirButton);

        JButton crearExperimentoButton = new JButton("Crear un nuevo experimento");
        crearExperimentoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog("Introduce el nombre del experimento:");
                gestor.crearNuevoExperimento(nombre);
            }
        });
        panel.add(crearExperimentoButton);

        JButton crearPoblacionButton = new JButton("Crear una población de bacterias y añadirla al experimento actual");
        crearPoblacionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí deberías abrir un nuevo diálogo para recoger todos los datos necesarios para crear una nueva PoblacionDeBacterias
                // Por ejemplo:
                String nombre = JOptionPane.showInputDialog("Introduce el nombre de la población:");
                // Y así sucesivamente para el resto de los datos
                // Finalmente, creas la nueva PoblacionDeBacterias y la añades al experimento actual
                PoblacionDeBacterias nuevaPoblacion = new PoblacionDeBacterias(nombre, new Date(), new Date(), 0, 0.0, "Alta", 0);
                gestor.getExperimentoActual().agregarPoblacion(nuevaPoblacion);
            }
        });
        panel.add(crearPoblacionButton);

        JButton visualizarPoblacionesButton = new JButton("Visualizar los nombres de todas las poblaciones de bacterias del experimento actual");
        visualizarPoblacionesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí deberías mostrar un diálogo con los nombres de todas las poblaciones de bacterias del experimento actual
            }
        });
        panel.add(visualizarPoblacionesButton);

        JButton borrarPoblacionButton = new JButton("Borrar una población de bacterias del experimento actual");
        borrarPoblacionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí deberías abrir un nuevo diálogo para que el usuario pueda seleccionar qué población de bacterias quiere borrar
            }
        });
        panel.add(borrarPoblacionButton);

        JButton verInformacionButton = new JButton("Ver información detallada de una población de bacterias del experimento actual");
        verInformacionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí deberías abrir un nuevo diálogo para que el usuario pueda seleccionar de qué población de bacterias quiere ver la información detallada
            }
        });
        panel.add(verInformacionButton);

        JButton guardarButton = new JButton("Guardar");
        guardarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String archivo = JOptionPane.showInputDialog("Introduce el nombre del archivo:");
                gestor.guardarExperimento(archivo);
            }
        });
        panel.add(guardarButton);

        JButton guardarComoButton = new JButton("Guardar como");
        guardarComoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String archivo = JOptionPane.showInputDialog("Introduce el nombre del archivo:");
                gestor.guardarExperimentoComo(archivo);
            }
        });
        panel.add(guardarComoButton);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
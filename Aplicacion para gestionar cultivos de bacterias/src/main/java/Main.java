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

        // Añadir el resto de los botones y sus ActionListener correspondientes
        // ...

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
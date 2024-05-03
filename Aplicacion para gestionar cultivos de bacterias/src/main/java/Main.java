import PoblacionDeBacterias.PoblacionDeBacterias;
import Experimento.GestorDeExperimentos;
import Experimento.Experimento;

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
                try {
                    String archivo = JOptionPane.showInputDialog("Introduce el nombre del archivo:");
                    gestor.abrirExperimento(archivo);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error al abrir el archivo: " + ex.getMessage());
                }
            }
        });
        panel.add(abrirButton);

        JButton crearExperimentoButton = new JButton("Crear un nuevo experimento");
        crearExperimentoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = JOptionPane.showInputDialog("Introduce el nombre del experimento:");
                    gestor.crearNuevoExperimento(nombre);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error al crear el experimento: " + ex.getMessage());
                }
            }
        });
        panel.add(crearExperimentoButton);

        JButton crearPoblacionButton = new JButton("Crear una población de bacterias y añadirla al experimento actual");
        crearPoblacionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = JOptionPane.showInputDialog("Introduce el nombre de la población:");
                    // Aquí deberías abrir un nuevo diálogo para recoger todos los datos necesarios para crear una nueva PoblacionDeBacterias
                    // Y así sucesivamente para el resto de los datos
                    // Finalmente, creas la nueva PoblacionDeBacterias y la añades al experimento actual
                    PoblacionDeBacterias nuevaPoblacion = new PoblacionDeBacterias(nombre, new Date(), new Date(), 0, 0.0, "Alta", 0);
                    gestor.getExperimentoActual().agregarPoblacion(nuevaPoblacion);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error al crear la población: " + ex.getMessage());
                }
            }
        });
        panel.add(crearPoblacionButton);

        JButton visualizarPoblacionesButton = new JButton("Visualizar los nombres de todas las poblaciones de bacterias del experimento actual");
        visualizarPoblacionesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Experimento experimentoActual = gestor.getExperimentoActual();
                    if (experimentoActual != null) {
                        StringBuilder nombres = new StringBuilder();
                        for (PoblacionDeBacterias poblacion : experimentoActual.getPoblaciones()) {
                            nombres.append(poblacion.getNombre()).append("\n");
                        }
                        JOptionPane.showMessageDialog(frame, nombres.toString());
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error al visualizar las poblaciones: " + ex.getMessage());
                }
            }
        });
        panel.add(visualizarPoblacionesButton);

        JButton borrarPoblacionButton = new JButton("Borrar una población de bacterias del experimento actual");
        borrarPoblacionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = JOptionPane.showInputDialog("Introduce el nombre de la población a borrar:");
                    Experimento experimentoActual = gestor.getExperimentoActual();
                    if (experimentoActual != null) {
                        for (PoblacionDeBacterias poblacion : experimentoActual.getPoblaciones()) {
                            if (poblacion.getNombre().equals(nombre)) {
                                experimentoActual.eliminarPoblacion(poblacion);
                                break;
                            }
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error al borrar la población: " + ex.getMessage());
                }
            }
        });
        panel.add(borrarPoblacionButton);

        JButton verInformacionButton = new JButton("Ver información detallada de una población de bacterias del experimento actual");
        verInformacionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = JOptionPane.showInputDialog("Introduce el nombre de la población:");
                    Experimento experimentoActual = gestor.getExperimentoActual();
                    if (experimentoActual != null) {
                        for (PoblacionDeBacterias poblacion : experimentoActual.getPoblaciones()) {
                            if (poblacion.getNombre().equals(nombre)) {
                                // Aquí deberías mostrar un diálogo con toda la información de la población
                                // Esto depende de cómo hayas implementado el método toString en la clase PoblacionDeBacterias
                                JOptionPane.showMessageDialog(frame, poblacion.toString());
                                break;
                            }
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error al visualizar la información de la población: " + ex.getMessage());
                }
            }
        });
        panel.add(verInformacionButton);

        JButton guardarButton = new JButton("Guardar");
        guardarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String archivo = JOptionPane.showInputDialog("Introduce el nombre del archivo:");
                    gestor.guardarExperimento(archivo);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error al guardar el experimento: " + ex.getMessage());
                }
            }
        });
        panel.add(guardarButton);

        JButton guardarComoButton = new JButton("Guardar como");
        guardarComoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String archivo = JOptionPane.showInputDialog("Introduce el nombre del archivo:");
                    gestor.guardarExperimentoComo(archivo);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error al guardar el experimento como: " + ex.getMessage());
                }
            }
        });
        panel.add(guardarComoButton);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
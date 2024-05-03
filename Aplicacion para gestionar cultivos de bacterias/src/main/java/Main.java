import PoblacionDeBacterias.PoblacionDeBacterias;
import Experimento.GestorDeExperimentos;
import Experimento.Experimento;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;
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
                    // Supongamos que tienes un método en el gestor que devuelve una lista de los nombres de todos los experimentos disponibles
                    List<String> nombresExperimentos = gestor.getNombresExperimentos();

                    // Creas un JComboBox con los nombres de los experimentos
                    JComboBox<String> comboBox = new JComboBox<>(nombresExperimentos.toArray(new String[0]));

                    // Muestras un diálogo para que el usuario seleccione un experimento
                    JOptionPane.showMessageDialog(null, comboBox, "Selecciona un experimento", JOptionPane.QUESTION_MESSAGE);

                    // Obtienes el experimento seleccionado
                    String nombreExperimentoSeleccionado = (String) comboBox.getSelectedItem();

                    // Abres el experimento seleccionado
                    gestor.abrirExperimento(nombreExperimentoSeleccionado);

                    // Obtienes el experimento actual (que es el que acabas de abrir)
                    Experimento experimentoActual = gestor.getExperimentoActual();

                    // Muestras todos los datos del experimento
                    JOptionPane.showMessageDialog(frame, experimentoActual.toString());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error al abrir el experimento: " + ex.getMessage());
                }
            }
        });
        panel.add(abrirButton);

        JButton crearExperimentoButton = new JButton("Crear un nuevo experimento");
        crearExperimentoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombreExperimento = JOptionPane.showInputDialog("Introduce el nombre del experimento:");
                    gestor.crearNuevoExperimento(nombreExperimento);

                    String nombrePoblacion = JOptionPane.showInputDialog("Introduce el nombre de la población:");
                    Date fechaInicio = new Date(); // Aquí deberías abrir un nuevo diálogo para recoger la fecha de inicio
                    Date fechaFin = new Date(); // Aquí deberías abrir un nuevo diálogo para recoger la fecha de fin
                    int numeroBacteriasIniciales = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de bacterias iniciales:"));
                    double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura:"));
                    String condicionesLuminosidad = JOptionPane.showInputDialog("Introduce las condiciones de luminosidad (Alta, Media, Baja):");
                    int dosisComida = Integer.parseInt(JOptionPane.showInputDialog("Introduce la dosis de comida:"));

                    // Finalmente, creas la nueva PoblacionDeBacterias y la añades al experimento actual
                    PoblacionDeBacterias nuevaPoblacion = new PoblacionDeBacterias(nombrePoblacion, fechaInicio, fechaFin, numeroBacteriasIniciales, temperatura, condicionesLuminosidad, dosisComida);
                    gestor.getExperimentoActual().agregarPoblacion(nuevaPoblacion);
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
                    Date fechaInicio = new Date(); // Aquí deberías abrir un nuevo diálogo para recoger la fecha de inicio
                    Date fechaFin = new Date(); // Aquí deberías abrir un nuevo diálogo para recoger la fecha de fin
                    int numeroBacteriasIniciales = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de bacterias iniciales:"));
                    double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura:"));
                    String condicionesLuminosidad = JOptionPane.showInputDialog("Introduce las condiciones de luminosidad (Alta, Media, Baja):");
                    int dosisComida = Integer.parseInt(JOptionPane.showInputDialog("Introduce la dosis de comida:"));

                    // Finalmente, creas la nueva PoblacionDeBacterias y la añades al experimento actual
                    PoblacionDeBacterias nuevaPoblacion = new PoblacionDeBacterias(nombre, fechaInicio, fechaFin, numeroBacteriasIniciales, temperatura, condicionesLuminosidad, dosisComida);
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
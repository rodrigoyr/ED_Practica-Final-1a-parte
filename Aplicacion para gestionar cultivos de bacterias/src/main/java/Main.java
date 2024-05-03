
import PoblacionDeBacterias.PoblacionDeBacterias;
import Experimento.GestorDeExperimentos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorDeExperimentos gestor = new GestorDeExperimentos();

        while (true) {
            System.out.println("1. Abrir un archivo que contenga un experimento");
            System.out.println("2. Crear un nuevo experimento");
            System.out.println("3. Crear una población de bacterias y añadirla al experimento actual");
            System.out.println("4. Visualizar los nombres de todas las poblaciones de bacterias del experimento actual");
            System.out.println("5. Borrar una población de bacterias del experimento actual");
            System.out.println("6. Ver información detallada de una población de bacterias del experimento actual");
            System.out.println("7. Guardar");
            System.out.println("8. Guardar como");
            System.out.println("9. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre del archivo:");
                    String archivo = scanner.nextLine();
                    gestor.abrirExperimento(archivo);
                    break;
                case 2:
                    System.out.println("Introduce el nombre del experimento:");
                    String nombre = scanner.nextLine();
                    break;
                case 3:
                    // Aquí deberías pedir al usuario los detalles de la nueva población y luego agregarla al experimento
                    break;
                case 4:
                    // Aquí deberías imprimir los nombres de todas las poblaciones en el experimento
                    break;
                case 5:
                    // Aquí deberías pedir al usuario el nombre de la población a eliminar y luego eliminarla del experimento
                    break;
                case 6:
                    // Aquí deberías pedir al usuario el nombre de la población y luego imprimir sus detalles
                    break;
                case 7:
                    System.out.println("Introduce el nombre del archivo para guardar:");
                    String archivoGuardar = scanner.nextLine();
                    gestor.guardarExperimento(archivoGuardar);
                    break;
                case 8:
                    System.out.println("Introduce el nombre del nuevo archivo para guardar:");
                    String archivoGuardarComo = scanner.nextLine();
                    gestor.guardarExperimentoComo(archivoGuardarComo);
                    break;
                case 9:
                    System.exit(0);
            }
        }
    }
}
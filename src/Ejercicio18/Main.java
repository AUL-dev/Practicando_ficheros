package Ejercicio18;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el nombre de un archivo: ");
        String nombreArchivo = scanner.nextLine();
        try {
            File archivo = new File(nombreArchivo);
            if (archivo.exists()) {
                if (archivo.canExecute()) {
                    System.out.println("El archivo se puede ejecutar.");
                }
                if (archivo.canRead()) {
                    System.out.println("El archivo se puede leer.");
                }
                if (archivo.canWrite()) {
                    System.out.println("El archivo se puede sobreescribir.");
                }
            } else {
                System.err.println("No existe el archivo.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

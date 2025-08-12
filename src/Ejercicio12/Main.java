package Ejercicio12;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el nombre del archivo: ");
        String nombreArchivo = scanner.nextLine();
        try {
            File archivo = new File(nombreArchivo);
            if (archivo.exists()) {
                System.out.println("El archivo existe.");
            } else {
                System.err.println("El archivo no existe.");
            }
            if (archivo.isDirectory()) {
                System.out.println("El archivo es un directorio.");
            } else {
                System.out.println(("El archivo es un fichero"));
            }

            System.out.println(archivo.lastModified());
            System.out.println(archivo.length() + " bytes.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

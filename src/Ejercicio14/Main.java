package Ejercicio14;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el nombre del archivo existente: ");
        String archivoActual = scanner.nextLine();
        System.out.println("Escriba el nuevo nombre del archivo: ");
        String archivoNuevo = scanner.nextLine();
        try {
            File archivo = new File(archivoActual);
            File nuevoNombre = new File(archivoNuevo);
            if (archivo.exists()) {
                System.out.println("¿El archivo se ha renombrado?: "+archivo.renameTo(nuevoNombre));
            } else {
                System.err.println("El archivo no existe.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}

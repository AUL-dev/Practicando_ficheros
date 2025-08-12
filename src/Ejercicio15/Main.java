package Ejercicio15;

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
                System.out.println("¿El archivo ha sido borrado?"+archivo.delete());
            } else {
                System.err.println("El archivo no existe.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

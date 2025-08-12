package Ejercicio16;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el nombre de un directorio: ");
        String nombreDirectorio = scanner.nextLine();
        try {
            File directorio = new File(nombreDirectorio);
            if (directorio.exists()) {
                System.out.println("Ruta absoluta: " + directorio.getAbsolutePath());
            } else {
                System.err.println("El directorio no existe.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

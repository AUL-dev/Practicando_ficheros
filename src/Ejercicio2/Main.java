package Ejercicio2;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el nombre de un fichero que exista.");
        String nombreFichero = scanner.nextLine();
        System.out.println("Escribe la cadena de texto.");
        String cadenaTexto = scanner.nextLine();

        try {
            File fichero = new File(nombreFichero);
            if (fichero.exists()) {
                FileWriter escribirFichero = new FileWriter(fichero);
                escribirFichero.write(cadenaTexto);
                escribirFichero.close();
                System.out.println("Se ha imprimido correctamente.");
            } else {
                System.err.println("No existe el fichero");
            }
        } catch (IOException excepcion) {
            System.out.println(excepcion);
        }

    }
}
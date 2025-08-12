package Ejercicio1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el nombre del fichero.");
        String nombreFichero = scanner.nextLine();
        System.out.println("Escriba la cadena de texto.");
        String cadenaTexto = scanner.nextLine();
        try {
            FileWriter fichero = new FileWriter(nombreFichero);

            fichero.write(cadenaTexto);

            fichero.close();
        } catch (IOException excepcion) {
            System.out.println(excepcion);
        }


    }
}

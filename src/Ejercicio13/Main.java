package Ejercicio13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    // Pedir por teclado un nombre de archivo y otro nombre con el que
    // queremos copiarlo, tras comprobar que existe el fichero a copiar,
    // crear una copia del fichero.
    public static void main(String[] args) {
        // Paso 1: Pedir por teclado el nombre del archivo origen.
        // Paso 2: Pedir el archivo destino.
        // Paso 3: Comprobar que el archivo origen existe.
        // Paso 4: El archivo origen y el archivo destino, lo asociaria a las clases correspondientes
        // Paso 5: Copiarlo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el nombre del archivo origen: ");
        String archivoOrigen = scanner.nextLine();
        System.out.println("Escriba el nombre del archivo destino: ");
        String archivoDestino = scanner.nextLine();
        try {//HAY QUE COPIAR LA RUTA ENTERA AL RESPONDER POR CONSOLA????
            File miArchivoEntrada = new File(archivoOrigen);
            File miArchivoSalida = new File(archivoDestino);
            if (miArchivoEntrada.exists()) {
                FileInputStream archivoEntrada = new FileInputStream(miArchivoEntrada);
                FileOutputStream archivoSalida = new FileOutputStream(miArchivoSalida);
                byte[] buffer = new byte[1024];
                int longitud;
                while ((longitud = archivoEntrada.read(buffer)) > 0) {
                    archivoSalida.write(buffer, 0, longitud);
                }
                archivoEntrada.close();
                archivoSalida.close();
                System.out.println("El fichero ha sido copiado con Éxito!!!");
            } else {
                System.err.println("El archivo no existe.");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

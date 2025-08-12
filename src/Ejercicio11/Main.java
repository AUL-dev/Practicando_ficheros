package Ejercicio11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    // Actividad 11.- Realiza un programa que diga cuántas ocurrencias de una palabra hay en un fichero.
    // La estructura del fichero será:
    //      - Rojo, Verde, Coche, Azul, Coche, Locomotora, Coche.
    public static void main(String[] args) {
        // Paso 1: Leer un fichero con el BufferReader (Strings)
        // Paso 2: Te montas un contador con cada variable, y asocias la variable y por cada palabra repetida
        //         sumamos el contador.

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escriba la palabra deseada para saber su número de ocurrencias: ");
            String palabra = scanner.nextLine();
            int contadorPalabra = 0;
            FileReader lecturaArchivo = new FileReader("resources/ejercicio11/Ficheroejercicio11");
            BufferedReader miBuffer = new BufferedReader(lecturaArchivo);
            String lecturaLinea = miBuffer.readLine();
            while (lecturaLinea != null) {
                if (lecturaLinea.equalsIgnoreCase(palabra)) {
                    contadorPalabra++;
                }
                System.out.println(lecturaLinea);
                lecturaLinea = miBuffer.readLine();
            }
            System.out.println("El número de ocurrencias de la palabra escogida es: " + contadorPalabra);
            miBuffer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

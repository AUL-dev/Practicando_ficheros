package Ejercicio9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    /*
      Escribe un programa que guarde en un fichero el contenido de otros dos ficheros,
      de tal forma que en el fichero resultante aparezcan las líneas de los dos
      ficheros.
      2 ficheros entrada. LEER
      1 salida - Escribir
     */
    public static void main(String[] args) throws IOException {
        try {
            FileReader ficheroOrigen = new FileReader("resources/ejercicio9/fichero1");
            FileReader ficheroOrigen2 = new FileReader("resources/ejercicio9/fichero2");

            FileWriter ficheroDestino = new FileWriter("resources/ejercicio9/ficheroDestino");

            BufferedReader buffer = new BufferedReader(ficheroOrigen);
            BufferedReader miBuffer2 = new BufferedReader(ficheroOrigen2);


            String lineasFichero = buffer.readLine();
            ficheroDestino.write("*** FICHERO 1 ***");
            while (lineasFichero != null) {
                System.out.println(lineasFichero);
                ficheroDestino.write("\n" + lineasFichero);
                lineasFichero = buffer.readLine();
            }

            buffer.close();

            String lineasFichero2 = miBuffer2.readLine();
            ficheroDestino.write("\n"+"*** FICHERO 2 ***");
            while (lineasFichero2 != null) {
                System.out.println(lineasFichero2);
                ficheroDestino.write("\n" + lineasFichero2);
                lineasFichero2 = miBuffer2.readLine();
            }
            miBuffer2.close();
            ficheroDestino.close();



        } catch (IOException e) {
            System.out.println(e);
        }
    }
}



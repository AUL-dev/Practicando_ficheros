package Ejercicio10;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    /*Realiza un programa que sea capaz de ordenar alfabéticamente los nombres
     contenidos en un fichero de texto. El nombre del fichero resultado debe ser el
     mismo que el original añadiendo "_sort", por ejemplo palabras_sort.txt. Suponemos
     que cada palabra ocupa una línea. Sugerencia: Utilizar Arrays.sort(nombres); para
     ordenar el array importando java.util.Arrays;

     */
    public static void main(String[] args) throws IOException {
        // Primer paso: Leer un fichero.
        // Segundo paso: Crear un array rellenarlo
        // Tercer paso: Ordenar el fichero alfabéticamente (Arrays.sort(...))
        // Cuarto paso: Escribir en el palabras_sort.txt
        ArrayList<String> listado = new ArrayList<>();
        lectura(listado);
        escritura(listado);
    }

    public static void lectura(ArrayList<String> listado) {
        try {
            FileReader lecturaFichero = new FileReader("resources/ejercicio10/palabras");
            BufferedReader lecturaBuffer = new BufferedReader(lecturaFichero);
            String cadena = lecturaBuffer.readLine();
            while (cadena != null) {
                System.out.println(cadena);
                listado.add(cadena);
                cadena = lecturaBuffer.readLine();
            }
            lecturaFichero.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void escritura(ArrayList<String> listado) {
        try {
            FileWriter escrituraFichero = new FileWriter("resources/ejercicio10/palabras_sort");
            BufferedWriter escrituraBuffer = new BufferedWriter(escrituraFichero);
            Collections.sort(listado);
            for (String lista : listado) {
                escrituraBuffer.write(lista);
                escrituraBuffer.newLine();
            }
            escrituraBuffer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}









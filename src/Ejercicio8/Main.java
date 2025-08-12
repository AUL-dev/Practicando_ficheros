package Ejercicio8;


import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader lecturaFichero = new FileReader("Productos.txt");
            BufferedReader miBuffer = new BufferedReader(lecturaFichero);
            String productos = miBuffer.readLine();
            int contador = 0;

            while (productos != null) {

                if (0 == contador) {
                    System.out.print(productos);
                } else {
                    System.out.print("\n" + productos);
                }
                productos = miBuffer.readLine();
                contador++;
            }

            lecturaFichero.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

package Ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el nombre de un fichero: ");
        String nombreFichero = scanner.nextLine();
        try {
            FileReader lecturaFichero = new FileReader(nombreFichero);
            BufferedReader miBuffer = new BufferedReader(lecturaFichero);
            System.out.println(miBuffer.readLine());
            lecturaFichero.close();
        } catch (IOException excepcion) {
            System.out.println(excepcion);
        }
    }
}


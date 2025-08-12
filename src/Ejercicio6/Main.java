package Ejercicio6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader lecturaFichero = new FileReader("alumnos.txt");
            BufferedReader miBuffer = new BufferedReader(lecturaFichero);
            String alumno = miBuffer.readLine();
            while (alumno  != null) {
                System.out.println(alumno);
                alumno = miBuffer.readLine();
            }
            lecturaFichero.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}



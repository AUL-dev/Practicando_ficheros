package Ejercicio5;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el nombre de un alumno: ");
        String nombreAlumno = scanner.nextLine();
        try {
            FileWriter ficheroAlumnos = new FileWriter("alumnos.txt",true);
            ficheroAlumnos.write("\n" + nombreAlumno);
            ficheroAlumnos.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

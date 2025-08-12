package Ejercicio4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el nombre del fichero del alumno: ");
        String ficheroAlumno = scanner.nextLine();
        System.out.println("Escriba el nombre: ");
        String nombreAlumno = scanner.nextLine();
        System.out.println("Escriba los apellidos: ");
        String apellidosAlumno = scanner.nextLine();
        System.out.println("Escriba la edad: ");
        int edadAlumno = scanner.nextInt();
        try {
            FileWriter fichero = new FileWriter(ficheroAlumno + ".txt");
            fichero.write("Nombre: " + nombreAlumno);
            fichero.write("\nApellidos: " + apellidosAlumno);
            fichero.write("\nEdad: " + edadAlumno);
            fichero.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}

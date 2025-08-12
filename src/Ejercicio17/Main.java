package Ejercicio17;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el nombre de un directorio: ");
        String nombreDirectorio = scanner.nextLine();
        try {
            File directorio = new File(nombreDirectorio);
            if (!directorio.exists()) {
                if (directorio.mkdir()) {
                    System.out.println("La carpeta ha sido creada.");
                } else {
                    System.err.println("Ha ocurrido un error.");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

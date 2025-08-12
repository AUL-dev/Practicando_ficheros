package Ejercicio19;

import java.io.File;


public class Main {
    public static void main(String[] args) {
        File directorio = new File("resources/ejercicio19");
        String[] listado = directorio.list();

        if (listado != null) {
            for (String lista : listado) {
                System.out.println(lista);
            }
        } else {
            System.out.println("No existen ficheros en el directorio.");
        }
    }
}

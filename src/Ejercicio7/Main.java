package Ejercicio7;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        String[] descripcionProductos = new String[10];
        descripcionProductos[0] = "Verde";
        descripcionProductos[1] = "Rojo";
        descripcionProductos[2] = "Azul";
        descripcionProductos[3] = "Amarillo";
        descripcionProductos[4] = "Negro";
        descripcionProductos[5] = "Blanco";
        descripcionProductos[6] = "Gris";
        descripcionProductos[7] = "Morado";
        descripcionProductos[8] = "Rosa";
        descripcionProductos[9] = "Malva";

        try {
            FileWriter aniadirProductos = new FileWriter("Productos.txt");

            for (int i = 0; i < descripcionProductos.length; i++) {
                if (i == descripcionProductos.length - 1) {
                    aniadirProductos.write(descripcionProductos[i]);
                    break;
                }
                aniadirProductos.write(descripcionProductos[i] + " \n");
            }
            aniadirProductos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

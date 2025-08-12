package Ejercicio21;

import java.io.*;

public class SerializarObjeto {

    private static File miFichero = new File("resources/ejercicio21/Vuelo.txt");

    private static FileOutputStream escrituraBytes;

    static {
        try {
            escrituraBytes = new FileOutputStream(miFichero);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static ObjectOutputStream flujoDatos;

    static {
        try {
            flujoDatos = new ObjectOutputStream(escrituraBytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        Vuelo vuelo1 = new Vuelo(1, "Madrid", "Barcelona", 200, 350);
        VueloV2 vuelo2 = new VueloV2(2, "Madrid", "Valladolid", 154, 276, 120);
        escrituraObjetos(vuelo1);
        escrituraObjetos1(vuelo2);
        lecturaObjetos();


    }

    public static void escrituraObjetos(Vuelo mivuelo) {
        try {
            flujoDatos.writeObject(mivuelo);
            flujoDatos.close();
            System.out.println("El vuelo se ha guardado correctamente.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void lecturaObjetos() throws IOException {
        File miFichero = new File("resources/ejercicio21/Vuelo.txt");
        int contador = 0;
        FileInputStream lecturaBytes = new FileInputStream(miFichero);
        ObjectInputStream lecturaFlujoDatos = new ObjectInputStream(lecturaBytes);
        try {

            while (true) {

                if (contador % 2 == 0) {
                    Vuelo vuelo = (Vuelo) lecturaFlujoDatos.readObject();
                    System.out.println(vuelo);
                    contador++;
                } else {
                    VueloV2 vuelo2 = (VueloV2) lecturaFlujoDatos.readObject();
                    System.out.println(vuelo2);
                    contador++;
                }

            }
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (EOFException ex) {
            lecturaFlujoDatos.close();
            System.out.println("HEMOS TERMINADO.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void escrituraObjetos1(VueloV2 nuevoVuelo) {

        try {
            flujoDatos.writeObject(nuevoVuelo);
            flujoDatos.close();
            System.out.println("El vuelo se ha guardado correctamente.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }


}




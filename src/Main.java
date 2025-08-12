import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String cadena = "\nEste texto se ha añadido.";
        try {
            FileWriter fichero = new FileWriter("cadena.txt", false);
            for (int i = 0; i < cadena.length(); i++) {
                fichero.write(cadena.charAt(i));
            }

            fichero.close();
        } catch (IOException e) {
            System.out.println("Error en el fichero");
        }

    }
}
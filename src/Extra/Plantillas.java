package Extra;

public class Plantillas {


    private <T> void hola(T hola) {
        if (hola instanceof String) {
            System.out.println(hola);
        }
    }
}

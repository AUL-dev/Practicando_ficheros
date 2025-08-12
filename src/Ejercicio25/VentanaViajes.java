package Ejercicio25;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaViajes extends JFrame {
    private JPanel panel;
    private JLabel labelCodigo;
    private JTextField textFieldEscribirCodigo;
    private JButton btnAceptar;
    private JButton btnSalir;
    private JTextArea textArea1;
    private Viaje[] viajes;

    public VentanaViajes() {
        onInit();
        rellenarArray();

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarCampos();
                mostrarDatos();

            }
        });
    }

    public void onInit() {
        this.setTitle("Mi Aplicación Java");
        this.setSize(500, 300);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setContentPane(panel);
    }

    public void rellenarArray() {
        viajes = new Viaje[5];
        viajes[0] = new Viaje(1, "Madrid", "Ritz", "Cena", 350);
        viajes[1] = new Viaje(2, "Barcelona", "4Seasons", "Alojamiento", 174);
        viajes[2] = new Viaje(3, "Asturias", "Estrella", "Desayuno", 230);
        viajes[3] = new Viaje(4, "Sevilla", "Monet", "Comida", 460);
        viajes[4] = new Viaje(5, "Mallorca", "Costa Sol", "Alojamiento", 155);
    }

    public void validarCampos() {
        float option;
        try {
            option = Float.parseFloat(textFieldEscribirCodigo.getText());
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

        if (option < 1 || option > 5) {
            JOptionPane.showMessageDialog(null, "Código fuera de rango.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarDatos() {

        int numCodigo = Integer.parseInt(textFieldEscribirCodigo.getText()) - 1;

        textArea1.setText("El código es: " + viajes[numCodigo].getCodigo()
                + "\nEl destino es: " + viajes[numCodigo].getDestino()
                + "\nEl hotel es: " + viajes[numCodigo].getHotel()
                + "\nEl régimen de alojamiento es: " + viajes[numCodigo].getRegimenAlojamiento()
                + "\nEl precio es de: " + viajes[numCodigo].getPrecio());
    }

    public static void main(String[] args) {
        VentanaViajes totalViajes = new VentanaViajes();
    }

}


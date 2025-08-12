package Ejercicio24;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotaFinal extends JFrame {
    private JPanel panel;
    private JLabel labelNombre;
    private JLabel labelNotaTeoria;
    private JLabel labelNotaPractica;
    private JLabel labelNotaFinal;
    private JTextField textFieldNombre;
    private JTextField textFieldNotaTeoria;
    private JTextField textFieldNotaPractica;
    private JLabel labelCalificacionFinal;
    private JButton btnSaberNota;
    private JLabel txtLabel;

    public NotaFinal() {
        onInit();
        btnSaberNota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarCampos();
                try {
                    labelCalificacionFinal.setText(mediaFinal() + "");
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }


            }
        });
    }

    public void onInit() {
        this.setTitle("Mi Aplicación Java");
        this.setSize(500, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setContentPane(panel);
    }

    public void validarCampos() {
        String texto = textFieldNombre.getText().trim().toLowerCase();
        if (texto.isEmpty() || !texto.matches("[\\p{L}]+")) {
            JOptionPane.showMessageDialog(null, "Escribe un nombre correcto", "", JOptionPane.ERROR_MESSAGE);
        }
        try {
            Float.parseFloat(textFieldNotaTeoria.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Introduzca un número.", "Error de conversión.", JOptionPane.ERROR_MESSAGE);
        }
        if (Float.parseFloat(textFieldNotaTeoria.getText()) < 0 || (Float.parseFloat(textFieldNotaTeoria.getText()) > 10)) {
            JOptionPane.showMessageDialog(null, "No se puede introducir números fuera del rango.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            Float.parseFloat(textFieldNotaPractica.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Introduzca un número.", "Error de conversión.", JOptionPane.ERROR_MESSAGE);
        }
        if (Float.parseFloat(textFieldNotaPractica.getText()) < 0 || (Float.parseFloat(textFieldNotaPractica.getText()) > 10)) {
            JOptionPane.showMessageDialog(null, "No se puede introducir números fuera del rango.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public float mediaFinal() throws Exception {
        //NOTATEORIA 20%
        //NOTAPRACTICA 80%
        float mediaTeoria = Float.parseFloat(textFieldNotaTeoria.getText());
        float mediaPractica = Float.parseFloat(textFieldNotaPractica.getText());
        mediaTeoria = mediaTeoria * 20 / 100;
        mediaPractica = mediaPractica * 80 / 100;
        float resultado = mediaTeoria + mediaPractica;
        if (resultado < 0 || resultado > 10) {
            throw new RuntimeException("Error interno.");
        }
        if (resultado < 5) {
            txtLabel.setText(" suspendido.");
            System.out.println("Has sacado un: " + resultado + " estás SUSPENDIDO!!!!!!");
        } else {
            txtLabel.setText(" aprobado.");
            System.out.println("Has sacado un: " + resultado + " estás APROBADO!!!!!!");
        }
        return resultado;
    }

    public static void main(String[] args) {
        NotaFinal nota1 = new NotaFinal();

    }
}

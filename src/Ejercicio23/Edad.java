package Ejercicio23;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Edad extends JFrame {
    private JTextField escribirNombre;
    private JLabel edad;
    private JLabel fecha;
    private JLabel nombre;
    private JTextField escribirFecha;
    private JButton btnSaberEdad;
    private JPanel panel;
    private JLabel anios;

    public Edad() {
        onInit();
        btnSaberEdad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarCampos();
                anios.setText(obtenerEdad() + "");
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

    public static void main(String[] args) {
        Edad ventana = new Edad();

    }

    public void validarCampos() {
        try {
            escribirFecha.getText();
            DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate.parse(escribirFecha.getText(), formatoFecha);
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, "Escribe una fecha correcta.", "", JOptionPane.ERROR_MESSAGE);
        }

        String texto = escribirNombre.getText().trim().toLowerCase();
        if (texto.isEmpty() || !texto.matches("[\\p{L}]+")) {
            JOptionPane.showMessageDialog(null, "Escribe un nombre correcto", "", JOptionPane.ERROR_MESSAGE);
        }
    }

    public long obtenerEdad() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(escribirFecha.getText(), formatoFecha);

        long anios = ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
        return anios;
    }


}

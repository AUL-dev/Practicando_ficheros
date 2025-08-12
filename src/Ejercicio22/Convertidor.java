package Ejercicio22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Convertidor extends JFrame {
    private JPanel panel;
    private JLabel euros;
    private JTextField dinero;
    private JComboBox comboBox1;
    private JButton btnConvertir;
    private JLabel dineroConvertido;


    public Convertidor() {
        onInit();
        btnConvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarCampos();
                dineroConvertido.setText(conversor() + "");
            }
        });
        // Escuchar tecla Enter en toda la ventana
        KeyboardFocusManager.getCurrentKeyboardFocusManager()
                .addKeyEventDispatcher(new KeyEventDispatcher() {
                    @Override
                    public boolean dispatchKeyEvent(KeyEvent e) {

                        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                            validarCampos();
                            dineroConvertido.setText(conversor() + "");
                            return true;
                        }
                        return false;
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
        Convertidor convertidor = new Convertidor();
    }

    public float conversor() {
        String trim = comboBox1.getSelectedItem().toString().replaceAll("\\s+", "");
        TiposMonedas tiposMonedas = TiposMonedas.valueOf(trim);

        float dineroTransformado = 0;
        switch (tiposMonedas) {
            case Dolares:
                dineroTransformado = Float.parseFloat(dinero.getText()) * 0.80f;
                break;
            case Libras:
                dineroTransformado = Float.parseFloat(dinero.getText()) * 1.15f;
                break;
            case FrancoSuizo:
                dineroTransformado = Float.parseFloat(dinero.getText()) * 0.90f;
                break;
            default:
                throw new RuntimeException("Error interno.");
        }
        return dineroTransformado;
    }

    public void validarCampos() {
        try {
            Float.parseFloat(dinero.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Introduzca un número.", "Error de conversión.", JOptionPane.ERROR_MESSAGE);
        }
        if (Float.parseFloat(dinero.getText()) < 0) {
            JOptionPane.showMessageDialog(null, "No se puede introducir números negativos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}



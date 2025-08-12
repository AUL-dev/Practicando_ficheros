package Ejercicio26;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JPanel panel;
    private JLabel labelResultado;
    private JTextField textFieldNum1;
    private JTextField textFieldNum2;
    private JButton btnSumar;
    private JButton bntRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    private JButton btnSalir;

    public Calculadora() {
        onInit();

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarCampos();
                float resultado = tipoOperaciones(TiposOperaciones.Suma);
                labelResultado.setText(resultado + "");


            }
        });
        bntRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarCampos();
                float resultado = tipoOperaciones(TiposOperaciones.Resta);
                labelResultado.setText(resultado + "");
            }
        });
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarCampos();
                float resultado = tipoOperaciones(TiposOperaciones.Multiplicacion);
                labelResultado.setText(resultado + "");
            }
        });
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarCampos();
                float resultado = tipoOperaciones(TiposOperaciones.Division);
                labelResultado.setText(resultado + "");
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

    public float tipoOperaciones(TiposOperaciones operacion) {
        Float num1 = Float.parseFloat(textFieldNum1.getText());
        Float num2 = Float.parseFloat(textFieldNum2.getText());
        float resultado = 0;
        switch (operacion) {
            case Suma:
                resultado = num1 + num2;
                break;
            case Resta:
                resultado = num1 - num2;
                break;
            case Multiplicacion:
                resultado = num1 * num2;
                break;
            case Division:
                if(num1 != 0 || num2 != 0) {
                    resultado = num1 / num2;
                }
                break;
            default:
                throw new RuntimeException();
        }
        return resultado;
    }

    public void validarCampos() {
        try {
            float num1 = Float.parseFloat(textFieldNum1.getText());
            float num2 = Float.parseFloat(textFieldNum2.getText());
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora();
    }
}

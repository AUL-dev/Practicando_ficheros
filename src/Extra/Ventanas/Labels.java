package Extra.Ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Labels extends JFrame {
    private JButton btnCambiarTexto;
    private JPanel panel1;
    private JLabel label1;
    private JButton btnSalir;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JButton btnComboBox;

    public Labels() {
        onInit();
        cambiarTextos();

        btnCambiarTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText(textField1.getText());
            }
        });
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText(comboBox1.getSelectedItem().toString());
            }
        });
    }


    public void onInit() {
        this.setTitle("Mi Aplicación Java");
        this.setSize(500, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(panel1);

    }

    public void cambiarTextos() {
        btnCambiarTexto.setText("Aceptar");
        label1.setText("Hola mundo");
        btnSalir.setText("Salir");
    }

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
                "CREDENCIALES INCORRECTAS",
                "ERROR",
                JOptionPane.ERROR_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "CREDENCIALES INCORRECTAS",
                "ERROR",
                JOptionPane.INFORMATION_MESSAGE);

        int confirmacion = JOptionPane.showConfirmDialog(
                null,
                "¿Desea guardar los cambios?",
                "Confirmar",
                JOptionPane.DEFAULT_OPTION);


        //Labels label2 = new Labels();

    }
}

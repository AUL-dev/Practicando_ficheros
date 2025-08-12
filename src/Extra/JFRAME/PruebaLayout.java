package Extra.JFRAME;

import javax.swing.*;

public class PruebaLayout extends JFrame {
    private JTextArea holaTextArea;
    private JPanel panel1;
    private JLabel jlabel1;

    public PruebaLayout() {
        this.setTitle("Mi Aplicación Java");
        this.setSize(500,300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.jlabel1.setText("Texto de ejemplo");
        this.setContentPane(panel1);
    }

    public static void main(String[] args) {
        PruebaLayout pruebaLayout = new PruebaLayout();
        pruebaLayout.setVisible(true);

    }
}

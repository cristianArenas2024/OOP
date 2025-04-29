import javax.swing.*;
import java.awt.*;

public class Visual extends JFrame {
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JLabel resultLabel;
    private JButton sumarButton;
    private JButton restarButton;
    private JButton multiplicarButton;
    private JButton potenciaButton;

    public Visual() {

        setTitle("Calculadora");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

 
        textFieldA = new JTextField();
        textFieldB = new JTextField();
        resultLabel = new JLabel("Resultado:");
        sumarButton = new JButton("Sumar");
        restarButton = new JButton("Restar");
        multiplicarButton = new JButton("Multiplicar");
        potenciaButton = new JButton("Potencia");


        add(new JLabel("Número A:"));
        add(textFieldA);
        add(new JLabel("Número B:"));
        add(textFieldB);
        add(sumarButton);
        add(restarButton);
        add(multiplicarButton);
        add(potenciaButton);
        add(resultLabel);
    }

  
    public JTextField getTextFieldA() {
        return textFieldA;
    }

    public JTextField getTextFieldB() {
        return textFieldB;
    }

    public JLabel getResultLabel() {
        return resultLabel;
    }

    public JButton getSumarButton() {
        return sumarButton;
    }

    public JButton getRestarButton() {
        return restarButton;
    }

    public JButton getMultiplicarButton() {
        return multiplicarButton;
    }

    public JButton getPotenciaButton() {
        return potenciaButton;
    }
}

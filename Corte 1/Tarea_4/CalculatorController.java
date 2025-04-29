import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private Operations operations;
    private Visual calculatorUI;

    public CalculatorController(Visual calculatorUI, Operations operations) {
        this.calculatorUI = calculatorUI;
        this.operations = operations;


        this.calculatorUI.getSumarButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("sumar");
            }
        });

        this.calculatorUI.getRestarButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("restar");
            }
        });

        this.calculatorUI.getMultiplicarButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("multiplicar");
            }
        });

        this.calculatorUI.getPotenciaButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("potencia");
            }
        });
    }

    private void performOperation(String operation) {
        try {
            int numA = Integer.parseInt(calculatorUI.getTextFieldA().getText());
            int numB = Integer.parseInt(calculatorUI.getTextFieldB().getText());

            int result = 0;

            switch (operation) {
                case "sumar":
                    result = operations.sumar(numA, numB);
                    break;
                case "restar":
                    result = operations.restar(numA, numB);
                    break;
                case "multiplicar":
                    result = operations.multiplicar(numA, numB);
                    break;
                case "potencia":
                    result = operations.potencia(numA, numB);
                    break;
            }

            calculatorUI.getResultLabel().setText("Resultado: " + result);
        } catch (NumberFormatException ex) {
            calculatorUI.getResultLabel().setText("Por favor, ingrese números válidos.");
        }
    }
}

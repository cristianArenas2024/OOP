import javax.swing.JOptionPane;

public class Calculator {

    private Operations operations;

    // Constructor que recibe la clase Operations
    public Calculator(Operations operations) {
        this.operations = operations;
    }

    // Método para pedir los dos números
    public int[] getNumbers() {
        String inputA = JOptionPane.showInputDialog("Ingrese el primer número:");
        String inputB = JOptionPane.showInputDialog("Ingrese el segundo número:");

        try {
            // Convertir los valores ingresados a enteros
            int numA = Integer.parseInt(inputA);
            int numB = Integer.parseInt(inputB);
            return new int[]{numA, numB}; // Retorna los números en un arreglo
        } catch (NumberFormatException e) {
            // Manejo de error en caso de que los valores no sean números
            JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos.");
            return null;
        }
    }

    // Método para mostrar los resultados de las operaciones
    public void showResults(int numA, int numB) {
        int suma = operations.sumar(numA, numB);
        int resta = operations.restar(numA, numB);
        int multiplicacion = operations.multiplicar(numA, numB);
        int potencia = operations.potencia(numA, numB);

        // Mostrar los resultados usando JOptionPane
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
        JOptionPane.showMessageDialog(null, "La resta es: " + resta);
        JOptionPane.showMessageDialog(null, "La multiplicación es: " + multiplicacion);
        JOptionPane.showMessageDialog(null, "La potencia es: " + potencia);
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear la interfaz de usuario
        CalculatorUI calculatorUI = new CalculatorUI();
        
        // Crear la instancia de operaciones
        Operations operations = new Operations();

        // Crear el controlador
        CalculatorController controller = new CalculatorController(calculatorUI, operations);

        // Hacer visible la interfaz
        calculatorUI.setVisible(true);
    }
}

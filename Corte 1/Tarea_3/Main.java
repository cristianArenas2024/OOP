public class Main {
    public static void main(String[] args) {
        // Crear la instancia de Operations
        Operations operations = new Operations();
        
        // Crear la instancia de Calculator, pasando Operations como parámetro
        Calculator calculator = new Calculator(operations);

        // Obtener los números desde el usuario
        int[] numbers = calculator.getNumbers();
        
        // Si los números son válidos, proceder a calcular y mostrar los resultados
        if (numbers != null) {
            int numA = numbers[0];
            int numB = numbers[1];

            // Mostrar los resultados de las operaciones
            calculator.showResults(numA, numB);
        }
    }
}

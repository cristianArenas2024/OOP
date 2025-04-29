import java.util.Scanner;

public class Calculator {

    private Operations operations;

    // Constructor que recibe la clase Operations
    public Calculator(Operations operations) {
        this.operations = operations;
    }

    // Método para pedir los dos números
    public int[] getNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        String inputA = scanner.nextLine();

        System.out.print("Ingrese el segundo número: ");
        String inputB = scanner.nextLine();

        try {
            // Convertir los valores ingresados a enteros
            int numA = Integer.parseInt(inputA);
            int numB = Integer.parseInt(inputB);
            return new int[]{numA, numB}; // Retorna los números en un arreglo
        } catch (NumberFormatException e) {
            // Manejo de error en caso de que los valores no sean números
            System.out.println("Por favor, ingrese números válidos.");
            return null;
        }
    }

    // Método para mostrar los resultados de las operaciones
    public void showResults(int numA, int numB) {
        int suma = operations.sumar(numA, numB);
        int resta = operations.restar(numA, numB);
        int multiplicacion = operations.multiplicar(numA, numB);
        int potencia = operations.potencia(numA, numB);

        // Mostrar los resultados en la consola
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La potencia es: " + potencia);
    }
}

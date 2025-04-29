public class Operations {
    // Método para la suma
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método para la resta
    public int restar(int a, int b) {
        return a - b;
    }

    // Método para la multiplicación
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para la potencia
    public int potencia(int base, int exponente) {
        return exponente == 0 ? 1 : base * potencia(base, exponente - 1);
    }
}

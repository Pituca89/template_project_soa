public class Suma {
    public static void main(String[] args) {
        // Declaración de variables
        int numero1 = 5;
        int numero2 = 10;

        // Llamada a la función que suma los dos números
        int resultado = sumar(numero1, numero2);

        // Imprimir el resultado en la consola
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);
    }

    // Método que suma dos números enteros
    public static int sumar(int a, int b) {
        return a + b;
    }
}

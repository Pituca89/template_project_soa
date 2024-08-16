public class Suma {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 10;

        int resultado = sumar(numero1, numero2);

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);
    }
    public static int sumar(int a, int b) {
        return a + b;
    }
}

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10; // Número de términos en la secuencia de Fibonacci
        int suma = 0; // Variable para almacenar la suma de los términos

        System.out.print("Secuencia de Fibonacci:\n");
        for (int i = 0; i < n; i++) {
            int fib = fibonacci(i);
            if (i == 0) {
                System.out.println(fib);
            } else if (i == 1) {
                System.out.println(fib);
            } else {
                int prevFib1 = fibonacci(i - 1);
                int prevFib2 = fibonacci(i - 2);
                System.out.println(prevFib1 + " + " + prevFib2 + " = " + fib);
            }
            suma += fib;
        }

        System.out.println("Suma de los términos: " + suma);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Si n es 0 o 1, simplemente retorna n
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Llamada recursiva para calcular el término de Fibonacci
    }
}

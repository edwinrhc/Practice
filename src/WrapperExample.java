package src;

public class WrapperExample {

    public static void main(String[] args) {
        // Ejemplo de uso de Integer (Clase wrapper para int )
        Integer intObject1 = Integer.valueOf(10); // Creación de un objeto Integer
        Integer intObject2 = 20; // Autoboxing de int a Integer

        // sumar dos Integer (se realiza unboxing y luego la suma)
        int sum = intObject1 + intObject2; // Unboxing de Integer a int
        System.out.println("La suma de " + intObject1+ " y " + intObject2 + " es: " + sum  );

        // Ejemplo de uso de Double (Clase wrapper para double)
        Double doubleObject1 = Double.valueOf(5.75); // Creación de un objeto Double
        Double doubleObject2 = 2.25; // Autoboxing de double a Double

        // Multiplicar dos Double (se realiza unboxing y luego la multiplicación)
        double product = doubleObject1 * doubleObject2; // Unboxing de Double a double
        System.out.println("El producto de " + doubleObject1 + " y " + doubleObject2 + " es: " +product);

    }
}

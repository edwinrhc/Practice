package src;

public class WrapperExample {

    public static void main(String[] args) {
        // Ejemplo de uso de Integer (Clase wrapper para int )
        Integer intObject1 = Integer.valueOf(10); // Creación de un objeto Integer
        Integer intObject2 = 20; // Autoboxing de int a Integer

        // sumar dos Integer (se realiza unboxing y luego la suma)
        int sum = intObject1 + intObject2; // Unboxing de Integer a int
        System.out.println("La suma de " + intObject1+ " y " + intObject2 + " es: " + sum  );


    }
}

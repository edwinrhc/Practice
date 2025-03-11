package src.main;

import java.util.Arrays;

public class Digitize {
    /*
2.  Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
    1. Convertir el número en una cadena de texto para poder acceder a cada dígito
    2. Recorrer los dígitos desde el último hasta el primero.
    3. Convertir cada dígito de nuevo a un número entero.
    4. Guardar los dígitos en una lista (array)
    5. Retornar la lista con los dígitos en orden inverso.
     */
    public static int[] digitize(long n) {
        // Convertimos el número a String
        String numberStr = Long.toString(n);
        // Creamos un array para almacenar los dígitos en orden inverso
        int[] result = new int[numberStr.length()];
        // recorremos la cadena de derecha a izquierda y llenamos el array
        for (int i = 0; i < numberStr.length(); i++) {
            //Extraemos el dígito desde el final, lo convertimos a entero y lo almacenamos
            result[i] = Character.getNumericValue(numberStr.charAt(numberStr.length() - 1 - i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(34897)));
        System.out.println(Arrays.toString(digitize(12345)));
        System.out.println(Arrays.toString(digitize(0)));
    }
}

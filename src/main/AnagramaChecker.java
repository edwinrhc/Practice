package src.main;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramaChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera palabra: ");
        String palabra1 = scanner.nextLine();

        System.out.println("Ingrese el anagrama de la  palabra \"" + palabra1 + "\": ");
        String palabra2 = scanner.nextLine();


        if (esAnagrama(palabra1, palabra2)) {
            System.out.println("Las palabra \"" + palabra1 + "\" es un anagrama de \"" + palabra2 + "\".");
        } else {
            System.out.println("Las palabras \"" + palabra1 + "\" y \"" + palabra2 + " no son anagramas");
        }
        scanner.close(); // Para evitar fuga de memoria.
    }

    public static boolean esAnagrama(String palabra1, String palabra2) {
        String palabra1Modificada = palabra1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String palabra2Modificada = palabra2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (palabra1Modificada.length() != palabra2Modificada.length()) {
            return false; // Si las longitudes son diferentes, no pueden ser anagramas
        }
        char[] palabra1Array = palabra1Modificada.toCharArray();
        char[] palabra2Array = palabra2Modificada.toCharArray();
        Arrays.sort(palabra1Array);
        Arrays.sort(palabra2Array);
        return Arrays.equals(palabra1Array, palabra2Array);

    }


}

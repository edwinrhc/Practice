package src;

import java.util.Scanner;

public class PalindromeChecker {

    /** Crear un programa que sea palíndromo/
     */
  public static void main(String[] args){

      Scanner scanner = new Scanner(System.in);

      Boolean esPalabra = false;

      while (!esPalabra){
          System.out.println("Ingrese la palabra : ");
          String cadena = scanner.nextLine();
          if (isPalindromo(cadena)) {
              System.out.println("Si es palabra Palindromo: " + cadena);
              esPalabra = true;
          }else{
              System.out.println("No es palabra Palindromo: " + cadena);
          }

      }

      scanner.close();

  }

  public static boolean isPalindromo(String cadena){

      String Palabra = cadena.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
      return Palabra.equals(new StringBuilder(Palabra).reverse().toString());

  }




}
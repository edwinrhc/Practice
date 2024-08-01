package src;

import java.util.Scanner;

public class PalindromeChecker {

    /** Crear un programa que sea palíndromo/
     */
  public static void main(String[] args){

      Scanner scanner = new Scanner(System.in);
      Boolean palindromo = false;

      while (!palindromo){
          System.out.println("Ingrese palabra o frase");
          String cadena = scanner.nextLine();

          if(isPalindromo(cadena)){
              System.out.println("Si es palíndromo la palbra -> " + cadena);
              palindromo = true;
          }else{
              System.out.println("No es palíndromo");
          }

      }

      scanner.close();

  }

  public static boolean isPalindromo(String cadena){

      String isPalindromo = cadena.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
      return isPalindromo.equals(new StringBuilder(isPalindromo).reverse().toString());

  }



}
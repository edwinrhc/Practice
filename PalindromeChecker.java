import java.util.Scanner;

public class PalindromeChecker {

    /** Crear un programa que sea palíndromo/
     *
     */
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingrese la palabra o frase: ");
      String cadena = scanner.nextLine();

      if(isPalindromo(cadena)){
          System.out.println("Si palabra es palíndromo");
      }else{
          System.out.println("No es palabra palíndromo");
      }

  }

  public static boolean isPalindromo(String cadena){

      String frase = cadena.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
      return frase.equals(new StringBuilder(frase).reverse().toString());

  }


}
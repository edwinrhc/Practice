import java.util.Scanner;

public class PalindromeChecker {

    /** Crear un programa que sea palíndromo/
     *
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese palabra o frase");
        String cadena = scanner.nextLine();

        if(esPalindromo(cadena)){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }


    }

    public static boolean esPalindromo(String cadena){
        String cadenaFrase = cadena.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        return cadenaFrase.equals(new StringBuilder(cadenaFrase).reverse().toString());
    }




}
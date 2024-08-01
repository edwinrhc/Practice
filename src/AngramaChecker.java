package src;

import java.util.Arrays;
import java.util.Scanner;

public class AngramaChecker {
    public  static void  main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la primera palabra o frase: ");
        String primeraCadena = scanner.nextLine();
        System.out.println("Ingresa la segunda palabra o frase: ");
        String segundaCadena = scanner.nextLine();

        if(esAngrama(primeraCadena,segundaCadena)){
            System.out.println("Las cadenas son anagramas");
        }else{
            System.out.println("Las cadenas no son amagramas");
        }


    }

    public static boolean esAngrama(String primeraCadena, String segundaCadena){
        // Limpiar las cadenas: eliminar espacios y caracteres no alfabéticos, y convertir a minusculas
        String cadenaLimpia1 = primeraCadena.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String cadenaLimpia2 = segundaCadena.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        // Convertir las cadenas a arrays de caracteres
        char[] arrayCadena1 = cadenaLimpia1.toCharArray();
        //Ejmplo de palabara usando char[] "amor" -> ['a','m','o','r']
        char[] arrayCadena2 = cadenaLimpia2.toCharArray();

        // Ordenar los arrays
        Arrays.sort(arrayCadena1);
        Arrays.sort(arrayCadena2);

        return Arrays.equals(arrayCadena1,arrayCadena2);
    }
}

package src.main.otros;

//Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.

import java.util.stream.Collectors;

/* Nos dan una cadena de String de números de 0 a 9. Debemos hacer es recorrer cada número y convertirlo
  en un 0 si es menor a 5 y un 1 si es mayor o igual a 5
 */
public class FakeBinary {

    //TODO: Primera Alternativa
/*    public static String fakeBinary(String str) {
        StringBuilder result = new StringBuilder(); // Para construir la nueva cadena
        // Recorremos cada caracter de la cadena de String
        for(int i = 0;i < str.length(); i++) {
            char c = str.charAt(i); // Extraemos cada caracter
            if(c < '5'){ // Si es menor que '5', agregamos '0'
                result.append('0');
            }else { // si es mayo que '5', agregamos '1'
                result.append('1');
            }
        }
        return result.toString();//Convertimos Stringbuilder a String y lo retornamos
    }*/
    //TODO: Segunda Alternativa
    public static String fakeBinary(String str) {
      return str.chars() //  Convertimos el String en un Stream de caracteres
              .mapToObj(c -> c < '5'? "0": "1" ) // Reemplazamos cada caracter según la condición
              .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(fakeBinary("505458595354841"));
    }
}

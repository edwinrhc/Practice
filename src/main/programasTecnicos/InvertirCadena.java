package src.main.programasTecnicos;

import java.util.Scanner;

public class InvertirCadena {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.print("Introduce un cadena: ");
        String texto = sc.nextLine();
        sc.close();

        // Validar con regex
        if (!texto.matches("^[A-Za-zñÑáéíóúÁÉÍÓÚ]+$")) {
            System.out.println("Error: Solo se permiten letras (sin espacios, números ni caracteres especiales)");
            return;
        }

        System.out.println("Cadena original: " + texto);
        String invertida = invertir(texto);
        System.out.println("Cadena invertida: " + invertida);

    }

    // observado:Menos recomendada
//    public static String invertir(String s) {
//        StringBuilder resultado = new StringBuilder();
//        for (int i = s.length() - 1; i >= 0; i--) {
//            resultado.append(s.charAt(i));
//        }
//        return resultado.toString();
//    }

    //nota:Recomendada
    public static String invertir(String s) {
        return new StringBuilder(s).reverse().toString();
    }

}

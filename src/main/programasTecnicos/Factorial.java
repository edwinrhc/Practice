package src.main.programasTecnicos;

import java.util.Scanner;

public class Factorial {

    /**
     *Nota: Calcula el factorial de n forma iterativa
     * @param n entero no negativo
     * @return n!
     */
    public static long factorialIterativo(int n){
        long resultado = 1;
        for(int i = 2; i<= n; i++){
            resultado *= i;
        }
        return resultado;
    }

    /**
     * Nota: Genera la representación en texto del cálculo del factorial:
     *  "n! = n x (n-1) x ... x 1 = resultado"
     */
    public static String factorialConExpresion(int n){
        // Caso especial
        if(n == 0){
            return "0! = 1";
        }

        // Construir la parte "n * n(n-1) * ... * 1"
        StringBuilder expresion  = new StringBuilder();
        expresion.append(n).append("! = ");
        //Construirla expresión
        for(int i = n; i > 0; i --){
            expresion.append(i);
            if(i > 1){
                expresion.append(" x ");
            }
        }

        expresion.append(" = ").append(factorialIterativo(n));
        return expresion.toString();

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un entero no negativo: ");
        int n = sc.nextInt();
        sc.close();

        if (n < 0) {
            System.out.println("Error: el número debe ser no negativo.");
            return;
        }
        // ¡Aquí se imprime la línea completa de una vez!
        System.out.println(factorialConExpresion(n));
    }
}

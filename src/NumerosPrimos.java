package src;

import java.util.Scanner;

public class NumerosPrimos {

    public static boolean esPrimo(int numero){
        if(numero <= 1){
            return false;
        }
        if(numero <= 3){
            return true;
        }
        if(numero % 2 == 0 || numero % 3 == 0){
            return false;
        }
        for(int i = 5; i*i <= numero; i+=6){
            if(numero % i == 0 || numero %(i+2) == 0){
                return false;
            }
        }
        return true;
    }

    public static void listarPrimosHasta(int n){
        for(int i = 2; i <= n; i++){
            if(esPrimo(i)){
                System.out.println("Es N° primo: "+ i + " ");
            }
        }
        System.out.println(); // Salto de línea
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Ingresa el número:");
        Integer numPrimo = num.nextInt();

        listarPrimosHasta(numPrimo);
    }
}

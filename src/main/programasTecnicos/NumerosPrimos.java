package src.main.programasTecnicos;

import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Ingresa el número:");
        Integer limite = num.nextInt();

        // Llamamos al metodo para encontrar los números primos hasta el límite usando la Criba de Eratóstenes
        cribaEratostenes(limite);

        // Recorremos todos los números desde 2 hasta el límite
   /*     for(int i = 2; i<=limite; i++){
            if(esPrimo(i)){
                System.out.println(i);
            }
        }*/

    }

    public static boolean esPrimo(int numero){
        //Paso 1: Si el número es menor que 2
        if(numero < 2){
            return false;
        }
        // Paso 2: Si es = 2 es primo
        if(numero == 2){
            return true;
        }
        // Paso 3: Verificamos si el número es divisible por algún número hasta la raíz cuadrada
        for(int i = 2; i <= Math.sqrt(numero); i++){
            if(numero % i == 0){
                return false;
            }
        }
        // Si no encontramos divisores, el número es primo
        return true;
    }

    // Utilizando la lógica Criba de Eratóstenes
    public static void cribaEratostenes(int limite){
        // Paso 1:  Crear una lista booleana que marque si los números son primos
        boolean[] esPrimo = new boolean[limite+1];

        // Inicializamos todos los números como primos
        for(int i = 2; i <= limite; i++){
            esPrimo[i] = true;
        }
        // Paso 2: Empezamos con el nro 2, el primer primo
        for(int i = 2; i * i <= limite; i++){
            if(esPrimo[i]){
                // Paso 3: Marcamos los múltiplos de i como no primos
                for(int j = i * i; j <= limite; j+= i){
                    esPrimo[j] = false;
                }
            }
        }
        // Paso 4: Imprimir los números primos
        System.out.println("Los números primos hasta " + limite + " son:");
        for(int i = 2; i<= limite;i++){
            if(esPrimo[i]){
                System.out.println(i);
            }
        }

    }
}

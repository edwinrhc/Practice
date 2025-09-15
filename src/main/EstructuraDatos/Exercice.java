package src.main.EstructuraDatos;

import java.util.Scanner;

public class Exercice {

    public static void main(String[] args) {
        // Exercise 01
//        sumArray();
//        // Exercise 02
//        searchArray();

        reverseArray();
    }

    //Exercise 01 - Crea un programa que guarde en un arreglo (int[]) los números del 1 al 5 y muestre la suma total.
    public static void sumArray(){
        int[] numbers = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("The sum is: " + sum);
    }

    //Exercise 02 - Guarda los números {10, 20, 30, 40, 50} en un arreglo. Pregunta al usuario un número y verifica si existe en el arreglo.
    public static void searchArray(){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10,20,30,40,50};
        boolean fount = false;
        System.out.print("Write of number: ");
        int search = scanner.nextInt();

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == search){
                fount = true;
                break;
            }
        }
        if(fount){
            System.out.println("The number is in the array");
        }else{
            System.out.println("The number is not in the array");
        }
    }

    //Exercise 03 - Dado un arreglo {1,2,3,4,5}, crea otro arreglo que tenga los mismos valores pero en orden inverso {5,4,3,2,1}.
    public static void reverseArray(){
        int[] numbers = {1,2,3,4,5};
        int[] reverse = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            reverse[i] = numbers[numbers.length - 1 - i];
            System.out.println("i = " + i +
                    " |  reverse["+i+"] = " + reverse[i]+
                    " |  numbers["+(numbers.length - 1 - i )+ "] = " +
                    numbers[numbers.length - 1 - i]);

        }
        System.out.println("Resultado final: ");
        for(int i = 0; i < reverse.length; i++){
            System.out.print(reverse[i] + " ");
        }

    }

}

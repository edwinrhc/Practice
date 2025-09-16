package src.main.EstructuraDatos;

/**
 * Que es un array? * Un array es una estructura de datos que guarda un conjunto de elementos del mismo tipo. * organizados en posiciones llamadas índices. * EL primer índice siempre es 0 * El último índice es logintud -1
 */
public class Array {
    public static void main(String[] args) {
        //Forma 1: Declarar y asignar tamaño //
        // int[] numeros = new int[5];
        // Tenemos un array de 5 elementos de tipo int
        // Forma 2: declarar e inicializar con valores
        int[] edades = {18, 20, 25, 30, 45};
        System.out.println(edades[0]);
    }
}
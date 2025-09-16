package src.main.programasTecnicos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Utilidad para cálculo de potencia
 * @Author Edwin
 */
public final class CalculoPotencia {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in) ){
            System.out.print("Introduce la base (a): ");
            double base = sc.nextDouble();

            System.out.print("Introduce el exponente (b): (entre -1_000_000 y 1_000_000): ");
            int exponente = sc.nextInt();

            if(Math.abs(exponente) > 1_000_000){
                System.err.println("Error: el exponente está fuera de los límites permitidos");
                System.exit(1);
            }
            double conMath = calcularConMath(base, exponente);
            double rapido = calcularRapido(base, exponente);

            System.out.printf("Usando Math.pow():      %.6f%n", conMath);
            System.out.printf("Usando exponenciación:  %.6f%n", rapido);


        }catch (InputMismatchException ime){
            System.err.println("Entrada inválida: asegúrate de introducir números válidos");
        }
    }

    //Nota: Impide instanciación
    private CalculoPotencia(){
        throw new AssertionError("No se debe instanciar esta clase utilitaria");
    }

    /**
     * Calcula la potencia utilizando {@link Math#pow(double,double)}
     *
     * @param base la bas (double)
     * @param exponente el exponente (int)
     * @return resultado de base<sup>exponente</sup>
     */
    public static double calcularConMath(double base, int exponente){
        return Math.pow(base,exponente);
    }

    /**
     * Calcula la potencia mediante el algoritmo de exponenciación rápida.
     * @param base  la base(double)
     * @param exponente el expontente (int), puede ser negativo
     * @return resultado de base <sup>exponente</sup>
     */
    public static double calcularRapido(double base, int exponente){
        if(base == 0  && exponente == 0){
            throw new IllegalArgumentException("0 no puede elevarse a exponente cero o negativo");
        }
        double resultado = 1.0;
        long exp = Math.abs((long)exponente);
        double factor = base;

        while(exp > 0){
            if((exp & 1) == 1){
                resultado *= factor;
            }
            factor *= factor;
            exp >>= 1;
        }
        return (exponente < 0)? 1.0 / resultado :resultado;
    }



}

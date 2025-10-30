package src.main.lambda;


import java.util.*;

public class sinLambda {

    public static void main(String[] args) {
    // Ordenar una lista de nombres, no alfabéticamente, sino por su longitud
        List<String> nombres = Arrays.asList("Juan","Pedro","Mateo","Leo","Juan de Dios");

        // Usamos Collection.sort y le pasamos un nuevo Comparator
        Collections.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // La lógica real está aquí:
                return Integer.compare(o1.length(), o2.length());
            }

        });
        System.out.println(nombres);

    }
}

package src.main.lambda;


import src.main.lambda.model.Ticket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
//        OrdenarListaPorLongitud();
//        ListOfTickets();
//        OrdernarListaAlfabetico();

        MapandReduce();
    }


    public static void OrdenarListaPorLongitud(){
        // Ordenar una lista de nombres, no alfabéticamente, sino por su longitud
        List<String> nombres = Arrays.asList("Juan","Pedro","Ana","Mateo","Leo","Juan de Dios","Fernando");
        // Usamos Collection.sort y le pasamos un *lambda*
//        Collections.sort(nombres, ( String a, String b) -> {
//            return Integer.compare(a.length(), b.length());
//        });

        Collections.sort(nombres, (a,b) -> Integer.compare(a.length(), b.length()));
        System.out.println(nombres);
    }

    public static void ListOfTickets(){
        List<Ticket> tickets = List.of(
                new Ticket(1, "Pendiente"),
                new Ticket(2, "Atendido"),
                new Ticket(3, "Pendiente")
        );
        tickets.stream()
                .filter(t -> t.getEstado().equals("Pendiente"))
                .forEach(t -> System.out.println("Ticket: " + t.getId()));


    }

    public static void OrdernarListaAlfabetico(){

        List<String> nombres = new ArrayList<>(List.of("Luisa","Brenda","Marisol","Julia","Estrella","Zoila","Pamela"));
        nombres.sort( (a,b) -> a.compareToIgnoreCase(b)); // Orden alfabético
        nombres.forEach(System.out::println);

    }

    public static void MapandReduce(){

        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10);
        int suma = numeros.stream()
                .map(n -> n * 2 ) // Multiplicamos por 2
                .reduce(0,(a,b) -> a + b); // Sumamos todos los resultados
        System.out.println(suma);

    }
}

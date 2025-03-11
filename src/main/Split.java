package src.main;

import java.util.Arrays;

public class Split {

    /* Write a function to split a string and convert it into an array of words.
        EXAMPLE:
        INPUT: "Robin Singh" ==> ["Robin", "Singh"]
    */

    public static String[] stringsToArray(String str){
        return str.trim().split("\\s+"); // Elimina los espacios en blanco innecesarios y divide correctamente
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringsToArray(" Robin Singh")));
        System.out.println(Arrays.toString(stringsToArray("I love arrays they are my favorite")));
    }

}

package src.main.otros;

/*Complete the function so that it finds the average of the three scores passed to it and returns the letter value associated with that grade

Numerical Score	Letter Grade
90 <= score <= 100	'A'
        80 <= score < 90	'B'
        70 <= score < 80	'C'
        60 <= score < 70	'D'
        0 <= score < 60	'F'
Tested values are all between 0 and 100. Theres is no need to check for negative values or values greater than 100.*/

public class Grasshopper {

    public static char getGrade(int score1, int score2, int score3){
        int average = (score1 + score2 + score3) / 3;
       switch (average/10) {
           case 10: case 9: return 'A';
           case 8: return 'B';
           case 7: return 'C';
           case 6: return 'D';
           default: return 'F';
       }
    }

    public static void main(String[] args) {
        System.out.println(getGrade(95, 90, 93)); // Debería imprimir: 'A'
        System.out.println(getGrade(70, 75, 79)); // Debería imprimir: 'C'
        System.out.println(getGrade(50, 55, 59)); // Debería imprimir: 'F'
        System.out.println(getGrade(85, 87, 82)); // Debería imprimir: 'B'
    }

}

package src.main;

public class BMICalculator {
    /*

    Calcule BMI
    Write function bmi that calculates body mass index (bmi = weight / height2).

            if bmi <= 18.5 return "Underweight"

            if bmi <= 25.0 return "Normal"

            if bmi <= 30.0 return "Overweight"

            if bmi > 30 return "Obese"

            */
    public static String bmi(double weight, double height) {
        double bmi = weight /(height * height); // Calcular BMI
        // Evaluar los rangos del BMI y devolver la categoría
        // 1 Opción
/*        if(bmi  <= 18.5) return "Underweight";
        if(bmi <= 25.0) return "Normal";
        if(bmi <= 30.0) return "Overweight";
        return "Obese";*/

        // 2 Opción
        return (bmi <= 18.5) ? "Underweight"
                : (bmi <= 25.0) ? "Normal"
                : (bmi <= 30.0) ? "Overweight"
                : "Obese";
    }

    public static void main(String[] args) {
        System.out.println(bmi(80, 1.80));  // "Normal"
        System.out.println(bmi(50, 1.70));  // "Underweight"
        System.out.println(bmi(90, 1.75));  // "Overweight"
        System.out.println(bmi(110, 1.60)); // "Obese"

    }
}

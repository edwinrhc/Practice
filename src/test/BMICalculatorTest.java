package src.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import src.main.otros.BMICalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMICalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "80, 1.80, Normal",
            "50, 1.70, Underweight",
            "90, 1.75, Overweight",
            "110, 1.60, Obese"
    })
    public void testBMI(double weight, double height, String expectedCategory) {
        assertEquals(expectedCategory, BMICalculator.bmi(weight, height));
    }
}

package src.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import src.main.Grasshopper;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class GrassHopperTest {

    static Stream<Object[]> gradeProvider(){
        return Stream.of(
                new Object[]{95,90,93,'A'},
                new Object[]{82,85,90,'B'},
                new Object[]{70,75,79,'C'},
                new Object[]{60,65,68,'D'},
                new Object[]{50,55,59,'F'}
        );
    }

    @ParameterizedTest
    @MethodSource("gradeProvider")
    public void testGrades(int score1, int score2, int score3, char expectedGrade){
        assertEquals(expectedGrade, Grasshopper.getGrade(score1, score2, score3));
    }


}

package src.test;

import org.junit.Test;
import src.main.Digitize;

import static org.junit.Assert.assertArrayEquals;

public class DigitizeExampleTests {

    @Test
    public void testBasicCases() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, Digitize.digitize(35231));
        assertArrayEquals(new int[] {0}, Digitize.digitize(0));
        assertArrayEquals(new int[] {7, 9, 5, 8, 4, 3}, Digitize.digitize(348597));
    }

    @Test
    public void testLargeNumbers() {
        assertArrayEquals(new int[] {0, 2, 9, 3, 9, 8, 2, 6, 7, 5, 4}, Digitize.digitize(45762893920L));
        assertArrayEquals(new int[] {4, 9, 3, 8, 3, 8, 2, 0, 7, 8, 4, 5}, Digitize.digitize(548702838394L));
    }
}

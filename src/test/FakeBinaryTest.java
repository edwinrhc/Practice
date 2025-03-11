package src.test;

import org.junit.Test;
import src.main.FakeBinary;

import static org.junit.Assert.assertEquals;

public class FakeBinaryTest {

    @Test
    public void testSomething() {
        FakeBinary fakeBinary = new FakeBinary();
        assertEquals("01011110001100111", fakeBinary.fakeBinary("45385593107843568"));
        assertEquals("101000111101101", fakeBinary.fakeBinary("509321967506747"));
        assertEquals("011011110000101010000011011", fakeBinary.fakeBinary("366058562030849490134388085"));
    }
}

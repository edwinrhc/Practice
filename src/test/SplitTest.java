package src.test;

import org.junit.Test;
import src.main.otros.Split;

import static org.junit.Assert.assertArrayEquals;

public class SplitTest {


    @Test
    public void testBasicCases(){
        assertArrayEquals(new String[]{"Robin", "Singh"}, Split.stringsToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, Split.stringsToArray("I love arrays they are my favorite"));
    }

    @Test
    public void testWithExtraSpaces(){
        assertArrayEquals(new String[]{"Robin", "Singh"}, Split.stringsToArray("  Robin    Singh   "));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, Split.stringsToArray("I   love   arrays   they   are   my   favorite   "));
    }

    @Test
    public void testSingleWord(){
     assertArrayEquals(new String[]{"Robin"}, Split.stringsToArray("Robin"));
    }

    @Test
    public void testEmptyString(){
        assertArrayEquals(new String[]{""}, Split.stringsToArray(""));
    }

}

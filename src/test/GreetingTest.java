package src.test;

import org.junit.Test;
import src.main.otros.Greeting;

import static org.junit.Assert.assertEquals;

public class GreetingTest {

    @Test public void basicTests(){
        assertEquals("For inputs \"Daniel\" and \"Daniel\"", "Hello boss", Greeting.greet("Daniel", "Daniel"));
        assertEquals("For inputs \"Greg\" and \"Daniel\"", "Hello guest", Greeting.greet("Greg", "Daniel"));
    }

}

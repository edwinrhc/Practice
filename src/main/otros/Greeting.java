package src.main.otros;

//Create a function that gives a personalized greeting. This function takes two parameters: name and owner.
public class Greeting {

    public static String greet(String name, String owner){
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }

    public static void main(String[] args) {
        System.out.println(greet("Edwin", "Edwin"));
        System.out.println(greet("John", "Edwin"));
    }
}

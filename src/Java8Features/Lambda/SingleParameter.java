package Java8Features.Lambda;

interface Sayable2{
    public String say(String name);
}

public class SingleParameter {
    public static void main(String[] args) {

        // Lambda expression with single parameter.
        Sayable2 s1 = (name)-> {
            return "Hello, " + name;
        };
        System.out.println(s1.say("Lance"));

        // You can omit function parentheses
        Sayable2 s2 = name -> {
            return "Hello, " + name;
        };
        System.out.println(s2.say("Alfonz"));
    }
}

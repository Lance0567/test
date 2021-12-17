package Java8Features.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerExample2 {
    public static void main(String[] args) {
        StringJoiner joinNames= new StringJoiner(",", "[", "]");  // passing comma(,) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinNames.add("Alfonz");
        joinNames.add("Lance");
        joinNames.add("Francis");
        joinNames.add("John");

        System.out.println(joinNames);
    }
}

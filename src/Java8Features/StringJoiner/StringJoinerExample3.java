package Java8Features.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerExample3 {
    public static void main(String[] args) {

        StringJoiner joinNames = new StringJoiner(",", "[", "]");

        joinNames.add("Alfonz");
        joinNames.add("Lance");

        // Creating StringJoiner with :(colon) delimiter
        StringJoiner joinNames2 = new StringJoiner(":", "[", "]");

        joinNames2.add("Francis");
        joinNames2.add("John");

        StringJoiner merge = joinNames.merge(joinNames2);
        System.out.println(merge);
    }
}

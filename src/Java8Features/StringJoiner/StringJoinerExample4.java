package Java8Features.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerExample4 {
    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(",");

        // Prints nothing because it is empty
        System.out.println(joinNames);

        // We can set default empty value.
        joinNames.setEmptyValue("It is empty");
        System.out.println(joinNames);

        // Adding values to StringJoiner
        joinNames.add("Alfonz");
        joinNames.add("Lance");
        System.out.println(joinNames);

        // Returns StringJoiner as String type
        String str = joinNames.toString();
        System.out.println(str);

        // Now, we can apply String methods on it
        char ch = str.charAt(3);
        System.out.println("Character at index 3:" + ch);

        // Adding one more element
        joinNames.add("Francis");
        System.out.println(joinNames);

        // Returns length
        int newLength = joinNames.length();
        System.out.println("New Length: " + newLength);
    }
}

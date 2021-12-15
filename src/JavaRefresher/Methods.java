package JavaRefresher;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        // JavaRefresher.Methods
        System.out.println("Hello");
        String brand = "Samsumg";
        System.out.println(brand.toUpperCase());
        System.out.println(brand.startsWith("S"));
        System.out.println(brand.endsWith("g"));
        System.out.println();

        char[] letter = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        int count = countOccurrences(letter, 'D');
        System.out.println(count);
    }

    public static int countOccurrences(char [] letters, char searchLetter) {
        System.out.println(Arrays.toString(letters));
        System.out.println(searchLetter);

        int count = 0;
        for (char letter : letters) {
            if (letter == searchLetter) {
                count++;
            }
        }
        return count;
    }
}

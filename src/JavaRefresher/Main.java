package JavaRefresher;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Arrays style 1
        int [] numbers = {2,3,4,5,6,7,8,9};
        int oneHundred = numbers [4];
        int four = numbers[numbers.length - 2];
        System.out.println(oneHundred);
        System.out.println(four);

        // Arrays style 2
        int zero = 0;
        int one = 1;

        // Quick arrays
        int [] numbers2 = new int[3];
        numbers2[0] = 0;
        numbers2[1] = 1;
        numbers2[2] = 2;
        System.out.println(Arrays.toString(numbers2));

        // Loops Arrays style 3 (indexes
        int[] numbers3 = {2,0,1,4,100,4,90,78,77};


        for (int i = 0; i < numbers3.length; i++) {
            System.out.println(numbers3[i]);
        }

        // Reverse order
        for (int i = numbers3.length - 1; i >= 0; i--) {
            System.out.println(numbers3[i]);
        }

        int number = 0;
        number--;
        System.out.println(number);

    }
}

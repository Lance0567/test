package Test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Score();
    }

    static void Score() {
        Scanner input = new Scanner(System.in);

        String[] myNumbers=new String[100];

        for(int a=0; a<myNumbers.length; a++){
            System.out.println("Number " + (a + 1) + ":");
            myNumbers[a]=input.nextLine();
        }
    }

    static boolean SplitMethod(String set) {
        String[] set_splitted = set.split(",");
        for (int a = 0; a < set_splitted.length; a++) {
            for (int j = a + 1; j < set_splitted.length; j++) {
                if (set_splitted[a].equals(set_splitted[j])) {
                    return true;
                }
            }
        }
        return false;
    }
    static void printScore(String set) {
        String[] set_splitted = set.split(",");
        System.out.println("--------------------Score--------------------");
        for (int b = 100; b >=1 ; b--) {
            System.out.println(b);
        }
    }
}
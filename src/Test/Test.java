package Test;

import java.util.Scanner;

public class Test {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 20;

        for (int a = 1; a <=x; a++) {
            for (int b = 1; b <=x; b++) {
                System.out.print(a + "* ");
            }
            System.out.println();
        }
    }
    static void showChoices() {
        System.out.println("------------Select from the choices------------");
        System.out.println("1 - Generate Subsets");
        System.out.println("2 - Exit");
        String choice = input.nextLine().trim();
        if (choice.equals("1")) {
            printScoreCommands();
        } else if (choice.equals("2")) {
            System.out.println("Thank you!");
        } else if (choice.equals("")) {
            System.out.println("Input is required!");
            showChoices();
        } else {
            System.out.println("Invalid input!");
            showChoices();
        }
    }

    static void printScoreCommands() {
        System.out.println("Enter a set(e.g {1,2,3}):");
        String set = input.nextLine().trim();
        if (set.length() < 2) {
            System.out.println("Input is required!");
            printScoreCommands();
        } else if (set.charAt(0) != '{') {
            System.out.println("Invalid set!");
            printScoreCommands();
        } else if (set.charAt(set.length() - 1) != '}') {
            System.out.println("Invalid set!");
            printScoreCommands();
        } else if (SplitMethod(set.replace("{", "").replace("}", ""))) {
            System.out.println("Invalid set!");
            printScoreCommands();
        } else if (set.equals("")) {
            System.out.println("Input is required!");
            printScoreCommands();
        } else {
            {
                printScore(set);
            }
            showChoices();
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

    }
}


import java.util.Scanner;

public class SubsetGenerator {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        showChoices();

    }

    static void showChoices() {
        System.out.println("------------Select from the choices------------");
        System.out.println("1 - Generate Subsets");
        System.out.println("2 - Exit");
        String choice = input.nextLine().trim();
        if (choice.equals("1")) {
            printSetCommands();
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

    static void printSetCommands() {
        System.out.println("Enter a set(e.g {1,2,3}):");
        String set = input.nextLine().trim();
        if (set.length() < 2) {
            System.out.println("Input is required!");
            printSetCommands();
        } else if (set.charAt(0) != '{') {
            System.out.println("Invalid set!");
            printSetCommands();
        } else if (set.charAt(set.length() - 1) != '}') {
            System.out.println("Invalid set!");
            printSetCommands();
        } else if (SplitMethod(set.replace("{", "").replace("}", ""))) {
            System.out.println("Invalid set!");
            printSetCommands();
        } else if (set.equals("")) {
            System.out.println("Input is required!");
            printSetCommands();
        } else {
            {
                printSubset(set.replace("{", "").replace("}", ""));
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

    static void printSubset(String set) {
        String[] set_splitted = set.split(",");
        System.out.println("--------------------Subsets--------------------");
        if ("".equals(set)) {
            for (int i = 1; i < (1 << set_splitted.length);) {
                String result = "";
                for (int j = 0; j < set_splitted.length; j++) {
                    if ((i & (1 << j)) > 0) {
                        result += " " + set_splitted[j];
                    }
                }

                System.out.println((++i - 1) + ".\t-\t{" + result.trim().replace(" ", ",") + "}");
            }
        } else {
            for (int i = 0; i < (1 << set_splitted.length);) {
                String result = "";
                for (int j = 0; j < set_splitted.length; j++) {
                    if ((i & (1 << j)) > 0) {
                        result += " " + set_splitted[j];
                    }
                }

                System.out.println(++i + ".\t-\t{" + result.trim().replace(" ", ",") + "}");
            }
        }
    }
}

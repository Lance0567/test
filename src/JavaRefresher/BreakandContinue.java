package JavaRefresher;

public class BreakandContinue {
    public static void main(String[] args) {

        //Break and Continue
        String[] names = {"Anna", "Ali", "Bob", "Mike"};
        for (String name : names) {
            if (name.startsWith("A")) {
                continue;
            }
            System.out.println(name);
        }
        System.out.println();

        for (String name : names) {
            if (name.equals("Bob")) {
                break;
            }
            System.out.println(name);
        }
    }
}

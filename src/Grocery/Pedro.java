package Grocery;

/**
 *
 * @author Acer
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Simple supermarket receipt
 *
 * @author Regino
 */
class Goods {
    String id;
    String name;
    double price;
    int count;

    public Goods() {
    }

    public Goods(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}

public class Pedro {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        ArrayList<Goods> list = new ArrayList<>();
        list.add(new Goods("121123","Pancit Canton",9.25));
        list.add(new Goods("121456","Yakisoba",10.35));
        list.add(new Goods("121789","Corn chips",6.00));
        list.add(new Goods("122123","Potato chips",9.75));
        list.add(new Goods("122789","Lemon juice",22.00));
        list.add(new Goods("123123","Apple juice",21.65));
        list.add(new Goods("123789","Instant Beef Mami",7.50));
        list.add(new Goods("124123","Instant Chicken Mami",7.50));
        list.add(new Goods("124456","Canned sardines",18.00));
        list.add(new Goods("124789","Canned tuna",21.75));
        list.add(new Goods("125123","Corned beef",24.50));
        list.add(new Goods("125789","Choco biscuit",65.25));
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------- M E N U ----------");
            System.out.printf("%-4s%-5s%3s\n", "|", "1. View list of Items", "|");
            System.out.printf("%-4s%-5s%4s\n", "|", "2. Add items to cart", "|");
            System.out.printf("%-4s%-19s%5s\n", "|", "3. Exit", "|");
            System.out.printf("%-6s%22s", "|", "|");
            System.out.println("");
            System.out.println("----------------------------");
            System.out.println("Choice:");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    showAllGoods();
                    break;
                case 2:
                    Order(list);
                    break;
                case 3:
                    System.out.println("Thank you for using the supermarket shopping system, you're welcome to visit next time, Goodbye! :)");
                    System.exit(0);
                default:
                    System.out.println("Input no corresponding operation, please re-enter");
            }
        }
    }

    //Define the method to realize the operation of purchasing goods
    public static void showAllGoods() {
        System.out.println("\t\tList of products");
        System.out.println("-----------------------------------------");
        System.out.printf("%-6s%9s%22s\n", "ProductID", " Name", "Price");
        int id1 = 121123, id2 = 121456, id3 = 121789, id4 = 122123, id5 = 122789, id6 =123123, id7 = 123789,
                id8 = 124123, id9 = 124456, id10 = 124789, id11 = 125123, id12 = 125789;
        String name1 = "Pancit Canton", name2 = "Yakisoba", name3 = "Corn chips", name4 = "Potato chips",
                name5 = "Lemon juice", name6 = "Apple juice", name7 = "Instant Beef Mami",
                name8 = "Instant Chicken Mami", name9 = "Canned sardines",name10 = "Canned tuna",
                name11 = "Corned beef", name12 = "Choco biscuit";
        double gpa1 = 9.25, gpa2 = 10.35, gpa3 = 6.00, gpa4 = 9.75, gpa5 = 22.00, gpa6 = 21.65, gpa7 = 7.50,
                gpa8 = 7.50, gpa9 = 18.00, gpa10 = 21.75, gpa11 = 24.50, gpa12 = 65.25;
        System.out.printf("%-6d%17s%17.2f\n", id1,name1,gpa1);
        System.out.printf("%-6d%12s%22.2f\n", id2,name2,gpa2);
        System.out.printf("%-6d%14s%20.2f\n", id3,name3,gpa3);
        System.out.printf("%-6d%16s%18.2f\n", id4,name4,gpa4);
        System.out.printf("%-6d%15s%19.2f\n", id5,name5,gpa5);
        System.out.printf("%-6d%15s%19.2f\n", id6,name6,gpa6);
        System.out.printf("%-6d%21s%13.2f\n", id7,name7,gpa7);
        System.out.printf("%-6d%24s%10.2f\n", id8,name8,gpa8);
        System.out.printf("%-6d%19s%15.2f\n", id9,name9,gpa9);
        System.out.printf("%-6d%15s%19.2f\n", id10,name10,gpa10);
        System.out.printf("%-6d%15s%19.2f\n", id11,name11,gpa11);
        System.out.printf("%-6d%17s%17.2f\n", id12,name12,gpa12);
        System.out.println("-----------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Go back to menu? (Y/N)");
        System.out.println("Choice:");

        while (true) {
            String choice = sc.nextLine().toUpperCase();
            switch (choice) {
                case "Y":
                    menu();
                case "N":
                    System.out.println("Thank you for using the supermarket shopping system, you're welcome to visit next time, Goodbye! :)");
                    System.exit(0);
                default:
                    System.out.println("Input no corresponding operation, please re-enter");
            }
        }
    }

    public static void Order(ArrayList<Goods> list) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Product ID to be added into cart: (Enter '0' if proceed to checkout.)");
            String line = sc.nextLine();
            String[] good = line.split("-");

            if ("0".equals(line)) {
                receipt(list);
                break;
            }
            if (good.length != 2) {
                System.out.println("The purchase posture you entered is incorrect, please change the posture and try again (format: product id-purchase quantity)");
                continue;
            }
            if (!isIdExist(list, good[0])) {
                System.out.println("The product id you entered does not exist, please enter it again!");
                continue;
            }
            addGoods(list, good[0], Integer.valueOf(good[1]));
        }
    }

    public static boolean isIdExist(ArrayList<Goods> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Goods g = list.get(i);
            if (g.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    //Define the method, add the number of goods purchased
    public static void addGoods(ArrayList<Goods> list, String id, int count) {
        for (int i = 0; i < list.size(); i++) {
            Goods g = list.get(i);
            if (g.getId().equals(id)) {
                int oldCount = g.getCount();
                g.setCount(oldCount + count);
                return;
            }
        }
    }

    public static void receipt(ArrayList<Goods> list) {
        System.out.println("----------------------------- R E C E I P T --------------------------------");
        System.out.printf("%-16s%4s%17s%19s%16s\n", "ProductID","Name","Quantity", "    Price per Quantity","Total Price");
        int type = 0;
        int all = 0;
        double allMoney = 0.0;
        for (int i = 0; i < list.size(); i++) {
            Goods g = list.get(i);
            int count = g.getCount();
            if (count != 0) {
                type++;
                all += count;
                double price = g.getPrice();
                double money = price * count;
                allMoney += money;
                System.out.printf("%-6s%19s%8s%19.2f%20.2f\n", g.getId(), g.getName(), count, price, money);
            }
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(type + " Items");
        System.out.println("total: " + all + " Piece");
        System.out.println("Total: " + allMoney + " Pesos");
        System.out.println("---------------------------");
        //After purchasing and printing the receipt, clear the original purchase record
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setCount(0);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Exit? Enter 'Y' to exit. 'N' to go back to the Menu");

        while (true) {
            String choice = sc.nextLine().toUpperCase();
            switch (choice) {
                case "Y":
                    System.out.println("Thank you for using the supermarket shopping system, you're welcome to visit next time, Goodbye! :)");
                    System.exit(0);
                case "N":
                    menu();
                default:
                    System.out.println("Input no corresponding operation, please re-enter");
            }
        }
    }
}
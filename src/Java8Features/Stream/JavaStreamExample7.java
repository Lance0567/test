package Java8Features.Stream;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample7 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenovo Laptop", 28000f));
        productList.add(new Product(4, "Sony Laptop", 28000f));
        productList.add(new Product(5, "Apple Laptop", 90000f));
        // max() method to get max Product price
        Product productA = productList.stream().max((product1, product2)->product1.price > product2.price?1:-1).get();
        System.out.println(productA.price);
        // min() method to get min Product price
        Product productB = productList.stream().min((product1, product2)->product1.price > product2.price?1:-1).get();
        System.out.println(productB.price);
    }
}

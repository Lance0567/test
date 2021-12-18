package Java8Features.Stream;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample8 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenovo Laptop", 28000f));
        productList.add(new Product(4, "Sony Laptop", 28000f));
        productList.add(new Product(5, "Apple Laptop", 90000f));
        // count number of products based on the filter
        long count = productList.stream()
                .filter(product -> product.price <30000)
                .count();
        System.out.println(count);
    }
}

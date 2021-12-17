package Java8Features.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class CollectorsExample {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        // Adding Products
        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenovo Laptop", 28000f));
        productList.add(new Product(4, "Sony Laptop", 28000f));
        productList.add(new Product(5, "Apple Laptop", 90000f));
        List<Float> productPriceList =
                productList.stream().map(x->x.price)   // fetching price
                        .collect(Collectors.toList()); // collecting as list
        System.out.println(productPriceList);

    }
}

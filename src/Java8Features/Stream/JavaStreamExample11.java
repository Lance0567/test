package Java8Features.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product3 {
    int id;
    String name;
    float price;

    public Product3(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
public class JavaStreamExample11 {
    public static void main(String[] args) {
        List<Product3> productList = new ArrayList<>();

        productList.add(new Product3(1, "HP Laptop", 25000f));
        productList.add(new Product3(2, "Dell Laptop", 30000f));
        productList.add(new Product3(3, "Lenovo Laptop", 28000f));
        productList.add(new Product3(4, "Sony Laptop", 28000f));
        productList.add(new Product3(5, "Apple Laptop", 90000f));

        List<Float> productPriceList =
                productList.stream()
                        .filter(p->p.price > 30000) // filtering data
                        .map(Product3::getPrice)// fetching price by referring getPrice method
                        .collect(Collectors.toList()); // collecting as list
        System.out.println(productPriceList);
    }
}

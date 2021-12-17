package Java8Features.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample3 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();

        productList.add(new Product(1,"HP Laptop", 25000f));
        productList.add(new Product(2,"Dell Laptop", 30000f));
        productList.add(new Product(3,"Lenovo Laptop", 28000f));
        productList.add(new Product(4,"Sony Laptop", 28000f));
        productList.add(new Product(5,"Apple Laptop", 90000f));
        Double sumPrice =
                productList.stream()
                        .collect(Collectors.summingDouble(x->x.price));
        System.out.println("Sum of prices " + sumPrice);
        Integer sumId = productList.stream().collect(Collectors.summingInt(x->x.id));
        System.out.println("Sum of id's: " + sumId);
    }
}

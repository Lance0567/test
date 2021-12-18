package Java8Features.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaStreamExample9 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenovo Laptop", 28000f));
        productList.add(new Product(4, "Sony Laptop", 28000f));
        productList.add(new Product(5, "Apple Laptop", 90000f));

        // Converting product list into Set
        Set<Float> productPriceList = productList.stream()  // filter product on the base of price
                .filter(product -> product.price < 30000)
                .map(product -> product.price)
                .collect(Collectors.toSet());  // collect it as Set(remove duplicate elements)
        System.out.println(productPriceList);
    }
}

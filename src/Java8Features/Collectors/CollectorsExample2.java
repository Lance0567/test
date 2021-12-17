package Java8Features.Collectors;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample2 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        // Adding Products
        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenovo Laptop", 28000f));
        productList.add(new Product(4, "Sony Laptop", 28000f));
        productList.add(new Product(5, "Apple Laptop", 95000f));
        Set<Float> productPriceList =
                productList.stream()
                        .map(x->x.price)
                        .collect(Collectors.toSet());
        System.out.println(productPriceList);
    }
}

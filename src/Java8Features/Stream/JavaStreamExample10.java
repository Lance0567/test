package Java8Features.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStreamExample10 {
    public static void main(String[] args)  {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenovo Laptop", 28000f));
        productList.add(new Product(4, "Sony Laptop", 28000f));
        productList.add(new Product(5, "Apple Laptop", 90000f));

        // Converting Product List into a Map
        Map<Integer,String> productPriceMap =
                productList.stream()
                        .collect(Collectors.toMap(p->p.id,p->p.name));
        System.out.println(productPriceMap);
    }
}

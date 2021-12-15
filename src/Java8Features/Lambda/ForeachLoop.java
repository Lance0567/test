package Java8Features.Lambda;

import java.util.ArrayList;
import java.util.List;

public class ForeachLoop {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("love");
        list.add("care");
        list.add("desperation");
        list.add("focus");

        list.forEach(
                (n)-> System.out.println(n)
        );
    }
}

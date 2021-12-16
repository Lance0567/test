package Java8Features.forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> gameList = new ArrayList<String>();
        gameList.add("Football");
        gameList.add("Cricket");
        gameList.add("Chess");
        gameList.add("Hockey");
        System.out.println("------------Iterating by passing lambda expression--------------");
        gameList.forEach(games -> System.out.println(games));
    }
}

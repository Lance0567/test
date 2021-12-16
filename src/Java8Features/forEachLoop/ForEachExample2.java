package Java8Features.forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample2 {
    public static void main(String[] args) {
        List<String> gameList = new ArrayList<String>();
        gameList.add("FootBall");
        gameList.add("Cricket");
        gameList.add("Chess");
        gameList.add("Hockey");
        System.out.println("------------Iterating by passing method reference---------------");
        gameList.forEach(System.out::println);
    }
}

package Java8Features.Lambda;

@FunctionalInterface //it is optional
interface Drawable{
    public void draw();
}

public class Example {
    public static void main(String[] args) {
        int width = 10;

        //with lambda
        Drawable d1 = ()->{
            System.out.println("Drawing " + width);
        };
        d1.draw();
    }
}

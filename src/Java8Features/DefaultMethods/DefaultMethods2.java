package Java8Features.DefaultMethods;

interface Sayable2 {
    // default method
    default void say(){
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void sayMore(String msg);
    // static method
    static void sayLouder(String msg){
        System.out.println(msg);
    }
}

public class DefaultMethods2 implements Sayable {
    public void sayMore(String msg) {  // implementing abstract method
        System.out.println(msg);
    }
    public static void main(String[] args) {
        DefaultMethods2 dm2 = new DefaultMethods2();
        dm2.say();   // calling default method
        dm2.sayMore("Work is worship");  // calling abstract method
        Sayable2.sayLouder("Hellooo...");  // calling static method
    }
}

@FunctionalInterface
interface Hello {
    void sayHello();
}

@FunctionalInterface
interface Greeting {
    String greet();
}

@FunctionalInterface
interface Maths {
    int sum(int a, int b);
}

public class Interfaces {
    public static void main(String[] args) {

        Hello h1 = () -> System.out.println("Hello Lambda");
        h1.sayHello();

        Greeting g1 = () -> "Good Morning";
        System.out.println(g1.greet());

        Maths m1 = (a, b) -> a + b;
        System.out.println("Sum: " + m1.sum(10, 20));
    }
}
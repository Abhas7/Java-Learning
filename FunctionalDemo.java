/*public class Demo<T> {

    private T data;

    public Demo(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    } 

    public void setData(T data) { 
        this.data = data;
    }

    public static void main(String[] args) {
        Demo<String> d1 = new Demo<String>("Heyy");
        System.out.println(d1.getData());

        Demo<Integer> d2 = new Demo<Integer>(22);
        System.out.println(d2.getData());
    }
}*/

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate; 
import java.util.function.Supplier;

public class FunctionalDemo {

    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {

        Consumer<String> c = (s) -> System.out.println(s);
        c.accept("Adios");

        Consumer<String> c1 = System.out::println;
        c1.accept("Hello");
    
        Consumer<String> c2 = FunctionalDemo::print;
        c2.accept("Aloha");

        Supplier<String> s1 = () -> {
            return "Abhas"; 
        };
        System.out.println(s1.get());

        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());

        Predicate<Integer> odd = n -> n % 2 == 0;
        System.out.println(odd.test(4));

        BiPredicate<Integer, Integer> greater = (a, b) -> a > b;
        System.out.println(greater.test(4, 6));

        Function<Integer, Integer> add5 = n -> n + 5;
        System.out.println(add5.apply(20)); 

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b; 
        System.out.println(add.apply(10, 20));
 

    } 
}   


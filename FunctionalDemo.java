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
    }
}
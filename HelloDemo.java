interface Hello {
    void sayHello();

}
interface Greeting {
    String greet();
}

public class HelloDemo{
    public static void main(String[] args){
        
        Hello h1 = () -> System.out.println("Hello World");

        h1.sayHello();
 
        Greeting g1 = () -> {
            return "Hello";
        };
        
        System.out.println(g1.greet());
    } 
}
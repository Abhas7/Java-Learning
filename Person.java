public class Person { 
    private String name;
    private int age;
    
    public Person() { // default constructor -> No parameters
    } 

    public Person(String name, int age) { // parameterized constructor -> parameters
        this.name = name;
        this.age = age;
    } 

    public void print() { 
        System.out.println("Name: " + name + " , Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Polo", 21);
        p1.print(); 
    }
}
 
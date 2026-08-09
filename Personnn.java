public class Personnn{
    private String name;
    private int age;

    public Personnn(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personnn [name=" + name + ", age=" + age + "]";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    } 
}
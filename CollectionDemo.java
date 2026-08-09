import java.util.LinkedList;
import java.util.Iterator;

public class CollectionDemo {

    public static void main(String[] args) {

        LinkedList<String> lst = new LinkedList<String>(); 

        lst.add("Microsoft");
        lst.add("Google");
        lst.addFirst("Apple");
        lst.addLast("Apache");  
        lst.add(2, "Oracle"); 

        System.out.println("Traversing using for loop"); 

        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i)); 
        }

        System.out.println("Traversing using Iterator");
        Iterator<String> itr = lst.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        System.out.println("Traversing using for-each");
        for(String s : lst) {
            System.out.println(s);


        System.out.println("Traversing using for-each method");
        lst.forEach(e -> System.out.println(e));
        }    
        }
    }
}  
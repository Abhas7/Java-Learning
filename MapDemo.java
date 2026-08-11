// import java.util.LinkedList;
// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.TreeSet;
// import java.util.Iterator;

// public class CollectionDemo {

//     public static void main(String[] args) {

//         LinkedList<String> lst = new LinkedList<String>();

//         lst.add("Microsoft");
//         lst.add("Google");
//         lst.addFirst("Apple");
//         lst.addLast("Apache");
//         lst.add(2, "Oracle");

//         System.out.println("Traversing using for loop");

//         for (int i = 0; i < lst.size(); i++) {
//             System.out.println(lst.get(i));
//         }

//         System.out.println("Traversing using Iterator");

//         Iterator<String> itr = lst.iterator();

//         while (itr.hasNext()) {
//             System.out.println(itr.next());
//         }

//         System.out.println("Traversing using for-each");

//         for (String s : lst) {
//             System.out.println(s);
//         }

//         System.out.println("Traversing using for-each method");

//         lst.forEach(e -> System.out.println(e));

//         // ArrayList
//         ArrayList<String> ar = new ArrayList<String>();

//         ar.add("Google");
//         ar.add("Amazon");
//         ar.add("Facebook");
//         ar.add("Netflix");
//         ar.add("Oracle");

//         // Add all LinkedList elements
//         ar.addAll(lst);

//         System.out.println("Traversing over merged collection");

//         for (String e : ar) {
//             System.out.println(e);
//         }

//         // HashSet
//         HashSet<String> set = new HashSet<String>(ar);

//         System.out.println("Traversing over set collection");

//         for (String e : set) {
//             System.out.println(e);
//         }

//         // TreeSet
//         TreeSet<String> tree = new TreeSet<String>(set);

//         System.out.println("Traversing over TreeSet collection");

//         for (String e : tree) {
//             System.out.println(e);
//         }
//     }
// }

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors; 

public class MapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("scott", "tiger");
        map.put("jack", "jill");
        map.put("polo", "lili");
        map.put("jack", "rose");

        System.out.println("Scott: " + map.get("scott"));
        System.out.println("Polo: " + map.get("polo"));
        System.out.println("Jack: " + map.get("jack"));

        // Print all keys and values without manually feeding keys
        for (Map.Entry<String, String> entry : map.entrySet()) {
            // System.out.println(entry.getKey() + ": " + entry.getValue());

            // map.forEach((key, value) -> System.out.println(key + ": " + value));

        // System.out.println(numbers.stream().count());
        // System.out.println(numbers.stream().max(null));
        // System.err.println(numbers.stream().min(null));
        // System.err.println(numbers.stream().average(null));
        // System.err.println(numbers.stream().skip(10));
        // System.out.println(numbers.stream().filter(e -> e % 2 == 0));
        // System.out.println(numbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()));
        // System.out.println(numbers.stream().map(e -> e * 2));
        // System.out.println(numbers.stream().map(e -> e * 2).collect(Collectors.toList()));
        // System.out.println(numbers.stream().sorted());  
        // System.out.println(numbers.stream());


               


            
        }
    }
}
/*import java.io.File;
import java.util.Date;

public class Stream {
    public static void main(String[] args) throws Exception {

        String path = "D:/temp/";
        File file = new File(path);

        if (file.exists()) {

            System.out.println(file.getName());
            System.out.println(file.getCanonicalPath());
            System.out.println(file.getAbsolutePath());

            if (file.isFile()) {

                System.out.println(file.canRead());
                System.out.println(file.canWrite());
                System.out.println(file.canExecute());

                Date date = new Date(file.lastModified());
                System.out.println(date);

                System.out.println(file.length());

            } else {
                System.out.println("Content of the directory"); 
                String[] contents = file.list();
                for (String f : contents){
                    System.out.println(f);
                }
            }
        } else {
            System.out.println("File does not exists");

        }
    }
}*/



/*import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;  



public class FileWriterDemo {
    public static void main(String[] args) {
        String path = "src/amazing.txt";
        BufferedWriter writer = null;
        try { 
            writer = new BufferedWriter(new FileWriter(path));

            writer.write("When I see your face");
            writer.newLine();  

            writer.write("There's not a thing that I would change");
            writer.newLine();

            writer.write("Cause you're amazing, just the way you are"); 

            System.out.println("Writing to file completed.");
            writer.close();
        } catch (IOException e){
            e.printStackTrace(); 
        }
    }
}*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws Exception {

        Person p = new Person("Polo", 21);
        System.out.println(p);

        String path = "src/pers.dat";
        ObjectOutputStream ostream = null;
        ObjectInputStream istream = null;

        // Serialization code
        ostream = new ObjectOutputStream(new FileOutputStream(path));
        ostream.writeObject(p); // serializing object
        ostream.close();
        System.out.println("Object serialized...");

        // Deserialization code
        istream = new ObjectInputStream(new FileInputStream(path));
        Object obj = istream.readObject(); // Deserializing object
        System.out.println(obj);
        istream.close();
    }
}
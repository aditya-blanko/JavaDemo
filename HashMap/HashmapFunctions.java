package HashMap;
import java.io.*;
import java.util.*;

public class HashmapFunctions {
    
    public static void main(String[] args) {

        HashMap<Integer,String> hashmap = new HashMap<>();
        
        // functionality of put function
        hashmap.put(1, "Aditya"); 
        hashmap.put(2, "Atishay");
        hashmap.put(3, "Aryan");
        hashmap.put(5, "Aniket");

        System.out.println("Hashmap of given data is" + hashmap);

        // Functionality of get function
        String result = hashmap.get(3);
        System.out.println("Value of given key is " + result);

        // Functionality of containskey function
        System.out.println(hashmap.containsKey(3));
        System.out.println(hashmap.containsKey(6));

        // Functionality of remove function
        hashmap.remove(5);
        System.out.println("Updated hashmap is "+ hashmap);
        System.out.println();

        // Functionality of entryset function
        System.out.println("Hashmap is ");
        for(Map.Entry<Integer,String> e: hashmap.entrySet())
        {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
        
        
    }
}

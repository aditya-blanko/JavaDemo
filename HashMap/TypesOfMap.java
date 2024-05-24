package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TypesOfMap {
    public static void main(String[] args) {

        // Unordered return type
        HashMap<Integer,String> map = new HashMap<>();

        map.put(2, "Aditya"); 
        map.put(1, "Atishay");
        map.put(5, "Aryan");
        map.put(3, "Aniket");
        System.out.println("Hashmap looks like" + map);


        // Order of inesrtion remains same
        HashMap<Integer,String> map1 = new LinkedHashMap<>();
        
        map1.put(2, "Aditya"); 
        map1.put(1, "Atishay");
        map1.put(5, "Aryan");
        map1.put(3, "Aniket");
        System.out.println("LinkedHashmap looks like" + map1);


        // Sorted output on the basis of keys
        TreeMap<Integer,String> map2 = new TreeMap<>();

        map2.put(2, "Aditya"); 
        map2.put(1, "Atishay");
        map2.put(5, "Aryan");
        map2.put(3, "Aniket");
        System.out.println("Treemap looks like" + map2);



    }
}

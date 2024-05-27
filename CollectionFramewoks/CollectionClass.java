package CollectionFramewoks;

import java.util.*;

public class CollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(1);
        list.add(9);

        System.out.println("Max element "+ Collections.max(list));
        System.out.println("Min element "+ Collections.min(list));
        System.out.println(Collections.frequency(list, 1));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}

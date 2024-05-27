package CollectionFramewoks;

import java.util.*;

public class ArrayListImplementation {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Arraylist looks like " + list);
        list.add(4);
        System.out.println("Now Arraylist looks like " + list);
        list.add(1, 50);
        System.out.println("Arraylist looks like " + list);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(500);
        newList.add(600);

        // we can add a whole new list to aur list
        list.addAll(newList);
        System.out.println("Arraylist looks like " + list);
        

        System.out.println(list.get(1));
        

        list.remove(1);
        System.out.println("Arraylist looks like " + list);

        list.add(2);

        list.remove(Integer.valueOf(2));
        System.out.println("Arraylist looks like " + list);

        list.set(0, 1000);
        System.out.println("Arraylist looks like " + list);

        System.out.println(list.contains(2));

        System.out.println(list);

        for(int i=0;i<list.size();i++)
        {
            System.out.println("List looks like " + list.get(i));
        }

        for(Integer element : list)
        {
            System.out.println("Foreach element "+ element);
        }

        // Iterator<Integer> it = list.iterator();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext())
        {
            System.out.println("Iterator " + it.next());            
        }


    }
    
}

package CollectionFramewoks;

import java.util.Arrays;

public class ArraysMethod {
    
    public static void main(String[] args) {
        int num[] = {1,2,4,5,7,8,9,47,12};
        System.out.println("Element is present at index "+ Arrays.binarySearch(num, 4));

        Arrays.sort(num);
        for(int i : num)
        {
            System.out.print(i + " ");
        }
        Arrays.fill(num, 12);
        System.out.println("Array looks like");
        for(int i : num)
        {
            System.out.print(i + " ");
        }
    }
}

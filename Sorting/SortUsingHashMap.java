package Sorting;

// import java.util.HashMap;
// import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortUsingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i], i);
        }
        System.out.println("Sorted Array is ");
        for(Map.Entry<Integer,Integer> e: map.entrySet())
        {
            System.out.println(e.getKey());
        }
        


    }
}

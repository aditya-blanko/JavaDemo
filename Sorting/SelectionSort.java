package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void SortedArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int min_idx = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min_idx])
                {
                    min_idx = j;
                }
            }
            if(min_idx != i)
            {
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemnts you want in an array : ");
        int num = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int arr[] = new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }

        SortedArray(arr);
        System.out.println("Your Sorted array is" + Arrays.toString(arr));
    }
    
}

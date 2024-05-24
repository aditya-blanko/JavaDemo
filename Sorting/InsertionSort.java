package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void SortedArray(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int j = i;
            while(j>0 && arr[j]<arr[j-1])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
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

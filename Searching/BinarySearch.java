package Searching;

import java.util.Scanner;

public class BinarySearch {

    public static int BinarySearcher(int arr[],int target){

        int low = 0;
        int high = arr.length-1;
        int mid = (low + high )/2;

        while(low<=high)
        {
            if(arr[mid]==target)
            {
                return mid;
            }
             else if(arr[mid]<target)
            {
                low = mid + 1;
            }
            else if(arr[mid]>target)
            {
                high =mid-1;
            }

        }
        return -1;
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
        System.out.println("Enter the element you want to find : ");
        int target = sc.nextInt();
        int result = BinarySearcher(arr,target);
        if(result == -1)
        {

            System.out.println("Element not found in the array");

        }
        else{
            System.out.println("The element you are loooking for is present on " + result + " index");
        }
    }
}

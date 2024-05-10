package Searching;

import java.util.Scanner;

public class LowerBound {

    public static int FindFirstOccurence(int arr[],int target){

        int low = 0;
        int high = arr.length-1;
        int result = -1;

        while(low<=high)
        {
            int mid = (low + high )/2;
            if(arr[mid]==target)
            {
                result = mid;
                high =mid -1;
            }
            else if(arr[mid]<target)
            {
                low =mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in an array : ");
        int num = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int arr[] = new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to find : ");
        int target = sc.nextInt();
        int result = FindFirstOccurence(arr,target);
        if(result == -1)
        {
            System.out.println("Element not found in the array");
        }
        else
        {
            System.out.println("The element you are loooking for first occured on " + result + " index");
        }
    }
}

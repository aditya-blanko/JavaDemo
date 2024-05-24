// Binary Search with the help of recursion

package Recursion;

import java.util.Scanner;

public class BinarySearchh {

    public static int BinarySearcher(int arr[],int target,int low ,int high)
    {
        int mid = (low +high)/2;
        int result = -1;
        while(low<=high)
        {
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                return BinarySearcher(arr, target, mid+1, high);
            }
            else
            {
                return BinarySearcher(arr, target, low, mid-1);
            }
        }
        return result;
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
        int low = 0, high = arr.length-1; 
        int result = BinarySearcher(arr,target,low,high);
        if(result == -1)
        {

            System.out.println("Element not found in the array");

        }
        else{
            System.out.println("The element you are loooking for is present on " + result + " index");
        }
    }
    
}

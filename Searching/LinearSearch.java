package Searching;
import java.util.Scanner;

public class LinearSearch {
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
        
        int idx = -1;
        for(int i=0;i<num;i++)
        {
            if(arr[i] == target)
            {
                idx = i;
                System.out.println("Element found at index : " + idx);
                break;
            }
            else{
                System.out.println("element is not presnt in the array");
                
            }
            
            
            
        }
        
        
        
    }
}

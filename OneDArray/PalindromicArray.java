package OneDArray;
import java.util.Scanner;

public class PalindromicArray {
    public static void main(String[] args) {
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you need in an array");
        n = sc.nextInt();
        int array[] = new int[n];
        for (i=0;i<n;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("your array is");
        for (i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
        for (i=0;i<array.length;i++)
        {
            if(array[i] != array[n-i-1])
            {
                System.out.println("Given Array is not a palindromic array");
                break;

            }
        }
        System.out.println("Given Array is a palindromic array");
            
        
        
        
        
    }
}

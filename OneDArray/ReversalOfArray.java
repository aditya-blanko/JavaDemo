package OneDArray;
import java.util.Scanner;

public class ReversalOfArray {
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

        for(i=0;i<n/2;i++)
        {
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.println(array[i] + "");
        }
    }
}

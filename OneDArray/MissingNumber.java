package OneDArray;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        int i,n;
        int sum = 0;
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
        int sum_of_natural_numbers = (n*(n+1))/2;
        for(i=0;i<n-1;i++)
        {
            sum += array[i];
        }
        int missing_number = sum_of_natural_numbers - sum;
        System.out.println("Your missing number is : " + missing_number);
    }
}

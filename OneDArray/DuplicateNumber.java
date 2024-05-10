package OneDArray;
import java.util.Scanner;

public class DuplicateNumber {
    public static void main(String[] args) {
        int i,n,j;
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
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(array[i] == array[j])
                {
                    System.out.println("the duplicate number is :" + array[i]);
                }
            }
        }
    }
}

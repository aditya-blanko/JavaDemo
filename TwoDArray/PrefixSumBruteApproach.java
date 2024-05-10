package TwoDArray;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class PrefixSumBruteApproach 
{

    public static int PrefixSum(int arr[][],int r1,int c1,int r2, int c2)
    {
        int sum = 0;
        for(int i=r1;i<=r2;i++)
        {
            for(int j=c1;j<=c2;j++)
            {
                sum += arr[i][j];

            }
        }
        return sum;
    }
    public static void main(String[] args) 
    {

        int arr[][]= {

            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of r1: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the value of c1: ");
        int c1 = sc.nextInt();
        System.out.println("Enter the value of r2: ");
        int r2 = sc.nextInt();
        System.out.println("Enter the value of c2: ");
        int c2 = sc.nextInt();
        int result = PrefixSum(arr,r1,c1,r2,c2);
        System.out.println("area of given rectangle is : " + result);

    
    }
}

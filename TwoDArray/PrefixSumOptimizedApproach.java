package TwoDArray;

import java.util.Scanner;

public class PrefixSumOptimizedApproach {

    public static void PrefixSumOfRowColumns(int arr[][])
    {   
        // Prefix Sum of all the rows
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr[0].length;j++)
            {
                arr[i][j] += arr[i][j-1];
            }
        }

        // Prefix Sum of all the columns
        for(int j=0;j<arr[0].length;j++)
        {
            for(int i=1;i<arr.length;i++)
            {
                arr[i][j] += arr[i-1][j];
            }
        }
    }

    public static int PrefixSumofGivenArea(int arr[][], int r1, int c1, int r2, int c2)
    {
        int sum = 0;
        int left = 0;
        int up = 0;
        int common_area =0;
        int result = 0;

        sum = arr[r2][c2];
        left = arr[r2][c1-1];
        up = arr[r1-1][c2];
        common_area = arr[r1-1][c1-1];

        result = sum - left - up + common_area;

        return result;

    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
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

        PrefixSumOfRowColumns(arr);
        int result = PrefixSumofGivenArea(arr,r1,c1,r2,c2);
        System.out.println("Value of given area is: " + result);
    }
}

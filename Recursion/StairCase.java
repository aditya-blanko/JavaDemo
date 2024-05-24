package Recursion;

import java.util.Scanner;

public class StairCase {

    public static int FindingStairCases(int num)
    {
        if(num<=1)
        {
            return num;
        }
        else
        {
            return FindingStairCases(num-1) + FindingStairCases(num-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs");
        int num = sc.nextInt();

        // relationship betwwen staircase and the fibonacci series
        int result = FindingStairCases(num+1);
        System.out.println("Number of ways are " +result);
    }
    
}

package Recursion;

import java.util.Scanner;

public class Fibonacci {

    public static int FindingFibonacci(int num)
    {
        // int result = 0;
        if(num<=1)
        {
            return num;
        }
        else
        {
            int result = FindingFibonacci(num-1) + FindingFibonacci(num-2);
            return result;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in the fibonacci series is ");
        int num = sc.nextInt();
        for(int i=0;i<num;i++)
        {
            System.out.println(FindingFibonacci(i));
        }
        // int result = FindingFibonacci(num);
        // System.out.println("the final result is " + result);
        sc.close();
    }
}

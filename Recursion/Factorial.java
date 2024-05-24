package Recursion;

import java.util.Scanner;

public class Factorial {
    
    public static int FindingFactorial(int num)
    {
        if(num == 0 || num == 1)
        {
            return 1;
        }

        else
        {
            int result = num*FindingFactorial(num-1);
            return result;
        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want the factorial of ");
        int num = sc.nextInt();
        int result = FindingFactorial(num);
        System.out.println("Factorial of given number is " + result);
    }
}

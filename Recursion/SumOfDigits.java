package Recursion;

import java.util.Scanner;

public class SumOfDigits {

    public static int FindingSum(int num)
    {
        if(num<=9)
        {
            return num;
        }
        else
        {
            int result = num%10 + FindingSum(num/10);
            return result;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();

        int result = FindingSum(num);
        System.out.println("Sum of the digits of the number is " + result);

    }
    
}

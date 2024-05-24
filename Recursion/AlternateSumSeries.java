package Recursion;

import java.util.Scanner;

public class AlternateSumSeries {
    
    public static int FindingAlternateSeriesSum(int num)
    {
        int result = 0;
        if(num==0)
        {
            return 0;
        }
        if(num%2==0) //For even number
        {
            result = FindingAlternateSeriesSum(num-1) - num;
            return result;
        }
        else
        {
            result = FindingAlternateSeriesSum(num-1) + num;
            return result;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();

        int result = FindingAlternateSeriesSum(num);
        System.out.println("The Alternate sum series of given number is " + result);
    }
}

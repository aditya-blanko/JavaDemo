package Recursion;

import java.util.Scanner;

public class PowerOfNumber1 {

    public static int PowerApproach1(int a, int b)
    {
        if(b==1)
        {
            return a;
        }
        else
        {
            return a*PowerApproach1(a, b-1);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = PowerApproach1(a,b);
        System.out.println("value of a^b is " + result);
    }
}

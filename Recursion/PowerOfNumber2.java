package Recursion;

import java.util.Scanner;

public class PowerOfNumber2 {

    public static int PowerApproach2(int a,int b)
    {
        if(b==1)
        {
            return a;
        }
        else
        {
            int result = PowerApproach2(a, b/2);
            int final_result = result*result;
            if(b%2==0)
            {
                return final_result;
            }
            else
            {
                return a*final_result;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = PowerApproach2(a,b);
        System.out.println("value of a^b is " + result);

    }
}

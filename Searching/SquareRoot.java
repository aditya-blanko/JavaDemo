package Searching;

import java.util.Scanner;

public class SquareRoot {

    public static int FindSquareRoot(int num)
    {
        
        int low = 0;
        int high = num;
        int result = -1;    
        while(low<=high)
        {        
            int mid  = (low+high)/2;
            long val = mid*mid;        
            if(val == num)
            {
                // perfect Square root
                return mid;
            }
            else if (val < num)
            {
                result = mid;
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
            
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element you want the square root of ");
        int num = sc.nextInt();

        int result = FindSquareRoot(num);
        System.out.println("Square root of given number is " + result);

        
    }
}

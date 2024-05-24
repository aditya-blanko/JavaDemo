package Recursion;

import java.util.Scanner;

public class PrintingMultiplesOfNumber {

    public static void PrintMultiples(int num,int k)
    {
        if(k==1)
        {
            System.out.println(num);
        }
        else
        {
            PrintMultiples(num, k-1);
            System.out.println(num*k);
        }
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want the multiples of ");
        int num  = sc.nextInt();
        System.out.println("Enter the number of multiples you want ");
        int k = sc.nextInt();
        System.out.println();
        PrintMultiples(num,k);
        System.out.println();
    }
}

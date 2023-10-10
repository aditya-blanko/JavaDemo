// import java.util.Scanner;

// public class ScannerClass {
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.println("Enter principle amount : ");
//         float p = sc.nextFloat();
//         System.out.println("Enter rate pf interest : ");
//         float r = sc.nextFloat();
//         System.out.println("Enter time : ");
//         float t = sc.nextFloat();

//         float si = (p*r*t)/100;

//         System.out.println("Principle amount is "  + p);
//         System.out.println("Rate of interest is " + r);
//         System.out.println("Time is : " + t);
//         System.out.println("Simple interest is : " + si);
        
//     }
    
// }


import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args)
     {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("Enter the character : ");
        char ch = sc.next().charAt(0);
        System.out.println("Character is "  + ch);   
    }
}
package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static boolean validstr(String str) {

        Stack<Character> stack = new Stack<>();
        char arr[] = str.toCharArray();

        for(char element : arr)
        {
            // if elements contain open parentheses push into stack
            if(element=='(' || element=='{' || element=='[' )
            {
                stack.push(element);
                continue;
            }
            // if nothing is pushed into the stack
            else if(stack.empty())
            {
                return false;
            }

            char top = stack.pop();

            if(top =='[' && element !=']')
            {
                return false;
            } 

            else if(top =='{' && element !='}')
            {
                return false;
            } 

            else if(top =='(' && element !=')')
            {
                return false;
            } 
        }
        return stack.empty();


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();

        System.out.println("is the given string valid :" + validstr(str));
    }
}

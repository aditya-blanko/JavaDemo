package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatChar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();

        // hashmap construction
        // key conatins unique characters of string
        // value contains frequency of characters of string
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i) , map.get(str.charAt(i)) + 1);
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }
        int result = -1;
        for(int i=0;i<str.length();i++)
        {
            if(map.get(str.charAt(i)) == 1)
            {
                System.out.println("the first non-repeating character is at index " + i);
                result = 1;
                break;
            }
        }
        if(result == -1)
            {
                System.out.println("there are no repeating characters in the string");
            }
    }
}

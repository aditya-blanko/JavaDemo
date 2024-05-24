package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemnts you want in an array : ");
        int num = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int arr[] = new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum : ");
        int target = sc.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();

        // putting arr[i] as key and i as value
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i], i);
        }
        // initialize a new array to store the index of values contributing to the target sum
        int result[] = {-1,-1};
     
        // if current is equal to target
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target && map.containsKey(0))
            {
                result[0] = i;
                result[1] = map.get(0);
                break;
            }

            else if(map.containsKey(target-arr[i]))
            {
                // for non-repeatable elements
                if(map.get(target-arr[i]) > i)
                {
                    result[0] = i;
                    result[1] = map.get(target-arr[i]);
                    break;
                }
            }
        }
        System.out.println("Two sum index values are [" + result[0] + "," + result[1] + "]");
        
    }
}


        // int result = -1;
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=i+1;j<arr.length;j++)
        //     {
        //         if(arr[i] + arr[j] == target)
        //         {
        //             return new int[]{i,j};
        //         }
                
        //     }
        // }
        // return new int[0];

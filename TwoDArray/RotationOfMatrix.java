package TwoDArray;
import java.util.*;
import java.io.*;

public class RotationOfMatrix 
{

    public static void RotatedMatrix(int arr[][])
    {
        // Transpose of Matrix
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr[0].length;j++)
            {
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
            }
        }

        // Swap the columns
        for(int i=0;i<arr.length;i++)
        {
            int leftindex = 0;
            int rightindex = arr[0].length -1;
            while(leftindex<rightindex)
            {
                int temp = arr[i][leftindex];
                arr[i][leftindex] = arr[i][rightindex];
                arr[i][rightindex] = temp;

                leftindex++;
                rightindex--;

            }


        }
    }
    public static void main(String[] args) 
    {

        int arr[][]= {

            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        RotatedMatrix(arr);
        for(var matrix:arr)
        {
            System.out.println(Arrays.toString(matrix));
        }

            
    
    }
}

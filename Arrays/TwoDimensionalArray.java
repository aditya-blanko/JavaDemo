public class TwoDimensionalArray {
    public static void main(String[] args) 
    {
        
        
        int arra[][] = { {4,5},{5,6},{8,9} };
        
        // int arra[][] = new int[3][2];
        // arra[0][0] = 4;
        // arra[1][0] = 5; 
        // arra[2][0] = 6; 
        // arra[2][1] = 9;
        // arra[0][1] = 8; 
        // arra[1][1] = 7;
        

        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=1;j++)
            {
                System.out.print(arra[i][j] + " ");
            }
            System.out.println();
        }
    }
}

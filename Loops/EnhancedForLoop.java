public class EnhancedForLoop {
    public static void main(String[] args) {


        int arr[][] = {   {1,2,6},
                          {5,6,7,9},
                          {8,9,8}
                      };
         for(int a[] : arr)
         {
            for(int b : a)
            {
                System.out.print(b + " ");
            }
            System.out.println();
         }             
        // int arr[] = {4,5,6,1};
        // for(int a : arr)
        // {
        //     System.out.println(a);
        // }
    }
}

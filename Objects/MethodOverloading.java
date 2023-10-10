class calc
{
    public int add(int n1 , int n2 )
    {
        int res1 =  n1 + n2;
        return res1;
    }
    public int add(int n1 , int n2 , int n3)
    {
        int res2 =  n1 + n2 + n3;
        return res2;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        
        calc obj = new calc();
        int result1 = obj.add(4,5);
        int result2 = obj.add(4,5,6);
        System.out.println(result1);
        System.out.println(result2);
    }
    
}


// class calc
// {
//     public void asd(int n)
//     {
//         System.out.println(n);
//     }
// }

// public class MethodOverloading
// {
//     public static void main(String[] args) {
//         calc obj = new calc();
//         obj.asd(6);
//     }
// }
class calc{
    public int add( int arr[])
    {
        int result = 0;
        for(int n : arr)
        {
            result = result + n;
        }
        return result;
    }
}


public class AnonymousArray {
    public static void main(String[] args) {
        calc obj = new calc();
        int result = obj.add(new int[]{2,3,5,6});
        System.out.println(result);
    }
}



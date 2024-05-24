public class IncDec {
    public static void main(String[] args) {
        int a = 10;
        // a++;
        // System.out.println(a);
        // a--;
        // System.out.println(a);

        // int b = a++;
        // System.out.println(a);            //
        // System.out.println(b);

        int b = ++a + a++;
        System.out.println(a);
        System.out.println(b);
    }
    
}

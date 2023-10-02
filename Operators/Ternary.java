public class Ternary {
    public static void main(String[] args) {
        // int a = 20;
        // int b = 30;
        // int res = (a>b)? a: b;
        // System.out.println(res);
        // String result = (a>b)? "a is greater" : "b is greater";
        // System.out.println(result);


        int a = 20;
        int b = 25;
        int c = 30;
        int res = (a<b && a<c)? a: (b<a && b<c)? b : c;
        System.out.println(res);


    }
}

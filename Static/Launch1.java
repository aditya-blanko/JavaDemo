// package Static;

public class Launch1 {

    public static void main(String[] args) {
        System.out.println("It is a main method");
    }

    
    static int a;

    static {
        System.out.println("It is a static block");
        a = 10;
        System.out.println(a);
    }

    
}

// package Static;

class demo {

    static int a;
    static int b;

    int m;
    int n;

    static
    {
        System.out.println("It is a static block");
        a = 10;
        b = 20;
    }

    {
        System.out.println("It is a non-static block");
        m = 30;
        n = 40;
    }

    static void A()
    {
        System.out.println("Value of static variable a is " + a);
        System.out.println("Value of static variable b is " + b);
    }

    void B()
    {
        System.out.println("Value of non-static variable m is " + m);
        System.out.println("Value of non-static variable n is " + n);
    }

}
public class Launch2{
    
    public static void main(String[] args) {
        // System.out.println("This is a main method");

        demo d  = new demo();

        demo.A();       // Static method can be called without creating the object    
        d.B();


    }
    

}
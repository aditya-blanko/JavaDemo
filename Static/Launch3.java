public class Launch3 {
    static int a = 10;
    int b = 10;

    static void display()
    {
        System.out.println("this is a static method");
        System.out.println(a);
    }

    void display1()
    {
        System.out.println("this is a non-static method");
        System.out.println(b);
    }

    public static void main(String[] args) {
        
        System.out.println("This is a main method");
        display();
        Launch3 d  = new Launch3();
        d.display1();
        // d.display();
    }
}

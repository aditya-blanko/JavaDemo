package constructorr;

class Demo {
    private int a;
    private String b;

    public Demo() 
    {
        System.out.println("Default constructor is called");
        a = 10;
        b = "Aditya";
    }

    Demo(String b)
    {
        this.b = b;
        a = 9;
    }

    Demo(String b, int a) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class indexOverloading {
    public static void main(String[] args) {

        Demo obj1 = new Demo();
        obj1.display();

        Demo obj2 = new Demo("Atishay");
        obj2.display();

        Demo obj3 = new Demo("Aryan", 8);
        obj3.display();

    }

}

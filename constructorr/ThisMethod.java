// this() method is uswed to call the constructor of the same class
// while super() method is used to call the constructor of different class

package constructorr;

class Demo {
    private int a;
    private String b;

    public Demo() {
        System.out.println("Default constructor is called");
        a = 10;
        b = "Aditya";
    }

    Demo(String b) {
        this("ayush", 5);
        this.b = b;
        a = 9;
    }

    Demo(String b, int a) {
        this();
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class ThisMethod {
    public static void main(String[] args) {

        Demo obj1 = new Demo();
        obj1.display();

        Demo obj2 = new Demo("Atishay");
        obj2.display();

        Demo obj3 = new Demo("Aryan", 8);
        obj3.display();

    }

}

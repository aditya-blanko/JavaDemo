// package Private;


// Problem of shadowing occurs when the name of arguments passing and the name of variable is same 
// to counter this we use this() method
class student {
    private int age;
    private String name;

    public void setdata1(int age) {
        this.age = age;
        // name = "aditya";
    }

    public void setdata2(String name) {
        // age = age;
        this.name = name;
    }

    public void show() {
        System.out.println("My name is " + name + " and I'm " + age + " years old");
    }
}

public class Shadowing {
    public static void main(String[] args) {
        student obj = new student();
        student obj1 = new student();
        obj.setdata1(18);
        obj1.setdata2("Aditya");
        obj.show();
        obj1.show();
    }
}
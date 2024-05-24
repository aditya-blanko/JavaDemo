// package Private;

class student {
    private int age;
    private String name;

    public void setdata() {
        age = 20;
        name = "aditya";
    }

    public void show() {
        System.out.println("My name is " + name + " and I'm " + age + " years old");
    }
}

public class Private {
    public static void main(String[] args) {
        student obj = new student();
        student obj1 = new student();
        obj.setdata();
        obj.show();
        obj1.show();
    }
}
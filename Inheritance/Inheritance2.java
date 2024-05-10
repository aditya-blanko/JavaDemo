package Inheritance;

class human 
{
    int age;
    private String name;

    human() {
        System.out.println("human class constructor");
    }

    void demo()
    {
        age  = 18;
        name  = "Aditya";
        System.out.println("Age of the human is " + age) ;
        System.out.println("Name of the human is " + name);
    }
}

class student extends human 
{
    student()
    {
        this(30);
        System.out.println("child class constructor");
    }
    
    student( int age) {
        System.out.println("student class constructor");
        System.out.println(age);

    }
    void display()
    {
        System.out.println("Age is " + age);
        // System.out.println("Name is " + name);
        
    }
}


public class Inheritance2 {
    public static void main(String[] args) {
        student h = new student();
        // student h1 = new student(20);
        h.demo();
        h.display();

    }
    
}

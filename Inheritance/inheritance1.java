package Inheritance;

class human
{
    static int age = 18;
    static void display()
    {
        System.out.println("Age of the human is " + age);
    }
}
 class student extends human
{

}

public class inheritance1 {
    public static void main(String[] args) {
        // student stu1 = new student();
        student.display();
    }
    
}

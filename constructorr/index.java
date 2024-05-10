package constructorr;

class Demo {

    private int age;
    private String name;

    Demo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}

public class index {
    public static void main(String[] args) {

        Demo obj = new Demo(20, "aditya");
        int age = obj.getAge();
        System.out.println(age);
        String name = obj.getName();
        System.out.println(name);

    }

}

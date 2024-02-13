public class Object {
    int num1 ; //instance variable
    public static void main(String[] args) {
        int num2 ; //local variable
        Object obj = new Object();
        System.out.println(obj.num1);
        // System.out.println(obj.num2); //we have to initiate the local variable first
    }
}

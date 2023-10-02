public class Conditional {
    public static void main(String[] args) {
        int a = 20;
        if(a>=15 && a<30)
        {
            System.out.println("legal");
        }
        else if(a<10)
        {
            System.out.println("not legal");
        }
        else
        {
            System.out.println("overage");
        }
    }
}

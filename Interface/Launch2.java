package Interface;

interface A
{
    void show();
}
interface B 
{
    void abc();
}
class X implements A,B
{
    public void show()
    {
        System.out.println("In show");
    }
    public void abc()
    {
        System.out.println("In abc");
    }
}
public class Launch2 {
    public static void main(String[] args) {
        X obj = new X();
        obj.show();
        obj.abc();
    }
    
}

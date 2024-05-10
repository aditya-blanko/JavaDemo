package Interface;
interface computer
{
    void okay();
    default void okayy()
    {
        System.out.println("okayy");
    }
}

class desktop implements computer
{
    public void okay()
    {
        System.out.println("desktop");
    }
}

class laptop implements computer
{
    public void okay()
    {
        System.out.println("laptop");
    }
}

public class launch3 {
    public static void main(String[] args) {
        
        desktop obj = new desktop();
        obj.okay();
        obj.okayy();
    }
}

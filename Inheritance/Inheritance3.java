//  Methods in inheritance

package Inheritance;

class aeroplane 
{
    void takeoff()
    {
        System.out.println("Aeroplane is taking off");
    }
    void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}

class cargoplane extends aeroplane 
{
    void fly()    
    {
        System.out.println("Cargoplane flies at lower height");
    }
    void carrygoods()    //specialised method
    {
        System.out.println("Cargoplane carries goods");
    }
}

class passengerplane extends aeroplane 
{
    void fly()
    {
        System.out.println("Cargoplane flies at heigher height");
    }
    void carrypassengers()        //specialised method
    {
        System.out.println("Cargoplane carries passengers");
    }
}

public class Inheritance3 
{
    public static void main(String[] args) {

        cargoplane cp = new cargoplane();
        cp.takeoff();    // inherited method
        cp.fly();        // fly method will be overridden
        cp.carrygoods();

        passengerplane pp = new passengerplane();
        pp.carrypassengers();
        pp.fly();         // fly method will be overridden
        pp.takeoff();     // inherited method
    }
}

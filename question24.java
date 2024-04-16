class Vehicle {
    void startEngine()
    {

    }
    void stopEngine()
    {

    }
}
class car extends Vehicle{
    void startEngine()
    {
        System.out.println("car started.");
    }
    void stopEngine()
    {
        System.out.println("Car stopped.");
    }
}
class motorcycle extends Vehicle{
    void startEngine()
    {
        System.out.println("Bike started.");
    }
    void stopEngine()
    {
        System.out.println("Bike stopped.");
    }
}
public class question24 {
    public static void main(String[] args)
    {
        car c = new car();
        c.startEngine();
        c.stopEngine();
        motorcycle b = new motorcycle();
        b.startEngine();
        b.stopEngine();
    }
}

// write a program to create class vehicle, the base class should be vehicle with sub-classes car,bike and truck. 
//each sub class should have properties such as makemodel, year , fuel type.
//implement methods to calculate fuel efficiency , distance travelled and maximum speed.
import java.util.Scanner;
class vehicle{
    String makemodel;
    int year;
    String fueltype;
}
class car extends vehicle{
    Scanner s = new Scanner(System.in);
    double mileage;
    car(String name,int year,String fuel)
    {
        super.makemodel = name;
        super.year = year;
        super.fueltype=fuel;
    }
    void effi()
    {
        int kilo,lit;
       
        kilo=100;

        lit=8;
        mileage = kilo/lit;
        System.out.println("Mileage of the Car is : "+mileage);
    }
    void travelled()
    {
        Scanner s = new Scanner(System.in);

        int fuelin=5;
        System.out.println("The Car can travel approxiamately "+(mileage*fuelin)+" kms.");
        s.close();
    }
    void maxspeed()
    {
        System.out.println("Max speed of a car can be around 120kmph.");
    }
    
}
class bike extends vehicle{
    Scanner s = new Scanner(System.in);
    double mileage;
    bike(String name,int year,String fuel)
    {
        super.makemodel = name;
        super.year = year;
        super.fueltype=fuel;
    }
    void effi()
    {

        int kilo,lit;

        kilo=100;

        lit=2;
        mileage = kilo/lit;
        System.out.println("Mileage of the Bike is : "+mileage);

    }
    void travelled()
    {
       

        int fuelin=5;
        System.out.println("The Bike can travel approxiamately "+(mileage*fuelin)+" kms.");

    }
    void maxspeed()
    {
        System.out.println("Max speed of a Bike can be around 80kmph.");
        s.close();
    }
    
}
class truck extends vehicle{
    Scanner s = new Scanner(System.in);
    double mileage;
    truck(String name,int year,String fuel)
    {
        super.makemodel = name;
        super.year = year;
        super.fueltype=fuel;
    }
    void effi()
    {
        
        int kilo,lit;

        kilo=500;
        lit=98;
        mileage = kilo/lit;
        System.out.println("Mileage of the truck is : "+mileage);
       
    }
    void travelled()
    {
        
        int fuelin=5;

        System.out.println("The truck can travel approxiamately "+(mileage*fuelin)+" kms.");

    }
    void maxspeed()
    {
        System.out.println("Max speed of a truck can be around 140kmph.");
    }
    
}
public class question18 {
    public static void main(String[] args)
    {
        car c = new car("Venue",2020,"DIESEL");
        c.effi();
        c.travelled();
        c.maxspeed();
        truck t = new truck("Volvo",2021,"DIESEL");
        t.effi();
        t.travelled();
        t.maxspeed();
        bike b = new bike("Splendor",2022,"petrol");
        b.effi();
        b.travelled();
        b.maxspeed();
    }
}

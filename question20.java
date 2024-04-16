//Write a Java program to create an abstract class Person with abstract methods eat() and exercise(). 
//Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods to 
//describe how each person eats and exercises.
abstract class Person{
    abstract void eat();
    abstract void exercise();
}
class Athlete extends Person{
    void eat()
    {
        System.out.println("Eats in control");
    }
    void exercise()
    {
        System.out.println("Exercises a lot.");
    }
}
class LazyPerson extends Person{
    void eat()
    {
        System.out.println("Eats a lot.");
    }
    void exercise()
    {
        System.out.println("exercises a lot.");
    }
}
public class question20 {
    public static void main(String[] args)
    {
        Athlete a = new Athlete();
        System.out.println("Athlete");
        a.eat();
        a.exercise();
        LazyPerson lp = new LazyPerson();
        System.out.println("LazyPerson");
        lp.eat();
        lp.exercise();
    }
}

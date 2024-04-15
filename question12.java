import java.util.Scanner;
//print area of circle using class and object.
//2. write a program to print following details 1. roll number 2. student name 3. marks of 5 subjects. calculate total and percentage and display all information. 
class Circle{
    double area(double radius){
        return 3.14*radius*radius;
    }
}
public class question12{
    public static void main(String[] args)
    {
        System.out.println("Kinshuk Thapa A44");
        Circle c = new Circle();
        System.out.println("Area of circle : "+(c.area(4.5)));
    }
}
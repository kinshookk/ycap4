class Employee{
    void calculateSalary(){

    }
}
class Manager extends Employee{
    void calculateSalary()
    {
        System.out.println("100k Salary");
    }
}
class Programmer extends Employee{
    void calculateSalary()
    {
        System.out.println("30k salary");
    }
}
public class question23 {
    public static void main(String[] args)
    {
        Manager m = new Manager();
        m.calculateSalary();
        Programmer p = new Programmer();
        p.calculateSalary();
    }    
}

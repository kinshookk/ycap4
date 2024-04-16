//Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). 
//Create a subclass called Employee that adds a new method named getEmployeeId() 
//and overrides the getLastName() method to include the employee's job title.
class Person{
    String firstname;
    String lastname;
    String getFirstName()
    {
        return firstname;
    }
    String getLastName()
    {
        return lastname;
    }
}
class Employee extends Person{
    String employee_id;
    String job_title;
    String getEmployeeId(){
        return employee_id;
    }
    String getLastName()
    {
        return job_title;
    }
}
public class question19 {
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        e1.firstname="Kinshuk";
        e1.lastname="Thapa";
        e1.employee_id="101";
        e1.job_title="Test";
        System.out.println(e1.getEmployeeId());
        System.out.println(e1.getFirstName());
        System.out.println(e1.getLastName());
    }
}

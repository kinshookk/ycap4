//program to create class employee with employee name, salary, and hiring date.
//create method to calculate years of service.
class employee{
    String name;
    double salary;
    int hireyear;
    employee(String name,double salary,int hireyear){
        this.name = name;
        this.salary = salary;
        this.hireyear=hireyear;
    }
    int yearsOfService()
    {
        return 2024-hireyear;
    }
}
public class question14 {
    public static void main(String[] args)
    {
        employee[] listemp= new employee[5];
        listemp[0]= new employee("Kinshuk", 40000, 2019);
        listemp[1]= new employee("Himanshu", 27000, 2017);
        listemp[2]= new employee("Atharva", 23000, 2009);
        listemp[3]= new employee("Manas", 35000, 2018);
        listemp[4]= new employee("Ayush", 39000, 2015);
        for(int i=0;i<5;i++)
        {
            System.out.println("~~~~~~~~~~~~~~");
            System.out.println("Employee Name :"+listemp[i].name);
            System.out.println("Years of Service :" +" "+listemp[i].yearsOfService());
            System.out.println("~~~~~~~~~~~~~~~");
        }
    }
}

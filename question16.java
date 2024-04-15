class person{
    private String name;
    private int age;
    private String country;
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setCountry(String country)
    {
        this.country=country;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public String getCountry()
    {
        return this.country;
    }
}
public class question16 {
    public static void main(String[] args)
    {
        person p1 = new person();
        p1.setName("Kinshuk");
        p1.setAge(19);
        p1.setCountry("India");
        System.out.println("Name : "+p1.getName());
        System.out.println("Age : "+p1.getAge());
        System.out.println("Country : "+p1.getCountry());
    }
}

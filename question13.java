class studentinfo{
    int roll;
    String name;
    int[] marks={0,0,0,0,0};
    int total = 0;
    double percentage;
    void sum()
    {
        for(int i=0;i<marks.length;i++)
        {
            total+=marks[i];
        }
    }
    void percent()
    {
        percentage = (total*100 / 500);
    }
    studentinfo(String name,int roll)
    {
        this.name = name;
        this.roll=roll;
        for(int i=0;i<5;i++)
        {
            marks[i]=(int)(Math.random() * 100);
        }
        sum();
        percent();
    }
    void display()
    {
        System.out.println("Student Name : "+(name));
        System.out.println("Roll Number : "+(roll));
        System.out.println("Total : "+(total));
        System.out.println("Percentage : "+(percentage));
    }
}
public class question13 {
    public static void main(String[] args) {
        System.out.println("Kinshuk Thapa");
        studentinfo s1 = new studentinfo("Kinshuk",44);
        s1.display();
        studentinfo s2 = new studentinfo("Atharva",39);
        s2.display();
        studentinfo s3 = new studentinfo("Manas",36);
        s3.display();
        studentinfo s4 = new studentinfo("Himanshu",37);
        s4.display();
        studentinfo s5 = new studentinfo("Ayush",61);
        s5.display();
    }
}

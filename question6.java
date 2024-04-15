import java.util.Scanner;
public class question6 {
    public static void main(String[] args)
    {
        System.out.println("Kinshuk Thapa");
        Scanner s = new Scanner(System.in);
        int a =s.nextInt();
        if(a>1000)
        {
            System.out.println(0.15*a);
        }
        else{
            System.out.println("No commission.");
        }
        s.close();
    }
}

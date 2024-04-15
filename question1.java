import java.util.Scanner;
public class question1 {
    
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Kinshuk Thapa");
        System.out.println("Enter number one : ");
        int a=s.nextInt();
        System.out.println("Enter second number : ");
        int b=s.nextInt();
        System.out.println("Addition : "+(a+b));
        System.out.println("Subtraction : "+(a-b));
        System.out.println("Multiplication : "+(a*b));
        System.out.println("Division : "+(a/b));
        s.close();
    }
}

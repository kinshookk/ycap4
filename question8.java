import java.util.Scanner;

public class question8 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a =s.nextInt();
        if (a%8==0 && a%5==0)
        {
            System.out.println("Divisible by 8 and 5.");
        }
        else if (a%8==0)
        {
            System.out.println("Divisible by 8.");
        }
        else if(a%5==0)
        {
            System.out.println("Divisible by 5.");
        }
        else{
            System.out.println("Not divisible by 8 and 5.");
        }
    }    
}

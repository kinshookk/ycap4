import java.util.Scanner;
public class question10 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a%2!=0)
        {
            System.out.println("Odd number.");
        }
        else{
            System.out.println("Even number.");
        }
    }
}

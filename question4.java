import java.util.Scanner;
public class question4 {
    public static void main(String[] args)
    {
        System.out.println("Kinshuk Thapa");
        Scanner s = new Scanner(System.in);
        int angle_one = s.nextInt();
        int angle_two = s.nextInt();
        System.out.println("third angle : "+(180-angle_one-angle_two));
    }
}

import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        System.out.println("Kinshuk Thapa");
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("New A : "+a);
        System.out.println("New B: "+b);
    }
}

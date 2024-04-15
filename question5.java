import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {

        System.out.println("Kinshuk Thapa");
        Scanner s = new Scanner(System.in);
        double a= s.nextFloat();
        if(a>1500)
        {
            double f = a - (a*0.25);
            System.out.println("Final price : "+f);
        }
        else{
            System.out.println("Final price : "+a);
        }
    }
}

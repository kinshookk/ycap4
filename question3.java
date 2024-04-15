import java.util.Scanner;
public class question3 {
    public static void main(String[] args)
    {
        System.out.println("Kinshuk Thapa");
        Scanner s = new Scanner(System.in);
        double basic = s.nextFloat();
        double hra=0.25*basic;
        double da = 0.40*basic;
        double pf =0.20*basic;
        double ta = 0.30*basic;
        double gross = basic+hra+da+ta;
        double net = basic+hra+da+pf+ta;
        System.out.println("Gross : "+gross);
        System.out.println("Net : "+net);
        s.close();
    }
}

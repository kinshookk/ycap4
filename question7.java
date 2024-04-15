import java.util.Scanner;
public class question7 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int total=25*5;
        int percentage =  (total*100)/250;
        if(percentage>=90)
        {
            System.out.println("A+");
        }
        else if (percentage>=80 && percentage<=89)
        {
            System.out.println("A");
        }
        else if(percentage>=70 && percentage<=79){
            System.out.println("B+");
        }
        else if(percentage>=60 && percentage<=69)
        {
            System.out.println("B");
        }
        else if (percentage>=50 && percentage<=59){
            System.out.println("C");
        }
        else if(percentage<50)
        {
            System.out.println("Fail");
        }
        s.close();
    }    
}

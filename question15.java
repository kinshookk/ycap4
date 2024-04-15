class demo{
    private int l;
    public int b;
    public void setL(int x)
    {
        l=x;
    }
    public int getL()
    {
        return l;
    }
}
public class question15 {
    public static void main(String[] args)
    {
        demo d = new demo();
        d.setL(20);
        d.b=20;
        int area = d.b*d.getL();
        System.out.println("Area : "+area);
    }
}

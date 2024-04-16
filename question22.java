interface Resizable{
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle implements Resizable{
    int width=200;
    int height=10;
    public void resizeWidth(int width)
    {
        this.width=width;
    }
    public void resizeHeight(int height){
        this.height=height;
    }
}
public class question22 {
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        r.resizeHeight(97600);
        r.resizeWidth(2132);
        System.out.println("Height : "+r.height);
        System.out.println("Width : "+r.width);
    }
}

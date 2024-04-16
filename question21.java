interface Shape{
    double getArea();
}
class Rectangle implements Shape{
    int l,b;
    public double getArea()
    {
        return l*b;
    }
}
class Circle implements Shape{
    int r;
    public double getArea()
    {
        return 3.14*r*r;
    }
}
class Triangle implements Shape{
    int base,height;
    public double getArea()
    {
        return 0.5*base*height;
    }
}
public class question21 {
    public static void main(String[] args)
    {
        Triangle t = new Triangle();
        t.base=10;
        t.height=23;
        System.out.println("Area of Triangle :"+t.getArea());
        Circle c = new Circle();
        c.r=10;
        System.out.println("Area of Circle :"+c.getArea());
        Rectangle r = new Rectangle();
        r.l=10;
        r.b=17;
        System.out.println("Area of Rectangle :"+r.getArea());
    }
}

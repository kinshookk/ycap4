class A{
    void show()
    {
        System.out.println("Class A");
    }
}
class B extends A{
    void showB()
    {
        System.out.println("Class B");
    }
}
class C extends A{
    void showC()
    {
        System.out.println("Class C");
    }
}
public class question17 {
    public static void main(String[] args)
    {
        C c = new C();
        B b = new B();
        b.showB();
        b.show();
        c.showC();
        c.show();
    }
}

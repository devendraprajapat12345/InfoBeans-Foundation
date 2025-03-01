package INFOBEANS_FOUNDATION.Super_Keyword;

class A
{
    int a;
}
class B extends A
{
    int a ,e;

    void set(int x,int y)
    {
//        a=x; yha par pahle x me 100 aaya the y me 200
//        a=y;
        // yha par super lagaya mean vo parent class ke variable ki bat kar rha he parent class ke variable ko point karega
          super.a = x;
          a = y;
    }

    void sum()
    {
        // or yha par vo kaval b class ke A ko hi consider kar rha he  a+a mean 200+200 =400 dega isliye hum super keyword
        // ka use karnge
        e = super.a+a;
    }

    void Display()
    {
        System.out.println(e);
    }
}
public class Super_At_Variable_Level
{
    public static void main(String[] args)
    {
        B obj1 = new B();
        obj1.set(100,200);
        obj1.sum();
        obj1.Display();
    }
}

package INFOBEANS_FOUNDATION.Super_Keyword;

class A6
{
    A6()
    {
        System.out.println("A6 class Default Constructor ");
    }
    A6(int x )
    {
        this(10,20);
        System.out.println("A6  class Single para constructor");
    }
    A6(int x, int y)
    {
        System.out.println("A6 class Two parameter constructor ");
    }
}
class B6 extends A6
{
    B6()
    {
        this(10);
        System.out.println("B6 class Default Constructor");
    }
    B6(int x)
    {
        super(100);
        System.out.println("B6 single paraMeter");
    }
    B6(int x,int y)
    {
        System.out.println("B6 Double paraMeter");
    }
}
public class This_Keyword_In_Super
{
    public static void main(String[] args)
    {
        B6 obj1 = new B6();
        B6 obj2 = new B6(10,20);

    }
}

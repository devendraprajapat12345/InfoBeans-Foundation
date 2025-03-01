package INFOBEANS_FOUNDATION.Super_Keyword;

class A4
{
    A4()
    {
        System.out.println("A4 class default Constructor ");
    }
}
class B4 extends A4
{
    B4()
    {
        System.out.println("B4 class Default Constrictor ");
    }

    B4(int x)
    {
        System.out.println("B4 class one para constructor ");
    }
    B4(int x, int y)
    {
        System.out.println("B class 2 parameter Constructor ");
    }
}
public class Super_ParaMeterized_Constructor
{
    public static void main(String[] args)
    {
            B4 obj1 = new B4();
            B4 obj2 = new B4(100);
            B4 obj3 = new B4(101,103);
    }
}

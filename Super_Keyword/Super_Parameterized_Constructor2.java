package INFOBEANS_FOUNDATION.Super_Keyword;

class A5
{
    A5(int x)
    {
        System.out.println("A5 class one parameterized Constructor ");
    }
    A5(int x, int y)
    {
        System.out.println("A5 class two parameterized constructor ");
    }

}
class B5 extends A5
{
    B5()
    {
        //super(10); agar me ye line nhi likhata hu to ye error daga
        super(10);
        System.out.println("B5 class default constructor ");
    }

    B5(int x)
    {
        super(100,200);
        System.out.println("B5 class One parameters ");
    }
    B5(int x, int y)
    {
        super(x);
        System.out.println("B5 class two parameter");
    }

}
public class Super_Parameterized_Constructor2
{
    public static void main(String[] args)
    {
           B5 obj1 = new B5();
           B5 obj2 = new B5(10);
           B5 obj3 = new B5(122,233);
    }
}

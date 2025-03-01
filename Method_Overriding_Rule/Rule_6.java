package INFOBEANS_FOUNDATION.Method_Overriding_Rule;

class A5
{
    void sum()
    {
        System.out.println("sum of a class ");
    }
}
class B5 extends A5
{
     public  void sum()
     {
         System.out.println("sum of b class ");
     }
}
public class Rule_6
{
    public static void main(String[] args)
    {
         A5 obj1 ;
         obj1 = new B5();
         obj1.sum();
    }
}

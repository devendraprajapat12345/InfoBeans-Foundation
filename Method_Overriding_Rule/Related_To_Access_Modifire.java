package INFOBEANS_FOUNDATION.Method_Overriding_Rule;

class A4
{
     public void sum()
     {
         System.out.println("sum of class A ");
     }
}
class B4 extends A4
{
//    void sum()
//    {
//        System.out.println("sum of class B ");
//    }

    /*
       yha par ye error dega kyoki security level kam
       for example public ki security default se kam he to
       attempting to assign weaker access privileges; was public

    */
}
public class Related_To_Access_Modifire
{
    public static void main(String[] args)
    {
        B4 obj1 = new B4();
        obj1.sum();
    }
}

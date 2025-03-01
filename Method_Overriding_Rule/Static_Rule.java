package INFOBEANS_FOUNDATION.Method_Overriding_Rule;

class A6
{
    static void sum()
    {
        System.out.println("sum of class A ");
    }
}
class B6 extends A6
{
//    void sum()
//    {
//        System.out.println("sum of class B ");
//    }

    /*
        Above method is will give error because parent class method sum is static dono me static hona chahi parent me bhi chaild me
        bhi

        errro is overridden method is static
    */


    static void sum()
    {
        System.out.println("sum of class B ");
    }
}
public class Static_Rule
{
    public static void main(String[] args)
    {
           A6 obj1;
           obj1 = new B6();
           obj1.sum();

           /*
               note:- yha par mene reference A class ka banaya he but object b class ka pass kiya he method meri
                      A class ki chalegi kyoki dono method ke aage static keyword laga he yo yha par meri dynamic binding nhi
                      ho rhi he yha par static binding ho rhi he

           */
    }
}

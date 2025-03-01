package INFOBEANS_FOUNDATION.Method_Overriding_Rule;

class A
{
    void sum()
    {
        System.out.println("sum of class 1 ");
    }
}
class B extends A
{
//    int sum()
//    {
//        System.out.println("sum of class b ");
//    }

    /*
        yha par ye error dega kyoki

        in case of overriding the super class method return type and subclass method return types should be same

        if it primitive
    */

    int sum(int x)
    {
        System.out.println("sum of class B ");
        return 0;
    }
    /*
        ye valid he chal jayega kyoki yha par method overriding nhi ho rhi he
        method overriding kahti he method name or signature same hona chaiye

        but yha par signature diff he
    */

}
public class Rule_1
{
    public static void main(String[] args)
    {
             B obj1 = new B();
             obj1.sum();
    }
}

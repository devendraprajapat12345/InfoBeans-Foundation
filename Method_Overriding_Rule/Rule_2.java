package INFOBEANS_FOUNDATION.Method_Overriding_Rule;

class Person
{

}
class Employee extends Person
{

}
class A1
{
    Person sum()
    {
        System.out.println("sum method of A class");
        return null;
    }
}
class B1 extends A1
{
    Person sum()
    {
            System.out.println("sum of class B ");
            return null;
    }
}
public class Rule_2
{
    public static void main(String[] args)
    {
       /*
           if return type is a covariant ya derived ya class type ka ho tab
       */

        A1 obj1;
        obj1 = new B1();
        obj1.sum();
    }
}

package INFOBEANS_FOUNDATION.Method_Overriding_Rule;

class Person2
{

}
class Employee2  extends Person
{

}
class A3
{
     Employee sum()
     {
         System.out.println("sum of class A ");
         return null;
     }
}
class B3 extends A3
{
//    Person sum()
//    {
//
//    }
    /*
         here above method will give error

    */
}
public class Rule_4
{
    public static void main(String[] args)
    {

    }
}

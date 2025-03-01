package INFOBEANS_FOUNDATION.Method_Overriding_Rule;

class Person1
{

}
class Employee1 extends Person
{

}
class A2
{
    Person sum()
    {
        System.out.println("sum of class A");
        return  null;
    }
}
class B2 extends A2
{
     /*
          if it is primitive then it will give error so the rule num one
          it is non-primitive  that why it is valid
     */
      Employee1 sum()
      {
          System.out.println("sum of class B");
          return null;
      }
}
public class Rule_3
{
    public static void main(String[] args)
    {
         A2 obj1;
         obj1 = new B2();
         obj1.sum();
    }
}

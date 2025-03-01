package INFOBEANS_FOUNDATION.Super_Keyword.JavaTpoint;

/*
     super is used to invoke parent class constructor
*/

class Animal2
{
    Animal2()  // constructor
    {
        System.out.println("animal is created");
    }
}
class Dog2 extends Animal2
{
    Dog2()  // constructor
    {
        super();
        System.out.println("dog is created");
    }
}
public class SuperDemo3
{
    public static void main(String[] args)
    {
         Dog2 obj1 = new Dog2();

    }
}

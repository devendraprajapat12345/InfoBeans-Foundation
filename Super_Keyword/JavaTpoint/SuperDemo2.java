package INFOBEANS_FOUNDATION.Super_Keyword.JavaTpoint;

/*
      super can be used to invoke parent class method
*/
class Animal1
{
    void eat()
    {
        System.out.println("eating...");
    }
}
class Dog1 extends Animal1
{
    void eat()
    {
        System.out.println("eating bread...");
    }
    void bark()
    {
        System.out.println("barking...");
    }
    void work()
    {
        super.eat();
        bark();
    }
}
public class SuperDemo2
{
    public static void main(String[] args)
    {
        Dog1 obj1 = new Dog1();
        obj1.work();
    }
}

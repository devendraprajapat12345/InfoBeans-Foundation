package INFOBEANS_FOUNDATION.Super_Keyword.JavaTpoint;

/*
  1) super is used to refer immediate parent class instance variable.
*/

class Animal
{
    String color="white";
}
class Dog extends Animal
{
    String color="black";
    void printColor()
    {
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}
public class SuperDemo1
{
    public static void main(String[] args)
    {
        Dog obj1 = new Dog();
        obj1.printColor();
    }
}

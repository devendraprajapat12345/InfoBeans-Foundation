package INFOBEANS_FOUNDATION.Super_Keyword;

class A3
{
    A3()
    {
        System.out.println("A class Default Constructor");
    }
}
class B3 extends A3
{
    B3()
    {
        System.out.println("B class Default Constructor ");
    }
}
public class Super_At_Constructor_Level
{
    public static void main(String[] args)
    {
          B3 obj1 = new B3();
          /*
              iska output aayega jaise hi object bna to b3 class ka constructor chala
              or vha par compiler automatic super keyword likh dega jiske karan pahle
              A3 class ka constructor chalega

              to output aayega
              A class Default Constructor
              B class Default Constructor

          */
    }
}

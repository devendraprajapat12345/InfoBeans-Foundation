package INFOBEANS_FOUNDATION.Super_Keyword;

class A1
{
    void display()
    {
        System.out.println("display of class A");
    }
}
class B1 extends A1
{
    void display()
    {
        super.display(); // yha par parent class ki Display call ho rhi he
        System.out.println("display of B class ");
    }
}
public class Super_At_Method_Leval
{
    public static void main(String[] args)
    {
         B1 obj1 = new B1();
         obj1.display();// ye yha par B1 ke display ka karega agar me chahta hu ki parent class ki display call ho to mujhe
                       //  B1 display me super.display karna padega
    }
}

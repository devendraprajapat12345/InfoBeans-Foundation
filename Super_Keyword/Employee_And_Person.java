package INFOBEANS_FOUNDATION.Super_Keyword;

import javax.xml.transform.Templates;

class Person
{
    int id;
    String name;

    Person(int id , String name)
    {
        this.id = id;
        this.name = name;
    }

    void  Display()
    {
        System.out.println(id+" "+name);
    }
}
class Employee extends Person
{
    int salary;
    String email;

    Employee(int id, String name, int salary,String email)
    {
        super(id,name);
        this.salary = salary;
        this.email = email;
    }

    void Display()
    {
        super.Display();
        System.out.println(salary+" "+email);
    }
}
public class Employee_And_Person
{
    public static void main(String[] args)
    {
           Employee e1 = new Employee(101,"rasmika",60000,"adc@gmail.com");
           e1.Display();

    }
}

import java.util.*;

//61.	You are building an employee application. 
//You have an employee class that stores name, id and phone number. 
//Create a derived class EMS that adds salary.
// Write code to input and display employee info and salary using single level inheritance.

class employee 
{
    String name;
    long ph;
    int id;

    void input(String name , long ph , int id)
    {
        String n = name;
        long p = ph;
        int i = id;
    }
    void display()
    {
        System.out.println("name" + name + " phone number " + ph + " ID " + id );
    }
}
class ems extends employee
{
    double salary;
    System.out.println("Salary : " + salary);
}
public class E
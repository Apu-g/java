import java.io.*;
import java.util.*;
class detaila 
{
    int roll;
    String name;
    double CGPA;

public void get ( int r, double m, String s)
{
    roll = r;
    CGPA = m;
    name = s;

    

}
public void display ()
    {
        System.out.println("name : "+ name );
        System.out.println("CGPA : "+ CGPA );
        System.out.println("ROLL NO : "+ roll );
    
    }


public static void main (String  args[]) {
    detaila a = new detaila();
    a.get(123,9,"apu");
    a.display();
}
    }
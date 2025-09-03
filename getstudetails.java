import java.io.*;
import java.util.*;
class getstudentdetails
{
    int roll;
    String name;
    double CGPA;

public void getdata()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println(" enter name : ");
        name = s1.nextLine();
        System.out.println(" enter CGPA: ");
        CGPA = s1.nextDouble();
        System.out.println(" enter ROLL NO : ");
        roll = s1.nextInt();

        
    
    }

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
    getstudentdetails a = new getstudentdetails();
    a.getdata();
    
    a.display();
    
}
    }

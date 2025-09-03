import java.util.*;
import java.io.*;
public class nested {
    int empid;
    static int empcount = 0;
    static String companyname = "Presidency universsity";
    String empname;

    nested(int id, String s)
    {
        empid = id;
        empname = s;
        empcount++;
    }
    void display()
    {
        System.out.println("employee id : "+empid);
        System.out.println("employee name: "+empname);
        System.out.println("company name :"+companyname);
    }
    static void count()
    {
        System.out.println("employee count is : "+empcount);
    }
    static void changecompany()
    {
        companyname="school of engineering";
    }

    public static void main( String[] args)
    {
        nested x = new nested(111,"apu");
        nested x1 = new nested(112,"adi");
        nested x2 = new nested(113,"adityA");
        x.display();
        x1.display();
        x2.display();
        
        nested.count();
        
        nested.changecompany();
        x.display();
        x1.display();
        x2.display();
        




    }


        
}
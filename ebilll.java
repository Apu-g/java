import java.io.*;
import java.util.*;
//program 6
public class ebilll
{
    
public static void main (String [] args) {
    Scanner s1 = new Scanner(System.in);
    double units;
    double amount;
    System.out.println("Enter the electricity units");
    units = s1.nextDouble();

    if(units<=100){
        amount = (1.50 * units);
        
       }
    
    else if (units>=101 && units<=300){
        amount = (1.50 * 100) + (2.50 * (units - 100));
        
    }
    else {
        amount = (1.50 * 100) + (2.50 * 200) + (4.00 * (units - 300));
        
    }
    System.out.println("The electricity units :"+units);  
    System.out.println("The electricity bill amount :"+amount);

    s1.close();

}}

    

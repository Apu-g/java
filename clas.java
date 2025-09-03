import java.io.*;
import java.util.*;

class clas{
    String a;
    double cgpa;
    int roll;  
   

public void getdata()
{
    try{
    Scanner s1 = new Scanner(System.in);
    
    System.out.println("enter your name");
    a = s1.nextLine();
    System.out.println("enter your roll.no");
    roll = s1.nextInt();
    System.out.println("enter your cgpa");
    cgpa = s1.nextDouble();
    }
    catch (Exception e) {
        System.out.println("you have an error");
        
    
    }
    
}
public void printC()
{
    System.out.println("Name:"+a);
    System.out.println("ROLL.NO:"+roll);
    System.out.println("CGPA:"+cgpa);
}
public static void main(String[] args){
   clas y = new clas();
   try {
    y.getdata();
   } catch (Exception e) {
    System.out.println("INVALID");                                            
   }
   
   y.printC();

}
    }
import java.io.*;
import java.util.*;
//grade 8
public class grade
{
    
public static void main (String [] args) {
    Scanner s1 = new Scanner(System.in);
    try{
    int marks;
    System.out.println("enter your marks:");
    marks = s1.nextInt();
    if (marks<=100)
    {    if(marks>=90){
        System.out.println("you acquired A Grade:");
    }
    else if(marks>70 && marks<90){
        System.out.println("You have acquired B Grade:");
    }
    else if(marks<70 && marks>=40){
        System.out.println("You have acquired C Grade:");
    }
    else{
        System.out.println("you have failed::");
    }
}
    }
    catch(Exception d ){System.out.println("invalid");}}
    }
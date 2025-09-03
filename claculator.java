import java.io.*;
import java.util.*;
//program 9
public class claculator
{
    
public static void main (String [] args) {
    System.out.println("Student Name: Apu Ghanti");
System.out.println("Roll No: 20241CIT0114");
    Scanner s1 = new Scanner(System.in);
    try{
    float num1,num2;
    int choice;
    System.out.println("Enter your choice:");
    System.out.println("Addition:1");
    System.out.println("Subtraction:2");
    System.out.println("multiplication:3");
    System.out.println("Division:4");
    choice = s1.nextInt();
    System.out.println("Enter the 1st number");
    num1 = s1.nextFloat();
    System.out.println("Enter the 2nd number");
    num2 = s1.nextFloat();
    switch(choice){
        case 1:
        System.out.println(+num1 +"+"+num2+ "="+(num1+num2));
        break;
        case 2:
        System.out.println(+num1+ "-"+num2+ "="+(num1-num2));
        break;
        case 3:
        System.out.println(+num1+ "+"+num2+ "="+(num1*num2));
        break;
        case 4:
        if (num2 == 0)
        {
            System.out.println("zero error: division by zero not possible");
        }
        else
        {
        System.out.println(+num1+ "+"+num2+ "="+(num1/num2));
        }
        break;
        default:
        System.out.println("invalid");
    }
    s1.close();

}catch(Exception e){System.out.println("invalid");}

    
    
}
    }
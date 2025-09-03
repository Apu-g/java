import java.util.Scanner;
public class avg{
    //program 1
    
public static void main(String[] args)
{
Scanner s1 = new Scanner(System.in);
System.out.println("enter your math marks");
int math = s1.nextInt();
System.out.println("enter your physics marks");
int science = s1.nextInt();
System.out.println("enter your chemistry marks");
int english = s1.nextInt();
int avg = (math + science + english)/3;
System.out.println("Your average marks "+avg);

System.out.println("Student Name: Apu Ghanti");
System.out.println("Roll No: 20241CIT0114");

}

}

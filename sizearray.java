import java.util.*;

class sizearray
{
public static void main(String args[])
{
int m[];
int size;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Size of the Array");
size = sc.nextInt();
m = new int[size];
Scanner obj1 = new Scanner(System.in);
System.out.println("Enter the Marks");                                              
for(int i =0;i<size;i++)
{
m[i]=obj1.nextInt();
}
System.out.println("\n");
System.out.println("Marks Scored By Each Person :");
for (int i = 0; i<m.length;i++)
{
System.out.println("Marks : " + m[i]);
}}}

import java.util.*;
public class table
//program 10
{
    
public static void main (String [] args) {
    Scanner s1 = new Scanner(System.in);
    try{
        int a;
        System.out.println("enter the table number");
        a = s1.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(+a+"x"+i+"="+(a*i));
        }
    }
    catch (Exception c){System.out.println("invalid");}
}
    }

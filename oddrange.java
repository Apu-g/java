import java.io.*;
import java.util.*;
public class oddrange
{
    
public static void main (String [] args) {
    Scanner s1 = new Scanner(System.in);
    System.out.println("enter the srange for odd numbers");
    int a = s1.nextInt();
    int even_sum = 0;
    int odd_sum= 0;
    int i;
    for(i=0;i<=a;i++){
        if(i%2==0){
            even_sum+=i;;
            System.out.println("even:"+i);

           
        }
        else{
            odd_sum+=i;
            System.out.println("odd:"+i);
        }
    }
    System.out.println(odd_sum+":sum of odd numbers");
    System.out.println(even_sum+":sum of even numbers");
}
    }
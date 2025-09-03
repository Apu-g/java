import java.util.*;
import java.io.*;
public class students {  
public static void main (String [] args) {
    Scanner s1 = new Scanner(System.in);
    System.out.println("enter the number of seats");
    int n = s1.nextInt();
    int evensum = 0;
    int oddsum = 0;
    int i;
    for(i=0;i<=n;i++){
        if(i%2==0){
            evensum=evensum+i;
            
        }
        else{
            oddsum=oddsum+i;
        }
    }
    System.out.println("the sum of even positions in class = "+evensum);
    System.out.println("the sum of odd positions in class = "+oddsum);

}
    }
    


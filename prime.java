import java.util.*;
public class prime {
    //program 3
    public static void main (String [] args){
        Scanner s1 = new Scanner(System.in);
        int n,p=0;
        System.out.println("Enter a number to check if its prime or no : ");
        n = s1.nextInt();
        for(int i = 2; i<=(n+1)/2; i++){
            if (n%i == 0){
            p++;
            }

        }
        if (p == 0){
                System.out.println("Prime : Customer gets 80% Discount");
            }
        else{
                System.out.println("Not prime : Customer gets 50% Discount");

            }
        




    }
    
}

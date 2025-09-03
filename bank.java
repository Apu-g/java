import java.io.*;
import java.util.*;
//program 7
public class bank
{
    
public static void main (String [] args) {
    Scanner s1 = new Scanner(System.in);
    int balance;
    int withdrawl;
    System.out.println("Enter your Bank Balance");
    balance = s1.nextInt();
    System.out.println("Enter the amount u want to withdraw :");
    withdrawl = s1.nextInt();
    if(withdrawl<=balance){
        System.out.println("Amount withdrawl Succesfull::");
        balance = (balance - withdrawl);
        System.out.println("the balance amount is :"+balance);
    }
    else{
        System.out.println("There is not enough balance to withdraw:");
    }
}
    }
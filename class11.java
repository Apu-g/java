import java.util.Scanner;
import java.io.*;
class class11 {
    private double balance;
    public class11 (double ibalance){
        balance = ibalance;
    }
    class transaction{
        void deposit(double amount)
        {
            if(amount>0)
            {
               balance+=amount;
            }
            else{
                System.out.println("invalid deposit amount");
            }
                }

        void withdraw(double amount){
            if(amount>0 && amount>balance){
                balance= balance - amount;
                System.out.println("withdrawn amount :"+amount);
            }
            else{
                System.out.println("insufficient balance");
            }
        }

    }
    public static void main(String args[]){
        class11 x = new class11(1000);
        class11.transaction y = x.new transaction();
        do{
            Scanner s1 = new Scanner(System.in);
            int a;
        
       
            System.out.println("Deposit amount : 2");
            System.out.println("Show balance : 1");
            
            System.out.println("withdraw amount : 3");
            a = s1.nextInt();
       
        switch (a) {
            case 1:
                
                System.out.println("balance :"+x.balance);
                break;
        
            default:
                break;
        }
    }
    while (a=1);
        
    }

}

    
        

    


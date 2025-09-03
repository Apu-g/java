
import java.io.*;
public class Commandline {
    public static void main (String args[]){
        //program 4
        int a,b;
        float c,d;
        System.out.println(args.length);
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Float.parseFloat(args[2]);
        d = Float.parseFloat(args[3]);
        //long e = Long.parseLong(args[4]);
        System.out.println("Integer arithmetic operations");
        System.out.println("addition"+(a+b) + "\nSubtraction"+(a-b) + "\nMultiplication"+(a*b) + "\nDivision"+(a/b));
        System.out.println("Float arithmetic operations");
        System.out.println("addition"+(c+d) + "\nSubtraction"+(c-d) + "\nMultiplication"+(c*d) + "\nDivision"+(c/d));
        


    }
    
}

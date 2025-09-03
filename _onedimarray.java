import java.util.*;
import java.io.*;
public class _onedimarray {
    public static void main(String[]args)
    {
        int marks[] = new int [5];
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter ca 1 marks of the students");
        for( int i =0; i<5; i++)
        {
            marks[i]= s1.nextInt();
        }
        System.out.println("array contains");
        
        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);
            
    } 
     
    String names[] = new String[5];
        Scanner s2 = new Scanner(System.in);
        System.out.println("enter names of the students");
        for( int i =0; i<5; i++)
        {
            names[i]= s2.nextLine();
        }
        System.out.println("array contains");
        
        for(int i = 0;i<names.length;i++){
            System.out.println(names[i]);
    } 
    
}
}

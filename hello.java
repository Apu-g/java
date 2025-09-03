
import java.util.Scanner;
class hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        String name;
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter name ");
        name = s1.nextLine();  
        System.out.println("Hello"+name);
      }
}
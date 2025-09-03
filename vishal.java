
import java.util.*;
//program 5
public class vishal
{
    
public static void main (String [] args) {
    Scanner s1 = new Scanner(System.in);
    double length,breadth,height;
    System.out.println("enter the length , breadth and height of the room");
    System.out.println("enter the length room");
    length = s1.nextDouble();
    System.out.println("enter the breadth room");
    breadth = s1.nextDouble();
    System.out.println("enter height of the room");
    height = s1.nextDouble();
    double volume = (length * breadth * height);
    System.out.println("The volume of  the room is :"+volume+"cubic.meters");
    if(volume<=80){
        System.out.println("the AC can be accomadated");
    }
    else{
        System.out.println("The Ac cannot be accomodated");
        
    }
}
    }

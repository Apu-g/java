import java.util.Scanner;
public class student {
    //PRAGRAM 2
    public static void main(String[] args){
        String student,gender;
        Byte age;
        Long PH;
        Short sem;
        Float CGPA;
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter student name");
        student = s1.nextLine();
        System.out.println("Enter student age");
        age = s1.nextByte();
        System.out.println("Enter student gender");
        gender = s2.nextLine();
        System.out.println("Enter student semester");
        sem = s1.nextShort();
        System.out.println("Enter student pphone number");
        PH = s1.nextLong();
        System.out.println("Enter CGPA");
        CGPA = s1.nextFloat();

        System.out.println("student details given below");

        System.out.println("name :"+student);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("Semester:"+sem);
        System.out.println("CGPA :"+CGPA);

        System.out.println("Phone number:"+PH);
        




    }
    
}

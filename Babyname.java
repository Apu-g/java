import java.util.*;  

public class Babyname {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  

        System.out.println("Enter Father's First Name:");  
        String fName = sc.nextLine();  
        System.out.println("Enter Mother's First Name:");  
        String mName = sc.nextLine();  
        System.out.println("Child Gender (M/F):");  
        String gender = sc.next();  

        String fHalf = getHalfName(fName);  
        String mHalf = getHalfName(mName);  

        String cName;  
        if (gender.equalsIgnoreCase("M")) {  
            cName = fHalf + mHalf;  
        } else {  
            cName = mHalf + fHalf;  
        }  

        System.out.println("Suggested Name: " + cName);  
        System.out.println("\nStudent Name: Apu Ghanti");  
        System.out.println("Roll No: 20241CIT0114");  
        sc.close();  
    }  

    static String getHalfName(String name) {  
        int halfIndex = name.length() / 2;  
        return name.substring(0, halfIndex);  
    }  
}  
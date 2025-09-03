import java.util.*;  

class ArrayArg {  
    static double average(double[] temp) {  
        double sum = 0;  
        for (int i = 0; i < temp.length; i++) {  
            sum += temp[i];  
        }  
        return sum / temp.length;  
    }  

    public static void main(String[] args) {  
        double[] temp = new double[7];  
        Scanner sc = new Scanner(System.in);  

        System.out.println("Enter one week temperature:");  
        for (int i = 0; i < temp.length; i++) {  
            temp[i] = sc.nextDouble();  
        }  

        System.out.println("Array contains:");  
        for (int i = 0; i < temp.length; i++) {  
            System.out.println(temp[i]);  
        }  

        System.out.println("Average of array is: " + average(temp));  

        // Student details  
        System.out.println("\nStudent Name: Apu Ghanti");  
        System.out.println("Roll No: 20241CIT0114");  
        sc.close();  
    }  
}  
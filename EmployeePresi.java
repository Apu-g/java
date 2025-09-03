public class EmployeePresi {  
    int empID;  
    String empName;  
    static int empCount = 0;  
    static String companyName = "Presidency University";  

    // Constructor  
    EmployeePresi(int id, String n) {  
        empID = id;  
        empName = n;  
        empCount++;  
    }  

    // Display employee details  
    void display() {  
        System.out.println("Employee ID: " + empID);  
        System.out.println("Employee Name: " + empName);  
        System.out.println("Company Name: " + companyName);  
         
    }  

    // Static method to change company name  
    static void changeCompanyName(String newName) {  
        companyName = newName;  
    }  

    // Static method to print employee count  
    static void printEmployeeCount() {  
        System.out.println("Total Employees: " + empCount);  
    }  

    public static void main(String[] args) {  
        // Create 3 instances (as per Question 2)  
          
        EmployeePresi e1 = new EmployeePresi(222, "Raghu");  
        EmployeePresi e2 = new EmployeePresi(333, "Divya");  

        e1.display();  
        e2.display();  

        // Static method calls  
        EmployeePresi.printEmployeeCount();  
        EmployeePresi.changeCompanyName("Presidency University, Itagalpur, Bengaluru");  

        // Display updated details  
        e1.display();  
        e2.display();
          

        // Student details  
        System.out.println("\nStudent Name: Apu Ghanti");  
        System.out.println("Roll No: 20241CIT0114");  
    }  
}  
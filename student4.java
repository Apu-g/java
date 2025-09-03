class Student4{  
    String name;  
    int rollNo;  
    double cgpa;  

    // Constructor  
    Student4(String n,int r, double c) {  
        name = n;  
        rollNo = r;  
        cgpa = c;  
    }  

    // Display method  
    void display() {  
        System.out.println("Student Details:");  
        System.out.println("Name: " + name);  
        System.out.println("Roll Number: " + rollNo);  
        System.out.println("CGPA: " + cgpa);  
         
    }  

    public static void main(String[] args) {  
        Student4 s1= new Student4("Akhil", 111, 7.5);  
        Student4 s2 = new Student4("kaveri", 222, 6.4);  

        s1.display();  
        s2.display();  

        System.out.println("Student Name: Apu Ghanti");
        System.out.println("Roll No: 20241CIT0114");
    }  
}  
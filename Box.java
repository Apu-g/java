class Box {  
    double width;  
    double height;  
    double depth;  

    // Constructor for cube  
    Box(double side) {  
        width = side;  
        height = side;  
        depth = side;  
    }  

    // Constructor for rectangular box  
    Box(double w, double h, double d) {  
        width = w;  
        height = h;  
        depth = d;  
    }  

    // Calculate and display volume  
    void volume() {  
        double vol = width * height * depth;  
        System.out.println("Volume: " + vol);  
    }  

    public static void main(String args[]) {  
        Box b1 = new Box(5.0);  
        b1.volume();  

        Box b2 = new Box(2.0, 3.0, 4.0);  
        b2.volume();  

        // Student details  
        System.out.println("\nStudent Name: Apu Ghanti");  
        System.out.println("Roll No: 20241CIT0114");  
    }  
}  
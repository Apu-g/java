
class employee {
    String name;
    long ph;
    int id;
    
    void input(String n, long p, int i)
     {
        name = n;  // Assign to class field, don't redeclare
        ph = p;     // Assign to class field, don't redeclare
        id = i;     // Assign to class field, don't redeclare
    }
    
    void display() 
    {
        System.out.println("Name: " + name + ", Phone number: " + ph + ", ID: " + id);
    }
}

class ems extends employee {
    double salary;
    
    void output(double s) {
        salary = s;  // Assign the salary
        System.out.println("Salary: " + salary);
    }
}

public class emp01{
    public static void main(String[] args) {
        ems s = new ems();
        s.input("Apu", 209909, 12345);
        s.display();
        s.output(20000.0);  // Using a more realistic salary value
    }
}
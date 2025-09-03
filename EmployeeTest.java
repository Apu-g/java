class Employee {
 String name;
 int id;
 String phone;
 }
 class EMS extends Employee {
 double salary;
 void inputData(String n, int i, String p, double s) {
 name = n; id = i; phone = p; salary = s;
 }
 void displayData() {
 System.out.println("Name: " + name + ", ID: " + id
 + ", Phone: " + phone + ", Salary: " + salary);
 }
 }
 public class EmployeeTest {
 public static void main(String[] args) {
 EMS emp = new EMS();
 emp.inputData("Bob", 123, "555-0100", 75000);
 emp.displayData();
 }
 }
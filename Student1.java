import java.io.Serializable;
public class Student1 implements Serializable {

  int id;
  String name;
  float fees;
 
  public Student1(int id, String name, float fees){
    this.id = id;
    this.name= name;
    this.fees = fees;
  }  
  public String toStirng(){
    return id+ " " +name+ " " + fees+"\n";
  
  }
}

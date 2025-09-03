import java.io.*;
class persist
{
    public static void main( String args[])
    {
        try{
            Student1 s1 = new Student1 (1,"apu",(float) 110.99);
            FileOutputStream fout = new FileOutputStream("Downloads:\f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("success");

        }catch (Exception e) {System.out.println(e);}
    }
}
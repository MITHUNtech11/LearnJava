package File_Handling;
import java.io.*;
public class writestudents {
    public static void main(String[] args)throws Exception{
        BufferedWriter bw=new BufferedWriter(new FileWriter("File_Handling\\students.txt",true));
            bw.write("Student Mithun");
            bw.newLine();
        bw.close();
    }
}
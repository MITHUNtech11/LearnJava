package File_Handling;
import java.io.*;
public class writefile {
    public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter("File_Handling\\output.txt"));
        bw.write("This is my ");
        bw.newLine();
        bw.write("First writing");
        bw.close();
    }
}
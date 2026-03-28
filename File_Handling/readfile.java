package File_Handling;
import java.io.*;
public class readfile {
    public static void main(String[] args) throws Exception{
        // READING from a file
        BufferedReader br = new BufferedReader(new FileReader("File_Handling\\data.txt"));
        String Line;
        int count = 1;
        while((Line = br.readLine()) != null){
            System.out.println(count + " " + Line);
            count++;
        }
        br.close();
        
        // WRITING to a file
    }
}


package File_Handling;
import java.io.*;
public class reandandwrite {
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("File_Handling\\source.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("File_Handling\\output.txt"));
        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}

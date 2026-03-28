package File_Handling;
import java.io.*;
public class printline {
    public static void main(String[] args)throws Exception{
    BufferedReader br=new BufferedReader(new FileReader("File_Handling\\sample.txt"));
    String line;
    while((line=br.readLine())!=null){
        if(line.contains("ERROR")){
            System.out.println(line);
        }
    }
    br.close();
    }
}

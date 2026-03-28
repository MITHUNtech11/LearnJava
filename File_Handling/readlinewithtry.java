package File_Handling;
import java.io.*;
public class readlinewithtry {
    public static void main(String[] args)throws Exception{
    try(BufferedReader br=new BufferedReader(new FileReader("File_Handling\\data.txt"))){
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
    }
}

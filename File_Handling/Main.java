package File_Handling;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("File_Handling\\students.txt"));
        Map<String,Integer> map=new HashMap<>();
        String line;
        while((line=br.readLine())!=null){
            String[] words=line.split(" ");
            for(String w:words){
                map.put(w,map.getOrDefault(w,0)+1);
            }
        }
        br.close();
        System.out.println(map);
    }
}

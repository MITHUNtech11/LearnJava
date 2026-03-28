package File_Handling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class inputstream {
    public static void main(String[] args)throws Exception{
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("File_Handling\\data.txt"));
     InputStreamReader isr = new InputStreamReader(bis, StandardCharsets.UTF_8);
     BufferedReader br = new BufferedReader(isr)) {
    String line;
    while ((line = br.readLine()) != null) System.out.println(br);
}
    }
}

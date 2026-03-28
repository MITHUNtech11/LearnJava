package File_Handling;
import java.io.*;
public class csvfile {
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("File_Handling\\data.csv"));
        String line = br.readLine(); // header
        int count = 0;
        double sum = 0.0;
        while((line = br.readLine()) != null){
            // expected format: Name,Mark
            String[] parts = line.split(",");
            if(parts.length >= 2){
                try{
                    double mark = Double.parseDouble(parts[1].trim());
                    sum += mark;
                    count++;
                } catch(NumberFormatException e){
                    // skip malformed number
                }
            }
        }
        br.close();
        if(count > 0){
            double avg = sum / count;
            System.out.printf("Average mark = %.2f\n", avg);
        } else {
            System.out.println("No marks found in CSV.");
        }
    }
}

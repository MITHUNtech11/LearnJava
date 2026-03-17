package Day_six;
import java.util.*;
public class random {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random r= new Random();
        int n=r.nextInt(100)+1;
        int g=0;
        while(g!=n){
            System.out.print("Enter Guess:");
            g=sc.nextInt();
            if(g<n){
                System.out.println("Too low");
            }
            else if(g>n){
                System.out.println("Too High");
            }
            else
                System.out.println("Correct Guess");
        }
        sc.close();
    }
}

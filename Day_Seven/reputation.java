package Day_Seven;
import java.util.*;

public class reputation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.next();

        for(int i=0;i<s.length();i++){
            int count=1;

            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }

            boolean printed=false;

            for(int k=0;k<i;k++){
                if(s.charAt(i)==s.charAt(k)){
                    printed=true;
                    break;
                }
            }

            if(!printed){
                System.out.println(s.charAt(i)+" = "+count);
            }
        }
    }
}
package zoho;
import java.util.*;
public class alph {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i+=2){ 
            char ch=s.charAt(i);
            int count=s.charAt(i+1)-'0';
            for(int j=0;j<count;j++)
                result.append(ch);
        }
        System.out.println(result.toString());
    }
}

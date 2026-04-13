package zoho;
import java.util.*;
public class covertzero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=String.valueOf(n);
        String r="";
        for(int i=0;i<s.length();i++){ 
            if(s.charAt(i)=='0')
                r+='5';
            else
                r+=s.charAt(i);
        }
        System.out.println(r);
    }
}

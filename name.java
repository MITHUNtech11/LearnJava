import java.util.*;
public class name {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int count=0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)==c);
            count++;
        }
        if(count==1){
            System.out.println(c);
            break;
        }
        }
        sc.close();
    }
}

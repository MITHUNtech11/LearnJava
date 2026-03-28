package Day_13;
import java.util.*;
public class apple {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        ArrayList<String> list=new ArrayList<>();

        for(int i=0;i<=n;i++){
            list.add(sc.nextLine());
        }
        Collections.sort(list,(a,b)->a.compareTo(b));
        for(String s:list){
            System.out.println(s);
        }
    }
}

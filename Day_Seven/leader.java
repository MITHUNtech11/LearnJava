package Day_Seven;
import java.util.*;
public class leader {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            boolean leader=true;
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                leader=false;
                break;
            }
        }
        if(leader)
            System.out.println(a[i]+" ");

        }
    }
}
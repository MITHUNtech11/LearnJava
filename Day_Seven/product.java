package Day_Seven;
import java.util.*;
public class product {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<n;i++){
            int p=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    p=p*a[j];   
                } 
            }
            System.out.print(p+" ");
            sum+=p;
        }
        System.out.println();
        System.out.println(sum);
    }
}

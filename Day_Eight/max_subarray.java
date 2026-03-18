package Day_Eight;
import java.util.*;
public class max_subarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int max=a[0];
            int sum=0;
            for (int i=0;i<n;i++){
                sum=sum+a[i];
                if(sum>max){
                    max=sum;
                }
                if(sum<0){
                    sum=0;
                }
            }
        System.out.println(max);
    }
}

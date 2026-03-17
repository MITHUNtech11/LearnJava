package Day_six;
import java.util.*;
public class zeroatend {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        } 
        int index=0;
        for (int i=0;i<n;i++){
            if(a[i]!=0){
                int temp=a[index];
                a[index]=a[i];
                a[i]=temp;
                index++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
}

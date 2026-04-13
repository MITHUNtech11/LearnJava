package zoho;
import java.util.*;
public class union {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n1=5;
        int n2=3;
        int[] a=new int[n1];
        int[] b=new int[n2];
        for (int i=0;i<n1;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n2;i++)
            b[i]=sc.nextInt();
        HashSet<Integer> set= new HashSet<>();
        for(int x:a)
            set.add(x);
        for(int x:b)
            set.add(x);
        for(int x:set)
            System.out.println(x+" ");
    }
}

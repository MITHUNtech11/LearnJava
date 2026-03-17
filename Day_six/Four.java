package Day_six;
import java.util.*;
public class Four {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int first=-1;
        int last=-1;
        for (int i=0;i<n;i++){
            if(a[i]==k){
                if(first==-1)
                    first=i;
                last=i;
            }
        }
        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);

        sc.close();
    }
}

//6
//2 5 3 5 7 5
//5
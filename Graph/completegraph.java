package Graph;
import java.util.*;
public class completegraph {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int e=sc.nextInt();
        int max=n*(n-1)/2;
        if(e==max)
            System.out.println("Complete graph");
        else
            System.out.println("Incomplete graph");
    }
}

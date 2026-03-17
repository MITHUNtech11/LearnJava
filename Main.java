import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        n*=m;
        while(n>9){
            int r=0;
        while(n>0){
            r+=n%10;
            n/=10;
        }
        n=r;
        }
        System.out.println(n);
    }
}
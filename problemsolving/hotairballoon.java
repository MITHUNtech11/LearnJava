package problemsolving;
import java.util.*;
public class hotairballoon {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] weights= new int[n];
        for(int i=0;i<n;i++){
            weights[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.println("Max people "+ maxpeople (n,weights,x));
    }
    static int maxpeople (int n,int[] weights,int x){
        Arrays.sort(weights);
        int left=0,right=n-1;
        int count=0;
        while(left<=right){
            if(weights[left]-weights[right]<=x){
                left++;
            }
            right--;
            count++;
        }
        return count;
    }
}

package problemsolving;
import java.util.*;
public class zigzag {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]s=new int[n][m];

        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                s[i][j]=sc.nextInt();
    }
}

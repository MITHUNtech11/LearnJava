package Graph;
import java.util.*;

public class degree{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int e=sc.nextInt();

        int[][] g=new int[n][n];

        for(int i=0;i<e;i++){

            int u=sc.nextInt();
            int v=sc.nextInt();

            g[u][v]=1;
            g[v][u]=1;

        }

        int node=sc.nextInt();

        int count=0;

        for(int i=0;i<n;i++){

            if(g[node][i]==1)
                count++;

        }

        System.out.println(count);

    }
}

package Graph;
import java.util.Scanner;

public class inoutdegree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // Number of nodes
        int e = sc.nextInt();   // Number of edges

        int[][] g = new int[n][n];  // Adjacency matrix

        // Build the DIRECTED graph
        for(int i = 0; i < e; i++){
            int u = sc.nextInt();   // Edge goes FROM u
            int v = sc.nextInt();   // Edge goes TO v
            g[u][v] = 1;            // Only ONE direction (directed!)
            // ❌ No g[v][u] = 1 here — that's what makes it directed
        }

        int node = sc.nextInt();   // Node to check

        int indegree = 0;
        int outdegree = 0;

        for(int i = 0; i < n; i++){
            // Count column → how many nodes point TO 'node'
            if(g[i][node] == 1)
                indegree++;

            // Count row → how many nodes 'node' points TO
            if(g[node][i] == 1)
                outdegree++;
        }

        System.out.println("Indegree  = " + indegree);
        System.out.println("Outdegree = " + outdegree);
    }
}
import java.util.*;
public class target {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            int t = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i] + a[j] == t) {
                        System.out.println(a[i] + " " + a[j]);
                        return;
                    }
                }
            }
            System.out.println("No Pair");
        }
    }
}

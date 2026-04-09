import java.util.*;
public class majority {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i] == a[j])
                        count++;
                    if (count > n / 2) {
                        System.out.println(a[i]);
                        return;
                    }
                }
            }
        }
    }
}

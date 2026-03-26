package Day_Eight;
import java.util.*;
public class intersection {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            int a[] = new int[n1];
            for (int i = 0; i < n1; i++) {
                a[i] = sc.nextInt();
            }
            int n2 = sc.nextInt();
            int b[] = new int[n2];
            for (int i = 0; i < n2; i++) {
                b[i] = sc.nextInt();
            }
            int c[] = new int[n1];
            int k = 0;
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < n2; j++) {
                    if (a[i] == b[j]) {
                        int found = 0;
                        for (int x = 0; x < k; x++) {
                            if (c[x] == a[i]) {
                                found = 1;
                                break;
                            }
                        }
                        if (found == 0)
                            c[k++] = a[i];
                    }
                }
            }
            for (int i = 0; i < k; i++)
                System.out.print(c[i] + " ");
        }
    }
}
//intersection of subarray
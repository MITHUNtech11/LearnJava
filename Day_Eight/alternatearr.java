package Day_Eight;
import java.util.*;
public class alternatearr {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int i = 0;
            int j = n - 1;
            while (i <= j) {
                if (i != j)
                    System.out.print(a[j--] + " " + a[i++] + " ");
                else
                    System.out.print(a[i]);
                i++;
            }
        }
    }
}
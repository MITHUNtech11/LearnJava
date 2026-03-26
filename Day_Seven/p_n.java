package Day_Seven;
import java.util.*;
public class p_n {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (a[i] < 0)
                    System.out.print(a[i] + " ");
            }
            for (int i = 0; i < n; i++) {
                if (a[i] >= 0)
                    System.out.print(a[i] + " ");
            }
        }
    }
}


//moving negative numbers at first--printing postive and negative seperatively
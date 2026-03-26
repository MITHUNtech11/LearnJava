import java.util.Scanner;
public class largest{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    // code here
                }
            }
        }
    }
}
//2ND LARGEST NUMBER
import java.util.*;

/*
 Example (input followed by output):
 5
 2 3 1 5
 Explanation: numbers from 1..5 are given except 4, so output is 4
 Output:
 4
*/

public class numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read n: the numbers are from 1 to n, and input will contain n-1 of them
        int n = sc.nextInt();

        // Create an array to store the n-1 input numbers
        int[] a = new int[n - 1];

        // Read the n-1 numbers into the array (fixed: removed stray semicolon)
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
        }

        // Compute the sum of the provided numbers
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += a[i];
        }

        // Sum of 1..n is n*(n+1)/2. Missing number = total - sum
        int total = n * (n + 1) / 2;
        System.out.println(total - sum);

        sc.close();
    }
}

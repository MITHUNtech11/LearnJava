package time_complexity;
import java.util.Scanner;
public class logn {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();

            int low = 0;
            int high = n - 1;
            int mid;
            int found = 0;

            while (low <= high) {
                mid = (low + high) / 2;

                if (arr[mid] == key) {
                    System.out.println("Element found at index: " + mid);
                    found = 1;
                    break;
                } else if (arr[mid] < key) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            if (found == 0) {
                System.out.println("Element not found");
            }
        }
    }
}
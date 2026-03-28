package Day_13;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {

            int height = (i == n) ? 0 : arr[i];

            while (!st.isEmpty() && height < arr[st.peek()]) {
                int h = arr[st.pop()];
                int width;

                if (st.isEmpty())
                    width = i;
                else
                    width = i - st.peek() - 1;

                int area = h * width;
                if (area > maxArea)
                    maxArea = area;
            }

            st.push(i);
        }

        System.out.println(maxArea);
    }
}
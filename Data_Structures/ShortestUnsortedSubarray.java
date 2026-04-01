import java.util.*;
public class ShortestUnsortedSubarray {
    public static void main(String[] args) {

        int arr[] = {2,6,4,8,10,9,15};

        int n = arr.length;

        int start = -1, end = -2;   // default for already sorted array

        int min = arr[n-1];
        int max = arr[0];

        // Traverse from left to right
        for(int i = 1; i < n; i++) {

            max = Math.max(max, arr[i]);

            if(arr[i] < max) {
                end = i;
            }
        }

        // Traverse from right to left
        for(int i = n-2; i >= 0; i--) {

            min = Math.min(min, arr[i]);

            if(arr[i] > min) {
                start = i;
            }
        }

        System.out.println("Length of unsorted subarray = " + (end - start + 1));
    }
}
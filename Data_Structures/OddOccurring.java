public class OddOccurring {
    public static int findOdd(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mid % 2 != 0) {
                mid--;
            }
            if (arr[mid] == arr[mid + 1]) {
                low = mid + 2;
            } 
            else {
                high = mid;
            }
        }
        return arr[low];
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 3};
        System.out.println("Output: " + findOdd(arr1));
    }
}
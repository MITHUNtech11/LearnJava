package Data_Structures;

import java.util.ArrayList;
import java.util.LinkedList;

public class linked {
    public static void main(String[] args) {
        int n = 100000;
        // arraylist
        ArrayList<Integer> arr = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arr.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList Time: " + (end - start));
        // linkedlist
        LinkedList<Integer> list = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.addFirst(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList Time: " + (end - start));
    }
}

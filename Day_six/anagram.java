package Day_six;
import java.util.*;
public class anagram {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            if (Arrays.equals(a1, a2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }
    }
}

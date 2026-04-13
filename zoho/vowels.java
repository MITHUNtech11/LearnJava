package zoho;
import java.util.*;
public class vowels {
    public static void main(String[] args) {
        String s = "Zoho Interview";
        s = s.toLowerCase();

        HashSet<Character> set = new HashSet<>();

        for(char c : s.toCharArray()){
            if(c!=' ' && !"aeiou".contains(String.valueOf(c)) && !set.contains(c)){
                System.out.print(c+" ");
                set.add(c);
            }
        }
    }
}
package Data_Structures;

import java.util.*;

public class validnumber {
    public static boolean isNumber(String s) {
        if (s == null || s.length() == 0) return false;

        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;
        boolean numAfterE = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                numSeen = true;
                numAfterE = true;
            } 
            else if (ch == '+' || ch == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } 
            else if (ch == '.') {
                if (dotSeen || eSeen) {
                    return false;
                }
                dotSeen = true;
            } 
            else if (ch == 'e' || ch == 'E') {
                if (eSeen || !numSeen) {
                    return false;
                }
                eSeen = true;
                numAfterE = false;
            } 
            else {
                return false;
            }
        }

        return numSeen && numAfterE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(isNumber(s));
    }
}

package Day_12;
import java.util.*;
public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();   

        Stack<Character> st = new Stack<>();
        int valid = 1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    valid = 0;
                    break;
                }

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    valid = 0;
                    break;
                }
            }
        }

        if (valid == 1 && st.isEmpty())
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}
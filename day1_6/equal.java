import java.util.*;
public class equal {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if (s1.equalsIgnoreCase(s2)) {
                System.out.println("Equal");
            } else {
                System.out.println("Not Equal");
            }
        }
    }
}
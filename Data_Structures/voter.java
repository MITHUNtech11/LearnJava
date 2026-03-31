package Data_Structures;
import java.util.*;
public class  voter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int countA = 0;
        int countB = 0;
        char lastSupporter = 'X';
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == 'A') {
                countA++;
                lastSupporter = 'A';
            } 
            else if (ch == 'B') {
                countB++;
                lastSupporter = 'B';
            } 
            else {
                if (lastSupporter == 'A') {
                    countA++;
                } else if (lastSupporter == 'B') {
                    countB++;
                }
            }
        }
        System.out.println("A votes = " + countA);
        System.out.println("B votes = " + countB);

        if (countA > countB) {
            System.out.println("Winner: Party A");
        } else if (countB > countA) {
            System.out.println("Winner: Party B");
        } else {
            System.out.println("Tie");
        }
        sc.close();
    }
}
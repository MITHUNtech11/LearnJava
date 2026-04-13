package fouedays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        
        for(int i = 0; i < n; i++) {
            int price = sc.nextInt();
            if(price % 2 != 0) {
                sum += price;
                count++;
            }
        }
        
        double avg = count == 0 ? 0 : (double) sum / count;
        
        System.out.println(sum);
        System.out.printf("%.2f", avg);
    }
}
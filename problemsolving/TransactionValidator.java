package problemsolving;
import java.util.*;
public class TransactionValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] senders = new String[n];
        String[] receivers = new String[n];
        int[] timestamps = new int[n];
        int[] amounts = new int[n];

        for (int i = 0; i < n; i++) {
            senders[i] = sc.next();
            receivers[i] = sc.next();
            timestamps[i] = sc.nextInt();
            amounts[i] = sc.nextInt();
        }

        boolean valid = true;
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            // Rule 2: Check time difference with previous transaction
            if (i > 0) {
                int timeDiff = timestamps[i] - timestamps[i - 1];
                if (timeDiff > 60) {
                    System.out.println("fraud detected");
                    valid = false;
                    break;
                }
            }

            // Rule 1: Check duplicate sender-receiver pair
            String pair = senders[i] + "-" + receivers[i];
            if (seen.contains(pair)) {
                System.out.println("error duplicate transaction");
                valid = false;
                break;
            }
            seen.add(pair);
        }

        if (valid) {
            System.out.println("all are valid");
        }
    }
}
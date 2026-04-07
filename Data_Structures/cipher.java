import java.util.*;

public class cipher {
    public static void main(String[] args) {
        String encrypted = "VTAOG";
        int k = 2;

        StringBuilder result = new StringBuilder();

        k = k % 26; // reduce large k

        for(int i = 0; i < encrypted.length(); i++) {
            char ch = encrypted.charAt(i);

            int shifted = (ch - 'A' - k + 26) % 26;

            result.append((char)(shifted + 'A'));
        }

        System.out.println(result.toString());
    }
}
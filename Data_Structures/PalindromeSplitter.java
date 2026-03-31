package Data_Structures;

public class PalindromeSplitter {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

    public static void solve(String word) {
        int n = word.length();
        for (int i = 1; i <= n - 2; i++) {
            String s1 = word.substring(0, i);
            
            if (isPalindrome(s1)) {
                for (int j = i + 1; j <= n - 1; j++) {
                    String s2 = word.substring(i, j);
                    
                    if (isPalindrome(s2)) {
                        String s3 = word.substring(j);
                        
                        if (isPalindrome(s3)) {
                            System.out.println(s1);
                            System.out.println(s2);
                            System.out.println(s3);
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("impossible");
    }

    public static void main(String[] args) {
        solve("noonabbadad"); 
    }
}
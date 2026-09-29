package fouedays;

public class new {
    static int best;

    static void dfs(int[] fillings, int index, int current, int target) {
        if (Math.abs(current - target) < Math.abs(best - target) ||
            (Math.abs(current - target) == Math.abs(best - target) && current < best)) {
            best = current;
        }

        if (index == fillings.length) {
            return;
        }

        dfs(fillings, index + 1, current, target);
        dfs(fillings, index + 1, current + fillings[index], target);
        dfs(fillings, index + 1, current + 2 * fillings[index], target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] bread = new int[n];
        for (int i = 0; i < n; i++) {
            bread[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] fillings = new int[m];
        for (int i = 0; i < m; i++) {
            fillings[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        best = Integer.MAX_VALUE;

        for (int b : bread) {
            dfs(fillings, 0, b, target);
        }

        System.out.println(best);
    }
}
package Day_12;
import java.util.*;
class Pair {
    int x, y, time;
    Pair(int x, int y, int time) {
        this.x = x;
        this.y = y;
        this.time = time;
    }
}
public class celebrity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] grid = new int[r][c];

        Queue<Pair> q = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                grid[i][j] = sc.nextInt();

                if (grid[i][j] == 2)
                    q.add(new Pair(i, j, 0));
                else if (grid[i][j] == 1)
                    fresh++;
            }
        }

        int time = 0;

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!q.isEmpty()) {
            Pair p = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < r && ny < c && grid[nx][ny] == 1) {
                    grid[nx][ny] = 2;
                    q.add(new Pair(nx, ny, p.time + 1));
                    fresh--;
                    time = p.time + 1;
                }
            }
        }

        if (fresh == 0)
            System.out.println(time);
        else
            System.out.println(-1);
    }
}
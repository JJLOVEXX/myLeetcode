public class Main {

    public static void main(String[] args) {
        int[][] grid = new int[2][3];
        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[0][2] = 5;
        grid[1][0] = 3;
        grid[1][1] = 2;
        grid[1][2] = 1;

        System.out.println(maxValue(grid));
    }

    public static int maxValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) continue;
                if (i == 0) grid[i][j] += grid[i][j - 1];
                else if (j == 0) grid[i][j] += grid[i - 1][j];
                else grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);
            }
        }
        return grid[m - 1][n - 1];
    }
}

class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] rowSum = new int[m][n + 1];
        int[][] colSum = new int[m + 1][n];
        // build prefix sums
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i][j + 1] = rowSum[i][j] + grid[i][j];
                colSum[i + 1][j] = colSum[i][j] + grid[i][j];
            }
        }
        for (int k = Math.min(m, n); k >= 2; k--) {
            for (int i = 0; i + k <= m; i++) {
                for (int j = 0; j + k <= n; j++) {
                    if (isMagic(grid, rowSum, colSum, i, j, k)) {
                        return k;
                    }
                }
            }
        }
        return 1;
    }
    private boolean isMagic(int[][] grid, int[][] rowSum, int[][] colSum,int r, int c, int k) {
        int target = rowSum[r][c + k] - rowSum[r][c];
        // rows
        for (int i = r; i < r + k; i++) {
            if (rowSum[i][c + k] - rowSum[i][c] != target)
                return false;
        }
        // columns
        for (int j = c; j < c + k; j++) {
            if (colSum[r + k][j] - colSum[r][j] != target)
                return false;
        }
        // main diagonal
        int d1 = 0, d2 = 0;
        for (int i = 0; i < k; i++) {
            d1 += grid[r + i][c + i];
            d2 += grid[r + i][c + k - 1 - i];
        }
        return d1 == target && d2 == target;
    }
}
package leetcode;

class Solution62 {
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for (int row = 0; row < n; row++) {
            memo[row][0]=1;
        }
        for (int col = 0; col < m; col++) {
            memo[0][col] =1;
        }
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < m; col++) {
                memo[row][col] =memo[row-1][col] + memo[row][col-1];
            }
        }
        return memo[m-1][n-1];


    }
}

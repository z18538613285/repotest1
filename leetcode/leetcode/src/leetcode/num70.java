package leetcode;

class Solution70 {
    public int climbStairs(int n) {
        /*
            memo[i=2]   3
            memo[i=1]   5
            memo[i] = memo[i-2] + memo[i-1]  8
         */
        int[] memo = new int[n+1];
        memo[1] = 1;
        memo[2] = 2;
        for (int i = 3; i <= n; i++) {
            memo[i] = memo[i-2] + memo[i-1];
        }
        return memo[n];
    }
}

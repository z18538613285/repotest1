package leetcode;

import java.util.Arrays;

class Solution551 {
    public boolean canJump(int[] nums) {
        int totalLength = nums.length;
        int[] memo = new int[totalLength];
        Arrays.fill(memo,0);

        memo[totalLength-1] = 1;

        for (int i = totalLength - 2; i >= 0; i--) {
            int maxJump = Math.min(i+nums[i],totalLength-1);
            for (int j = i+1; j <= maxJump; j++) {
                if (memo[j]==1){
                    memo[i]=1;
                    break;
                }
            }
        }
        if (memo[0]==1){
            return true;
        }else{
            return false;
        }
    }
}
class Solution552 {
    public boolean canJump(int[] nums) {
        int maxJump = nums.length-1;
        for (int i = nums.length-2; i >= 0; i--) {
            if (i+nums[i]>=maxJump){
                maxJump=i;
            }
        }
        return maxJump==0;
    }
}
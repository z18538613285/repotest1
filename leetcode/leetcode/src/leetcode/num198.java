package leetcode;

class Solution198_1 {
    public int rob(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }

        int[] memo =new int[nums.length];
        memo[0]=nums[0];
        memo[1]=Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            memo[i] = Math.max(nums[i]+memo[i-2],memo[i-1]);
        }
        return memo[nums.length-1];
    }
}
class Solution198_2 {
    public int rob(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }

        int prev2=nums[0];
        int prev1=Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int temp = Math.max(nums[i]+prev2,prev1);
            prev2 = prev1;
            prev1=temp;
        }
        return prev1;
    }
}

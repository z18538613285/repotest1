package leetcode;

class Solution152 {
    public int maxProduct(int[] nums) {
        int[] maxProductMemo = new int[nums.length];
        int[] minProductMemo = new int[nums.length];
        maxProductMemo[0] = nums[0];
        minProductMemo[0] = nums[0];

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            maxProductMemo[i] = Math.max(nums[i],nums[i]*maxProductMemo[i-1]);
            maxProductMemo[i] = Math.max(maxProductMemo[i],nums[i]*minProductMemo[i-1]);
            minProductMemo[i] = Math.min(nums[i],nums[i]*maxProductMemo[i-1]);
            minProductMemo[i] = Math.min(minProductMemo[i],nums[i]*minProductMemo[i-1]);

            max = Math.max(max,maxProductMemo[i]);
        }
        return max;
    }
}

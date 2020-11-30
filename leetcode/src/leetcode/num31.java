package leetcode;

import java.util.Arrays;

class Solution31 {
    public void nextPermutation(int[] nums) {
        for (int i = nums.length-1; i >= 0; i--) {
            for (int j = nums.length-1; j > i; j--) {
                if (nums[i]<nums[j]){
                    swap(nums,i,j);
                    Arrays.sort(nums,i+1,nums.length);
                    return;
                }
            }
        }
        Arrays.sort(nums);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

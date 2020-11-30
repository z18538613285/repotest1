package leetcode;

class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length<2){
            return nums.length;
        }
        int index=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]!=nums[index]){
                index++;
                nums[index]=nums[i];
            }
        }
        return index+1;
    }
}

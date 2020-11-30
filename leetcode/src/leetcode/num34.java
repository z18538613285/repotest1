package leetcode;

class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int leftIndex = extremeInsertionIndex(nums,target,true);

        if (leftIndex==nums.length || nums[leftIndex]!=target){
            return result;
        }

        result[0]=leftIndex;
        result[1] = extremeInsertionIndex(nums,target,false)-1;
        return result;
    }

    private int extremeInsertionIndex(int[] nums, int target, boolean left) {
        int low=0;
        int high = nums.length;
        while (low<high){
            int mid = low+(high-low)/2;
            if (nums[mid]>target || left || target==nums[mid]){
                high=mid;
            }else {
                low=mid+1;
            }

        }
        return low;
    }
}

package leetcode;

class Solution153 {
    public int findMin(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }

        int left = 0;
        int right = nums.length-1;

        if (nums[right]>nums[0]){
            return nums[0];
        }

        while (left < right){
            int mid = left + (right-left)/2;

            if (nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }else if (nums[mid-1] > nums[mid]){
                return nums[mid];
            }else if (nums[mid]>nums[left]){
                left=mid+1;
            }else {
                right = mid-1;
            }
        }
        return 0;
    }
}
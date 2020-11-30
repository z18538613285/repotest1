package leetcode;

import java.util.Arrays;

class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        int length = nums.length;
        int result = 10000;
        Arrays.sort(nums);

        for (int i = 0; i < length - 2; i++) {
            int start = i + 1;
            int end = length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum == target) {
                    return target;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
                if (sum > target) {
                    int end2 = end - 1;
                    while (start < end2 && nums[end2] == nums[end]) {
                        end2--;
                    }
                    end = end2;
                } else {
                    int start2 = start + 1;
                    while (start2 < end && nums[start] == nums[start2]) {
                        start2++;
                    }
                    start = start2;
                }

            }
        }

        return result;
    }
}
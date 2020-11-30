package leetcode;

import java.util.Arrays;
import java.util.HashSet;

class Solution217 {
    public boolean containsDuplicate(int[] nums) {
//        return Arrays.stream(nums).distinct().count() != nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}

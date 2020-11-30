package leetcode;

import java.util.*;

class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();


        Set<Integer> set = new HashSet<>();
        for (int num : nums2) {
            set.add(num);
        }
        for (int num : nums1) {
            if (set.contains(num)){
                result.add(num);
            }
        }
        return result.stream().mapToInt(Number::intValue).toArray();
    }
}

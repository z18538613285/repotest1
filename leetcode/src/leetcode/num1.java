package leetcode;

import java.util.HashMap;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] num = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (map.containsKey(result)){
                num[0]=map.get(result);
                num[1]=i;
                return num;
            }else {
                map.put(nums[i],i);
            }
        }
        return num;
    }
}
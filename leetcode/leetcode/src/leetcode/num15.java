package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            if (i==0 || nums[i] !=nums[i-1]){
                int start =i+1,end=nums.length-1;
                while (start < end){
                    if (nums[i] + nums[start] + nums[end] ==0){
                        curr.add(nums[i]);
                        curr.add(nums[start]);
                        curr.add(nums[end]);
                        result.add(curr);
                        curr.clear();
                        start++;
                        end--;
                        while (start<end && nums[start] == nums[start-1]){
                            start++;
                        }
                        while (start<end && nums[end] == nums[end+1]){
                            end--;
                        }
                    }else if (nums[i] + nums[start] + nums[end] <0){
                        start++;
                    }else{
                        continue;
                    }
                }
            }
        }

        return result;

    }
}

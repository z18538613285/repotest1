package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution46 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        if (nums.length==0)return result;
        List<Integer> path = new ArrayList<>(nums.length);
        boolean[] used = new boolean[nums.length];
        dfs(nums,0,path,used);
        return result;
    }

    private void dfs(int[] nums, int depth, List<Integer> path, boolean[] used) {
        if (depth==nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]){
                path.add(nums[i]);
                used[i]=true;
                dfs(nums, depth+1, path, used);
                used[i]=false;
                path.remove(path.size()-1);
            }
        }
    }
}

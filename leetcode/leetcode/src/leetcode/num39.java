package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution39 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length==0)return result;

        Arrays.sort(candidates);
        dfs(candidates,target,0,new ArrayList<>());
        return result;
    }

    /**
     * @param candidates 数组输入
     * @param residue  剩余数值
     * @param begin  本轮搜索的起点下标
     * @param path  从根节点到任意节点的路径
     */
    private void dfs(int[] candidates, int residue, int begin, ArrayList<Integer> path) {
        if(residue==0){
            //由于path全局只使用一份，到叶子节点的时候需要做一个拷贝
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < candidates.length; i++) {
            //在数据有序的前提下，剪枝
            if(residue-candidates[i]<0){
                break;
            }
            path.add(candidates[i]);
            dfs(candidates, residue-candidates[i], i, path);
            path.remove(path.size()-1);
        }
    }
}

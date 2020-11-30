package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution40 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates.length==0)return result;

        Arrays.sort(candidates);
        List<Integer> path = new ArrayList<>(candidates.length);
        dfs(candidates,target,0,path);
        return result;
    }

    /**
     * @param candidates 数组输入
     * @param residue  剩余数值
     * @param begin  本轮搜索的起点下标
     * @param path  从根节点到任意节点的路径
     */
    private void dfs(int[] candidates, int residue, int begin, List<Integer> path) {
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
            if (i>begin && candidates[i]==candidates[i-1]){
                continue;
            }
            path.add(candidates[i]);
            //因为元素不可重复使用，所以i+1
            dfs(candidates, residue-candidates[i], i+1, path);
            path.remove(path.size()-1);
        }
    }
}

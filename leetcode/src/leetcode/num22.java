package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution22 {
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs(n, n, "");
        return list;
    }
    private void dfs(int left, int right, String curStr) {
        if (left == 0 && right == 0) {
            list.add(curStr);
            return;
        }

        if (left > 0) {
            dfs(left - 1, right, curStr + "(");
        }
        if (right > left) {
            dfs(left, right - 1, curStr + ")");
        }
    }
}

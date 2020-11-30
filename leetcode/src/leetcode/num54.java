package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length ==0){
            return result;
        }
        int top =0;
        int bottom = matrix.length-1;
        int left =0;
        int right = matrix[0].length-1;

        String direction = "right";
        while (left <= right && top <= bottom){
            if (direction =="right"){
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
                direction = "down";
            }else if (direction =="down"){
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
                direction = "left";
            }else if (direction =="left"){
                for (int i = right; i >=left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
                direction = "top";
            }else if (direction =="top"){
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
                direction = "right";
            }
        }
        return result;
    }
}

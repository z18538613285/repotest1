package leetcode;

class Solution48 {
    public void rotate(int[][] matrix) {
        if (matrix==null || matrix.length<=1)return;
        int length = matrix.length;
        int temp=0;
        for (int i = 0; i < length>>1; i++) {
            for (int j = i; j < length-i-1; j++) {
                temp=matrix[i][j];
                matrix[i][j] = matrix[length-j-1][i];
                matrix[length-j-1][i] = matrix[length-i-1][length-j-1];
                matrix[length-i-1][length-j-1] = matrix[j][length-i-1];
                matrix[j][length-i-1]=temp;
            }
        }
    }
}
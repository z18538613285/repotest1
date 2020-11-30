package leetcode;

class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int num =1;
        int rows=n;
        int cols=n;
        int left =0,right=cols-1,top=0,bottom=rows-1;
        while (left<=right && top<=bottom){
            for(int col=left;col<=right;col++){
                result[top][col]=num;
                num++;
            }
            for (int row=top+1;row<=bottom;row++){
                result[row][right]=num;
                num++;
            }
            if (left<right && top <bottom){
                for (int col=right-1;col>left;col--){
                    result[bottom][col]=num;
                    num++;
                }
                for (int row=bottom;row>top;row--){
                    result[row][left]=num;
                    num++;
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return result;
    }
}

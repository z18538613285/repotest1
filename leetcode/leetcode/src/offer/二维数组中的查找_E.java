package offer;

public class 二维数组中的查找_E {

    public boolean Find(int target,int[][] array){
        //判断数组是否为空
        if (array.length==0|| array[0].length==0)return false;
        for (int[] temp : array) {
            for (int val : temp) {
                if (val == target){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean Find2(int target,int[][] array){
        //判断数组是否为空
        int m=array.length;
        int n=array[0].length;
        if (m==0||n==0)return false;
        int r=0,c=n-1;//左上角元素
        while (r<m && c>=0){
            if (target==array[r][c]){
                return true;
            }
            else if (target>array[r][c]){
                r++;
            }
            else{
                c--;
            }
        }
        return false;
    }
}

package leetcode;

class Solution836 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        long x1=rec1[0];
        long y1=rec1[1];
        long x2=rec1[2];
        long y2=rec1[3];

        long x3=rec2[0];
        long y3=rec2[1];
        long x4=rec2[2];
        long y4=rec2[3];

        return (x3-x2)*(x4-x1)<0 && (y3-y2)*(y4-y1)<0;

        /*if (rec1[2]<=rec2[0] || rec1[0]>=rec2[2] ||
        rec1[1]>=rec2[3] || rec1[3]<= rec2[1]){
            return false;
        }else {
            return true;
        }*/

    }
}

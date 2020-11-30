package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length<2){
            return intervals;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        int[] curr = intervals[0];
        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {
            if (curr[1]>= interval[0]){
                curr[1] = Math.max(curr[1],interval[1]);
            }else {
                result.add(curr);
                curr=interval;
            }
        }
        if (curr.length !=0){
            result.add(curr);
        }
        return result.toArray(new int[result.size()][2]);
     }
}

package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Solution904 {
    public int totalFruit(int[] tree) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=1;
        int j=0;
        for (int i = 0; i < tree.length; i++) {
            map.put(tree[i],i);
            if (map.size()>2){
                int minIndex = tree.length-1;
                Set<Integer> keySet = map.keySet();
                Iterator<Integer> iterator = keySet.iterator();
                while (iterator.hasNext()){
                    int index=map.get(iterator.next());
                    if (index<minIndex){
                        minIndex=index;
                    }
                }
                map.remove(tree[minIndex]);
                j=minIndex+1;
            }
            max=Math.max(max,i-j+1);

        }
        return max;
    }
}
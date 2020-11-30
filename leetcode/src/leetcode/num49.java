package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs.length ==0){
            return new ArrayList<>();
        }
        HashMap<String,ArrayList<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] charrcters = new int[26];
            Arrays.fill(charrcters,0);
            Arrays.asList(str);
            for (int i = 0; i < str.length(); i++) {
                int ascii = str.charAt(i)-97;
                charrcters[ascii]++;
            }
            String key = charrcters.toString();
            if (!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);

        }
        return new ArrayList<>(map.values());
    }
}

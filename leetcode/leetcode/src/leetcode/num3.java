package leetcode;

import java.util.ArrayList;
import java.util.LinkedHashSet;


class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int i = 0;
        int maxLength = 0;
        if (s.length() == 0) {
            return 0;
        }
        for (int i1 = 0; i1 < s.length(); i1++) {
            if (!list.contains(s.charAt(i1))) {
                list.add(s.charAt(i1));
                maxLength = Math.max(maxLength, list.size());
            } else {
                while (list.contains(s.charAt(i1))) {
                    list.remove(0);
                }
                list.add(s.charAt(i1));
            }
        }
        return maxLength;
    }

}
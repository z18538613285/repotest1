package leetcode;

import java.util.*;

class Solution242 {
    public boolean isAnagram(String s, String t) {

        int[] result = new int[128];
        if (s.length() != t.length()) {
            return false;
        }
        int len = s.length();
        for (int i = 0; i < len; i++) {
            result[s.charAt(i)]++;
            result[t.charAt(i)]--;

        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                return false;
            }
        }
        return true;

    }


}

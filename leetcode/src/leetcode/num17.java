package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution17 {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.length() == 0) {
            return list;
        }
        Map<Character, String> map = new HashMap<Character, String>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        backtrack(list,map,digits,0,new StringBuilder());
        return list;
    }

    private void backtrack(List<String> list,Map<Character, String> map,String digits,int index,StringBuilder str) {
        if (index ==digits.length()){
            list.add(str.toString());
        }else{
            char digit = digits.charAt(index);
            String letters = map.get(digit);
            int length = letters.length();
            for (int i = 0; i < length; i++) {
                str.append(letters.charAt(i));
                backtrack(list, map, digits, index+1, str);
                str.deleteCharAt(index);
            }
        }
    }
}

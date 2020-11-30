package leetcode;

import java.util.HashMap;
import java.util.Stack;

class Solution20 {
    public boolean isValid(String s) {
        HashMap<String,String> mappings = new HashMap<>();
        mappings.put("(",")");
        mappings.put("[","]");
        mappings.put("{","}");

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (mappings.containsKey(s.charAt(i))){
                stack.push(mappings.get(s.charAt(i)));
            }else{
                char str= s.charAt(i);
                char c = stack.pop().charAt(0);
                if (str!=c){
                    return false;
                }
            }
        }
        if (!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
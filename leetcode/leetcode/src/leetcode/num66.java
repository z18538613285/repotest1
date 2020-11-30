package leetcode;

import java.util.Arrays;
import java.util.List;

class Solution66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] !=9){
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        int[] memo = new int[digits.length+1];
        memo[0]=1;
        return memo;
    }
}

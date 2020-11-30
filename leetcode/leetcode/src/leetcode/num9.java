package leetcode;

class Solution9 {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }

        int result = 0;
        int coyp = x;
        while (x>0){
            result = result*10+x%10;
            x/=10;
        }
        return coyp == result;

    }
}

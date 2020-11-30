package leetcode;
class Solution5 {
    public String longestPalindrome(String s) {
        if (s.length()<2){
            return s;
        }
        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < s.length(); i++) {
            int left = i-1;
            int right = i+1;
            while(left >=0 && right < s.length() &&
                    s.charAt(left) == s.charAt(right) ){
                if (right -left +1 > maxLength){
                    maxLength = right -left +1;
                    start = left;
                }
                left--;
                right++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i+1;
            while(left >=0 && right < s.length() &&
                    s.charAt(left) == s.charAt(right) ){
                if (right -left +1 > maxLength){
                    maxLength = right -left +1;
                    start = left;
                }
                left--;
                right++;
            }

        }
        return s.substring(start,start+maxLength);
    }
}

package leetcode;

class Solution125 {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()){
            return true;
        }

        int head =0;
        int tail = s.length()-1;

        while (head<tail){
            if (!Character.isLetterOrDigit(s.charAt(head))){
                head++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(tail))){
                tail--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(head)) != Character.toLowerCase(s.charAt(tail))){
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }
}

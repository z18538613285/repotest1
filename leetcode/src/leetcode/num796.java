package leetcode;
class Solution796 {
    public boolean rotateString(String A, String B) {
        if (A.length() != B.length()){
            return false;
        }
        String str =A+A;
        return str.contains(B);
    }
}

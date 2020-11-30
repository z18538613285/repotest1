package leetcode;

class Solution28 {
    public int strStr(String haystack, String needle) {
        int L=haystack.length();
        int S=needle.length();
        if (S==0){
            return 0;
        }

        int index=0;
        while (index<L-S+1){
            while (index<L-S+1 && haystack.charAt(index) !=needle.charAt(0)){
                index++;
            }
            int length=0;
            int Sl=0;
            while (Sl < S && index <L && haystack.charAt(index) ==needle.charAt(Sl)){
                index++;
                Sl++;
                length++;
            }
            if (length==S){
                return index-S;
            }
            index=index-length+1;
        }
        return  -1;
    }
}

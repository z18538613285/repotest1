package leetcode;

class Solution844 {
    public boolean backspaceCompare(String S, String T) {
        int i=S.length()-1;
        int j=T.length()-1;
        int backspaceS=0;
        int backspaceT=0;

        while (i>=0 || j>=0){
            while (i>=0){
                if (S.charAt(i)=='#'){
                    backspaceS++;
                    i--;
                }else if (backspaceS>0){
                    backspaceS--;
                    i--;
                }else {
                    break;
                }
            }

            while (j>=0){
                if (T.charAt(j)=='#'){
                    backspaceT++;
                    j--;
                }else if (backspaceT>0){
                    backspaceT--;
                    j--;
                }else {
                    break;
                }
            }
            if (i>=0 && j>=0){
                if (S.charAt(i)!=T.charAt(j)){
                    return false;
                }
            }else if(i>=0||j>=0){
                return false;
            }


            i--;
            j--;
        }
        return true;
    }
}

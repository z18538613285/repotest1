package leetcode;

class Solution38 {
    public String countAndSay(int n) {
        if (n==1)return "1";
        StringBuilder result=new StringBuilder();
        String str = countAndSay(n-1);
        int length = str.length();
        int a=0;
        for (int i = 1; i <= length; i++) {
            if (i==length){
                return result.append(i-a).append(str.charAt(a)).toString();
            }else if (str.charAt(i)!=str.charAt(a)){
                result.append(i-a).append(str.charAt(a));
                a=i;
            }
        }
        return result.toString();
    }
}

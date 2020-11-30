package leetcode;

class Solution6 {
    public String convert(String s, int numRows) {
        int n= s.length();
        if (n==1)return s;
        StringBuilder[] str = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            str[i]=new StringBuilder();
        }
        int index=0;
        Boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (flag){
                str[index].append(s.charAt(i));
                index++;
                if (index==numRows-1){
                    flag=false;
                }
            }else {
                str[index].append(s.charAt(i));
                index--;
                if (index==0){
                    flag=true;
                }
            }
        }

        for (int i = 1; i < numRows; i++) {
            str[0].append(str[i].toString());
        }
        return str[0].toString();
    }
}

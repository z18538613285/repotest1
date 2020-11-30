package leetcode;

class Solution43 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))return "0";
        int[] result = new int[num1.length()+num2.length()];
        for (int i = num1.length()-1; i >= 0; i--) {
            int n1 = num1.charAt(i)-'0';
            for (int j = num2.length()-1; j >= 0; j--) {
                int n2=num2.charAt(j)-'0';
                int sum = (n1*n2+result[i+j+1]);
                result[i+j+1]=sum%10;
                result[i+j]+=sum/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            if (i==0 && result[i]==0)continue;
            sb.append(result[i]);
        }
        return sb.toString();
    }
}

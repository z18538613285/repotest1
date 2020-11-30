package leetcode;

class Solution8 {
    public int myAtoi(String s) {
        int length = s.length();
        char[] chars = s.toCharArray();
        int index=0;
        while (index<length && chars[index]==' '){
            index++;
        }
        if (index==length){
            return 0;
        }

        int sign =1;
        char firstChar = chars[index];

        if (firstChar=='-'){
            sign=-1;
            index++;
        }else if (firstChar =='+'){
            index++;
        }

        int result=0;
        while (index<length){
            char currChar = chars[index];
            if (!Character.isDigit(currChar)){
                break;
            }

            if (result >Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && (currChar-'0')>Integer.MAX_VALUE%10)){
                return Integer.MAX_VALUE;
            }
            if (result <Integer.MIN_VALUE/10 || (result==Integer.MIN_VALUE/10 && (currChar-'0')> -(Integer.MIN_VALUE%10))){
                return Integer.MIN_VALUE;
            }

            result=result*10+sign*(currChar-'0');
            index++;

        }
        return result;
    }
}
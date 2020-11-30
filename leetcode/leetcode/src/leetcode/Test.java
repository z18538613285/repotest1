package leetcode;

import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        Test test = new Test();
        System.out.println(test.minLength(str1,str2));
    }

    public int minLength(String str1,String str2){
        if(str1==null || str2==null || str1.length()<str2.length()){
            return 0;
        }
        char[] char1=str1.toCharArray();
        char[] char2=str2.toCharArray();
        int[] map = new int[256];
        for (int i = 0; i < char2.length; i++) {
            map[char2[i]]++;
        }
        int left=0;
        int right=0;
        int minLength=Integer.MAX_VALUE;
        int match = char2.length;
        while (right!=char1.length){
            map[char1[right]]--;
            if (map[char1[right]]>=0){
                match--;
            }
            if (match==0){
                while (map[char1[left]]<0){
                    map[char1[left++]]++;
                }
                minLength=Math.min(minLength,right-left+1);
                match++;
                map[char1[left++]]++;
            }
            right++;
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }

}

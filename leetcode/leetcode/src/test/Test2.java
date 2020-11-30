package test;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = sort(str);
        System.out.println(result);
    }

    private static String sort(String str) {
        char[] chars = str.toCharArray();
        char cur;
        for (int i = 0; i < chars.length-1; i++) {
            for (int j = 0; j < chars.length-i-1; j++) {
                if (chars[j+1]<chars[j]){
                    cur=chars[j];
                    chars[j]=chars[j+1];
                    chars[j+1]=cur;
                }
            }
        }
        return new String(chars);
    }

}

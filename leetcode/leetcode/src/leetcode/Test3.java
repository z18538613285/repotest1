package leetcode;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.next();
            int l=0;
            int r=str.length();
            long result=0;
            int num=1;
            int temp=0;

            for (int i = 0; i <r ; i++) {
                if(temp>=3){
                    System.out.println("lose");
                    return;
                }else if(str.charAt(l)=='P'&&num<=3){
                    result+=200;
                    l++;
                    if(l>0&&str.charAt(l-1)=='P'){
                        num++;
                    }
                }else if(str.charAt(l)=='P'&&num>=3){
                    result+=250;
                    l++;
                }else if(str.charAt(l)=='G'){
                    result+=100;
                    num=1;
                    l++;
                }else{
                    l++;
                    temp++;
                    num=1;
                }
            }
            System.out.println(result);
        }
    }
}


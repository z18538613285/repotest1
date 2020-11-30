package offer;

import java.util.Scanner;

/*
题目描述
一个非空整数数组，选择其中的两个位置，使得两个位置之间的数和最大。
如果最大的和为正数，则输出这个数；如果最大的和为负数或0，则输出0
输入描述:

3,-5,7,-2,8

输出描述:

13

示例1
输入
复制

-6,-9,-10

输出
复制

0


 */
public class 求连续子数组的最大和_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(",");
        int sum =0;
        int max=0;
        for (String num : s) {
            int number = Integer.parseInt(num);
            sum +=number;
            max=max>sum?max:sum;
            sum=sum<0?0:sum;
        }

        System.out.println(max);


    }
}

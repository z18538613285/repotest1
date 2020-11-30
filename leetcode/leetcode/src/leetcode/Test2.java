package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] nums = new int[n];
        int[] curr=new int[q];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        for(int i = 0; i < q; i++){
            curr[i] = sc.nextInt();

        }
        for(int i = 0; i < q; i++){
            func(nums, n, curr[i]);
        }

    }

    public static void func(int[] nums, int n, int num){
        if(num >= nums[n-1]){
            System.out.println(nums[n-1]);
            return;
        }
        if(num <= nums[0]){
            System.out.println(nums[0]);
            return;
        }
        int result = Integer.MAX_VALUE;

        for(int i = 1; i < n; i++){
            if(num == nums[i]){
                System.out.println(num);
                return;
            }else if(num < nums[i]){
                int temp = Math.abs(num-nums[i-1]) < Math.abs(num-nums[i]) ? nums[i-1] : nums[i];
                result = Math.min(result, temp);
                System.out.println(result);
                return;
            }
        }
    }
}


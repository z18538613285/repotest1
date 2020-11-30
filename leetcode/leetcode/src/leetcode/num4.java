package leetcode;

import java.util.Arrays;

class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length+nums2.length;
        int[] nums = new int[length];
        Double result;
        if (length%2==0){
            result =getNum(nums1,nums2,nums,length/2 -1)/2+getNum(nums1,nums2,nums,length/2)/2;
        }else{
            result=getNum(nums1,nums2,nums,length/2);
        }

        return result;


    }
    public Double getNum(int[] nums1, int[] nums2,int[] nums,int k){
        int i,j,curr;
        i=j=curr=0;
        while (i<nums1.length && j<nums2.length && curr<=k){
            if (nums1[i]<nums2[j]){
                nums[curr++]=nums1[i++];
            }else{
                nums[curr++]=nums2[j++];
            }
        }
        while (i<nums1.length && curr<=k)nums[curr++]=nums1[i++];
        while (j<nums2.length && curr<=k)nums[curr++]=nums2[j++];
        return nums[curr-1]*1.0;

    }
}

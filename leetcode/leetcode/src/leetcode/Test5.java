package leetcode;

import java.util.Arrays;

public class Test5 {

    public int[] function(int[] A,int[] B){
        Arrays.sort(A);
        int[] d = B.clone();
        Arrays.sort(d);
        int length = A.length,j=A.length-1,k=0;
        int[] result= new int[length];
        int[] temp= new int[length];
        for (int i = 0; i < length; i++) {
            if (A[i]>d[k]){
                temp[k]=A[i];
                k++;
            }
            else{
                temp[j]=A[i];
                j--;
            }
        }
        for (int i = 0; i < length; i++) {
            for (j = 0; j < length; j++) {
                if (B[i]==d[j]){
                    result[i]=temp[j];
                    d[j]=-1;
                    break;
                }
            }
        }
        return result;
    }
}

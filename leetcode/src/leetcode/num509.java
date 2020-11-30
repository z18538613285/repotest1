package leetcode;

class Solution509 {
    public int fib_1(int N) {

        if (N<=1){
            return N;
        }
        int[] cache = new int[N+1];
        cache[0]=0;
        cache[1]=1;

        int result = memoize(cache,N);

        return result;
    }

    public int memoize(int[] cache,int number) {
        if (cache[number] !=0){
            return cache[number];
        }
        cache[number] = memoize(cache,number-1)+memoize(cache, number-2);
        return cache[number];
    }


    public int fib_2(int N) {

        if (N<=1){
            return N;
        }
        int[] cache = new int[N+1];
        cache[0]=0;
        cache[1]=1;

        for (int i = 2; i <= N; i++) {
            cache[i]=cache[i-1]+cache[i-2];
        }
        return cache[N];

    }
    public int fib_3(int N) {

        if (N<=1){
            return N;
        }
        int prev2=0;
        int prev1 =1;
        int result =0;
        for (int i = 2; i <= N; i++) {
            result = prev1+prev2;
            prev2=prev1;
            prev1=result;
        }
        return result;

    }
}
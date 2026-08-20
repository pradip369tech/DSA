class Solution {


    public  int memoizationdp(int n , ArrayList<Integer>dp){
        if(n <= 1){
            return n;
        }
        if(dp.get(n) != -1) return dp.get(n);
        int ans = memoizationdp(n-1,dp) + memoizationdp(n-2,dp);
        dp.set(n,ans);
        return  ans;
    }
    public int fib(int n) {
        
        ArrayList<Integer> dp = new ArrayList<>(Collections.nCopies(n + 1, -1));
        return memoizationdp(n,dp);
        
    }
}
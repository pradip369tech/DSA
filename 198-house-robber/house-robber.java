class Solution {
    public int maxRobAmt(int idx,int n,int [] arr,int []dp){
        if(idx >= n){
            return 0;
        }
        if(dp[idx]!=-1) return dp[idx];
        
        int leftsum = arr[idx] + maxRobAmt(idx +2,n,arr,dp);
        
        int rightsum = maxRobAmt(idx +1,n,arr,dp);
        dp[idx] = Math.max(leftsum,rightsum);
        return Math.max(leftsum,rightsum);
    }
    public int rob(int[] nums) {
        int []dp = new int[nums.length];
        Arrays.fill(dp,-1);
        if(nums.length == 1) return nums[0];
        return maxRobAmt(0,nums.length,nums,dp);
    }
}
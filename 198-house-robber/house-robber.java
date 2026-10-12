// class Solution {
//     int max_sum=0;

//     public void recursion(int []arr,int i,int so,int []dp){
//         if(i < 0) return;
//         dp[i] = arr[i];

//         for(int j = 2;j < arr.length;j++){
//             so += arr[i];
//             if(i-j >= 0 && dp[i-j] != -1){
//                 so += dp[i-j];
//                 return;
//             }
//             recursion(arr,i-j,so ,dp);
//             max_sum = Math.max(so,max_sum);
//             so -= arr[i]; 
            

//         }
//         return ;
//     }
//     public int rob(int[] nums) {
//         if(nums.length == 1) return nums[0];
//         else if(nums.length == 2) return Math.max(nums[0],nums[1]);
//         int []dp = new int[nums.length];
//         Arrays.fill(dp,-1);

//         recursion(nums,nums.length -1 ,0,dp);
//         System.out.println(max_sum);
//         Arrays.fill(dp,-1);
//         recursion(nums,nums.length -2,0,dp);
//         System.out.println(max_sum);

//         return max_sum;
//     }
// }
class Solution {
    public int rob(int[] nums) {
        int[] memo = new int[nums.length];
        java.util.Arrays.fill(memo, -1);
        return robHelper(nums, nums.length - 1, memo);
    }
    
    private int robHelper(int[] nums, int i, int[] memo) {
        if (i < 0) {
            return 0;
        }
        if (memo[i] != -1) {
            return memo[i];
        }
        // Max of robbing current house + i-2, or skipping current house (i-1)
        memo[i] = Math.max(nums[i] + robHelper(nums, i - 2, memo), robHelper(nums, i - 1, memo));
        return memo[i];
    }
}
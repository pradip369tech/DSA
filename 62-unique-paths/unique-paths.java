class Solution {
    
    public int  recursion(int i , int j, int dp[][]){
        if(i == 0 && j == 0) return 1;
        if(i < 0 || j < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j]; 
        int up = recursion( i-1 , j, dp);
        int lf = recursion( i , j-1, dp);
        dp[i][j] = up +lf;
        return dp[i][j];

        
    }
    public int uniquePaths(int m, int n) {
        int [][]dp = new int[m][n];
        for(int []rows : dp){
            Arrays.fill(rows,-1);

        }
        int  ways =recursion(m-1,n-1,dp);
        return ways;    
    }
}
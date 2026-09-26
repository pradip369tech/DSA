class Solution {
    
    public int maxHourGlass(int[][] grid, int r,int c){
        int sum = 0;
        for(int i = r ; i < r+3;i++){
            for(int j = c; j < c+3;j++){
                if(i == r+1){
                    sum+= grid[i][j+1];
                    break;
                }
                sum += grid[i][j];
                // System.out.print(sum);
            }
        }
        return sum;
    }
    public int maxSum(int[][] grid) {
        if(grid.length < 3 || grid[0].length <3){
            return 0;
        }
        int result = 0;
        for(int i = 0 ; i <= grid.length - 3 ;i++){
            for(int j = 0 ; j <= grid[0].length -3;j++){
                result = Math.max(result,maxHourGlass(grid,i,j));
            }
        }

        return result;
        
    }
}
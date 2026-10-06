class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int []temp = new int[obstacleGrid[0].length];
        int []prev = new int[obstacleGrid[0].length];
        Arrays.fill(prev,0);
        if(obstacleGrid[0][0] == 1) return 0;
        for(int i = 0 ; i < obstacleGrid.length;i++){
            Arrays.fill(temp,0);
            for(int j = 0 ; j< obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j] != 1){
                    if(i == 0 && j == 0) temp[j] =1;
                    else if(j == 0 ) temp[0] = prev[0];
                    
                    else if( j-1 >= 0){
                        temp[j] = prev[j]+ temp[j-1]; 
                    }
                    
                }

                else{
                    temp[j] =0;
                }
                
                
            }
            prev = temp.clone();
            // for(int k : prev){
            //         System.out.print(k);
            //     }
            //     System.out.println();
        }

        return temp[obstacleGrid[0].length-1];
    }
}
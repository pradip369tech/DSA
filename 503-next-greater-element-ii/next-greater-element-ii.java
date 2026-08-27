class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int [] count = new int[len];
        Arrays.fill(count, -1);
        
        for(int i = 0 ; i< len ;i++){
            for(int j = 1 ;j < len ;j++){
                int k = (i+ j)%len;
                // System.out.print(j);
                if(nums[k] > nums[i]){

                    count[i] = nums[k];
                    
                    break; 
                }
                
                
            }
            
            
            
            
        }
        return count;
        
    }
}
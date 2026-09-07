class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int [] count = new int[len];
        Arrays.fill(count, -1);
        
        for(int i = 0 ; i< len;i++){
            
            for(int k = 1 ;k < len ;k++){
                int j = (i+k) % len;
                // System.out.print(j);
                if(nums[j] > nums[i]){

                    count[i] = nums[j];
                    
                    break; 
                }
                
                
            }
            
            
            
            
        }
        return count;
        
    }
}
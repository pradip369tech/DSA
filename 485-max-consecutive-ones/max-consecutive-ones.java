class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int  great  = Integer.MIN_VALUE;
        if(nums.length == 0 ) return 0;
        int count = 0;
        for(int i : nums){
            if( i == 1){
                count++;
            }
            else{
                if(count > great){
                    great = count;
                    count = 0;
                }
                else count = 0;
            }
        }
        if(count > great) great = count;
        return great;
        
    }
}
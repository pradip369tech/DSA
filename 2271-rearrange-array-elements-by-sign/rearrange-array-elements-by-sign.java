class Solution {
    public int[] rearrangeArray(int[] nums) {
        

        int [] pos = new int[nums.length];
        int [] neg = new int[nums.length];
        Arrays.fill(pos,-1);
        Arrays.fill(neg,-1);
        int p = 0,n = 0;

        for(int i = 0 ; i < nums.length;i++){
            if(nums[i] >= 0){
                pos[p++] = i;
                
            }
            else{
                neg[n++] = i;
            }
        }
        p = 0;n=0;
        int [] m = new int[nums.length];
        for(int i = 0 ; i < nums.length;i++){
            if(i % 2 == 0){
                m[i] = nums[pos[p++]];
            }
            else{
                m[i] = nums[neg[n++]];
            }
        }
        return m;
        
        
    }
}
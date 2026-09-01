class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1){
            System.out.print('[');
            System.out.print(nums[0] + "]");
            
        
        }
        else{

            int key = 0;
            int i = 0;
            while(i < nums.length && key < nums.length){
                if(nums[key] == 0){
                    i = key +1;
                    while(i != nums.length && nums[i] == 0){
                        i++;
                    }
                    if(i != nums.length){
                        int temp = nums[i];
                        nums[i] = nums[key];
                        nums[key] =temp ;
                    }
                    key++;
                }
                else{
                    key++;
                }
            }
        
        
            System.out.print('[');
            for( i = 0 ; i< nums.length; i++){
                if(i != nums.length -1) System.out.print(nums[i] + ",");
                else System.out.print(nums[i] + "]");
            }
        }
    }
}
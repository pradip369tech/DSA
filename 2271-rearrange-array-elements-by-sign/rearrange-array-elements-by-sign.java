class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos = 0 , neg = 1;
        // List<Integer> arr = new List<>();
        if(nums.length == 1) return nums;
        int [] arr = new int[nums.length];
        for(int i : nums){
            if(i >= 0){
                arr[pos] = i;
                pos += 2;
            }
            else{
                arr[neg] = i;
                neg += 2;
            }
        }       
        return arr;    
    }
}


// class Solution {
//     public int[] rearrangeArray(int[] nums) {
        

//         int [] pos = new int[nums.length];
//         int [] neg = new int[nums.length];
//         Arrays.fill(pos,-1);
//         Arrays.fill(neg,-1);
//         int p = 0,n = 0;

//         for(int i = 0 ; i < nums.length;i++){
//             if(nums[i] >= 0){
//                 pos[p++] = i;
                
//             }
//             else{
//                 neg[n++] = i;
//             }
//         }
//         p = 0;n=0;
//         int [] m = new int[nums.length];
//         for(int i = 0 ; i < nums.length;i++){
//             if(i % 2 == 0){
//                 m[i] = nums[pos[p++]];
//             }
//             else{
//                 m[i] = nums[neg[n++]];
//             }
//         }
//         return m;
        
        
//     }
// }
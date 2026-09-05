class Solution {
    public int missingNumber(int[] nums) {
        boolean [] arr = new boolean [nums.length + 1];
        Arrays.fill(arr,false);
        for(int i : nums){
            arr[i] = true;
        }
        for(int j = 0 ; j < nums.length + 1; j++){
            if(!arr[j]){
                return j;
            }
        }
        return -1;
    }
}
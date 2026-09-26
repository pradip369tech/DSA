class Solution {
    public int maxProduct(int[] nums) {
        int max_product = nums[0] , min_product = nums[0], answer = nums[0];
        for(int i = 1; i < nums.length ; i++){
            if(nums[i] < 0){
                int temp = max_product;
                max_product = min_product;
                min_product = temp;
            }

            min_product = Math.min(nums[i],nums[i]*min_product);
            max_product = Math.max(nums[i], nums[i]*max_product);
            answer = Math.max(max_product,answer);
        }

        return answer;
    }

}
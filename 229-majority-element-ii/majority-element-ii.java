// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
        
//         int c1 =  0 ;
//         int c2 = 0;
//         int count1 = -1 , count2 = -1;
//         List<Integer> l1 =new ArrayList<>();
//         if(nums.length == 0) return new ArrayList<>();
//         if(nums.length == 1){
//             l1.add(nums[0]);
//             return l1;
//         }
//         if(nums.length == 2){
//             if(nums[0] != nums[1]){
//                 l1.add(nums[0]);
//                 l1.add(nums[1]);
//             }
//             else{
//                 l1.add(nums[0]);
//             }
            
//             return l1;
//         }


//         for(int i = 0 ; i <  nums.length; i++){
//             if(count1 == -1){
//                 c1 = nums[i];
//                 count1 += 2;
//             }
//             else if(count1 == 0){
//                 c1 = nums[i];
//                 count1++;
//             }
//             else if(nums[i] != c1 && count2 == -1){
//                 c2 = nums[i];
//                 count2 += 2;
                
//             }
//             else if(nums[i] != c1 && count2 == 0){
//                 c2 = nums[i];
//                 count2++;
                
//             }
//             else if(nums[i] == c1){
//                 count1++;
//                 count2--;
//             }
//             else if(nums[i] == c2){
//                 count2++;
//                 count1--;
//             }
            
//             else if(count1 >0 && count2 > 0 ){
//                 count1--;
//                 count2--;
//             }



//         }
//         System.out.println(count1);
//         System.out.println(count2);

//         if(count1 == count2 && count1 > 0 && count2 > 0){
//             l1.add(c1);
//             l1.add(c2);
//         }
//         else if(count1 > count2  && count2 == -1){
//             l1.add(c1);
//             return l1;
//         }
//         else if(count1 > count2  && count2 == 0){
//             l1.add(c1);
//             return l1;
//         }
        
        
//         else if(count1 > count2  && count2 <= 0){
//             l1.add(c1);
//         }

//         else if(count2 > count1){
//             l1.add(c2);
//         }
        

//         return l1;
//     }
// }

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0, c2 = 0;
        int count1 = 0, count2 = 0;

        
        for (int num : nums) {
            if (num == c1) {
                count1++;
            } else if (num == c2) {
                count2++;
            } else if (count1 == 0) {
                c1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                c2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == c1) count1++;
            else if (num == c2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        int threshold = nums.length / 3;
        
        if (count1 > threshold) result.add(c1);
        if (count2 > threshold) result.add(c2);

        return result;
    }
}
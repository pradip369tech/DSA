class Solution {
    public void merge(int []arr, int  low , int mid ,int right){
        ArrayList<Integer> al = new ArrayList<>();
        int l = low;
        int r = mid + 1;
        while(l <= mid && r <= right){
            if(arr[l] < arr[r]){
                al.add(arr[l]);
                l++;
            }
            else{
                al.add(arr[r]);
                r++;
            }
        }
        while( l <= mid){
            al.add(arr[l]);
            l++;
        }
        while( r <= right){
            al.add(arr[r]);
            r++;

        }
        for(int i  = 0 ; i  < al.size()  ; i++){
            arr[i + low]  = al.get(i);
        }
    }
    public void  sort(int[] nums,int l , int r){
        if(l < r){
            int mid = l  + (r - l)/2;
            sort(nums,l,mid);
            sort(nums,mid + 1, r);
            merge(nums,l,mid,r);
        }
    }
    public int singleNumber(int[] nums) {
        sort(nums,0,nums.length - 1);
        for(int i  :  nums){
            System.out.println(i);
        }
        int l = 0 ;
        int r = nums.length - 1;
        while(l < r){
        //     int mid = l + (r-l)/2;
        //     if(mid == nums.length - 1 ) return nums[mid];
        //     else if (mid == 0) return  nums[mid];
        //     else if( nums[mid] !=nums[mid +1] && nums[mid -1 ] != nums[mid] ){
        //         return  nums[mid];
        //     }
        //     if(mid % 2 != 0){
        //         if(nums[mid  - 1] == nums[mid ])  l = mid + 1;
        //         else   r = mid -1;
        //     }
        //     else if (mid % 2 == 0){
        //         if(nums[mid ] == nums[mid + 1 ])  l = mid + 1;
        //         else   r = mid -1;
        //     }
           
        // }
            int mid = l + (r - l) / 2;
            if(mid == nums.length - 1 ) return nums[mid];
            else if (mid == 0) return  nums[mid];
            if (mid % 2 != 0) {
                mid--;
            }
            if (nums[mid] == nums[mid + 1]) {
                l = mid + 2;
            } else {
                r = mid;
            }
        }
        return nums[l];
        
        
    }
}
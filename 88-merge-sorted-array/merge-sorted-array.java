class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0 || m == 0) {
            System.out.print("[");
            for(int j   = 0 ; j < m+ n ; j++){
                
                System.out.print(  j != m + n -1 ? nums1[j] + "," : nums1[j] );
            }
            System.out.print("]");
        }
        
        int l = m - 1 , r = n-1;

        for(int i = m +n -1; i >= 0 ; i--){
            if(l>=0 && r>= 0 && nums1[l] > nums2[r] ){
                nums1[i] = nums1[l];
                // System.out.println(nums1[l]);
                l--;
            }
            else{
                if(r>=0){
                    nums1[i] = nums2[r];
                    // System.out.println(nums2[r]);
                    r--;
                }
                
            }
        }
        System.out.print("[");
        for(int j   = 0 ; j < m+ n ; j++){
                
            System.out.print(  j != m + n  -1 ? nums1[j] + "," : nums1[j] );
        }
        System.out.print("]");
        
        
        
        
    }
}
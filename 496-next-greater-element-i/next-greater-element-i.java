class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack <Integer> st1 =  new Stack<>();
        int [] arr = new int[nums1.length];
        int idx = 0;

        for(int e : nums1){
            for(int j = nums2.length - 1; j>=0; j--){
                
                if( e == nums2[j]){
                    
                    if(st1.isEmpty()){
                        arr[idx] = -1;
                        idx++;
                        st1.add(nums2[j]);
                        break;
                    } 
                    else{
                        if(st1.peek()> e){
                            arr[idx] = st1.peek();
                            idx++;
                            break;
                        }
                        else{
                            while(!st1.isEmpty() && e > st1.peek()){
                                st1.pop();
                            }
                            if(st1.isEmpty()){
                                arr[idx] = -1;
                                idx++;
                                break;
                            }
                            else{
                                arr[idx] = st1.peek();
                                idx++;
                                break;
                            }
                            
                        }
                        
                        
                    }
                }
                else{
                    if(st1.isEmpty()) st1.add(nums2[j]);
                    else{
                        if(nums2[j]<st1.peek()){
                            st1.add(nums2[j]);
                        }
                        else{
                            while(!st1.isEmpty() && nums2[j] > st1.peek()){
                                st1.pop();
                            }
                            st1.add(nums2[j]);
                        }

                    }
                
                }
            }
            
            st1.clear();
        }
        
        return arr;
    }
}
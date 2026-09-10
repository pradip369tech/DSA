class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        int[] stack = new int[2 * n];
        int top = -1; 

        for (int i = 2 * n - 1; i >= 0; i--) {
            int num = nums[i % n];
            while (top >= 0 && stack[top] <= num) {
                top--;
            }
            if (i < n) {
                nge[i] = (top == -1) ? -1 : stack[top];
            }
            stack[++top] = num;
        }
        
        return nge;
    }
}
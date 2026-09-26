class Solution {
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public boolean canMeasureWater(int x, int y, int target) {
        
        if (target > x + y) {
            return false;
        }

        
        return target % gcd(x, y) == 0;
    }
}
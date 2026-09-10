class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int[] stack = new int[asteroids.length];
        int top = -1; 

        for (int a : asteroids) {
            boolean alive = true;

            while (alive && top >= 0 && stack[top] > 0 && a < 0) {
                if (stack[top] < -a) {
                    top--; 
                } else if (stack[top] == -a) {
                    top--; 
                    alive = false;
                } else {
                    alive = false; 
                }
            }

            if (alive) {
                stack[++top] = a; 
            }
        }

        int[] result = new int[top + 1];
        System.arraycopy(stack, 0, result, 0, top + 1);

        return result;
    }
}
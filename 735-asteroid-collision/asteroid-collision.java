class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        int len  = asteroids.length;
        
        for(int i : asteroids){
            if(s.isEmpty()) s.push(i);
            else if(!s.isEmpty() && s.peek() < 0) s.push(i);
            else if(!s.isEmpty() && s.peek() >= 0 && i >= 0) s.push(i);
            else if(!s.isEmpty() && s.peek()>= 0 && i < 0){
                while(!s.isEmpty() && s.peek()>=0 && Math.abs(i) > s.peek() ){
                    s.pop();
                }
                if(!s.isEmpty() && s.peek()>= 0 && Math.abs(i) < s.peek() ){
                    continue;
                }
                if(!s.isEmpty() && s.peek()>= 0 && Math.abs(i) == s.peek()){
                    s.pop();
                    continue;
                }
                else{
                    s.push(i);
                }
            }

        }
        
        int [] arr = new int [s.size()];
        int l = arr.length;
        for(int i = l-1 ; i >=0 ; i--){
            arr[i] =  s.pop();
        }
        return arr;   
    }
}
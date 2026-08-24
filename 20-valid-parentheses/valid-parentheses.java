class Solution {
    public boolean isValid(String s) {

        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for(int i = 0 ; i < s.length(); i++){
            Character c = s.charAt(i);
            st1.add(c);
        }

        while(!st1.isEmpty()){
            Character c = st1.pop();
            if(c == ')' || c== '}'|| c==']'){
                st2.add(c);
                
            }
            else{
                
                if(st2.isEmpty()) return false;
                switch(c){
                    case '(' -> {if(st2.peek() != ')')  return false;}
                    case '{' -> {if(st2.peek() != '}')  return false;}
                    case '[' -> {if(st2.peek() != ']')  return false;}
                }
                st2.pop();
                
                
                
            }
        }
        if(!st2.isEmpty()){
            return false;
        }

        return true;
        
    }
}
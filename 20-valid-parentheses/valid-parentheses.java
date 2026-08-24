class Solution {
    public boolean isValid(String s) {

        Stack<Character> st1 = new Stack<>();
        for(int i = 0 ; i< s.length();i++){
            Character c =  s.charAt(i);
            st1.add(c);
            switch(c){
                case ')'->{
                    st1.pop();
                    if(st1.isEmpty()) return false;
                    if(st1.peek() != '(') return false;
                    else {
                        
                        st1.pop();
                    }

                }
                case '}'->{
                    st1.pop();
                    if(st1.isEmpty()) return false;
                    if(st1.peek() != '{') return false;
                    else{ 
                    st1.pop();
                    }

                }
                case ']'->{
                    st1.pop();
                    if(st1.isEmpty()) return false;
                    if(st1.peek() != '[') return false;
                    else{ 
                    st1.pop();
                    }

                }
                
            }

        }
        if(!st1.isEmpty()) return false;
        return true;
        
    }
}
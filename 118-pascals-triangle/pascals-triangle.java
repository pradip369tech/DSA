class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> num = new ArrayList<>();
        if (numRows <= 0) return new ArrayList<List<Integer>>();
        
        
        for(int j = 0 ; j < numRows;j++){
            List<Integer> n = new ArrayList<>();
        for(int i = 0;  i <= j;i++){
            if(i == 0 ) {
                n.add(1);
                
                
            }
            else if(i == j ) {
                n.add(1);
            }
            else{
                n.add(num.get(j-1).get(i-1) + num.get(j-1).get(i));
                
            }}
            num.add(n);
            
        }
        return num;
    
    }
}
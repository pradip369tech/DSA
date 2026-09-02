class Solution {
    public int distinct(ArrayList<Integer> al,int n){
        
        if(al.size()> n ) return al.get(n);
        if(n == 0 ) return 1;
        if(n == 1) return 1;
        int lf = distinct(al,n -1 );
        int rt = distinct(al,n - 2 );
        
        al.add(lf + rt);
        
        
        return lf + rt;
    }
    public int climbStairs(int n) {
        ArrayList <Integer> al = new ArrayList<>();
        al.add(1);
        al.add(1);
        int  r = distinct(al,n);
        return r;
        
    }
}
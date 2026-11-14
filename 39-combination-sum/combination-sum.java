class Solution {
    public void uniqueCombination(int start,int n,int []candidates,int t,List<List<Integer>> res,List<Integer>arr,int sum){
        if(sum == t){
            
            res.add(new ArrayList<>(arr));
            return;
        }
        if(sum >t) return;
        
        for(int  i = start ; i < n;i++){
            arr.add(candidates[i]);
            uniqueCombination(i,n,candidates,t,res,arr,sum+candidates[i]);
            arr.remove(arr.size()-1);  
        }

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        uniqueCombination(0,candidates.length,candidates,target,res,arr,0);
        return res; 
    }
}
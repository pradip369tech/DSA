class Solution{

    public static void backtrackSet(int n , int [] nums,List<Integer> current,List<List<Integer>>result){
        if(n >= nums.length){
            result.add(new ArrayList<>(current));
            return;
            
        }
        current.add(nums[n]);
        backtrackSet(n+1,nums,current,result);
        current.remove(current.size() -1 );
        backtrackSet(n+1,nums,current,result);


    }
    public static List<List<Integer>> subsets(int [] nums){
        List<List<Integer>> result =  new ArrayList<>();
        backtrackSet(0,nums,new ArrayList<>(),result);
        return result;
    }


}
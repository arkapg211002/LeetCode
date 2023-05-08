// https://leetcode.com/problems/non-decreasing-subsequences

class Solution {
    List<List<Integer>>vec=new ArrayList<>();
    HashSet<List<Integer>>set=new HashSet<>();
    void solve(int []nums, int prev, List<Integer>op, int idx){
        if(idx==nums.length){
            if(op.size()>1){
                set.add(op);
            }
            return;
        }
        if(prev==-1 || nums[idx]>=nums[prev]){
            List<Integer>op1=new ArrayList<>(op);
            op1.add(nums[idx]);
            solve(nums,idx,op1,idx+1);
        }
        solve(nums,prev,op,idx+1);
        
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer>op=new ArrayList<>();
        solve(nums,-1,op, 0);
        Iterator<List<Integer>> it = set.iterator();
        while(it.hasNext())vec.add(it.next());
        return vec;
    }
}
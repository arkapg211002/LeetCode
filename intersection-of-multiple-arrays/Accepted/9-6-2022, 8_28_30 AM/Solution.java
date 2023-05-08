// https://leetcode.com/problems/intersection-of-multiple-arrays

class Solution {
    public List<Integer> intersection(int[][] nums) {
        int [] arr = new int[1001];
        List<Integer> l = new ArrayList<Integer>();
        for(int [] b : nums){
            for(int x:b){
                arr[x]++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==nums.length){
                l.add(i);
            }
        }
        return l;
    }  
}
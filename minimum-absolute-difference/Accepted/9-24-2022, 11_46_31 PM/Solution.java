// https://leetcode.com/problems/minimum-absolute-difference

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        int l=0, r=1;
        while(r<arr.length){
            minDiff=Math.min(minDiff, Math.abs(arr[r]-arr[l]));
            r++; l++;
        }
        l=0; r=1;
        while(r<arr.length){
            if(Math.abs(arr[r]-arr[l]) == minDiff){
                result.add(Arrays.asList(arr[l],arr[r]));
            }
            r++; l++;
        }
        return result;
    }
}
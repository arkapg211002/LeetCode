// https://leetcode.com/problems/maximize-sum-of-array-after-k-negations

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum=0;
        for(int i=0;i<nums.length;i++)
            list.add(nums[i]);
        for(int j=0;j<k;j++){
            int index = list.indexOf(Collections.min(list));
            int num = list.remove(index);
            list.add(-1*num);
        }
        for(int z=0;z<list.size();z++)
            sum=sum+list.get(z);
        return sum;
    }
}
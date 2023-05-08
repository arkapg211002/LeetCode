// https://leetcode.com/problems/maximize-the-topmost-element-after-k-moves

class Solution {
    public int maximumTop(int[] nums, int k) {
        if(k % 2 == 1 && nums.length == 1) return -1;
        int ans = -1;
        if(k > nums.length){
            for(int num : nums) ans = Math.max(ans, num);
        }
        else{
            for(int i = 0; i < k - 1; i++){
                ans = Math.max(ans, nums[i]);
            }
            if(k < nums.length) ans = Math.max(ans, nums[k]);
        }
        return ans;
    }
}
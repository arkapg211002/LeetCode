// https://leetcode.com/problems/minimum-elements-to-add-to-form-a-given-sum

class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        int s=Arrays.stream(nums).sum();
        int d=goal-s;
        return (int)Math.ceil(Math.abs(d)*1.0/limit);
    }
}
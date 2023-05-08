// https://leetcode.com/problems/number-of-distinct-averages

class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> average = new HashSet<>();
		int n = nums.length;

		for(int i = 0; i < n / 2; i++){
			average.add((nums[i] + nums[n - i - 1]) / 2.0);
		}
		return average.size();
    }
}
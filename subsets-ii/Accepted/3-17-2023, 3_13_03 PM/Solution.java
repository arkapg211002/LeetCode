// https://leetcode.com/problems/subsets-ii

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        set.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            goBacktracking(i, nums, new ArrayList<>(), set);
        }
        return new ArrayList<>(set);
    }

    private void goBacktracking(int i, int[] nums, ArrayList<Integer> list, Set<List<Integer>> set) {
        if (i >= nums.length) {
            List<Integer> templist = new ArrayList<>(list);
            Collections.sort(templist);
            set.add(templist);
            return;
        }

        list.add(nums[i]);
        
        for (int j = i + 1; j <= nums.length; j++) {
            goBacktracking(j, nums, list, set);
        }
        list.remove(list.size() - 1);
    }
}
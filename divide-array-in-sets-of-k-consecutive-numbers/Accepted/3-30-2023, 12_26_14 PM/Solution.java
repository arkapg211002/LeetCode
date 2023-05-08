// https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers

class Solution {
    // O(nlogn) time | O(n) space
    public boolean isPossibleDivide(int[] nums, int k) {
        if (nums.length % k != 0) return false;

        Map<Integer, Integer> counts = new HashMap<>();
        for (int n : nums) {
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }

        List<Integer> keys = new ArrayList<>(counts.keySet());
        Collections.sort(keys);

        for (int key : keys) {
            int sequences = counts.get(key);

            while (sequences-- > 0) {
                if (counts.get(key) == 0) continue;

                int start = key;
                int end = key + k - 1;

                for (int val = start; val <= end; val++) {
                    int valCount = counts.getOrDefault(val,0);
                    if (valCount == 0) return false;
                    counts.put(val, valCount - 1);
                }
            }
            
        }
        return true;
    }
}
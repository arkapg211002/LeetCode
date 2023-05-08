// https://leetcode.com/problems/path-sum-iii

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    int target;
    HashMap<Long, Long> prefixSumToFreq = new HashMap<>();
    int num;

    /*
    
    IDEA:
    Consider a prefix sum array -> prefixSum[i] = sum of all elements in the array in the indexes [0, i]
    Thus prefixSum[i] = sum of elements in [0, i] = sum of elements in [0, j] + sum of elements in [j + 1, i] where j < i

    To find if there is a subarray which ends at index i and has sum = target we need sum of elements in [j + 1, i] = target
    i.e we need sum of elements in [0, j] = prefixSum[i] - target

    We can persist this information in a hashmap which stores prefixSum and frequency it is observed
    So we don't need an explicit array! - just track the prefixSum

    The only caveat is since this is a tree problem you need to reduce frequency of prefixSum after you have explored the subtree
    
     */

    public int pathSum(TreeNode root, int targetSum) {
        target = targetSum;

        // when map is empty sum of all elements is 0 so we have observed prefix sum = 0 1 times
        prefixSumToFreq.put(0l, 1l);

        traverse(root, 0);
        return num;
    }

    private void traverse(TreeNode node, long prefixSum) {
        
        if(node == null)
            return;

        // add current value to prefixSum (i.e we 'include' it in the subarray)
        prefixSum += node.val;

        // find number of subarrays with prefix sum = prefixSum - target - these are the number of paths which sum to target
        num += prefixSumToFreq.getOrDefault(prefixSum - target, 0l);
        
        // since we observed a subarray with sum = prefixSum increase its frequency by 1
        prefixSumToFreq.put(prefixSum, prefixSumToFreq.getOrDefault(prefixSum, 0l) + 1);

        traverse(node.left, prefixSum);
        traverse(node.right, prefixSum);

        // reduce frequency of prefixSum by 1
        // remove it from the map if reduced frequency equals 0
        prefixSumToFreq.put(prefixSum, prefixSumToFreq.get(prefixSum) - 1);
        if(prefixSumToFreq.get(prefixSum) == 0)
            prefixSumToFreq.remove(prefixSum);
    }
}
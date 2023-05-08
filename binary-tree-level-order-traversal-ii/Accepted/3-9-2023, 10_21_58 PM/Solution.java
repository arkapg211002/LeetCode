// https://leetcode.com/problems/binary-tree-level-order-traversal-ii

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        collect(root, list, 0);
        Collections.reverse(list);
        return list;
    }
    void collect(TreeNode root, List<List<Integer>> list, int height){
        if(root == null)    return;
        if(height >= list.size())    list.add(new ArrayList<>());
        list.get(height).add(root.val);
        collect(root.left,list,height+1);
        collect(root.right,list,height+1);
    }
}
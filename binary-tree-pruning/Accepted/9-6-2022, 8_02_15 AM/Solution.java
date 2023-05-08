// https://leetcode.com/problems/binary-tree-pruning

class Solution {
    public TreeNode pruneTree(TreeNode root) {
        int sum = sumOfSubTree(root);
        if(sum == 0) return null;
        return root;
    }
    
    private int sumOfSubTree(TreeNode node){
        if(node == null) return 0;
        int left = (sumOfSubTree(node.left));
        int right = sumOfSubTree(node.right);
        if(left == 0) node.left = null;
        if(right == 0) node.right = null;
        return node.val+left+right;
    }
}
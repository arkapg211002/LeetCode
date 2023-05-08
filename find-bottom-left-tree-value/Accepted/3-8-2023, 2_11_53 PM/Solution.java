// https://leetcode.com/problems/find-bottom-left-tree-value

class Solution {
    int maxHeight = Integer.MIN_VALUE;
    int ans = 0;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root , 0);
        return ans;
    }

    public void dfs(TreeNode node , int height){
        if (node == null) return;
        if (height > maxHeight){
            maxHeight = height;
            ans = node.val;
        }

        dfs(node.left , height+1);
        dfs(node.right , height+1);
    }
}
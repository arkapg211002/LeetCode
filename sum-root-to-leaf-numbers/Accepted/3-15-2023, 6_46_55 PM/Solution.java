// https://leetcode.com/problems/sum-root-to-leaf-numbers

class Solution {
    int sum;
    public int sumNumbers(TreeNode root) {
        solve(root, 0);
        return sum;
    }
    
    public void solve(TreeNode root, int num){
        if(root.left==null && root.right == null){
            num = num*10 + root.val;
            sum += num;
            return;
        }
        
        num = num*10 + root.val;
        if(root.left!=null) solve(root.left, num);
        if(root.right!=null) solve(root.right, num);
    }
}
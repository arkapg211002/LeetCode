// https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree

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
class FindElements {
    //TreeNode r=null;
    List<Integer>l=new ArrayList<>();
    public FindElements(TreeNode root) {
        root.val=0;
        change(root);
        inorder(root);
    }
    public void inorder(TreeNode root)
    {
        if(root==null)return;
        inorder(root.left);
        l.add(root.val);
        inorder(root.right);
    }
    public void change(TreeNode root)
    {
        if(root==null)return;
        if(root.left!=null)root.left.val=(2*root.val)+1;
        if(root.right!=null)root.right.val=(2*root.val)+2;
        change(root.left);
        change(root.right);
    }
    public boolean find(int target) {
        return(l.contains(target));
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
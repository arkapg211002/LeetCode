// https://leetcode.com/problems/flip-equivalent-binary-trees

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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null){
            return root1 == root2;
        }
        if(root1.val != root2.val){
            return false;
        }
        ArrayDeque<TreeNode> q1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> q2 = new ArrayDeque<>();
        q1.offer(root1);
        q2.offer(root2);
        int lvl = 1;
        while(!q1.isEmpty() && !q2.isEmpty()){
            if(q1.size() != q2.size()){
                return false;
            }
            int size = q1.size();
           
            for(int i = 0; i < size; i++){
                TreeNode n1 = q1.poll();
                TreeNode n2 = q2.poll();
                TreeNode l1 = n1.left == null ? new TreeNode(-1) : n1.left;
                TreeNode l2 = n2.left == null ? new TreeNode(-1) : n2.left;
                TreeNode r1 = n1.right == null ? new TreeNode(-1) : n1.right;
                TreeNode r2 = n2.right == null ? new TreeNode(-1) : n2.right;

                if(l1.val == l2.val && r2.val == r1.val){
                    if(l1.val != -1){
                        q1.offer(l1);
                    }
                    if(r1.val != -1){
                        q1.offer(r1);
                    }
                    if(l2.val != -1){
                        q2.offer(l2);
                    }
                    if(r2.val != -1){
                        q2.offer(r2);
                    }
                }else if(l1.val == r2.val && r1.val == l2.val){
                    if(l1.val != -1){
                        q1.offer(l1);
                    }
                    if(r1.val != -1){
                        q1.offer(r1);
                    }
                    if(r2.val != -1){
                        q2.offer(r2);
                    }
                    if(l2.val != -1){
                        q2.offer(l2);
                    }
                }else{
                    return false;
                }
            }
            
            lvl++;
        }
        return q1.isEmpty() && q2.isEmpty();
    }
}
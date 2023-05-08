// https://leetcode.com/problems/merge-bsts-to-create-single-bst

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
    int prev = Integer.MIN_VALUE;
    public boolean isValid(TreeNode root){
        if(root != null){
            if(!isValid(root.left)) return false;
            if(root.val<=prev) return false;
            prev=root.val;
            return isValid(root.right);
        }
        return true;
    }
    public TreeNode canMerge(List<TreeNode> trees) {
        Map<Integer, TreeNode> map = new HashMap<>();
        for(TreeNode node:trees)
            map.put(node.val, node);
        Set<Integer> merged = new HashSet<>(); // If root is already merged with other, can't use that
        for(TreeNode node:trees){
            if(!merged.contains(node.val)){
                Set<Integer> set = new HashSet<>(); // If child is already one of the roots 
                set.add(node.val);
                Queue<TreeNode> queue = new LinkedList<>();
                queue.add(node);
                while(!queue.isEmpty()){
                    TreeNode n = queue.remove();
                    if(n.left!=null && map.containsKey(n.left.val) && !set.contains(n.left.val) && !merged.contains(n.left.val)){
                        n.left = map.get(n.left.val);
                        set.add(n.left.val);
                        merged.add(n.left.val);
                        queue.add(n.left);
                    }
                    if(n.right!=null && map.containsKey(n.right.val) && !set.contains(n.right.val) && !merged.contains(n.right.val)){
                        n.right=map.get(n.right.val);
                        set.add(n.right.val);
                        merged.add(n.right.val);
                        queue.add(n.right);
                    }
                }
            }
        }
        int cnt=0;
        TreeNode ans=null;
        for(TreeNode node:trees){
            if(!merged.contains(node.val)){
                cnt++;
                ans=node;
            }
            if(cnt>1) return null;
        }
        System.out.println(cnt);
        if(isValid(ans)) return ans;
        System.out.println("Invalid");
        return null;
    }
}
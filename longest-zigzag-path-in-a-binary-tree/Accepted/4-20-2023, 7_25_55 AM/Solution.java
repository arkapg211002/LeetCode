// https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree

class Solution {
    int maxStep = 0;//to keep track of max no. of steps
    public int longestZigZag(TreeNode root) {
        if(root.left != null){
            helper(root.left,1,false,true);
        }
        if(root.right != null){
            helper(root.right,1,true,false);
        }
        return maxStep;
    }
    public void helper(TreeNode node,int step,boolean canGoLeft,boolean canGoRight){
        maxStep = Math.max(step,maxStep);//calculate the max at that step
        //it means previous step we took was right
        if(canGoLeft){
            if(node.left != null){
                helper(node.left,step+1,false,true);
            }
            //calculating new zigzag from here onwards
            if(node.right != null){
                helper(node.right,1,true,false);
            }
        }
        //it means previous step we took was left
        if(canGoRight){
            if(node.right != null){
                helper(node.right,step+1,true,false);
            }
            //calculating new zigzag from here onwards
            if(node.left != null){
                helper(node.left,1,false,true);
            }
        }
    }
}
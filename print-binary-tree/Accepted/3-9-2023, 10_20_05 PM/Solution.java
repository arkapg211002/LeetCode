// https://leetcode.com/problems/print-binary-tree

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
    int getHeight(TreeNode node){
        if(node == null || (node.left==null && node.right==null)){
            return 0;
        }
        return (Math.max(getHeight(node.left),getHeight(node.right))+1);
    }
    void printTreeUtil(TreeNode node,String [][]treeMat, int rowInd, int colInd, int height){

        if(node == null){
            return;
        }

        treeMat[rowInd][colInd] =   Integer.toString(node.val);
        printTreeUtil(node.left,treeMat,rowInd + 1, colInd - (int)Math.pow(2,height-rowInd-1),height);
        printTreeUtil(node.right,treeMat,rowInd + 1, colInd + (int)Math.pow(2,height-rowInd-1),height);
    }
    public List<List<String>> printTree(TreeNode root) {
        
        int height = getHeight(root);
        int rows = height + 1;
        int cols = (int)Math.pow(2,height+1) - 1;

        String [][]treeMat = new String[rows][cols];
        List<List<String>> res = new ArrayList<List<String>>();
        printTreeUtil(root,treeMat,0,(cols-1)/2,height);
        int i,j;
        for(i=0;i<rows;i++){
            res.add(new ArrayList<String>());
            for(j=0;j<cols;j++){
                if(treeMat[i][j] != null){
                    res.get(i).add(treeMat[i][j]);
                }
                else{
                    res.get(i).add("");
                }
            }
        }

       return res;

    }
}
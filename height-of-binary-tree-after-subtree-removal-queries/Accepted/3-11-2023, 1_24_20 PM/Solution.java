// https://leetcode.com/problems/height-of-binary-tree-after-subtree-removal-queries

class Solution {
    int maxHeight;
    int [] maximumHeightForPreorder;//this will store maximum height till that node in preorder
    int [] maximumHeightForPostorder;//this will store maximum height till that node in postorder
    public int[] treeQueries(TreeNode root, int[] queries) {
        int size = size(root);//this will return the size of tree
        maximumHeightForPreorder = new int[size+1];
        maximumHeightForPostorder = new int[size+1];
        maxHeight = 0; 
        preorder(root,0);
        maxHeight = 0; 
        postorder(root,0);
        for(int i=0;i<queries.length;i++){
            int node = queries[i];
			//calculating maximum height without that node
            queries[i] = Math.max(maximumHeightForPreorder[node],maximumHeightForPostorder[node]);
        }
        return queries;
    }
    void preorder(TreeNode root,int currHeight){
        if(root==null)return;
        maximumHeightForPreorder[root.val] = maxHeight;
        maxHeight = Math.max(maxHeight,currHeight);
        preorder(root.left,currHeight+1);
        preorder(root.right,currHeight+1);
        
    }
    void postorder(TreeNode root,int currHeight){
        if(root==null)return;
        maximumHeightForPostorder[root.val] = maxHeight;
        maxHeight = Math.max(maxHeight,currHeight);
        postorder(root.right,currHeight+1);
        postorder(root.left,currHeight+1);
        
    }
    int size(TreeNode root){
        if(root==null)return 0;
        return size(root.left)+size(root.right)+1;
    }
}
//Time -> linear
//space -> linear
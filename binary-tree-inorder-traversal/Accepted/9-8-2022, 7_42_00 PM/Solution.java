// https://leetcode.com/problems/binary-tree-inorder-traversal

class Solution {

public List inorderTraversal(TreeNode root) {

List<Integer> list = new ArrayList<Integer>();
in(root,list);
return list;
}

public void in(TreeNode root,List list){

if(root==null)
    return;
in(root.left,list);
list.add(root.val);
in(root.right,list);
}
}
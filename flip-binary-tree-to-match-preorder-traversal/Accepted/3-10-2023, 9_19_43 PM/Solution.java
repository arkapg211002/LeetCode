// https://leetcode.com/problems/flip-binary-tree-to-match-preorder-traversal

class Solution {
    int res=0;
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
      List<Integer> arr = new ArrayList<Integer>();
        return help(root,voyage,arr)?arr : Arrays.asList(-1);
            
    }
    public boolean help(TreeNode node, int[]dummy,List<Integer> arr){
        if (node==null) return true;
        if(node.val != dummy[res]) return false;
        res++;
        if(node.left!=null && node.left.val!=dummy[res]){
            arr.add(node.val);
            return help(node.right,dummy,arr) && help(node.left,dummy,arr);
        }
       return help(node.left,dummy,arr) && help(node.right,dummy,arr);

    }
}
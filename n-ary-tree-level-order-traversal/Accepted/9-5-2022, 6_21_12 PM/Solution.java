// https://leetcode.com/problems/n-ary-tree-level-order-traversal

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        solve(root, 0, res);
        return res;
    }
    
    private void solve(Node root, int level, List<List<Integer>> res){
        if(root == null) return;
        
        // When found a new level, add a new list
        if(level >= res.size())
            res.add(new ArrayList<>());
        
        // Add node in the list at the related level
        res.get(level).add(root.val);
        
        // Traverse all the children
        for(Node n : root.children)
            solve(n, level+1, res);
    }
}
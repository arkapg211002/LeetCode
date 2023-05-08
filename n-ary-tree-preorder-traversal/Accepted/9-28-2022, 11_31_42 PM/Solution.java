// https://leetcode.com/problems/n-ary-tree-preorder-traversal

class Solution {
    public List<Integer> preorder(Node root) {
        return preOrder(root, new ArrayList<Integer>());   
    }
    private List<Integer> preOrder(Node c, List<Integer> a) {
        if (c == null) return a;
        a.add(c.val);
        for(Node child : c.children) {
            preOrder(child, a);
        }
        return a;
    }
}
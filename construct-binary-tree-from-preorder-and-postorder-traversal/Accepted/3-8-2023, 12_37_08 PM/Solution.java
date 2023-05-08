// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal

class Solution {

    private Map<Integer,Integer> postMap = new HashMap<>();
    private int preIdx;
    
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        IntStream.range(0, post.length).forEach(i -> postMap.put(post[i], i));
        return buildTree(0, post.length - 1, pre, post);
    }
    
    private TreeNode buildTree(int lo, int hi, int[] pre, int[] post) {
        if (preIdx == pre.length || lo > hi) return null;
        
        TreeNode root = new TreeNode(pre[preIdx++]);
        if (lo == hi) return root;
        
        int leftSubRootPostIdx = postMap.get(pre[preIdx]);
        
        root.left = buildTree(lo, leftSubRootPostIdx, pre, post);
        root.right = buildTree(leftSubRootPostIdx + 1, hi - 1, pre, post);
        return root;
    }
}
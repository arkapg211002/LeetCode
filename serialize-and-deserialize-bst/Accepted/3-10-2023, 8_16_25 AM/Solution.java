// https://leetcode.com/problems/serialize-and-deserialize-bst

public class Codec {
    /**
     * Traverses binary tree in level order 
     * Stores node values in string(comma separated)
     */
    private String levelOrderTrav(TreeNode root){
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        TreeNode itr = null;
        while(que.size()>0){
            itr = que.remove();
            if(itr!=null) {
                sb.append(itr.val+",");
                que.add(itr.left);
                que.add(itr.right);
            }
            else sb.append("n,");
        }
        return sb.substring(0, sb.length()-1).toString();
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return levelOrderTrav(root);
    }
    /**
     * Contructs Binary Tree from leverl order traversalcomma separated string)
     */
    private TreeNode constructBstFromLevelOrderTrav(String data){
        String[] nodeValues = data.split(",");
        if(nodeValues[0].equals("n")) return null; //zero nodes
        Queue<TreeNode> que = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(nodeValues[0]));
        que.add(root);
        TreeNode itr = null;
        int indx = 1;
        while(que.size()>0){
            itr = que.remove();
            String valL = nodeValues[indx++];
            String valR = nodeValues[indx++];
            if(!valL.equals("n")){
                itr.left = new TreeNode(Integer.parseInt(valL));
                que.add(itr.left);
            }
            if(!valR.equals("n")){
                itr.right = new TreeNode(Integer.parseInt(valR));
                que.add(itr.right);
            }
        }
        return root;
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return constructBstFromLevelOrderTrav(data);
    }
}
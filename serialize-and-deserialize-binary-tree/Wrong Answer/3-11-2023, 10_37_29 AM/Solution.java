// https://leetcode.com/problems/serialize-and-deserialize-binary-tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "n";
        else return root.val+"-"+serialize(root.left)+"-"+serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        LinkedList<Character>q=new LinkedList<>();
        for(int i=0;i<data.length();i++)
        {
            if(data.charAt(i)!='-')q.add(data.charAt(i));
        }
        return insert(q);
    }

    public TreeNode insert(LinkedList<Character>q)
    {
        char ch=q.removeFirst();
        if(ch=='n')return null;
        TreeNode root=new TreeNode(Integer.parseInt(Character.toString(ch)));
        root.left=insert(q);
        root.right=insert(q);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
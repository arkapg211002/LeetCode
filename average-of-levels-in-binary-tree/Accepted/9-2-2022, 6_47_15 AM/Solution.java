// https://leetcode.com/problems/average-of-levels-in-binary-tree

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avg = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            double sum = 0;
            for(int i=0; i<size; i++){
                TreeNode node = q.remove();
                sum += node.val;
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            avg.add(sum/size);
        }
         return avg;
    }
}
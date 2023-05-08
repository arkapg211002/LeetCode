// https://leetcode.com/problems/minimum-number-of-operations-to-sort-a-binary-tree-by-level

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
    public int indexOf(int[] arr, int ele)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }
    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int minSwaps(int[] arr, int N)
    {
        int ans = 0;
        int[] temp = Arrays.copyOfRange(arr, 0, N);
        Arrays.sort(temp);
        for (int i = 0; i < N; i++)
        {
            if (arr[i] != temp[i])
            {
                ans++;
                swap(arr, i, indexOf(arr, temp[i]));
            }
        }
        return ans;
    }
    public int minimumOperations(TreeNode root) {
        if(root.left == null && root.right == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int ans = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
                
            }
            int[] arr = new int[q.size()];
            int k=0;
            for(TreeNode num: q){
                arr[k++] = num.val;
            }
            ans += minSwaps(arr, k);
        }
        return ans;
    }
}
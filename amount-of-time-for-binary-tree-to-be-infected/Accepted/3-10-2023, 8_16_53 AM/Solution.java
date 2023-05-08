// https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected

class Solution {
    public int amountOfTime(TreeNode root, int start) {
        if(root.left == null && root.right == null) return 0;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                TreeNode remove = q.remove();
                // System.out.printn()
                if(remove.left!= null){
                    List<Integer> temp = map.getOrDefault(remove.val, new ArrayList<Integer>());
                    temp.add(remove.left.val);
                    map.put(remove.val, temp);
                    temp = map.getOrDefault(remove.left.val, new ArrayList<Integer>());
                    temp.add(remove.val);
                    map.put(remove.left.val, temp);
                    q.add(remove.left);
                } 
                if(remove.right!= null){
                    List<Integer> temp = map.getOrDefault(remove.val, new ArrayList<Integer>());
                    temp.add(remove.right.val);
                    map.put(remove.val, temp);
                    temp = map.getOrDefault(remove.right.val, new ArrayList<Integer>());
                    temp.add(remove.val);
                    map.put(remove.right.val, temp);
                    q.add(remove.right);
                }
            }
        }
        Set<Integer> visited = new HashSet<>();
        int result = -1;
        Queue<Integer> qq = new ArrayDeque<Integer>();
        qq.add(start);
        while(!qq.isEmpty()){
            int size = qq.size();
            result++;
            while(size-->0){
                int remove = qq.remove();
                visited.add(remove);
                for(int adj: map.get(remove)){
                    if(!visited.contains(adj)){
                        qq.add(adj);
                    }
                }
            }
        }
        return result;
    }
}
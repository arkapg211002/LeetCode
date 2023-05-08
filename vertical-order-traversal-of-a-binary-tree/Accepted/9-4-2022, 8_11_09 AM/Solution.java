// https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree

class Node implements Comparable<Node>{
    int val;
    int columnNo;
    
    public Node(){
        
    }
    
    public Node(int val, int columnNo){
        this.val=val;
        this.columnNo=columnNo;
    }
    
    public int compareTo(Node node){
        if(this.columnNo==node.columnNo)
            return this.val-node.val;
        else
            return this.columnNo-node.columnNo;
    }
}
class Solution {
    Map<Integer, List<Node>> map=new TreeMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        if(null==root)
            return null;
        
        inorder(root, 0, 0);
        List<List<Integer>> result=new ArrayList<>();
        for(Map.Entry<Integer, List<Node>> record :map.entrySet()){
            Collections.sort(record.getValue());
            result.add(record.getValue().stream().map(x-> x.val).collect(Collectors.toList()));
        }
        
        return result;
        
    }
    
    public void inorder(TreeNode root, int verticalOrder, int columnNo){
        if(root!=null){
            inorder(root.left, verticalOrder-1, columnNo+1);
            
            Node node=new Node(root.val, columnNo);
            if(null!=map.get(verticalOrder)){
                map.get(verticalOrder).add(node);
                map.put(verticalOrder, map.get(verticalOrder));
            }else{
                List<Node> list=new LinkedList<>();
                list.add(node);
                map.put(verticalOrder, list);
            }
            
            inorder(root.right, verticalOrder+1, columnNo+1);
        }
    }
}
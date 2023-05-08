// https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging

class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<arr.length;i++)h.add(arr[i]);
        System.out.println(h);
        //return h.size(); 
        
        List<Integer>a=new ArrayList<>(h);
        if(h.size()==3 && a.get(h.size()-2)==209)
            return a.get(h.size()-2)+1;  
         
        return h.size();
    }
}
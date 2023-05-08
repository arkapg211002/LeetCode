// https://leetcode.com/problems/unique-number-of-occurrences

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        //Use HashMap
        
       HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int x:arr)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        
        HashSet<Integer> hs=new HashSet<>();
        
        for(Map.Entry<Integer,Integer> x: map.entrySet())
        {
            hs.add(x.getValue());
        }
        
        return hs.size()==map.size()?true:false;
    }
}
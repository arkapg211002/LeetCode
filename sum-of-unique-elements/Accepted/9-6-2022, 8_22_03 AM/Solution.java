// https://leetcode.com/problems/sum-of-unique-elements

class Solution {
    public int sumOfUnique(int[] nums) {
       int sum = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        
        for(int num: nums){
            hs.put(num, hs.getOrDefault(num, 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> entry: hs.entrySet()){
            if(entry.getValue()==1){
                sum = sum + entry.getKey();
            }
        }
        
        return sum;
    }
}
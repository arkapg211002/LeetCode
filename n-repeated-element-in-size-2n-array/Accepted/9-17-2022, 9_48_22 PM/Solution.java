// https://leetcode.com/problems/n-repeated-element-in-size-2n-array

class Solution {
    public int repeatedNTimes(int[] nums) {

        Map<Integer,Integer> map1 = new HashMap<>();
        for(int x:nums) {
            if(map1.containsKey(x)) map1.put(x,map1.get(x)+1);
            else map1.put(x,1);
        }
        for(Map.Entry x:map1.entrySet()) {
            int key = (int) x.getKey();
            int value = (int) x.getValue();

            if(value == nums.length/2) return key;
        }
        return 0;
    }
}
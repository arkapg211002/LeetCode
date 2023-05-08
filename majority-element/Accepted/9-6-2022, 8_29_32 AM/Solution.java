// https://leetcode.com/problems/majority-element

class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int a =0;
        for ( int num : nums ){
            if( count == 0){
                a = num;
            }
            if(num == a) count ++;
            else count --;
        }
        return a;
    }
}
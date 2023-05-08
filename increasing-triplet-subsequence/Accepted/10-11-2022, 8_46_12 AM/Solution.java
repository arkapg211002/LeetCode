// https://leetcode.com/problems/increasing-triplet-subsequence

class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int smallest = Integer.MAX_VALUE;
        int middle = Integer.MAX_VALUE;
        
        for(int i : nums){
            if(i<=smallest){
                // smallest number so far or the lowest point of our sequence.
                smallest = i;
            }else if(i<= middle){
                // greater than smallest number or the middle point so far.
                middle = i;
            }else {
                //we've found a number that was not smaller than the middle.
                //this number must be larger than both. We've found our triplet.
                return true;
            }
        }
        // we're able to find the larger number than our smallest and middle number.
        return false;
    }
}
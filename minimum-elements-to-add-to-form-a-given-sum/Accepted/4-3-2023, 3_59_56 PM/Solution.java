// https://leetcode.com/problems/minimum-elements-to-add-to-form-a-given-sum

class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        //long s=Arrays.stream(Arrays.stream(nums).mapToLong(i->i).toArray()).sum();
        return (int)(Math.ceil((Math.abs((long)goal-(Arrays.stream(Arrays.stream(nums).mapToLong(i->i).toArray()).sum())))*1.0/limit));
    }
}
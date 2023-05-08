// https://leetcode.com/problems/find-the-array-concatenation-value

class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long res = 0L;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = nums.length - 1;
        while(j >= i){
            if(j == i){
                sb.append(nums[i]);
            }else{
                sb.append(nums[i]).append(nums[j]);
            }
            int temp = Integer.parseInt(sb.toString());
            sb.setLength(0);
            res += temp;
            j--;
            i++;
        }
        return res;
    }
}
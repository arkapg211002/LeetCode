// https://leetcode.com/problems/prime-in-diagonal

class Solution {
    
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public int diagonalPrime(int[][] nums) {
        int max = 0;
        int j = 0;
        int i = 0;
        int k = nums.length -1;
        while(j < nums.length){
            // System.out.println(nums[j][k]);
            if(isPrime(nums[j][k])){
                max = Math.max(max, nums[j][k]);
            }
            if(isPrime(nums[i][i])){
                max = Math.max(max, nums[i][i]);
            }
            i++;
            k--;
            j++;
        }
        return max;
    }
}
// https://leetcode.com/problems/get-maximum-in-generated-array

class Solution {
    public int getMaximumGenerated(int n) {
        int[] arr = new int[n + 1];
        int m = 0;
        
        if(n<=1) return n;
        if(n == 2) return 1;
        
        arr[0] = 0; arr[1] = 1;
        for(int i = 2; i <= n; i++){
            
            if(i %2 == 0){
                arr[i] = arr[i / 2];
            }else{
                arr[i] = arr[i / 2] + arr[i / 2 + 1];
            }
            
            m = Math.max(m,arr[i]);
            
        }
        
        return m;
    }
}
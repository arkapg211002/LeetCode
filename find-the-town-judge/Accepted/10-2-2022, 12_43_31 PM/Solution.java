// https://leetcode.com/problems/find-the-town-judge

class Solution {
    public int findJudge(int n, int[][] trust) {
       int[] trusting = new int[n];
        int[] trustedBy = new int[n];
       for(int i=0;i<trust.length;i++){
           trusting[trust[i][0]-1]++;
           trustedBy[trust[i][1]-1]++;
       }
        for(int i=0;i<n;i++){
            if(trustedBy[i] == n-1){
                if(trusting[i] == 0){
                    return i+1;
                }
            }
        }
        return -1;
    }
}
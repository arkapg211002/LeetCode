// https://leetcode.com/problems/maximum-enemy-forts-that-can-be-captured

class Solution {
    public int captureForts(int[] forts) {
        int[]nums=forts;
        int max=0;
        int m=0;
        int c=0;
        boolean fl=false;
        boolean f=false;
        for(int i=0;i<forts.length;i++){
            if(nums[i]==1){
                if(fl){
                    max=c;
                   m=Math.max(m,max);
                   fl=false;
                }
                
                c=0;
                f=true;
                
            }
            else if(nums[i]==0){
                c++;
            }
            else if(nums[i]==-1){
               if(f){
                   max=c;
                   m=Math.max(m,max);
                   f=false;
               }
                c=0;
                fl=true;
                
            }
        }
        return m;
    }
}
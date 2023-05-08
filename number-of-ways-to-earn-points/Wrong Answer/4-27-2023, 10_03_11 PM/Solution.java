// https://leetcode.com/problems/number-of-ways-to-earn-points

class Solution {
    int mod=(int)Math.pow(10,9)+7;
    public int waysToReachTarget(int target, int[][] types) {
        int n=types.length;
        int dp[][]=new int[n][target+1];
        for(int r[]:dp)Arrays.fill(r,-1);
        return f(n-1,target,types,dp);
    }
    public int f(int ind,int target,int types[][],int dp[][])
    {
        if(target==0)return 1;
        if(ind==0)
        {
            if(target==0)return 1;
            else if(types[0][0]>0 && types[0][0]*types[0][1]>=target && target%types[0][1]==0)
            {
                return 1;
            }
            else return 0;
        }
        if(dp[ind][target]!=-1)return dp[ind][target]%mod;
        int nt=f(ind-1,target,types,dp);
        int t=0;
        if(types[ind][0]>0 && types[ind][1]<=target)
        {
            types[ind][0]-=1;
            t=f(ind,target-types[ind][1],types,dp);
            //types[ind][0]+=1;
        }
        return dp[ind][target]=(nt+t)%mod;
    }
}
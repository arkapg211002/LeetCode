// https://leetcode.com/problems/stone-game-vi

class Solution {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        int n=aliceValues.length;
        int a[][]=new int[n][3];
        for(int i=0;i<n;i++)
        {
            a[i][0]=aliceValues[i];
            a[i][1]=bobValues[i];
            a[i][2]=aliceValues[i]+bobValues[i];
        }
        Arrays.sort(a,(x,y)->
        {
            if(x[2]>y[2])return -1;
            else if(x[2]<y[2])return 1;
            else return 0;
        });
        int s=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)s+=a[i][0];
            else s-=a[i][1];
        }
        if(s>0)return 1;
        else if(s<0)return -1;
        else return 0;
    }
}
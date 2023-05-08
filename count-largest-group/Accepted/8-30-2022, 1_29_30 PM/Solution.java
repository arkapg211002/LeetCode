// https://leetcode.com/problems/count-largest-group

class Solution {
    public int countLargestGroup(int n) {
        if(n<10)return n;
        int a[]=new int[n+1];
        for(int i=1;i<10;i++)
        {
            a[i]+=1;
        }
        for(int i=10;i<=n;i++)
        {
            int s=0,j=i;
            while(j>0)
            {
                s+=j%10;
                j/=10;
            }
            a[s]+=1;
        }
        Arrays.sort(a);
        int m=a[a.length-1];
        int c=0;
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]==m)c+=1;
            if(a[i]!=m)break;
        }
        return c;
    }
}
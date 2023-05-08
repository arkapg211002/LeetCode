// https://leetcode.com/problems/sort-integers-by-the-power-value

class Solution {
    public int getKth(int lo, int hi, int k) {
        int a[][]=new int[hi-lo+1][2];
        int n=hi-lo+1;
        for(int i=0;i<n;i++)
        {
            a[i][0]=lo;
            a[i][1]=power(lo,0);
            lo+=1;
        }
        Arrays.sort(a,(x,y)->
                    {
                        if(x[1]<y[1])return -1;
                        else if(x[1]>y[1])return 1;
                        else 
                        {
                            if(x[0]<y[0])return -1;
                            else if(x[0]>y[0])return 1;
                            else return 0;
                        }
                    }
                   );
        return a[k-1][0];
    }
    public int power(int x,int count)
    {
        if(x==1)return 0;
        int eve=0,odd=0;
        if(x%2==0)eve=1+power(x/2,count+1);
        else odd=1+power(3*x+1,count+1);
        return count=eve+odd;
    }
}
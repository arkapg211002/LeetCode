// https://leetcode.com/problems/two-city-scheduling

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int s=0,l=0,r=0;
        int ls[][]=new int[costs.length][2];
        int rs[][]=new int[costs.length][2];
        int lc=0,rc=0;
        for(int i=0;i<costs.length;i++)
        {
            if(costs[i][0]<=costs[i][1])
            {
                s+=costs[i][0];
                l+=1;
                ls[lc][0]=costs[i][0];
                ls[lc][1]=costs[i][1];
                lc+=1;
            }
            else
            {
                s+=costs[i][1];
                r+=1;
                rs[rc][0]=costs[i][0];
                rs[rc][1]=costs[i][1];
                rc+=1;
            }

        }
        System.out.println(l+" "+r);
        if(l==r)return s;
        else if(l>r)
        {
            int d=(l-r)/2;
            Arrays.sort(ls,(a,b)->
            {
                int d1=a[1]-a[0];
                int d2=b[1]-b[0];
                if(d1<d2)return -1;
                else if(d1>d2)return 1;
                else return 0;
            });
            for(int i=0;i<d;i++)
            {   
                if(ls[i][0]!=0 && ls[i][1]!=0)
                {
                    s-=ls[i][0];
                    s+=ls[i][1];
                }
            }
            
        }
        else
        {
            int d=(r-l)/2;
            Arrays.sort(rs,(a,b)->
            {
                int d1=a[0]-a[1];
                int d2=b[0]-b[1];
                if(d1<d2)return -1;
                else if(d1>d2)return 1;
                else return 0;
            });
            for(int i=0;i<d;i++)
            {   
                if(rs[i][0]!=0 && rs[i][1]!=0)
                {
                    s-=rs[i][0];
                    s+=rs[i][1];
                }
            }
        }
        return s;
    }
}
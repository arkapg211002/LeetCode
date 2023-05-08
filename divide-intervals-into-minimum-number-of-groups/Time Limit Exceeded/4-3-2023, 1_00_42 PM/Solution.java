// https://leetcode.com/problems/divide-intervals-into-minimum-number-of-groups

class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals,(m,n)->
        {
            if(m[1]<n[1])return -1;
            else if(m[1]>n[1])return 1;
            else return 0;
        });
        int a[]=new int[intervals.length];
        Arrays.fill(a,0);
        int end=0,c=0,d=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                a[i]=1;
                end=intervals[i][1];
                for(int j=i+1;j<intervals.length;j++)
                {
                    if(a[j]==1)continue;
                    if(intervals[j][0]>end)
                    {
                        end=intervals[j][1];
                        a[j]=1;
                    }
                }
                c+=1;
            }
        }

        Arrays.sort(intervals,(x,y)->
        {
            if(x[0]<y[0])return -1;
            else if(x[0]>y[0])return 1;
            else return 0;
        });
        
        int b[]=new int[intervals.length];
        Arrays.fill(b,0);
        end=0;
        for(int i=0;i<b.length;i++)
        {
            if(b[i]==0)
            {
                b[i]=1;
                end=intervals[i][1];
                for(int j=i+1;j<intervals.length;j++)
                {
                    if(b[j]==1)continue;
                    if(intervals[j][0]>end)
                    {
                        end=intervals[j][1];
                        b[j]=1;
                    }
                }
                d+=1;
            }
        }
        return (int)Math.min(c,d);
    }
    
}
// https://leetcode.com/problems/couples-holding-hands

class Solution {
    public int minSwapsCouples(int[] row) {
        int n=row.length;
        int p[]=new int[n];
        int res=0;
        for(int i=0;i<n;i++)p[row[i]]=i;
        for(int i=0;i<n;i+=2)
        {
            int next=row[i]+(row[i]%2==0 ? 1:-1);
            int current=row[i+1];
            if(current != next)
            {
                int temp=row[i+1];
                row[i+1]=row[p[next]];
                row[p[next]]=temp;
                temp=p[next];
                p[next]=p[current];
                p[current]=temp;
                res+=1;
            }
        }
        return res;
    }
}
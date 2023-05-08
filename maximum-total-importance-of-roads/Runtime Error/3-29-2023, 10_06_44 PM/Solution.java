// https://leetcode.com/problems/maximum-total-importance-of-roads

class Solution {
    public long maximumImportance(int n, int[][] roads) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<roads.length;i++)
        {
            if(h.containsKey(roads[i][0])==false)h.put(roads[i][0],1);
            else h.put(roads[i][0],h.get(roads[i][0])+1);
            if(h.containsKey(roads[i][1])==false)h.put(roads[i][1],1);
            else h.put(roads[i][1],h.get(roads[i][1])+1);
        }
        int a[][]=new int[h.size()][2];
        int k=0;
        for(Map.Entry<Integer,Integer>e:h.entrySet())
        {
            a[k][0]=e.getKey();
            a[k][1]=e.getValue();
            k+=1;
        }        
        Arrays.sort(a,(x,y)->
        {
            if(x[1]>y[1])return -1;
            else if(x[1]<y[1])return 1;
            else return 0;
        });
        for(int i=0;i<a.length;i++)
        {
            a[i][1]=n;
            n-=1;
        }
        Arrays.sort(a,(x,y)->
        {
            if(x[0]<y[0])return -1;
            else if(x[0]>y[0])return 1;
            else return 0;
        });
        int s=0;
        for(int i=0;i<roads.length;i++)
        {
            int c=a[roads[i][0]][1];
            int d=a[roads[i][1]][1];
            s+=(c+d);
        }
        return s;
    }
}
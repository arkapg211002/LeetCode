// https://leetcode.com/problems/maximum-candies-you-can-get-from-boxes

class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        Queue<Integer>q=new LinkedList<>();
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<initialBoxes.length;i++)
            q.add(initialBoxes[i]);
        int c=0;
        while(!q.isEmpty())
        {
            //System.out.println(q);
            int a=q.poll();
            //System.out.println(status[a]);
            if(status[a]==1)
            {
                c+=candies[a];
                //System.out.println(c);
                if(h.containsKey(a)==true)h.remove(a);
            }
            for(int i=0;i<keys[a].length;i++)
            {
                status[keys[a][i]]=1;
                if(h.containsKey(keys[a][i])==true)h.put(keys[a][i],1);
            }
            for(int i=0;i<containedBoxes[a].length;i++)
            {    
                q.add(containedBoxes[a][i]);
                h.put(containedBoxes[a][i],status[containedBoxes[a][i]]);
            }
        }
        System.out.println(h);
        for(Map.Entry<Integer,Integer>e:h.entrySet())
        {
            if(e.getValue()==1)c+=candies[e.getKey()];
        }
        return c;
    }
}
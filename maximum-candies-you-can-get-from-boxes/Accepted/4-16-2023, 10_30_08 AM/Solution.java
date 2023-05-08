// https://leetcode.com/problems/maximum-candies-you-can-get-from-boxes

class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int v[]=new int[status.length];
        int c=0;
        HashSet<Integer>h=new HashSet<>();
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<initialBoxes.length;i++)
        {
            if(status[initialBoxes[i]]==1)
            {
                v[initialBoxes[i]]=1;
                q.add(initialBoxes[i]);
            }
            else
                h.add(initialBoxes[i]);
            
        }

        while(!q.isEmpty())
        {
            int b=q.poll();
            c+=candies[b];
            for(int i=0;i<keys[b].length;i++)
            {
                if(v[keys[b][i]]==1)continue;
                status[keys[b][i]]=1;
                if(h.contains(keys[b][i])==true)
                {
                    q.add(keys[b][i]);
                    v[keys[b][i]]=1;
                }    
            }

            for(int i=0;i<containedBoxes[b].length;i++)
            {
                if(v[containedBoxes[b][i]]==1)continue;
                if(status[containedBoxes[b][i]]==1)
                {
                    q.add(containedBoxes[b][i]);
                    v[containedBoxes[b][i]]=1;
                }
                else h.add(containedBoxes[b][i]);
            }
        }

        return c;
    }
}
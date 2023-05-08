// https://leetcode.com/problems/last-stone-weight

class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1)return stones[0];
        
        List<Integer>l=new ArrayList<Integer>();
        for(int i=0;i<stones.length;i++)
        {
            l.add(stones[i]);
        }
        Collections.sort(l);
        int a=0,b=0;
        while(l.size()>1)
        {
            a=l.get(l.size()-1);
            b=l.get(l.size()-2);
            if(a==b)
            {
                l.remove(l.size()-1);
                l.remove(l.size()-2);
                continue;
            }
            else if(b!=a)
            {
                l.remove(l.size()-2);
                l.remove(l.size()-1);
                l.add(a-b);
                Collections.sort(l);
                continue;
            }
        }
        return l.get(0);
    }
}
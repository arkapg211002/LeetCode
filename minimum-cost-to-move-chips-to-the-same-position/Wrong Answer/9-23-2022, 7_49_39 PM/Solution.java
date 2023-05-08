// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position

class Solution {
    public int minCostToMoveChips(int[] position) {
        int c=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<position.length;i++)
        {
            if(hm.containsKey(position[i])==false)
            {
                hm.put(position[i],1);
            }
            else
            {
                hm.put(position[i],hm.get(position[i])+1);
            }
        }
        //System.out.println(hm);
        int max=Integer.MIN_VALUE,id=0;
        for(Map.Entry<Integer,Integer>e:hm.entrySet())
        {
            //System.out.println(e.getKey()+" "+e.getValue());
            if(e.getValue()>max)
            {
                id=e.getKey();
                max=e.getValue();
            }
        }
        //System.out.println(max+" "+id);
        for(Map.Entry<Integer,Integer>e:hm.entrySet())
        {
            int a=e.getKey();
            int d=(int)Math.abs(a-id);
            if(d%2==0)continue;
            else c+=e.getValue();
        }
        return c;
    }
}
// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position

class Solution {
    public int minCostToMoveChips(int[] position) {
        int c=0,cm=0;
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
        int min=Integer.MAX_VALUE,idm=0;
        for(Map.Entry<Integer,Integer>e:hm.entrySet())
        {
            //System.out.println(e.getKey()+" "+e.getValue());
            if(e.getValue()>=max)
            {
                id=e.getKey();
                max=e.getValue();
            }
            if(e.getValue()<=min)
            {
                idm=e.getKey();
                min=e.getValue();
            }
        }
        //System.out.println(max+" "+id);
        int d=0,dm=0;
        for(Map.Entry<Integer,Integer>e:hm.entrySet())
        {
            int a=e.getKey();
            d=(int)Math.abs(a-id);
            dm=(int)Math.abs(a-idm);
            if(d%2!=0)c+=e.getValue();
            if(dm%2!=0)cm+=e.getValue();
        }
        return (int)Math.min(c,cm);
    }
}
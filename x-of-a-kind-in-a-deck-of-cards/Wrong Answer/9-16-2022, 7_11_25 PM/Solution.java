// https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<deck.length;i++)
        {
            if(hm.get(deck[i])==null)
            {
                hm.put(deck[i],1);
            }
            else
            {
                hm.put(deck[i],hm.get(deck[i])+1);
            }
        }
        //System.out.println(hm);
        HashSet<Integer>h=new HashSet<>();
        for(Map.Entry<Integer,Integer>e:hm.entrySet())
        {
            int val=e.getValue();
            if(val==1)return false;
            h.add(val);
        }
        if(h.size()==1)return true;
        else return false;
    }
}
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
        System.out.println(hm);
        List<Integer>l=new ArrayList<>();
        for(Map.Entry<Integer,Integer>e:hm.entrySet())
        {
            if(e.getValue()==1)return false;
            l.add(e.getValue());
        }
        Collections.sort(l);
        int val=l.get(0);
        for(int i=1;i<l.size();i++)
        {
            if(l.get(i)%val!=0)return false;
        }
        return true;
    }
}
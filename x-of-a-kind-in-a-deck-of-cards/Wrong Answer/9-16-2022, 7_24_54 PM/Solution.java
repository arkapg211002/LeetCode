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
        int s=0,ev=0,d=0;
        for(Map.Entry<Integer,Integer>e:hm.entrySet())
        {
            s+=1;
            int val=e.getValue();
            if(val==1)return false;
            else if(val%2==0)ev+=1;
            else d+=1;
        }
        if(ev==s || d==s)return true;
        else return false;
    }
}
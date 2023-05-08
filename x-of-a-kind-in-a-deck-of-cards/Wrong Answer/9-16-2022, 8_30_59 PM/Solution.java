// https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length==1)return false;
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
        if(hm.size()==1)return true;
        //System.out.println(hm);
        List<Integer>l=new ArrayList<>();
        for(Map.Entry<Integer,Integer>e:hm.entrySet())
        {
            if(e.getValue()==1)return false;
            l.add(e.getValue());
        }
        Collections.sort(l);
        int g=gcd(l.get(0),l.get(1));
        //System.out.println(g);
        if(g<2)return false;
        for(int i=2;i<l.size();i++)
        {
            //System.out.println(gcd(l.get(0),l.get(i)));
            if(gcd(l.get(0),l.get(i))!=g)return false;
        }
        return true;
        
        
    }
    public int gcd(int a,int b)
    {
        if(a==0)return b;
        else return gcd(b%a,a);
    }
}
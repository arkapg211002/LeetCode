// https://leetcode.com/problems/dota2-senate

class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> d= new LinkedList<>(), r=new LinkedList<>();
        int i=0,n=senate.length();
        for (char c: senate.toCharArray())
        {
            if(c=='D')d.add(i);
            else r.add(i);
            i++;
        }
        while(true)
        {
            if(d.peek()==null && r.peek()!=null)return "Radiant";
            if(d.peek()!=null && r.peek()==null)return "Dire";
            int id=d.poll();
            int ir=r.poll();
            int toDeleteBy =Math.min(id,ir);
            if(toDeleteBy==id)d.add(n+id);
            else r.add(n+ir);
        }
    }
}
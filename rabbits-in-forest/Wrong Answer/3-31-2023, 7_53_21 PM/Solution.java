// https://leetcode.com/problems/rabbits-in-forest

class Solution {
    public int numRabbits(int[] answers) {
        HashSet<Integer>h=new HashSet<>();
        int c=0,res=0;
        for(int i=0;i<answers.length;i++)
        {
            h.add(answers[i]);
            if(answers[i]==0)c+=1;
        }   
        List<Integer>l=new ArrayList<>(h);
        for(int i=0;i<l.size();i++)
        {
            if(l.get(i)==0)res+=c;
            else res+=l.get(i)+1;
        }
        return res;
    }
}